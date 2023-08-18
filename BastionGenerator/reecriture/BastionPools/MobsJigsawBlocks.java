package BastionGenerator.reecriture.BastionPools;

import BastionGenerator.enumType.PoolType;
import com.seedfinding.mccore.block.Block;
import com.seedfinding.mccore.block.Blocks;
import com.seedfinding.mccore.util.block.BlockDirection;
import com.seedfinding.mccore.util.data.Pair;
import com.seedfinding.mccore.util.data.Quad;
import com.seedfinding.mccore.util.pos.BPos;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class MobsJigsawBlocks {
    public static final HashMap<String, List<Pair<Quad<PoolType, String, Pair<BlockDirection,BlockDirection>, Block>, BPos>>> JIGSAW_BLOCKS = new HashMap<>() {{
        this.put("air", Collections.singletonList(
                new Pair<>(new Quad<>(PoolType.EMPTY, "block_connector", new Pair<>(BlockDirection.DOWN,BlockDirection.WEST), Blocks.AIR), new BPos(0,0,0))
        ));
        this.put("gold", Collections.singletonList(
                new Pair<>(new Quad<>(PoolType.EMPTY, "block_connector", new Pair<>(BlockDirection.DOWN,BlockDirection.WEST), Blocks.GOLD_BLOCK), new BPos(0,0,0))
        ));
        this.put("mobs/crossbow_piglin", Collections.singletonList(
                new Pair<>(new Quad<>(PoolType.EMPTY, "mob_connector", new Pair<>(BlockDirection.DOWN,BlockDirection.EAST), Blocks.AIR), new BPos(0,0,0))
        ));
        this.put("empty", Collections.singletonList(
                new Pair<>(new Quad<>(PoolType.EMPTY, "mob_connector", new Pair<>(BlockDirection.DOWN,BlockDirection.NORTH), Blocks.AIR), new BPos(0,0,0))
        ));
        this.put("mobs/hoglin", Collections.singletonList(
                new Pair<>(new Quad<>(PoolType.EMPTY, "mob_connector", new Pair<>(BlockDirection.DOWN,BlockDirection.NORTH), Blocks.AIR), new BPos(0,0,1))
        ));
        this.put("mobs/melee_piglin", Collections.singletonList(
                new Pair<>(new Quad<>(PoolType.EMPTY, "mob_connector", new Pair<>(BlockDirection.DOWN,BlockDirection.WEST), Blocks.AIR), new BPos(0,0,0))
        ));
        this.put("mobs/melee_piglin_always", Collections.singletonList(
                new Pair<>(new Quad<>(PoolType.EMPTY, "melee_connector", new Pair<>(BlockDirection.DOWN,BlockDirection.WEST), Blocks.AIR), new BPos(0,0,0))
        ));
        this.put("mobs/sword_piglin", Collections.singletonList(
                new Pair<>(new Quad<>(PoolType.EMPTY, "mob_connector", new Pair<>(BlockDirection.DOWN,BlockDirection.WEST), Blocks.AIR), new BPos(0,0,0))
        ));
    }};
}
