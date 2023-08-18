package BastionGenerator.reecriture.BastionPools;

import BastionGenerator.enumType.PoolType;
import com.seedfinding.mccore.block.Block;
import com.seedfinding.mccore.block.Blocks;
import com.seedfinding.mccore.util.block.BlockDirection;
import com.seedfinding.mccore.util.data.Pair;
import com.seedfinding.mccore.util.data.Quad;
import com.seedfinding.mccore.util.pos.BPos;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class HousingJigsawBlocks {
    public static final HashMap<String, List<Pair<Quad<PoolType, String, Pair<BlockDirection, BlockDirection>, Block>, BPos>>> JIGSAW_BLOCKS = new HashMap<>() {{
        this.putAll(MobsJigsawBlocks.JIGSAW_BLOCKS);
        this.put("units/air_base", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.HOUSING_CENTER_PIECES, "empty", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.AIR), new BPos(25,0,23)),
                new Pair<>(new Quad<>(PoolType.HOUSING_WALLS_WALL_BASES, "edge_wall_exit", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.AIR), new BPos(0,1,23)),
                new Pair<>(new Quad<>(PoolType.HOUSING_EDGE_WALL_UNITS, "empty", new Pair<>(BlockDirection.DOWN,BlockDirection.WEST), Blocks.POLISHED_BLACKSTONE_BRICKS), new BPos(0,1,24))
        ));
        this.put("units/center_pieces/center_0", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.EMPTY, "center_piece_connector", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.AIR), new BPos(5,0,4)),
                new Pair<>(new Quad<>(PoolType.HOUSING_PATHWAYS, "center_piece_wall", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.AIR), new BPos(0,1,4)),
                new Pair<>(new Quad<>(PoolType.HOUSING_PATHWAYS, "center_piece_wall", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.AIR), new BPos(0,1,6)),
                new Pair<>(new Quad<>(PoolType.HOUSING_PATHWAYS, "center_piece", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.AIR), new BPos(4,1,0)),
                new Pair<>(new Quad<>(PoolType.HOUSING_PATHWAYS, "center_piece", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.AIR), new BPos(4,1,10)),
                new Pair<>(new Quad<>(PoolType.HOUSING_PATHWAYS, "center_piece", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.AIR), new BPos(6,1,0)),
                new Pair<>(new Quad<>(PoolType.HOUSING_PATHWAYS, "center_piece", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.AIR), new BPos(6,1,10)),
                new Pair<>(new Quad<>(PoolType.HOUSING_PATHWAYS, "center_piece", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.AIR), new BPos(10,1,4)),
                new Pair<>(new Quad<>(PoolType.HOUSING_PATHWAYS, "center_piece", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.AIR), new BPos(10,1,5)),
                new Pair<>(new Quad<>(PoolType.HOUSING_PATHWAYS, "center_piece", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.AIR), new BPos(10,1,6))
        ));
        this.put("units/center_pieces/center_1", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.EMPTY, "center_piece_connector", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.AIR), new BPos(5,0,4)),
                new Pair<>(new Quad<>(PoolType.HOUSING_PATHWAYS, "center_piece_wall", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.AIR), new BPos(0,1,4)),
                new Pair<>(new Quad<>(PoolType.HOUSING_PATHWAYS, "center_piece_wall", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.AIR), new BPos(0,1,6)),
                new Pair<>(new Quad<>(PoolType.HOUSING_PATHWAYS, "center_piece", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.AIR), new BPos(4,1,0)),
                new Pair<>(new Quad<>(PoolType.HOUSING_PATHWAYS, "center_piece", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.AIR), new BPos(5,1,10)),
                new Pair<>(new Quad<>(PoolType.HOUSING_PATHWAYS, "center_piece", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.AIR), new BPos(6,1,0)),
                new Pair<>(new Quad<>(PoolType.HOUSING_PATHWAYS, "center_piece", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.AIR), new BPos(10,1,6))
        ));
        this.put("units/center_pieces/center_2", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.EMPTY, "center_piece_connector", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.POLISHED_BLACKSTONE_BRICKS), new BPos(5,0,4)),
                new Pair<>(new Quad<>(PoolType.HOUSING_PATHWAYS, "center_piece_wall", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.AIR), new BPos(0,1,4)),
                new Pair<>(new Quad<>(PoolType.HOUSING_PATHWAYS, "center_piece_wall", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.AIR), new BPos(0,1,6)),
                new Pair<>(new Quad<>(PoolType.HOUSING_PATHWAYS, "center_piece", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.AIR), new BPos(4,1,0)),
                new Pair<>(new Quad<>(PoolType.HOUSING_PATHWAYS, "center_piece", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.AIR), new BPos(5,1,10)),
                new Pair<>(new Quad<>(PoolType.HOUSING_PATHWAYS, "center_piece", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.AIR), new BPos(6,1,0)),
                new Pair<>(new Quad<>(PoolType.HOUSING_PATHWAYS, "center_piece", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.AIR), new BPos(10,1,6))
        ));
        this.put("units/edges/edge_0", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.HOUSING_FILLERS_STAGE_0, "empty", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.AIR), new BPos(0,1,5)),
                new Pair<>(new Quad<>(PoolType.EMPTY, "edge_entry", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.AIR), new BPos(3,1,0)),
                new Pair<>(new Quad<>(PoolType.EMPTY, "edge_entry", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.AIR), new BPos(8,1,0)),
                new Pair<>(new Quad<>(PoolType.HOUSING_FILLERS_STAGE_0, "empty", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.AIR), new BPos(11,1,3)),
                new Pair<>(new Quad<>(PoolType.EMPTY, "empty", new Pair<>(BlockDirection.UP,BlockDirection.EAST), Blocks.AIR), new BPos(4,6,3)),
                new Pair<>(new Quad<>(PoolType.HOUSING_STAGES_STAGE_1, "stage_0_top", new Pair<>(BlockDirection.UP,BlockDirection.EAST), Blocks.BASALT), new BPos(6,6,4))
        ));
        this.put("units/fillers/stage_0", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.EMPTY, "filler_0_entry", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.AIR), new BPos(0,1,3)),
                new Pair<>(new Quad<>(PoolType.EMPTY, "filler_0_entry", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.AIR), new BPos(0,1,5)),
                new Pair<>(new Quad<>(PoolType.EMPTY, "filler_0_entry", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.AIR), new BPos(5,1,0)),
                new Pair<>(new Quad<>(PoolType.EMPTY, "filler_0_entry", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.AIR), new BPos(9,1,0)),
                new Pair<>(new Quad<>(PoolType.EMPTY, "filler_0_entry", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.AIR), new BPos(11,1,3)),
                new Pair<>(new Quad<>(PoolType.EMPTY, "filler_0_entry", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.AIR), new BPos(11,1,4)),
                new Pair<>(new Quad<>(PoolType.HOUSING_STAGES_STAGE_1, "stage_0_top", new Pair<>(BlockDirection.UP,BlockDirection.EAST), Blocks.AIR), new BPos(6,6,3))
        ));
        this.put("units/pathways/pathway_0", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.EMPTY, "ground_pathway_entrance", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.AIR), new BPos(1,1,0)),
                new Pair<>(new Quad<>(PoolType.HOUSING_STAGES_STAGE_0, "ground_pathway_exit", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.AIR), new BPos(1,1,1))
        ));
        this.put("units/pathways/pathway_wall_0", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.EMPTY, "ground_pathway_entrance_wall", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.AIR), new BPos(1,1,0)),
                new Pair<>(new Quad<>(PoolType.HOUSING_WALL_UNITS, "ground_pathway_exit", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.AIR), new BPos(1,1,1))
        ));
        this.put("units/rampart_plates/plate_0", Collections.singletonList(
                new Pair<>(new Quad<>(PoolType.EMPTY, "rampart_plate", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.AIR), new BPos(4,18,8))
        ));
        this.put("units/ramparts/ramparts_0", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.EMPTY, "rampart", new Pair<>(BlockDirection.DOWN,BlockDirection.WEST), Blocks.BLACKSTONE), new BPos(0,0,15)),
                new Pair<>(new Quad<>(PoolType.PIGLIN_MELEE, "empty", new Pair<>(BlockDirection.UP,BlockDirection.EAST), Blocks.POLISHED_BLACKSTONE_BRICKS), new BPos(7,16,9)),
                new Pair<>(new Quad<>(PoolType.PIGLIN, "empty", new Pair<>(BlockDirection.UP,BlockDirection.EAST), Blocks.POLISHED_BLACKSTONE_BRICKS), new BPos(8,16,5)),
                new Pair<>(new Quad<>(PoolType.PIGLIN, "empty", new Pair<>(BlockDirection.UP,BlockDirection.EAST), Blocks.POLISHED_BLACKSTONE_BRICKS), new BPos(9,16,12)),
                new Pair<>(new Quad<>(PoolType.PIGLIN_MELEE, "empty", new Pair<>(BlockDirection.UP,BlockDirection.EAST), Blocks.POLISHED_BLACKSTONE_BRICKS), new BPos(10,16,9)),
                new Pair<>(new Quad<>(PoolType.HOUSING_RAMPARTS_PLATES, "empty", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.AIR), new BPos(0,31,8))
        ));
        this.put("units/ramparts/ramparts_1", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.EMPTY, "rampart", new Pair<>(BlockDirection.DOWN,BlockDirection.WEST), Blocks.BLACKSTONE), new BPos(0,0,15)),
                new Pair<>(new Quad<>(PoolType.PIGLIN_MELEE, "empty", new Pair<>(BlockDirection.UP,BlockDirection.EAST), Blocks.POLISHED_BLACKSTONE_BRICKS), new BPos(3,12,8))
        ));
        this.put("units/ramparts/ramparts_2", Collections.singletonList(
                new Pair<>(new Quad<>(PoolType.EMPTY, "rampart", new Pair<>(BlockDirection.DOWN,BlockDirection.WEST), Blocks.BLACKSTONE), new BPos(0,0,15))
        ));
        this.put("units/stages/rot/stage_1_0", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.EMPTY, "stage_1_bottom", new Pair<>(BlockDirection.DOWN,BlockDirection.NORTH), Blocks.POLISHED_BLACKSTONE_BRICKS), new BPos(6,0,3)),
                new Pair<>(new Quad<>(PoolType.HOUSING_STAGES_STAGE_2, "stage_1_top", new Pair<>(BlockDirection.UP,BlockDirection.EAST), Blocks.POLISHED_BLACKSTONE_BRICKS), new BPos(6,6,4))
        ));
        this.put("units/stages/stage_0_0", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.GOLD, "empty", new Pair<>(BlockDirection.UP,BlockDirection.EAST), Blocks.AIR), new BPos(7,0,6)),
                new Pair<>(new Quad<>(PoolType.HOUSING_FILLERS_STAGE_0, "empty", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.AIR), new BPos(0,1,4)),
                new Pair<>(new Quad<>(PoolType.EMPTY, "stage_0_entry", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.AIR), new BPos(5,1,0)),
                new Pair<>(new Quad<>(PoolType.EMPTY, "stage_0_entry", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.AIR), new BPos(6,1,0)),
                new Pair<>(new Quad<>(PoolType.EMPTY, "stage_0_entry", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.AIR), new BPos(7,1,0)),
                new Pair<>(new Quad<>(PoolType.PIGLIN, "empty", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.POLISHED_BLACKSTONE_BRICKS), new BPos(7,1,1)),
                new Pair<>(new Quad<>(PoolType.HOUSING_EDGES, "empty", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.POLISHED_BLACKSTONE_BRICKS), new BPos(8,1,7)),
                new Pair<>(new Quad<>(PoolType.HOUSING_FILLERS_STAGE_0, "empty", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.AIR), new BPos(11,1,4)),
                new Pair<>(new Quad<>(PoolType.HOUSING_STAGES_STAGE_1, "stage_0_top", new Pair<>(BlockDirection.UP,BlockDirection.EAST), Blocks.BASALT), new BPos(6,6,4))
        ));
        this.put("units/stages/stage_0_1", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.HOUSING_FILLERS_STAGE_0, "empty", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.AIR), new BPos(0,1,3)),
                new Pair<>(new Quad<>(PoolType.EMPTY, "stage_0_entry", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.POLISHED_BLACKSTONE_BRICKS), new BPos(5,1,0)),
                new Pair<>(new Quad<>(PoolType.EMPTY, "stage_0_entry", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.POLISHED_BLACKSTONE_BRICKS), new BPos(6,1,0)),
                new Pair<>(new Quad<>(PoolType.EMPTY, "stage_0_entry", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.POLISHED_BLACKSTONE_BRICKS), new BPos(7,1,0)),
                new Pair<>(new Quad<>(PoolType.HOUSING_EDGES, "empty", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS), new BPos(8,1,7)),
                new Pair<>(new Quad<>(PoolType.HOUSING_FILLERS_STAGE_0, "empty", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.AIR), new BPos(11,1,4)),
                new Pair<>(new Quad<>(PoolType.PIGLIN, "empty", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.POLISHED_BLACKSTONE_BRICKS), new BPos(4,3,1)),
                new Pair<>(new Quad<>(PoolType.HOUSING_STAGES_STAGE_1, "stage_0_top", new Pair<>(BlockDirection.UP,BlockDirection.EAST), Blocks.AIR), new BPos(6,6,4))
        ));
        this.put("units/stages/stage_0_2", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.HOUSING_FILLERS_STAGE_0, "empty", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.AIR), new BPos(0,1,4)),
                new Pair<>(new Quad<>(PoolType.EMPTY, "stage_0_entry", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.POLISHED_BLACKSTONE_BRICKS), new BPos(5,1,0)),
                new Pair<>(new Quad<>(PoolType.EMPTY, "stage_0_entry", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.POLISHED_BLACKSTONE_BRICKS), new BPos(6,1,0)),
                new Pair<>(new Quad<>(PoolType.EMPTY, "stage_0_entry", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS), new BPos(7,1,0)),
                new Pair<>(new Quad<>(PoolType.HOUSING_EDGES, "empty", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS), new BPos(8,1,7)),
                new Pair<>(new Quad<>(PoolType.HOUSING_FILLERS_STAGE_0, "empty", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.AIR), new BPos(11,1,4)),
                new Pair<>(new Quad<>(PoolType.PIGLIN_MELEE, "empty", new Pair<>(BlockDirection.UP,BlockDirection.WEST), Blocks.POLISHED_BLACKSTONE_BRICKS), new BPos(2,3,4)),
                new Pair<>(new Quad<>(PoolType.PIGLIN, "empty", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.POLISHED_BLACKSTONE_BRICKS), new BPos(4,3,1)),
                new Pair<>(new Quad<>(PoolType.GOLD, "empty", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.POLISHED_BLACKSTONE_BRICKS), new BPos(7,3,6)),
                new Pair<>(new Quad<>(PoolType.HOUSING_STAGES_STAGE_1, "stage_0_top", new Pair<>(BlockDirection.UP,BlockDirection.EAST), Blocks.AIR), new BPos(6,6,4))
        ));
        this.put("units/stages/stage_0_3", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.HOUSING_FILLERS_STAGE_0, "empty", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.AIR), new BPos(0,1,4)),
                new Pair<>(new Quad<>(PoolType.EMPTY, "stage_0_entry", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.POLISHED_BLACKSTONE_BRICKS), new BPos(5,1,0)),
                new Pair<>(new Quad<>(PoolType.EMPTY, "stage_0_entry", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.POLISHED_BLACKSTONE_BRICKS), new BPos(6,1,0)),
                new Pair<>(new Quad<>(PoolType.PIGLIN, "empty", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.POLISHED_BLACKSTONE_BRICKS), new BPos(6,1,1)),
                new Pair<>(new Quad<>(PoolType.EMPTY, "stage_0_entry", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.BASALT), new BPos(7,1,0)),
                new Pair<>(new Quad<>(PoolType.HOUSING_EDGES, "empty", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS), new BPos(8,1,7)),
                new Pair<>(new Quad<>(PoolType.HOUSING_FILLERS_STAGE_0, "empty", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.AIR), new BPos(11,1,4)),
                new Pair<>(new Quad<>(PoolType.GOLD, "empty", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.POLISHED_BLACKSTONE_BRICKS), new BPos(0,3,6)),
                new Pair<>(new Quad<>(PoolType.HOUSING_STAGES_STAGE_1, "stage_0_top", new Pair<>(BlockDirection.UP,BlockDirection.EAST), Blocks.BASALT), new BPos(6,6,4))
        ));
        this.put("units/stages/stage_1_0", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.EMPTY, "stage_1_bottom", new Pair<>(BlockDirection.DOWN,BlockDirection.NORTH), Blocks.POLISHED_BLACKSTONE_BRICKS), new BPos(6,0,3)),
                new Pair<>(new Quad<>(PoolType.GOLD, "empty", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.POLISHED_BLACKSTONE_BRICKS), new BPos(7,0,5)),
                new Pair<>(new Quad<>(PoolType.PIGLIN, "empty", new Pair<>(BlockDirection.UP,BlockDirection.EAST), Blocks.POLISHED_BLACKSTONE_BRICKS), new BPos(3,1,1)),
                new Pair<>(new Quad<>(PoolType.HOUSING_STAGES_STAGE_2, "stage_1_top", new Pair<>(BlockDirection.UP,BlockDirection.EAST), Blocks.POLISHED_BLACKSTONE_BRICKS), new BPos(6,6,4))
        ));
        this.put("units/stages/stage_1_1", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.EMPTY, "stage_1_bottom", new Pair<>(BlockDirection.DOWN,BlockDirection.EAST), Blocks.POLISHED_BLACKSTONE_BRICKS), new BPos(6,0,4)),
                new Pair<>(new Quad<>(PoolType.GOLD, "empty", new Pair<>(BlockDirection.UP,BlockDirection.EAST), Blocks.POLISHED_BLACKSTONE_BRICKS), new BPos(8,3,5)),
                new Pair<>(new Quad<>(PoolType.HOUSING_STAGES_STAGE_2, "stage_1_top", new Pair<>(BlockDirection.UP,BlockDirection.EAST), Blocks.POLISHED_BLACKSTONE_BRICKS), new BPos(6,6,4))
        ));
        this.put("units/stages/stage_1_2", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.EMPTY, "stage_1_bottom", new Pair<>(BlockDirection.DOWN,BlockDirection.EAST), Blocks.POLISHED_BLACKSTONE_BRICKS), new BPos(6,0,3)),
                new Pair<>(new Quad<>(PoolType.PIGLIN_MELEE, "empty", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.POLISHED_BLACKSTONE_BRICKS), new BPos(9,1,3)),
                new Pair<>(new Quad<>(PoolType.HOUSING_STAGES_STAGE_2, "stage_1_top", new Pair<>(BlockDirection.UP,BlockDirection.EAST), Blocks.POLISHED_BLACKSTONE_BRICKS), new BPos(5,6,4))
        ));
        this.put("units/stages/stage_1_3", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.EMPTY, "stage_1_bottom", new Pair<>(BlockDirection.DOWN,BlockDirection.EAST), Blocks.POLISHED_BLACKSTONE_BRICKS), new BPos(6,0,3)),
                new Pair<>(new Quad<>(PoolType.PIGLIN, "empty", new Pair<>(BlockDirection.UP,BlockDirection.WEST), Blocks.POLISHED_BLACKSTONE_BRICKS), new BPos(5,1,4)),
                new Pair<>(new Quad<>(PoolType.PIGLIN, "empty", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.POLISHED_BLACKSTONE_BRICKS), new BPos(4,3,1)),
                new Pair<>(new Quad<>(PoolType.GOLD, "empty", new Pair<>(BlockDirection.UP,BlockDirection.EAST), Blocks.POLISHED_BLACKSTONE_BRICKS), new BPos(7,3,6)),
                new Pair<>(new Quad<>(PoolType.HOUSING_STAGES_STAGE_2, "stage_1_top", new Pair<>(BlockDirection.UP,BlockDirection.EAST), Blocks.POLISHED_BLACKSTONE_BRICKS), new BPos(6,6,4))
        ));
        this.put("units/stages/stage_2_0", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.EMPTY, "stage_2_bottom", new Pair<>(BlockDirection.DOWN,BlockDirection.NORTH), Blocks.POLISHED_BLACKSTONE_BRICKS), new BPos(6,0,3)),
                new Pair<>(new Quad<>(PoolType.PIGLIN, "empty", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.POLISHED_BLACKSTONE_BRICKS), new BPos(2,1,1)),
                new Pair<>(new Quad<>(PoolType.HOUSING_STAGES_STAGE_3, "stage_2_top", new Pair<>(BlockDirection.UP,BlockDirection.SOUTH), Blocks.BASALT), new BPos(5,6,4))
        ));
        this.put("units/stages/stage_2_1", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.EMPTY, "stage_2_bottom", new Pair<>(BlockDirection.DOWN,BlockDirection.NORTH), Blocks.POLISHED_BLACKSTONE_BRICKS), new BPos(6,0,3)),
                new Pair<>(new Quad<>(PoolType.PIGLIN, "empty", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.POLISHED_BLACKSTONE_BRICKS), new BPos(2,1,1)),
                new Pair<>(new Quad<>(PoolType.HOUSING_STAGES_STAGE_3, "stage_2_top", new Pair<>(BlockDirection.UP,BlockDirection.SOUTH), Blocks.BASALT), new BPos(5,6,4))
        ));
        this.put("units/stages/stage_3_0", Collections.singletonList(
                new Pair<>(new Quad<>(PoolType.EMPTY, "stage_3_bottom", new Pair<>(BlockDirection.DOWN,BlockDirection.NORTH), Blocks.AIR), new BPos(5,0,4))
        ));
        this.put("units/stages/stage_3_1", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.GOLD, "empty", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.POLISHED_BLACKSTONE_BRICKS), new BPos(1,0,2)),
                new Pair<>(new Quad<>(PoolType.EMPTY, "stage_3_bottom", new Pair<>(BlockDirection.DOWN,BlockDirection.EAST), Blocks.AIR), new BPos(5,0,3))
        ));
        this.put("units/stages/stage_3_2", Collections.singletonList(
                new Pair<>(new Quad<>(PoolType.EMPTY, "stage_3_bottom", new Pair<>(BlockDirection.DOWN,BlockDirection.EAST), Blocks.AIR), new BPos(5,0,3))
        ));
        this.put("units/stages/stage_3_3", Collections.singletonList(
                new Pair<>(new Quad<>(PoolType.EMPTY, "stage_3_bottom", new Pair<>(BlockDirection.DOWN,BlockDirection.EAST), Blocks.AIR), new BPos(5,0,4))
        ));
        this.put("units/wall_units/edge_0_large", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.EMPTY, "edge_wall_unit_connector", new Pair<>(BlockDirection.UP,BlockDirection.SOUTH), Blocks.POLISHED_BLACKSTONE_BRICKS), new BPos(9,0,8)),
                new Pair<>(new Quad<>(PoolType.HOUSING_FILLERS_STAGE_0, "empty", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.AIR), new BPos(0,1,1)),
                new Pair<>(new Quad<>(PoolType.HOUSING_WALL_UNITS, "empty", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.AIR), new BPos(6,1,0)),
                new Pair<>(new Quad<>(PoolType.HOUSING_FILLERS_STAGE_0, "empty", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.AIR), new BPos(11,1,1)),
                new Pair<>(new Quad<>(PoolType.HOUSING_STAGES_ROT_STAGE_1, "stage_0_top", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.AIR), new BPos(5,6,2))
        ));
        this.put("units/wall_units/unit_0", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.GOLD, "empty", new Pair<>(BlockDirection.UP,BlockDirection.EAST), Blocks.POLISHED_BLACKSTONE_BRICKS), new BPos(10,0,5)),
                new Pair<>(new Quad<>(PoolType.HOUSING_FILLERS_STAGE_0, "empty", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.AIR), new BPos(0,1,3)),
                new Pair<>(new Quad<>(PoolType.EMPTY, "edge_wall_entry", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.POLISHED_BLACKSTONE_BRICKS), new BPos(10,1,7)),
                new Pair<>(new Quad<>(PoolType.HOUSING_STAGES_STAGE_1, "stage_0_top", new Pair<>(BlockDirection.UP,BlockDirection.EAST), Blocks.AIR), new BPos(4,6,2))
        ));
        this.put("units/walls/connected_wall", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.EMPTY, "wall_connected_wall", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.BLACKSTONE), new BPos(0,1,0)),
                new Pair<>(new Quad<>(PoolType.PIGLIN, "empty", new Pair<>(BlockDirection.UP,BlockDirection.WEST), Blocks.BLACKSTONE), new BPos(8,4,6)),
                new Pair<>(new Quad<>(PoolType.PIGLIN, "empty", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.BLACKSTONE), new BPos(12,8,10)),
                new Pair<>(new Quad<>(PoolType.PIGLIN_MELEE, "empty", new Pair<>(BlockDirection.UP,BlockDirection.WEST), Blocks.BLACKSTONE), new BPos(2,13,7)),
                new Pair<>(new Quad<>(PoolType.HOUSING_RAMPARTS, "wall", new Pair<>(BlockDirection.UP,BlockDirection.SOUTH), Blocks.BLACKSTONE), new BPos(15,23,15))
        ));
        this.put("units/walls/wall_base", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.HOUSING_EDGE_WALL_UNITS, "wall_base", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.BLACKSTONE), new BPos(5,1,0)),
                new Pair<>(new Quad<>(PoolType.HOUSING_WALLS_WALL_BASES, "path_connected_wall", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.BLACKSTONE), new BPos(15,1,0)),
                new Pair<>(new Quad<>(PoolType.PIGLIN, "empty", new Pair<>(BlockDirection.UP,BlockDirection.EAST), Blocks.POLISHED_BLACKSTONE_BRICKS), new BPos(2,2,3)),
                new Pair<>(new Quad<>(PoolType.PIGLIN, "empty", new Pair<>(BlockDirection.UP,BlockDirection.EAST), Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS), new BPos(4,5,10)),
                new Pair<>(new Quad<>(PoolType.PIGLIN, "empty", new Pair<>(BlockDirection.UP,BlockDirection.SOUTH), Blocks.POLISHED_BLACKSTONE_BRICKS), new BPos(5,6,8)),
                new Pair<>(new Quad<>(PoolType.PIGLIN, "empty", new Pair<>(BlockDirection.UP,BlockDirection.EAST), Blocks.POLISHED_BLACKSTONE_BRICKS), new BPos(4,7,7)),
                new Pair<>(new Quad<>(PoolType.PIGLIN, "empty", new Pair<>(BlockDirection.UP,BlockDirection.EAST), Blocks.POLISHED_BLACKSTONE_BRICKS), new BPos(13,11,3)),
                new Pair<>(new Quad<>(PoolType.PIGLIN, "empty", new Pair<>(BlockDirection.UP,BlockDirection.EAST), Blocks.POLISHED_BLACKSTONE_BRICKS), new BPos(11,18,14)),
                new Pair<>(new Quad<>(PoolType.PIGLIN, "empty", new Pair<>(BlockDirection.UP,BlockDirection.SOUTH), Blocks.POLISHED_BLACKSTONE_BRICKS), new BPos(12,18,12)),
                new Pair<>(new Quad<>(PoolType.HOUSING_LARGE_RAMPARTS, "wall", new Pair<>(BlockDirection.UP,BlockDirection.SOUTH), Blocks.BLACKSTONE), new BPos(15,23,15))
        ));
    }};
}
