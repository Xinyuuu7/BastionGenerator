package Xinyuiii.properties;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.EnumMap;
import java.util.LinkedList;
import java.util.List;

import Xinyuiii.reecriture.NewDecoratorRandom;
import com.seedfinding.mccore.rand.ChunkRand;
import com.seedfinding.mccore.util.block.BlockBox;
import com.seedfinding.mccore.util.block.BlockDirection;
import com.seedfinding.mccore.util.block.BlockMirror;
import com.seedfinding.mccore.util.block.BlockRotation;
import com.seedfinding.mccore.util.data.Pair;
import com.seedfinding.mccore.util.pos.BPos;
import com.seedfinding.mccore.util.pos.CPos;
import com.seedfinding.mccore.version.MCVersion;
import com.seedfinding.mccore.version.UnsupportedVersion;
import com.seedfinding.mcfeature.loot.LootContext;
import com.seedfinding.mcfeature.loot.LootTable;
import com.seedfinding.mcfeature.loot.item.ItemStack;

import Xinyuiii.enumType.BastionType;
import Xinyuiii.enumType.PoolType;
import Xinyuiii.reecriture.VoxelShape;
import Xinyuiii.reecriture.BastionPools.BastionStructureLoot;
import Xinyuiii.reecriture.BastionPools.BastionStructureSize;
import Xinyuiii.reecriture.BastionPools.JigsawBlock;

public class BastionGenerator {
    private List<Piece> pieces;
    private static final int MAX_DIST = 80; // max distance from start piece anchor
    private BastionType type;
    private MCVersion version;
    private long worldSeed;

    public BastionGenerator(MCVersion version) {
        this.version = version;
    }

    public boolean generate(long worldSeed,CPos bastionPos) {
        this.worldSeed = worldSeed;
        return generate(worldSeed,bastionPos.getX(),bastionPos.getZ(),new ChunkRand());
    }


    boolean generate(long worldSeed, int chunkX, int chunkZ, ChunkRand rand) {
        if (version.isOlderThan(MCVersion.v1_16))
            throw new UnsupportedVersion(version, " bastions");

        this.pieces = new ArrayList<>();
        boolean standardisedShuffling = version.isNewerOrEqualTo(MCVersion.v1_19);

        rand.setCarverSeed(worldSeed, chunkX, chunkZ, version);

        BlockRotation rotation;
        if (version.isNewerOrEqualTo(MCVersion.v1_16_2)) {
            rotation = BlockRotation.getRandom(rand);
            this.type = BastionType.getRandom(rand);
        }
        else {
            this.type = BastionType.getRandom(rand);
            rotation = BlockRotation.getRandom(rand);
            rand.nextInt(1); // choose a "random" start template
        }

        String template = TYPE_TO_START.get(this.type);
        BPos size = BastionStructureSize.STRUCTURE_SIZE.get(template);
        BPos bPos = new CPos(chunkX, chunkZ).toBlockPos(33);
        BlockBox box = BlockBox.getBoundingBox(bPos, rotation, BPos.ORIGIN, BlockMirror.NONE, size);
        int centerX = (box.minX + box.maxX) / 2;
        int centerZ = (box.minZ + box.maxZ) / 2;
        int heightY = 0;
        int y = bPos.getY() + heightY;
        int centerY = box.minY + 1;

        // create the first piece
        Piece piece = new Piece(template, bPos, box, rotation, 0);
        piece.move(0, y - centerY, 0);
        piece.setBoundsTop(y + 80);

        // create structure bounding box
        BlockBox fullBox = new BlockBox(centerX - MAX_DIST, y - MAX_DIST, centerZ - MAX_DIST, centerX + MAX_DIST + 1, y + MAX_DIST + 1, centerZ + MAX_DIST + 1);
        Assembler assembler = new Assembler(6, this.pieces, this.type, y, standardisedShuffling);
        assembler.pieces.add(piece);
        VoxelShape a = new VoxelShape(fullBox);
        a.fullBoxes.add(new BlockBox(box.minX,box.minY,box.minZ,box.maxX+1,box.maxY+1,box.maxZ+1));
        piece.voxelShape = a;

        // place pieces
        assembler.placing.addLast(piece);
        while(!assembler.placing.isEmpty()) {
            assembler.tryPlacing(assembler.placing.removeFirst(), rand);
        }

        return true;
    }

    public List<Pair<BPos, List<ItemStack>>> generateLoot() {
        List<Pair<BPos, List<ItemStack>>> result = new ArrayList<>();
        List<Pair<BPos, LootTable>> chestsPos = new ArrayList<>();
        for (Piece p : pieces) {
            List<LootTable> tables = new ArrayList<>();
            if (version.isBetween(MCVersion.v1_16,MCVersion.v1_16_1)) {
                tables = BastionStructureLoot.STRUCTURE_LOOT_1_16_0.get(p.name);
            }
            else if (version.isBetween(MCVersion.v1_16_2,MCVersion.v1_19_4)) {
                tables = BastionStructureLoot.STRUCTURE_LOOT_1_16_2.get(p.name);
            }
            else {
                tables = BastionStructureLoot.STRUCTURE_LOOT_1_20_0.get(p.name);
            }
            int size = tables.size();
            if (size != 0) {
                List<BPos> pos = new ArrayList<>();
                for (BPos offset : BastionStructureLoot.STRUCTURE_LOOT_OFFSETS.get(p.name)) {
                    pos.add(p.pos.add(p.getTransformedPos(offset,p.rotation)));
                }
                for (int i = 0 ; i < size ; i++) {
                    chestsPos.add(new Pair<>(pos.get(i),tables.get(i)));
                }
            }
        }
        List<CPos> chunkPos = new ArrayList<>();
        if (version.isNewerOrEqualTo(MCVersion.v1_18)) {
            NewDecoratorRandom rand = new NewDecoratorRandom();
            for (Pair<BPos,LootTable> chest : chestsPos) {
                CPos chunk = chest.getFirst().toChunkPos();
                long populationSeed = rand.getPopulationSeed(worldSeed,chunk.getX()<<4,chunk.getZ()<<4);
                if (version.isNewerOrEqualTo(MCVersion.v1_20)) {
                    rand.setDecoratorSeed(populationSeed,0,4);
                }
                else {
                    rand.setDecoratorSeed(populationSeed,12,4);
                }
                if (chunkPos.contains(chunk)) {
                    int num = Collections.frequency(chunkPos,chunk);
                    for (int i = 0 ; i < num ; i++) {
                        rand.nextLong();
                    }
                    LootContext context = new LootContext(rand.nextLong(), version);
                    List<ItemStack> items = chest.getSecond().generate(context);
                    result.add(new Pair<>(chest.getFirst(),items));
                    chunkPos.add(chunk);
                    continue;
                }
                LootContext context = new LootContext(rand.nextLong(), version);
                List<ItemStack> items = chest.getSecond().generate(context);
                result.add(new Pair<>(chest.getFirst(),items));
                chunkPos.add(chunk);
            }
            return result;
        }
        ChunkRand rand = new ChunkRand();
        for (Pair<BPos,LootTable> chest : chestsPos) {
            CPos chunk = chest.getFirst().toChunkPos();
            rand.setDecoratorSeed(worldSeed, chunk.getX() * 16, chunk.getZ() * 16, 40012, version);
            if (chunkPos.contains(chunk)) {
                int num = Collections.frequency(chunkPos,chunk);
                for (int i = 0 ; i < num ; i++) {
                    rand.nextLong();
                }
                LootContext context = new LootContext(rand.nextLong(), version);
                List<ItemStack> items = chest.getSecond().generate(context);
                result.add(new Pair<>(chest.getFirst(),items));
                chunkPos.add(chunk);
                continue;
            }
            LootContext context = new LootContext(rand.nextLong(), version);
            List<ItemStack> items = chest.getSecond().generate(context);
            result.add(new Pair<>(chest.getFirst(),items));
            chunkPos.add(chunk);
        }
        return result;
    }

    static public class Piece {
        String name;
        public BPos pos;
        BlockBox box;
        public BlockRotation rotation;
        int boundsTop;
        private VoxelShape voxelShape;
        int depth;

        public String getName(){
            return this.name;
        }

        Piece(String name, BPos pos, BlockBox box, BlockRotation rotation, int depth) {
            this.name = name;
            this.pos = pos;
            this.box = box;
            this.rotation = rotation;
            this.voxelShape = new VoxelShape(box);
            this.depth = depth;
        }

        public void move(int x, int y, int z) {
            box.move(x, y, z);
            pos = pos.add(x, y, z);
        }

        public void setBoundsTop(int boundsTop) {
            this.boundsTop = boundsTop;
        }

        public List<BlockJigsawInfo> getShuffledJigsawBlocks(BPos offset, BastionType bastionType, ChunkRand rand) {
            List<JigsawBlock> blocks = bastionType.getJigsawBlocks().get(this.name);
            List<BlockJigsawInfo> list = new ArrayList<>(blocks.size());

            for (JigsawBlock b : blocks) {
                BlockJigsawInfo blockJigsawInfo = new BlockJigsawInfo(b, rotation.rotate(b.relativePos, new BPos(0,0,0)).add(offset), rotation );
                list.add(blockJigsawInfo);
            }

            rand.shuffle(list);
            return list;
        }

        public void setVoxelShape(VoxelShape mutableobject1) {
            this.voxelShape = mutableobject1;
        }
        public VoxelShape getVoxelShape() {
            return this.voxelShape;
        }

        public  BPos getTransformedPos(BPos targetPos, BlockRotation rotationIn) {
            int i = targetPos.getX();
            int j = targetPos.getY();
            int k = targetPos.getZ();
            switch(rotationIn) {
                case COUNTERCLOCKWISE_90:
                    return new BPos(k,j, -i);
                case CLOCKWISE_90:
                    return new BPos(-k,j, +i);
                case CLOCKWISE_180:
                    return new BPos(-i, j, -k);
                default:
                    return targetPos;
            }
        }
    }

    public static class BlockJigsawInfo {
        JigsawBlock nbt;
        BPos pos;
        BlockRotation rotation;
        public BlockJigsawInfo(JigsawBlock nbt, BPos pos, BlockRotation rotation) {
            // nbt is stored as pool,(name,targetname),orientation,final_state
            this.nbt = nbt;
            this.pos = pos;
            this.rotation = rotation;
        }

        public BlockDirection getFront() {
            return rotation.rotate(this.nbt.direction1);
        }

        public BlockDirection getTop() {
            return rotation.rotate(this.nbt.direction2);
        }

        public BlockDirection getOpposite(BlockDirection b){
            switch (b) {
                case NORTH:
                    return BlockDirection.SOUTH;
                case SOUTH:
                    return BlockDirection.NORTH;
                case WEST:
                    return BlockDirection.EAST;
                case EAST:
                    return BlockDirection.WEST;
                case DOWN:
                    return BlockDirection.UP;
                case UP:
                    return BlockDirection.DOWN;
                default:
                    throw new IllegalStateException("Unable to get facing of " );
            }
        }
        public boolean canAttach(BlockJigsawInfo blockJigsawInfo2, BlockDirection direction) {
            return direction == this.getOpposite(blockJigsawInfo2.getFront())
                    && this.nbt.targetName.equals(blockJigsawInfo2.nbt.name)
                    && (this.nbt.jointType.isRollable() || this.getTop().equals(blockJigsawInfo2.getTop()));
        }
    }

    public static class Assembler {
        int maxDepth;
        BastionType bastionType;
        boolean standardisedShuffling;
        List<Piece> pieces;

        private final Deque<Piece> placing = new ArrayDeque<>();
        Assembler(int maxDepth, List<Piece> pieces, BastionType type, int heightY, boolean standardisedShuffling) {
            this.maxDepth = maxDepth;
            this.pieces = pieces;
            this.bastionType = type;
            this.standardisedShuffling = standardisedShuffling;
        }

        public void tryPlacing(Piece piece, ChunkRand rand) {
            int depth = piece.depth;
            BPos pos = piece.pos;
            VoxelShape mutableobject = new VoxelShape();
            BlockBox box = piece.box;
            int minY = box.minY;

            label139:
            for (BlockJigsawInfo blockJigsawInfo : piece.getShuffledJigsawBlocks(pos, this.bastionType, rand)) {
                BlockDirection blockDirection = blockJigsawInfo.getFront();
                BPos blockPos = blockJigsawInfo.pos;
                BPos relativeBlockPos = new BPos(blockPos.getX() + blockDirection.getVector().getX(),
                        blockPos.getY() + blockDirection.getVector().getY(),
                        blockPos.getZ() + blockDirection.getVector().getZ());
                int y = blockPos.getY() - minY;

                Pair< PoolType, List<Pair<String, Integer>> > pool = this.bastionType.getPool().get(blockJigsawInfo.nbt.poolType);

                if (pool != null && pool.getSecond().size() != 0) {
                    PoolType fallbackLocation = pool.getFirst();
                    Pair< PoolType, List<Pair<String, Integer>> > fallbackPool = this.bastionType.getPool().get(fallbackLocation);

                    if (fallbackPool != null && fallbackPool.getSecond().size() != 0) {

                        JigSawPool jigSawPool1 = new JigSawPool(pool.getSecond());
                        JigSawPool jigSawPool2 = new JigSawPool(fallbackPool.getSecond());
                        boolean isInside = box.contains(relativeBlockPos);
                        VoxelShape mutableobject1;
                        if (isInside) {
                            mutableobject1 = mutableobject;
                            if (mutableobject.isNull()) {
                                mutableobject.setValue(box,true);

                            }
                        } else {
                            mutableobject1 = piece.getVoxelShape();
                        }


                        LinkedList<String> list = new LinkedList<>();
                        if (depth != this.maxDepth) {
                            list = jigSawPool1.getTemplates();
                            if(list.size() != 0) {
                                rand.shuffle(list);
                                if (!this.standardisedShuffling) 	// older (pre 1.19) versions use a modified shuffling
                                    rand.advance(1);				// algo here for some reason, hence the call skip
                            }
                        }

                        LinkedList<String> listtmp = jigSawPool2.getTemplates();
                        if(listtmp.size() != 0) {
                            rand.shuffle(listtmp);
                            if (!this.standardisedShuffling)
                                rand.advance(1);
                        }
                        list.addAll(listtmp);


                        for (String jigsawpiece1 : list) {

                            if (jigsawpiece1.equals("empty")){
                                break;
                            }

                            List<BlockRotation> shuffledRotations = BlockRotation.getShuffled(rand);
                            for (BlockRotation rotation1 : shuffledRotations ) {

                                BPos size1 = BastionStructureSize.STRUCTURE_SIZE.get(jigsawpiece1);
                                BlockBox box1 = size1==null ? new BlockBox(0,0,0,0,0,0) : BlockBox.getBoundingBox(BPos.ORIGIN, rotation1, BPos.ORIGIN, BlockMirror.NONE, size1);
                                Piece piece1 = new Piece(jigsawpiece1, BPos.ORIGIN, box1, rotation1, 0);
                                List<BlockJigsawInfo> list1;
                                list1 = piece1.getShuffledJigsawBlocks(BPos.ORIGIN, this.bastionType, rand);

                                // bastion doesnt use expansion hack
                                // int i1 = 0;

                                BlockDirection direction = blockJigsawInfo.getFront();

                                // Loop to see if we can attach
                                for (BlockJigsawInfo blockJigsawInfo2 : list1) {
                                    if (blockJigsawInfo.canAttach(blockJigsawInfo2,direction)) {

                                        BPos blockPos3 = blockJigsawInfo2.pos;
                                        BPos blockPos4 = new BPos(relativeBlockPos.getX() - blockPos3.getX(),
                                                relativeBlockPos.getY() - blockPos3.getY(), relativeBlockPos.getZ() - blockPos3.getZ());

                                        BlockBox box2;
                                        if(size1 == null){
                                            box2 = new BlockBox(blockPos4.getX(),blockPos4.getY(),blockPos4.getZ(),blockPos4.getX(),
                                                    blockPos4.getY(),blockPos4.getZ());
                                        }
                                        else {
                                            box2 = BlockBox.getBoundingBox(blockPos4, rotation1, BPos.ORIGIN, BlockMirror.NONE, size1);
                                        }
                                        int j1 = box2.minY;
                                        int k1 = blockPos3.getY();
                                        int l1 = y - k1 + blockJigsawInfo.getFront().getVector().getY();

                                        // all bastion pieces are rigid
                                        int i2 = minY + l1;

                                        int j2 = i2 - j1;
                                        BlockBox box3 = new BlockBox(box2.minX,box2.minY,box2.minZ,box2.maxX,box2.maxY,box2.maxZ);
                                        box3.move(0, j2, 0);
                                        BPos blockpos5 = blockPos4.add(0, j2, 0);

                                        if (isNotEmpty(mutableobject1,box3)) {
                                            mutableobject1.fullBoxes.add(new BlockBox(box3.minX,box3.minY,box3.minZ,
                                                    box3.maxX+1,box3.maxY+1,box3.maxZ+1));

                                            Piece piece2 = new Piece(jigsawpiece1,blockpos5,box3,rotation1,depth+1);
                                            if(depth+1<= this.maxDepth){
                                                this.pieces.add(piece2);
                                                piece2.setVoxelShape(mutableobject1);
                                                this.placing.addLast(piece2);
                                            }
                                            continue label139;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        private boolean isNotEmpty(VoxelShape voxelShape,BlockBox box1) {
            if(box1.minX<voxelShape.getX().get(0) || box1.minY<voxelShape.getY().get(0) || box1.minZ<voxelShape.getZ().get(0)
                    || box1.maxX>=voxelShape.getLastX() || box1.maxY>=voxelShape.getLastY() || box1.maxZ>=voxelShape.getLastZ())
                return false;

            for (BlockBox fullBox: voxelShape.fullBoxes){
                if(intersects2(box1,fullBox)){
                    return false;
                }
            }
            return true;
        }

        public boolean intersects2(BlockBox box1, BlockBox box) {
            return box1.maxX >= box.minX && box1.minX < box.maxX && box1.maxZ >= box.minZ && box1.minZ < box.maxZ && box1.maxY >= box.minY && box1.minY < box.maxY;
        }
    }

    public static class JigSawPool {
        private final LinkedList<String> templates = new LinkedList<>();

        JigSawPool(List<Pair<String, Integer>> templates) {
            for(Pair<String, Integer> template : templates) {
                for(int i = 0; i < template.getSecond(); i++) {
                    this.templates.addLast(template.getFirst());
                }
            }
        }

        public LinkedList<String> getTemplates() {
            return templates;
        }
    }

    public static final EnumMap<BastionType, String> TYPE_TO_START = new EnumMap<>(BastionType.class) {{
        this.put(BastionType.HOUSING, "units/air_base");
        this.put(BastionType.STABLES, "hoglin_stable/air_base");
        this.put(BastionType.TREASURE, "treasure/big_air_full");
        this.put(BastionType.BRIDGE, "bridge/starting_pieces/entrance_base");
    }};

    public List<Piece> getPieces() {
        return this.pieces;
    }

    public BastionType getType() {
        return this.type;
    }
}
