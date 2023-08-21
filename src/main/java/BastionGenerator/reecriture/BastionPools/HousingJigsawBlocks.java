package BastionGenerator.reecriture.BastionPools;

import BastionGenerator.enumType.JointType;
import BastionGenerator.enumType.PoolType;
import com.seedfinding.mccore.util.block.BlockDirection;
import com.seedfinding.mccore.util.pos.BPos;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class HousingJigsawBlocks {
    public static final HashMap<String, List<JigsawBlock>> JIGSAW_BLOCKS = new HashMap<>() {
		private static final long serialVersionUID = 1471852754124802591L;
	{
            this.putAll(MobsJigsawBlocks.JIGSAW_BLOCKS);
        this.put("units/air_base", Arrays.asList(
                new JigsawBlock(PoolType.HOUSING_CENTER_PIECES, JointType.ROLLABLE, "empty", "center_piece_connector", BlockDirection.WEST, BlockDirection.UP, new BPos(25,0,23)),
                new JigsawBlock(PoolType.HOUSING_WALLS_WALL_BASES, JointType.ROLLABLE, "edge_wall_exit", "wall_base", BlockDirection.WEST, BlockDirection.UP, new BPos(0,1,23)),
                new JigsawBlock(PoolType.HOUSING_EDGE_WALL_UNITS, JointType.ALIGNED, "empty", "edge_wall_unit_connector", BlockDirection.DOWN, BlockDirection.WEST, new BPos(0,1,24))
        ));
        this.put("units/center_pieces/center_0", Arrays.asList(
                new JigsawBlock(PoolType.EMPTY, JointType.ROLLABLE, "center_piece_connector", "empty", BlockDirection.EAST, BlockDirection.UP, new BPos(5,0,4)),
                new JigsawBlock(PoolType.HOUSING_PATHWAYS, JointType.ALIGNED, "center_piece_wall", "ground_pathway_entrance_wall", BlockDirection.WEST, BlockDirection.UP, new BPos(0,1,4)),
                new JigsawBlock(PoolType.HOUSING_PATHWAYS, JointType.ALIGNED, "center_piece_wall", "ground_pathway_entrance_wall", BlockDirection.WEST, BlockDirection.UP, new BPos(0,1,6)),
                new JigsawBlock(PoolType.HOUSING_PATHWAYS, JointType.ALIGNED, "center_piece", "ground_pathway_entrance", BlockDirection.NORTH, BlockDirection.UP, new BPos(4,1,0)),
                new JigsawBlock(PoolType.HOUSING_PATHWAYS, JointType.ALIGNED, "center_piece", "ground_pathway_entrance", BlockDirection.SOUTH, BlockDirection.UP, new BPos(4,1,10)),
                new JigsawBlock(PoolType.HOUSING_PATHWAYS, JointType.ALIGNED, "center_piece", "ground_pathway_entrance", BlockDirection.NORTH, BlockDirection.UP, new BPos(6,1,0)),
                new JigsawBlock(PoolType.HOUSING_PATHWAYS, JointType.ALIGNED, "center_piece", "ground_pathway_entrance", BlockDirection.SOUTH, BlockDirection.UP, new BPos(6,1,10)),
                new JigsawBlock(PoolType.HOUSING_PATHWAYS, JointType.ALIGNED, "center_piece", "ground_pathway_entrance", BlockDirection.EAST, BlockDirection.UP, new BPos(10,1,4)),
                new JigsawBlock(PoolType.HOUSING_PATHWAYS, JointType.ALIGNED, "center_piece", "ground_pathway_entrance", BlockDirection.EAST, BlockDirection.UP, new BPos(10,1,5)),
                new JigsawBlock(PoolType.HOUSING_PATHWAYS, JointType.ALIGNED, "center_piece", "ground_pathway_entrance", BlockDirection.EAST, BlockDirection.UP, new BPos(10,1,6))
        ));
        this.put("units/center_pieces/center_1", Arrays.asList(
                new JigsawBlock(PoolType.EMPTY, JointType.ROLLABLE, "center_piece_connector", "empty", BlockDirection.EAST, BlockDirection.UP, new BPos(5,0,4)),
                new JigsawBlock(PoolType.HOUSING_PATHWAYS, JointType.ALIGNED, "center_piece_wall", "ground_pathway_entrance_wall", BlockDirection.WEST, BlockDirection.UP, new BPos(0,1,4)),
                new JigsawBlock(PoolType.HOUSING_PATHWAYS, JointType.ALIGNED, "center_piece_wall", "ground_pathway_entrance_wall", BlockDirection.WEST, BlockDirection.UP, new BPos(0,1,6)),
                new JigsawBlock(PoolType.HOUSING_PATHWAYS, JointType.ALIGNED, "center_piece", "ground_pathway_entrance", BlockDirection.NORTH, BlockDirection.UP, new BPos(4,1,0)),
                new JigsawBlock(PoolType.HOUSING_PATHWAYS, JointType.ALIGNED, "center_piece", "ground_pathway_entrance", BlockDirection.SOUTH, BlockDirection.UP, new BPos(5,1,10)),
                new JigsawBlock(PoolType.HOUSING_PATHWAYS, JointType.ALIGNED, "center_piece", "ground_pathway_entrance", BlockDirection.NORTH, BlockDirection.UP, new BPos(6,1,0)),
                new JigsawBlock(PoolType.HOUSING_PATHWAYS, JointType.ALIGNED, "center_piece", "ground_pathway_entrance", BlockDirection.EAST, BlockDirection.UP, new BPos(10,1,6))
        ));
        this.put("units/center_pieces/center_2", Arrays.asList(
                new JigsawBlock(PoolType.EMPTY, JointType.ROLLABLE, "center_piece_connector", "empty", BlockDirection.EAST, BlockDirection.UP, new BPos(5,0,4)),
                new JigsawBlock(PoolType.HOUSING_PATHWAYS, JointType.ALIGNED, "center_piece_wall", "ground_pathway_entrance_wall", BlockDirection.WEST, BlockDirection.UP, new BPos(0,1,4)),
                new JigsawBlock(PoolType.HOUSING_PATHWAYS, JointType.ALIGNED, "center_piece_wall", "ground_pathway_entrance_wall", BlockDirection.WEST, BlockDirection.UP, new BPos(0,1,6)),
                new JigsawBlock(PoolType.HOUSING_PATHWAYS, JointType.ALIGNED, "center_piece", "ground_pathway_entrance", BlockDirection.NORTH, BlockDirection.UP, new BPos(4,1,0)),
                new JigsawBlock(PoolType.HOUSING_PATHWAYS, JointType.ALIGNED, "center_piece", "ground_pathway_entrance", BlockDirection.SOUTH, BlockDirection.UP, new BPos(5,1,10)),
                new JigsawBlock(PoolType.HOUSING_PATHWAYS, JointType.ALIGNED, "center_piece", "ground_pathway_entrance", BlockDirection.NORTH, BlockDirection.UP, new BPos(6,1,0)),
                new JigsawBlock(PoolType.HOUSING_PATHWAYS, JointType.ALIGNED, "center_piece", "ground_pathway_entrance", BlockDirection.EAST, BlockDirection.UP, new BPos(10,1,6))
        ));
        this.put("units/walls/connected_wall", Arrays.asList(
                new JigsawBlock(PoolType.EMPTY, JointType.ROLLABLE, "wall_connected_wall", "empty", BlockDirection.WEST, BlockDirection.UP, new BPos(0,1,0)),
                new JigsawBlock(PoolType.PIGLIN, JointType.ROLLABLE, "empty", "mob_connector", BlockDirection.UP, BlockDirection.WEST, new BPos(8,4,6)),
                new JigsawBlock(PoolType.PIGLIN, JointType.ROLLABLE, "empty", "mob_connector", BlockDirection.UP, BlockDirection.NORTH, new BPos(12,8,10)),
                new JigsawBlock(PoolType.PIGLIN_MELEE, JointType.ROLLABLE, "empty", "mob_connector", BlockDirection.UP, BlockDirection.WEST, new BPos(2,13,7)),
                new JigsawBlock(PoolType.HOUSING_RAMPARTS, JointType.ALIGNED, "wall", "rampart", BlockDirection.UP, BlockDirection.SOUTH, new BPos(15,23,15))
        ));
        this.put("units/edges/edge_0", Arrays.asList(
                new JigsawBlock(PoolType.HOUSING_FILLERS_STAGE_0, JointType.ROLLABLE, "empty", "filler_0_entry", BlockDirection.WEST, BlockDirection.UP, new BPos(0,1,5)),
                new JigsawBlock(PoolType.EMPTY, JointType.ROLLABLE, "edge_entry", "empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(3,1,0)),
                new JigsawBlock(PoolType.EMPTY, JointType.ROLLABLE, "edge_entry", "empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(8,1,0)),
                new JigsawBlock(PoolType.HOUSING_FILLERS_STAGE_0, JointType.ROLLABLE, "empty", "filler_0_entry", BlockDirection.EAST, BlockDirection.UP, new BPos(11,1,3)),
                new JigsawBlock(PoolType.EMPTY, JointType.ROLLABLE, "empty", "empty", BlockDirection.UP, BlockDirection.EAST, new BPos(4,6,3)),
                new JigsawBlock(PoolType.HOUSING_STAGES_STAGE_1, JointType.ROLLABLE, "stage_0_top", "stage_1_bottom", BlockDirection.UP, BlockDirection.EAST, new BPos(6,6,4))
        ));
        this.put("units/wall_units/edge_0_large", Arrays.asList(
                new JigsawBlock(PoolType.EMPTY, JointType.ALIGNED, "edge_wall_unit_connector", "empty", BlockDirection.UP, BlockDirection.SOUTH, new BPos(9,0,8)),
                new JigsawBlock(PoolType.HOUSING_FILLERS_STAGE_0, JointType.ROLLABLE, "empty", "filler_0_entry", BlockDirection.WEST, BlockDirection.UP, new BPos(0,1,1)),
                new JigsawBlock(PoolType.HOUSING_WALL_UNITS, JointType.ROLLABLE, "empty", "edge_wall_entry", BlockDirection.NORTH, BlockDirection.UP, new BPos(6,1,0)),
                new JigsawBlock(PoolType.HOUSING_FILLERS_STAGE_0, JointType.ROLLABLE, "empty", "filler_0_entry", BlockDirection.EAST, BlockDirection.UP, new BPos(11,1,1)),
                new JigsawBlock(PoolType.HOUSING_STAGES_ROT_STAGE_1, JointType.ALIGNED, "stage_0_top", "stage_1_bottom", BlockDirection.UP, BlockDirection.NORTH, new BPos(5,6,2))
        ));
        this.put("units/pathways/pathway_0", Arrays.asList(
                new JigsawBlock(PoolType.EMPTY, JointType.ALIGNED, "ground_pathway_entrance", "empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(1,1,0)),
                new JigsawBlock(PoolType.HOUSING_STAGES_STAGE_0, JointType.ALIGNED, "ground_pathway_exit", "stage_0_entry", BlockDirection.SOUTH, BlockDirection.UP, new BPos(1,1,1))
        ));
        this.put("units/pathways/pathway_wall_0", Arrays.asList(
                new JigsawBlock(PoolType.EMPTY, JointType.ALIGNED, "ground_pathway_entrance_wall", "empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(1,1,0)),
                new JigsawBlock(PoolType.HOUSING_WALL_UNITS, JointType.ALIGNED, "ground_pathway_exit", "wall_entry", BlockDirection.SOUTH, BlockDirection.UP, new BPos(1,1,1))
        ));
        this.put("units/rampart_plates/plate_0", Collections.singletonList(
                new JigsawBlock(PoolType.EMPTY, JointType.ALIGNED, "rampart_plate", "empty", BlockDirection.EAST, BlockDirection.UP, new BPos(4,18,8))
        ));
        this.put("units/ramparts/ramparts_0", Arrays.asList(
                new JigsawBlock(PoolType.EMPTY, JointType.ALIGNED, "rampart", "empty", BlockDirection.DOWN, BlockDirection.WEST, new BPos(0,0,15)),
                new JigsawBlock(PoolType.PIGLIN_MELEE, JointType.ROLLABLE, "empty", "mob_connector", BlockDirection.UP, BlockDirection.EAST, new BPos(7,16,9)),
                new JigsawBlock(PoolType.PIGLIN, JointType.ROLLABLE, "empty", "mob_connector", BlockDirection.UP, BlockDirection.EAST, new BPos(8,16,5)),
                new JigsawBlock(PoolType.PIGLIN, JointType.ROLLABLE, "empty", "mob_connector", BlockDirection.UP, BlockDirection.EAST, new BPos(9,16,12)),
                new JigsawBlock(PoolType.PIGLIN_MELEE, JointType.ROLLABLE, "empty", "mob_connector", BlockDirection.UP, BlockDirection.EAST, new BPos(10,16,9)),
                new JigsawBlock(PoolType.HOUSING_RAMPARTS_PLATES, JointType.ALIGNED, "empty", "rampart_plate", BlockDirection.WEST, BlockDirection.UP, new BPos(0,31,8))
        ));
        this.put("units/ramparts/ramparts_1", Arrays.asList(
                new JigsawBlock(PoolType.EMPTY, JointType.ALIGNED, "rampart", "empty", BlockDirection.DOWN, BlockDirection.WEST, new BPos(0,0,15)),
                new JigsawBlock(PoolType.PIGLIN_MELEE, JointType.ROLLABLE, "empty", "mob_connector", BlockDirection.UP, BlockDirection.EAST, new BPos(3,12,8))
        ));
        this.put("units/ramparts/ramparts_2", Collections.singletonList(
                new JigsawBlock(PoolType.EMPTY, JointType.ALIGNED, "rampart", "empty", BlockDirection.DOWN, BlockDirection.WEST, new BPos(0,0,15))
        ));
        this.put("units/stages/rot/stage_1_0", Arrays.asList(
                new JigsawBlock(PoolType.EMPTY, JointType.ALIGNED, "stage_1_bottom", "empty", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(6,0,3)),
                new JigsawBlock(PoolType.HOUSING_STAGES_STAGE_2, JointType.ROLLABLE, "stage_1_top", "stage_2_bottom", BlockDirection.UP, BlockDirection.EAST, new BPos(6,6,4))
        ));
        this.put("units/fillers/stage_0", Arrays.asList(
                new JigsawBlock(PoolType.EMPTY, JointType.ROLLABLE, "filler_0_entry", "empty", BlockDirection.WEST, BlockDirection.UP, new BPos(0,1,3)),
                new JigsawBlock(PoolType.EMPTY, JointType.ROLLABLE, "filler_0_entry", "empty", BlockDirection.WEST, BlockDirection.UP, new BPos(0,1,5)),
                new JigsawBlock(PoolType.EMPTY, JointType.ROLLABLE, "filler_0_entry", "empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(5,1,0)),
                new JigsawBlock(PoolType.EMPTY, JointType.ROLLABLE, "filler_0_entry", "empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(9,1,0)),
                new JigsawBlock(PoolType.EMPTY, JointType.ROLLABLE, "filler_0_entry", "empty", BlockDirection.EAST, BlockDirection.UP, new BPos(11,1,3)),
                new JigsawBlock(PoolType.EMPTY, JointType.ROLLABLE, "filler_0_entry", "empty", BlockDirection.EAST, BlockDirection.UP, new BPos(11,1,4)),
                new JigsawBlock(PoolType.HOUSING_STAGES_STAGE_1, JointType.ROLLABLE, "stage_0_top", "stage_1_bottom", BlockDirection.UP, BlockDirection.EAST, new BPos(6,6,3))
        ));
        this.put("units/stages/stage_0_0", Arrays.asList(
                new JigsawBlock(PoolType.GOLD, JointType.ALIGNED, "empty", "block_connector", BlockDirection.UP, BlockDirection.EAST, new BPos(7,0,6)),
                new JigsawBlock(PoolType.HOUSING_FILLERS_STAGE_0, JointType.ROLLABLE, "empty", "filler_0_entry", BlockDirection.WEST, BlockDirection.UP, new BPos(0,1,4)),
                new JigsawBlock(PoolType.EMPTY, JointType.ROLLABLE, "stage_0_entry", "empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(5,1,0)),
                new JigsawBlock(PoolType.EMPTY, JointType.ROLLABLE, "stage_0_entry", "empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(6,1,0)),
                new JigsawBlock(PoolType.EMPTY, JointType.ROLLABLE, "stage_0_entry", "empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(7,1,0)),
                new JigsawBlock(PoolType.PIGLIN, JointType.ALIGNED, "empty", "mob_connector", BlockDirection.UP, BlockDirection.NORTH, new BPos(7,1,1)),
                new JigsawBlock(PoolType.HOUSING_EDGES, JointType.ROLLABLE, "empty", "edge_entry", BlockDirection.SOUTH, BlockDirection.UP, new BPos(8,1,7)),
                new JigsawBlock(PoolType.HOUSING_FILLERS_STAGE_0, JointType.ROLLABLE, "empty", "filler_0_entry", BlockDirection.EAST, BlockDirection.UP, new BPos(11,1,4)),
                new JigsawBlock(PoolType.HOUSING_STAGES_STAGE_1, JointType.ROLLABLE, "stage_0_top", "stage_1_bottom", BlockDirection.UP, BlockDirection.EAST, new BPos(6,6,4))
        ));
        this.put("units/stages/stage_0_1", Arrays.asList(
                new JigsawBlock(PoolType.HOUSING_FILLERS_STAGE_0, JointType.ROLLABLE, "empty", "filler_0_entry", BlockDirection.WEST, BlockDirection.UP, new BPos(0,1,3)),
                new JigsawBlock(PoolType.EMPTY, JointType.ROLLABLE, "stage_0_entry", "empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(5,1,0)),
                new JigsawBlock(PoolType.EMPTY, JointType.ROLLABLE, "stage_0_entry", "empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(6,1,0)),
                new JigsawBlock(PoolType.EMPTY, JointType.ROLLABLE, "stage_0_entry", "empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(7,1,0)),
                new JigsawBlock(PoolType.HOUSING_EDGES, JointType.ROLLABLE, "empty", "edge_entry", BlockDirection.SOUTH, BlockDirection.UP, new BPos(8,1,7)),
                new JigsawBlock(PoolType.HOUSING_FILLERS_STAGE_0, JointType.ROLLABLE, "empty", "filler_0_entry", BlockDirection.EAST, BlockDirection.UP, new BPos(11,1,4)),
                new JigsawBlock(PoolType.PIGLIN, JointType.ALIGNED, "empty", "mob_connector", BlockDirection.UP, BlockDirection.NORTH, new BPos(4,3,1)),
                new JigsawBlock(PoolType.HOUSING_STAGES_STAGE_1, JointType.ROLLABLE, "stage_0_top", "stage_1_bottom", BlockDirection.UP, BlockDirection.EAST, new BPos(6,6,4))
        ));
        this.put("units/stages/stage_0_2", Arrays.asList(
                new JigsawBlock(PoolType.HOUSING_FILLERS_STAGE_0, JointType.ROLLABLE, "empty", "filler_0_entry", BlockDirection.WEST, BlockDirection.UP, new BPos(0,1,4)),
                new JigsawBlock(PoolType.EMPTY, JointType.ROLLABLE, "stage_0_entry", "empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(5,1,0)),
                new JigsawBlock(PoolType.EMPTY, JointType.ROLLABLE, "stage_0_entry", "empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(6,1,0)),
                new JigsawBlock(PoolType.EMPTY, JointType.ROLLABLE, "stage_0_entry", "empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(7,1,0)),
                new JigsawBlock(PoolType.HOUSING_EDGES, JointType.ROLLABLE, "empty", "edge_entry", BlockDirection.SOUTH, BlockDirection.UP, new BPos(8,1,7)),
                new JigsawBlock(PoolType.HOUSING_FILLERS_STAGE_0, JointType.ROLLABLE, "empty", "filler_0_entry", BlockDirection.EAST, BlockDirection.UP, new BPos(11,1,4)),
                new JigsawBlock(PoolType.PIGLIN_MELEE, JointType.ROLLABLE, "empty", "mob_connector", BlockDirection.UP, BlockDirection.WEST, new BPos(2,3,4)),
                new JigsawBlock(PoolType.PIGLIN, JointType.ALIGNED, "empty", "mob_connector", BlockDirection.UP, BlockDirection.NORTH, new BPos(4,3,1)),
                new JigsawBlock(PoolType.GOLD, JointType.ALIGNED, "empty", "block_connector", BlockDirection.UP, BlockDirection.NORTH, new BPos(7,3,6)),
                new JigsawBlock(PoolType.HOUSING_STAGES_STAGE_1, JointType.ROLLABLE, "stage_0_top", "stage_1_bottom", BlockDirection.UP, BlockDirection.EAST, new BPos(6,6,4))
        ));
        this.put("units/stages/stage_0_3", Arrays.asList(
                new JigsawBlock(PoolType.HOUSING_FILLERS_STAGE_0, JointType.ROLLABLE, "empty", "filler_0_entry", BlockDirection.WEST, BlockDirection.UP, new BPos(0,1,4)),
                new JigsawBlock(PoolType.EMPTY, JointType.ROLLABLE, "stage_0_entry", "empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(5,1,0)),
                new JigsawBlock(PoolType.EMPTY, JointType.ROLLABLE, "stage_0_entry", "empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(6,1,0)),
                new JigsawBlock(PoolType.PIGLIN, JointType.ALIGNED, "empty", "mob_connector", BlockDirection.UP, BlockDirection.NORTH, new BPos(6,1,1)),
                new JigsawBlock(PoolType.EMPTY, JointType.ROLLABLE, "stage_0_entry", "empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(7,1,0)),
                new JigsawBlock(PoolType.HOUSING_EDGES, JointType.ROLLABLE, "empty", "edge_entry", BlockDirection.SOUTH, BlockDirection.UP, new BPos(8,1,7)),
                new JigsawBlock(PoolType.HOUSING_FILLERS_STAGE_0, JointType.ROLLABLE, "empty", "filler_0_entry", BlockDirection.EAST, BlockDirection.UP, new BPos(11,1,4)),
                new JigsawBlock(PoolType.GOLD, JointType.ALIGNED, "empty", "block_connector", BlockDirection.UP, BlockDirection.NORTH, new BPos(0,3,6)),
                new JigsawBlock(PoolType.HOUSING_STAGES_STAGE_1, JointType.ROLLABLE, "stage_0_top", "stage_1_bottom", BlockDirection.UP, BlockDirection.EAST, new BPos(6,6,4))
        ));
        this.put("units/stages/stage_1_0", Arrays.asList(
                new JigsawBlock(PoolType.EMPTY, JointType.ROLLABLE, "stage_1_bottom", "stage_0_top", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(6,0,3)),
                new JigsawBlock(PoolType.GOLD, JointType.ALIGNED, "empty", "block_connector", BlockDirection.UP, BlockDirection.NORTH, new BPos(7,0,5)),
                new JigsawBlock(PoolType.PIGLIN, JointType.ALIGNED, "empty", "mob_connector", BlockDirection.UP, BlockDirection.EAST, new BPos(3,1,1)),
                new JigsawBlock(PoolType.HOUSING_STAGES_STAGE_2, JointType.ROLLABLE, "stage_1_top", "stage_2_bottom", BlockDirection.UP, BlockDirection.EAST, new BPos(6,6,4))
        ));
        this.put("units/stages/stage_1_1", Arrays.asList(
                new JigsawBlock(PoolType.EMPTY, JointType.ROLLABLE, "stage_1_bottom", "stage_0_top", BlockDirection.DOWN, BlockDirection.EAST, new BPos(6,0,4)),
                new JigsawBlock(PoolType.GOLD, JointType.ALIGNED, "empty", "block_connector", BlockDirection.UP, BlockDirection.EAST, new BPos(8,3,5)),
                new JigsawBlock(PoolType.HOUSING_STAGES_STAGE_2, JointType.ROLLABLE, "stage_1_top", "stage_2_bottom", BlockDirection.UP, BlockDirection.EAST, new BPos(6,6,4))
        ));
        this.put("units/stages/stage_1_2", Arrays.asList(
                new JigsawBlock(PoolType.EMPTY, JointType.ROLLABLE, "stage_1_bottom", "stage_0_top", BlockDirection.DOWN, BlockDirection.EAST, new BPos(6,0,3)),
                new JigsawBlock(PoolType.PIGLIN_MELEE, JointType.ALIGNED, "empty", "mob_connector", BlockDirection.UP, BlockDirection.NORTH, new BPos(9,1,3)),
                new JigsawBlock(PoolType.HOUSING_STAGES_STAGE_2, JointType.ROLLABLE, "stage_1_top", "stage_2_bottom", BlockDirection.UP, BlockDirection.EAST, new BPos(5,6,4))
        ));
        this.put("units/stages/stage_1_3", Arrays.asList(
                new JigsawBlock(PoolType.EMPTY, JointType.ROLLABLE, "stage_1_bottom", "stage_0_top", BlockDirection.DOWN, BlockDirection.EAST, new BPos(6,0,3)),
                new JigsawBlock(PoolType.PIGLIN, JointType.ALIGNED, "empty", "mob_connector", BlockDirection.UP, BlockDirection.WEST, new BPos(5,1,4)),
                new JigsawBlock(PoolType.PIGLIN, JointType.ALIGNED, "empty", "mob_connector", BlockDirection.UP, BlockDirection.NORTH, new BPos(4,3,1)),
                new JigsawBlock(PoolType.GOLD, JointType.ALIGNED, "empty", "block_connector", BlockDirection.UP, BlockDirection.EAST, new BPos(7,3,6)),
                new JigsawBlock(PoolType.HOUSING_STAGES_STAGE_2, JointType.ROLLABLE, "stage_1_top", "stage_2_bottom", BlockDirection.UP, BlockDirection.EAST, new BPos(6,6,4))
        ));
        this.put("units/stages/stage_2_0", Arrays.asList(
                new JigsawBlock(PoolType.EMPTY, JointType.ROLLABLE, "stage_2_bottom", "stage_1_top", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(6,0,3)),
                new JigsawBlock(PoolType.PIGLIN, JointType.ALIGNED, "empty", "mob_connector", BlockDirection.UP, BlockDirection.NORTH, new BPos(2,1,1)),
                new JigsawBlock(PoolType.HOUSING_STAGES_STAGE_3, JointType.ROLLABLE, "stage_2_top", "stage_3_bottom", BlockDirection.UP, BlockDirection.SOUTH, new BPos(5,6,4))
        ));
        this.put("units/stages/stage_2_1", Arrays.asList(
                new JigsawBlock(PoolType.EMPTY, JointType.ROLLABLE, "stage_2_bottom", "stage_1_top", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(6,0,3)),
                new JigsawBlock(PoolType.PIGLIN, JointType.ALIGNED, "empty", "mob_connector", BlockDirection.UP, BlockDirection.NORTH, new BPos(2,1,1)),
                new JigsawBlock(PoolType.HOUSING_STAGES_STAGE_3, JointType.ROLLABLE, "stage_2_top", "stage_3_bottom", BlockDirection.UP, BlockDirection.SOUTH, new BPos(5,6,4))
        ));
        this.put("units/stages/stage_3_0", Collections.singletonList(
                new JigsawBlock(PoolType.EMPTY, JointType.ROLLABLE, "stage_3_bottom", "stage_2_top", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(5,0,4))
        ));
        this.put("units/stages/stage_3_1", Arrays.asList(
                new JigsawBlock(PoolType.GOLD, JointType.ALIGNED, "empty", "block_connector", BlockDirection.UP, BlockDirection.NORTH, new BPos(1,0,2)),
                new JigsawBlock(PoolType.EMPTY, JointType.ROLLABLE, "stage_3_bottom", "stage_2_top", BlockDirection.DOWN, BlockDirection.EAST, new BPos(5,0,3))
        ));
        this.put("units/stages/stage_3_2", Collections.singletonList(
                new JigsawBlock(PoolType.EMPTY, JointType.ROLLABLE, "stage_3_bottom", "stage_2_top", BlockDirection.DOWN, BlockDirection.EAST, new BPos(5,0,3))
        ));
        this.put("units/stages/stage_3_3", Collections.singletonList(
                new JigsawBlock(PoolType.EMPTY, JointType.ROLLABLE, "stage_3_bottom", "stage_2_top", BlockDirection.DOWN, BlockDirection.EAST, new BPos(5,0,4))
        ));
        this.put("units/wall_units/unit_0", Arrays.asList(
                new JigsawBlock(PoolType.GOLD, JointType.ROLLABLE, "empty", "block_connector", BlockDirection.UP, BlockDirection.EAST, new BPos(10,0,5)),
                new JigsawBlock(PoolType.HOUSING_FILLERS_STAGE_0, JointType.ROLLABLE, "empty", "filler_0_entry", BlockDirection.WEST, BlockDirection.UP, new BPos(0,1,3)),
                new JigsawBlock(PoolType.EMPTY, JointType.ROLLABLE, "edge_wall_entry", "empty", BlockDirection.SOUTH, BlockDirection.UP, new BPos(10,1,7)),
                new JigsawBlock(PoolType.HOUSING_STAGES_STAGE_1, JointType.ROLLABLE, "stage_0_top", "stage_1_bottom", BlockDirection.UP, BlockDirection.EAST, new BPos(4,6,2))
        ));
        this.put("units/walls/wall_base", Arrays.asList(
                new JigsawBlock(PoolType.HOUSING_EDGE_WALL_UNITS, JointType.ROLLABLE, "wall_base", "edge_wall_exit", BlockDirection.NORTH, BlockDirection.UP, new BPos(5,1,0)),
                new JigsawBlock(PoolType.HOUSING_WALLS_WALL_BASES, JointType.ROLLABLE, "path_connected_wall", "wall_connected_wall", BlockDirection.EAST, BlockDirection.UP, new BPos(15,1,0)),
                new JigsawBlock(PoolType.PIGLIN, JointType.ROLLABLE, "empty", "mob_connector", BlockDirection.UP, BlockDirection.EAST, new BPos(2,2,3)),
                new JigsawBlock(PoolType.PIGLIN, JointType.ALIGNED, "empty", "mob_connector", BlockDirection.UP, BlockDirection.EAST, new BPos(4,5,10)),
                new JigsawBlock(PoolType.PIGLIN, JointType.ROLLABLE, "empty", "mob_connector", BlockDirection.UP, BlockDirection.SOUTH, new BPos(5,6,8)),
                new JigsawBlock(PoolType.PIGLIN, JointType.ROLLABLE, "empty", "mob_connector", BlockDirection.UP, BlockDirection.EAST, new BPos(4,7,7)),
                new JigsawBlock(PoolType.PIGLIN, JointType.ROLLABLE, "empty", "mob_connector", BlockDirection.UP, BlockDirection.EAST, new BPos(13,11,3)),
                new JigsawBlock(PoolType.PIGLIN, JointType.ROLLABLE, "empty", "mob_connector", BlockDirection.UP, BlockDirection.EAST, new BPos(11,18,14)),
                new JigsawBlock(PoolType.PIGLIN, JointType.ROLLABLE, "empty", "mob_connector", BlockDirection.UP, BlockDirection.SOUTH, new BPos(12,18,12)),
                new JigsawBlock(PoolType.HOUSING_LARGE_RAMPARTS, JointType.ALIGNED, "wall", "rampart", BlockDirection.UP, BlockDirection.SOUTH, new BPos(15,23,15))
        ));
    }};
}
