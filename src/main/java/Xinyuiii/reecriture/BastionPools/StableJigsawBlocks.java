package Xinyuiii.reecriture.BastionPools;

import Xinyuiii.enumType.JointType;
import Xinyuiii.enumType.PoolType;
import com.seedfinding.mccore.util.block.BlockDirection;
import com.seedfinding.mccore.util.pos.BPos;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class StableJigsawBlocks {
    public static final HashMap<String, List<JigsawBlock>> JIGSAW_BLOCKS = new HashMap<>() {
        private static final long serialVersionUID = 1967667967192153613L;
        {
            this.putAll(MobsJigsawBlocks.JIGSAW_BLOCKS);
            this.put("hoglin_stable/air_base", Arrays.asList(
                    new JigsawBlock(PoolType.STABLE_STARTING_PIECES, JointType.ALIGNED, "empty", "starting_stairs_connector", BlockDirection.NORTH, BlockDirection.UP, new BPos(0,0,24)),
                    new JigsawBlock(PoolType.STABLE_WALL_BASES, JointType.ROLLABLE, "empty", "wall_base", BlockDirection.WEST, BlockDirection.UP, new BPos(0,0,25))
            ));
            this.put("hoglin_stable/posts/end_post", Collections.singletonList(
                    new JigsawBlock(PoolType.EMPTY, JointType.ROLLABLE, "end_post_connector", "empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(0,23,0))
            ));
            this.put("hoglin_stable/connectors/end_post_connector", Arrays.asList(
                    new JigsawBlock(PoolType.EMPTY, JointType.ROLLABLE, "post_connector", "empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(0,1,0)),
                    new JigsawBlock(PoolType.STABLE_POSTS, JointType.ROLLABLE, "empty", "end_post_connector", BlockDirection.SOUTH, BlockDirection.UP, new BPos(0,1,21))
            ));
            this.put("hoglin_stable/small_stables/inner_0", Arrays.asList(
                    new JigsawBlock(PoolType.STABLE_LARGE_STABLES_OUTER, JointType.ROLLABLE, "inner_connector_left", "outer_connector_right", BlockDirection.NORTH, BlockDirection.UP, new BPos(0,0,0)),
                    new JigsawBlock(PoolType.STABLE_LARGE_STABLES_OUTER, JointType.ROLLABLE, "inner_connector_right", "outer_connector_left", BlockDirection.SOUTH, BlockDirection.UP, new BPos(0,0,7)),
                    new JigsawBlock(PoolType.HOGLIN, JointType.ALIGNED, "empty", "mob_connector", BlockDirection.UP, BlockDirection.SOUTH, new BPos(5,0,3))
            ));
            this.put("hoglin_stable/small_stables/inner_1", Arrays.asList(
                    new JigsawBlock(PoolType.STABLE_LARGE_STABLES_OUTER, JointType.ROLLABLE, "inner_connector_left", "outer_connector_right", BlockDirection.NORTH, BlockDirection.UP, new BPos(0,0,0)),
                    new JigsawBlock(PoolType.STABLE_LARGE_STABLES_OUTER, JointType.ROLLABLE, "inner_connector_right", "outer_connector_left", BlockDirection.SOUTH, BlockDirection.UP, new BPos(0,0,7)),
                    new JigsawBlock(PoolType.HOGLIN, JointType.ROLLABLE, "empty", "mob_connector", BlockDirection.UP, BlockDirection.SOUTH, new BPos(5,0,3)),
                    new JigsawBlock(PoolType.GOLD, JointType.ALIGNED, "empty", "block_connector", BlockDirection.UP, BlockDirection.NORTH, new BPos(8,0,6))
            ));
            this.put("hoglin_stable/small_stables/inner_2", Arrays.asList(
                    new JigsawBlock(PoolType.STABLE_LARGE_STABLES_OUTER, JointType.ROLLABLE, "inner_connector_left", "outer_connector_right", BlockDirection.NORTH, BlockDirection.UP, new BPos(0,0,0)),
                    new JigsawBlock(PoolType.STABLE_LARGE_STABLES_OUTER, JointType.ROLLABLE, "inner_connector_right", "outer_connector_left", BlockDirection.SOUTH, BlockDirection.UP, new BPos(0,0,7)),
                    new JigsawBlock(PoolType.PIGLIN, JointType.ALIGNED, "empty", "mob_connector", BlockDirection.UP, BlockDirection.EAST, new BPos(4,0,2)),
                    new JigsawBlock(PoolType.PIGLIN_MELEE, JointType.ALIGNED, "empty", "mob_connector", BlockDirection.UP, BlockDirection.WEST, new BPos(6,0,4)),
                    new JigsawBlock(PoolType.HOGLIN, JointType.ROLLABLE, "empty", "mob_connector", BlockDirection.UP, BlockDirection.WEST, new BPos(7,0,2))
            ));
            this.put("hoglin_stable/small_stables/inner_3", Arrays.asList(
                    new JigsawBlock(PoolType.STABLE_LARGE_STABLES_OUTER, JointType.ROLLABLE, "inner_connector_left", "outer_connector_right", BlockDirection.NORTH, BlockDirection.UP, new BPos(0,0,0)),
                    new JigsawBlock(PoolType.STABLE_LARGE_STABLES_OUTER, JointType.ROLLABLE, "inner_connector_right", "outer_connector_left", BlockDirection.SOUTH, BlockDirection.UP, new BPos(0,0,7)),
                    new JigsawBlock(PoolType.PIGLIN, JointType.ALIGNED, "empty", "mob_connector", BlockDirection.UP, BlockDirection.EAST, new BPos(5,0,5))
            ));
            this.put("hoglin_stable/large_stables/inner_0", Arrays.asList(
                    new JigsawBlock(PoolType.STABLE_SMALL_STABLES_OUTER, JointType.ROLLABLE, "inner_connector_left", "outer_connector_right", BlockDirection.NORTH, BlockDirection.UP, new BPos(0,0,0)),
                    new JigsawBlock(PoolType.STABLE_SMALL_STABLES_OUTER, JointType.ROLLABLE, "inner_connector_right", "outer_connector_left", BlockDirection.SOUTH, BlockDirection.UP, new BPos(0,0,7))
            ));
            this.put("hoglin_stable/large_stables/inner_1", Arrays.asList(
                    new JigsawBlock(PoolType.STABLE_SMALL_STABLES_OUTER, JointType.ROLLABLE, "inner_connector_left", "outer_connector_right", BlockDirection.NORTH, BlockDirection.UP, new BPos(0,0,0)),
                    new JigsawBlock(PoolType.STABLE_SMALL_STABLES_OUTER, JointType.ROLLABLE, "inner_connector_right", "outer_connector_left", BlockDirection.SOUTH, BlockDirection.UP, new BPos(0,0,7)),
                    new JigsawBlock(PoolType.HOGLIN, JointType.ALIGNED, "empty", "mob_connector", BlockDirection.UP, BlockDirection.SOUTH, new BPos(6,0,3))
            ));
            this.put("hoglin_stable/large_stables/inner_2", Arrays.asList(
                    new JigsawBlock(PoolType.STABLE_SMALL_STABLES_OUTER, JointType.ROLLABLE, "inner_connector_left", "outer_connector_right", BlockDirection.NORTH, BlockDirection.UP, new BPos(0,0,0)),
                    new JigsawBlock(PoolType.STABLE_SMALL_STABLES_OUTER, JointType.ROLLABLE, "inner_connector_right", "outer_connector_left", BlockDirection.SOUTH, BlockDirection.UP, new BPos(0,0,7)),
                    new JigsawBlock(PoolType.HOGLIN, JointType.ALIGNED, "empty", "mob_connector", BlockDirection.UP, BlockDirection.SOUTH, new BPos(6,0,4))
            ));
            this.put("hoglin_stable/large_stables/inner_3", Arrays.asList(
                    new JigsawBlock(PoolType.STABLE_SMALL_STABLES_OUTER, JointType.ROLLABLE, "inner_connector_left", "outer_connector_right", BlockDirection.NORTH, BlockDirection.UP, new BPos(0,0,0)),
                    new JigsawBlock(PoolType.STABLE_SMALL_STABLES_OUTER, JointType.ROLLABLE, "inner_connector_right", "outer_connector_left", BlockDirection.SOUTH, BlockDirection.UP, new BPos(0,0,7)),
                    new JigsawBlock(PoolType.PIGLIN, JointType.ALIGNED, "empty", "mob_connector", BlockDirection.UP, BlockDirection.SOUTH, new BPos(3,0,3)),
                    new JigsawBlock(PoolType.PIGLIN, JointType.ALIGNED, "empty", "mob_connector", BlockDirection.UP, BlockDirection.NORTH, new BPos(3,0,6))
            ));
            this.put("hoglin_stable/large_stables/inner_4", Arrays.asList(
                    new JigsawBlock(PoolType.STABLE_SMALL_STABLES_OUTER, JointType.ROLLABLE, "inner_connector_left", "outer_connector_right", BlockDirection.NORTH, BlockDirection.UP, new BPos(0,0,0)),
                    new JigsawBlock(PoolType.STABLE_SMALL_STABLES_OUTER, JointType.ROLLABLE, "inner_connector_right", "outer_connector_left", BlockDirection.SOUTH, BlockDirection.UP, new BPos(0,0,7)),
                    new JigsawBlock(PoolType.HOGLIN, JointType.ALIGNED, "empty", "mob_connector", BlockDirection.UP, BlockDirection.EAST, new BPos(7,0,4))
            ));
            this.put("hoglin_stable/large_stables/outer_0", Arrays.asList(
                    new JigsawBlock(PoolType.EMPTY, JointType.ROLLABLE, "outer_connector_left", "empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(0,0,0)),
                    new JigsawBlock(PoolType.EMPTY, JointType.ROLLABLE, "outer_connector_right", "empty", BlockDirection.SOUTH, BlockDirection.UP, new BPos(0,0,7)),
                    new JigsawBlock(PoolType.PIGLIN, JointType.ALIGNED, "empty", "mob_connector", BlockDirection.UP, BlockDirection.NORTH, new BPos(4,0,4)),
                    new JigsawBlock(PoolType.PIGLIN, JointType.ALIGNED, "empty", "mob_connector", BlockDirection.UP, BlockDirection.EAST, new BPos(7,0,2))
            ));
            this.put("hoglin_stable/large_stables/outer_1", Arrays.asList(
                    new JigsawBlock(PoolType.EMPTY, JointType.ROLLABLE, "outer_connector_left", "empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(0,0,0)),
                    new JigsawBlock(PoolType.EMPTY, JointType.ROLLABLE, "outer_connector_right", "empty", BlockDirection.SOUTH, BlockDirection.UP, new BPos(0,0,7)),
                    new JigsawBlock(PoolType.HOGLIN, JointType.ALIGNED, "empty", "mob_connector", BlockDirection.UP, BlockDirection.EAST, new BPos(7,0,4)),
                    new JigsawBlock(PoolType.GOLD, JointType.ALIGNED, "empty", "block_connector", BlockDirection.UP, BlockDirection.WEST, new BPos(8,0,1))
            ));
            this.put("hoglin_stable/large_stables/outer_2", Arrays.asList(
                    new JigsawBlock(PoolType.EMPTY, JointType.ROLLABLE, "outer_connector_left", "empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(0,0,0)),
                    new JigsawBlock(PoolType.EMPTY, JointType.ROLLABLE, "outer_connector_right", "empty", BlockDirection.SOUTH, BlockDirection.UP, new BPos(0,0,7)),
                    new JigsawBlock(PoolType.PIGLIN, JointType.ALIGNED, "empty", "mob_connector", BlockDirection.UP, BlockDirection.SOUTH, new BPos(5,0,2)),
                    new JigsawBlock(PoolType.PIGLIN, JointType.ALIGNED, "empty", "mob_connector", BlockDirection.UP, BlockDirection.EAST, new BPos(6,0,3))
            ));
            this.put("hoglin_stable/large_stables/outer_3", Arrays.asList(
                    new JigsawBlock(PoolType.EMPTY, JointType.ROLLABLE, "outer_connector_left", "empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(0,0,0)),
                    new JigsawBlock(PoolType.EMPTY, JointType.ROLLABLE, "outer_connector_right", "empty", BlockDirection.SOUTH, BlockDirection.UP, new BPos(0,0,7))
            ));
            this.put("hoglin_stable/large_stables/outer_4", Arrays.asList(
                    new JigsawBlock(PoolType.EMPTY, JointType.ROLLABLE, "outer_connector_left", "empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(0,0,0)),
                    new JigsawBlock(PoolType.EMPTY, JointType.ROLLABLE, "outer_connector_right", "empty", BlockDirection.SOUTH, BlockDirection.UP, new BPos(0,0,7))
            ));
            this.put("hoglin_stable/small_stables/outer_0", Arrays.asList(
                    new JigsawBlock(PoolType.EMPTY, JointType.ROLLABLE, "outer_connector_left", "empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(0,0,0)),
                    new JigsawBlock(PoolType.EMPTY, JointType.ROLLABLE, "outer_connector_right", "empty", BlockDirection.SOUTH, BlockDirection.UP, new BPos(0,0,7)),
                    new JigsawBlock(PoolType.PIGLIN, JointType.ALIGNED, "empty", "mob_connector", BlockDirection.UP, BlockDirection.NORTH, new BPos(6,0,3)),
                    new JigsawBlock(PoolType.PIGLIN, JointType.ALIGNED, "empty", "mob_connector", BlockDirection.UP, BlockDirection.SOUTH, new BPos(7,0,1))
            ));
            this.put("hoglin_stable/small_stables/outer_1", Arrays.asList(
                    new JigsawBlock(PoolType.EMPTY, JointType.ROLLABLE, "outer_connector_left", "empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(0,0,0)),
                    new JigsawBlock(PoolType.EMPTY, JointType.ROLLABLE, "outer_connector_right", "empty", BlockDirection.SOUTH, BlockDirection.UP, new BPos(0,0,7)),
                    new JigsawBlock(PoolType.GOLD, JointType.ALIGNED, "empty", "block_connector", BlockDirection.UP, BlockDirection.SOUTH, new BPos(2,0,1)),
                    new JigsawBlock(PoolType.HOGLIN, JointType.ALIGNED, "empty", "mob_connector", BlockDirection.UP, BlockDirection.SOUTH, new BPos(7,0,4))
            ));
            this.put("hoglin_stable/small_stables/outer_2", Arrays.asList(
                    new JigsawBlock(PoolType.EMPTY, JointType.ROLLABLE, "outer_connector_left", "empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(0,0,0)),
                    new JigsawBlock(PoolType.EMPTY, JointType.ROLLABLE, "outer_connector_right", "empty", BlockDirection.SOUTH, BlockDirection.UP, new BPos(0,0,7)),
                    new JigsawBlock(PoolType.HOGLIN, JointType.ALIGNED, "empty", "mob_connector", BlockDirection.UP, BlockDirection.SOUTH, new BPos(6,0,2))
            ));
            this.put("hoglin_stable/small_stables/outer_3", Arrays.asList(
                    new JigsawBlock(PoolType.EMPTY, JointType.ROLLABLE, "outer_connector_left", "empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(0,0,0)),
                    new JigsawBlock(PoolType.EMPTY, JointType.ROLLABLE, "outer_connector_right", "empty", BlockDirection.SOUTH, BlockDirection.UP, new BPos(0,0,7)),
                    new JigsawBlock(PoolType.HOGLIN, JointType.ALIGNED, "empty", "mob_connector", BlockDirection.UP, BlockDirection.SOUTH, new BPos(4,0,6))
            ));
            this.put("hoglin_stable/ramparts/ramparts_1", Arrays.asList(
                    new JigsawBlock(PoolType.EMPTY, JointType.ALIGNED, "rampart", "empty", BlockDirection.DOWN, BlockDirection.WEST, new BPos(0,0,15)),
                    new JigsawBlock(PoolType.PIGLIN, JointType.ROLLABLE, "empty", "mob_connector", BlockDirection.UP, BlockDirection.WEST, new BPos(10,3,6)),
                    new JigsawBlock(PoolType.PIGLIN, JointType.ROLLABLE, "empty", "mob_connector", BlockDirection.UP, BlockDirection.WEST, new BPos(7,5,3)),
                    new JigsawBlock(PoolType.PIGLIN, JointType.ROLLABLE, "empty", "mob_connector", BlockDirection.UP, BlockDirection.NORTH, new BPos(3,10,11)),
                    new JigsawBlock(PoolType.PIGLIN, JointType.ROLLABLE, "empty", "mob_connector", BlockDirection.UP, BlockDirection.NORTH, new BPos(3,10,12)),
                    new JigsawBlock(PoolType.PIGLIN, JointType.ROLLABLE, "empty", "mob_connector", BlockDirection.UP, BlockDirection.EAST, new BPos(7,16,9)),
                    new JigsawBlock(PoolType.PIGLIN_MELEE, JointType.ROLLABLE, "empty", "mob_connector", BlockDirection.UP, BlockDirection.EAST, new BPos(9,16,11)),
                    new JigsawBlock(PoolType.PIGLIN, JointType.ROLLABLE, "empty", "mob_connector", BlockDirection.UP, BlockDirection.EAST, new BPos(10,16,7)),
                    new JigsawBlock(PoolType.PIGLIN_MELEE, JointType.ROLLABLE, "empty", "mob_connector", BlockDirection.UP, BlockDirection.NORTH, new BPos(4,18,11)),
                    new JigsawBlock(PoolType.STABLE_RAMPART_PLATES, JointType.ALIGNED, "empty", "rampart_plate", BlockDirection.WEST, BlockDirection.UP, new BPos(0,31,8))
            ));
            this.put("hoglin_stable/ramparts/ramparts_2", Arrays.asList(
                    new JigsawBlock(PoolType.EMPTY, JointType.ALIGNED, "rampart", "empty", BlockDirection.DOWN, BlockDirection.WEST, new BPos(0,0,15)),
                    new JigsawBlock(PoolType.PIGLIN, JointType.ROLLABLE, "empty", "mob_connector", BlockDirection.UP, BlockDirection.EAST, new BPos(7,2,13)),
                    new JigsawBlock(PoolType.PIGLIN_MELEE, JointType.ROLLABLE, "empty", "mob_connector", BlockDirection.UP, BlockDirection.EAST, new BPos(9,2,11)),
                    new JigsawBlock(PoolType.PIGLIN, JointType.ROLLABLE, "empty", "mob_connector", BlockDirection.UP, BlockDirection.NORTH, new BPos(11,2,12))
            ));
            this.put("hoglin_stable/ramparts/ramparts_3", Arrays.asList(
                    new JigsawBlock(PoolType.EMPTY, JointType.ALIGNED, "rampart", "empty", BlockDirection.DOWN, BlockDirection.WEST, new BPos(0,0,15)),
                    new JigsawBlock(PoolType.PIGLIN_MELEE, JointType.ROLLABLE, "empty", "mob_connector", BlockDirection.UP, BlockDirection.WEST, new BPos(7,2,7)),
                    new JigsawBlock(PoolType.PIGLIN, JointType.ROLLABLE, "empty", "mob_connector", BlockDirection.UP, BlockDirection.WEST, new BPos(10,2,7))
            ));
            this.put("hoglin_stable/rampart_plates/rampart_plate_1", Collections.singletonList(
                    new JigsawBlock(PoolType.EMPTY, JointType.ALIGNED, "rampart_plate", "empty", BlockDirection.EAST, BlockDirection.UP, new BPos(1,18,8))
            ));
            this.put("hoglin_stable/walls/side_wall_0", Arrays.asList(
                    new JigsawBlock(PoolType.EMPTY, JointType.ROLLABLE, "side_wall", "empty", BlockDirection.WEST, BlockDirection.UP, new BPos(0,0,15)),
                    new JigsawBlock(PoolType.EMPTY, JointType.ROLLABLE, "side_wall", "empty", BlockDirection.EAST, BlockDirection.UP, new BPos(15,0,15)),
                    new JigsawBlock(PoolType.PIGLIN, JointType.ROLLABLE, "empty", "mob_connector", BlockDirection.UP, BlockDirection.EAST, new BPos(11,1,8)),
                    new JigsawBlock(PoolType.PIGLIN, JointType.ROLLABLE, "empty", "mob_connector", BlockDirection.UP, BlockDirection.SOUTH, new BPos(7,5,11)),
                    new JigsawBlock(PoolType.PIGLIN, JointType.ROLLABLE, "empty", "mob_connector", BlockDirection.UP, BlockDirection.WEST, new BPos(8,5,7)),
                    new JigsawBlock(PoolType.STABLE_RAMPARTS, JointType.ALIGNED, "empty", "rampart", BlockDirection.UP, BlockDirection.NORTH, new BPos(0,23,0))
            ));
            this.put("hoglin_stable/walls/side_wall_1", Arrays.asList(
                    new JigsawBlock(PoolType.EMPTY, JointType.ROLLABLE, "side_wall", "empty", BlockDirection.WEST, BlockDirection.UP, new BPos(0,0,15)),
                    new JigsawBlock(PoolType.EMPTY, JointType.ROLLABLE, "side_wall", "empty", BlockDirection.EAST, BlockDirection.UP, new BPos(15,0,15)),
                    new JigsawBlock(PoolType.PIGLIN, JointType.ROLLABLE, "empty", "mob_connector", BlockDirection.UP, BlockDirection.SOUTH, new BPos(12,1,7)),
                    new JigsawBlock(PoolType.PIGLIN, JointType.ROLLABLE, "empty", "mob_connector", BlockDirection.UP, BlockDirection.NORTH, new BPos(7,4,8)),
                    new JigsawBlock(PoolType.PIGLIN, JointType.ROLLABLE, "empty", "mob_connector", BlockDirection.UP, BlockDirection.SOUTH, new BPos(7,11,4)),
                    new JigsawBlock(PoolType.PIGLIN, JointType.ROLLABLE, "empty", "mob_connector", BlockDirection.UP, BlockDirection.WEST, new BPos(8,11,5)),
                    new JigsawBlock(PoolType.PIGLIN, JointType.ROLLABLE, "empty", "mob_connector", BlockDirection.UP, BlockDirection.WEST, new BPos(8,11,6)),
                    new JigsawBlock(PoolType.STABLE_RAMPARTS, JointType.ALIGNED, "empty", "rampart", BlockDirection.UP, BlockDirection.NORTH, new BPos(0,23,0))
            ));
            this.put("hoglin_stable/starting_pieces/stairs_0_mirrored", Arrays.asList(
                    new JigsawBlock(PoolType.EMPTY, JointType.ROLLABLE, "stairs_mirrored", "empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(0,0,0)),
                    new JigsawBlock(PoolType.STABLE_LARGE_STABLES_INNER, JointType.ROLLABLE, "stable_stairs", "inner_connector_left", BlockDirection.NORTH, BlockDirection.UP, new BPos(14,0,0)),
                    new JigsawBlock(PoolType.STABLE_SMALL_STABLES_INNER, JointType.ROLLABLE, "stable_stairs", "inner_connector_right", BlockDirection.SOUTH, BlockDirection.UP, new BPos(14,0,15)),
                    new JigsawBlock(PoolType.STABLE_STAIRS, JointType.ALIGNED, "starting_stairs", "stair_1_bottom", BlockDirection.UP, BlockDirection.EAST, new BPos(14,5,6))
            ));
            this.put("hoglin_stable/stairs/stairs_1_0", Arrays.asList(
                    new JigsawBlock(PoolType.STABLE_LARGE_STABLES_INNER, JointType.ROLLABLE, "stable_stairs", "inner_connector_right", BlockDirection.NORTH, BlockDirection.UP, new BPos(0,0,0)),
                    new JigsawBlock(PoolType.STABLE_STAIRS, JointType.ALIGNED, "stair_1_bottom", "starting_stairs", BlockDirection.DOWN, BlockDirection.WEST, new BPos(0,0,9)),
                    new JigsawBlock(PoolType.STABLE_SMALL_STABLES_INNER, JointType.ROLLABLE, "stable_stairs", "inner_connector_left", BlockDirection.SOUTH, BlockDirection.UP, new BPos(0,0,15)),
                    new JigsawBlock(PoolType.STABLE_STAIRS, JointType.ALIGNED, "stair_1_top", "stair_2_bottom", BlockDirection.UP, BlockDirection.WEST, new BPos(0,5,9))
            ));
            this.put("hoglin_stable/stairs/stairs_1_1", Arrays.asList(
                    new JigsawBlock(PoolType.STABLE_LARGE_STABLES_INNER, JointType.ROLLABLE, "stable_stairs", "inner_connector_right", BlockDirection.NORTH, BlockDirection.UP, new BPos(0,0,0)),
                    new JigsawBlock(PoolType.STABLE_STAIRS, JointType.ALIGNED, "stair_1_bottom", "starting_stairs", BlockDirection.DOWN, BlockDirection.WEST, new BPos(0,0,9)),
                    new JigsawBlock(PoolType.STABLE_SMALL_STABLES_INNER, JointType.ROLLABLE, "stable_stairs", "inner_connector_left", BlockDirection.SOUTH, BlockDirection.UP, new BPos(0,0,15)),
                    new JigsawBlock(PoolType.STABLE_STAIRS, JointType.ALIGNED, "stair_1_top", "stair_2_bottom", BlockDirection.UP, BlockDirection.WEST, new BPos(0,5,9))
            ));
            this.put("hoglin_stable/stairs/stairs_1_2", Arrays.asList(
                    new JigsawBlock(PoolType.STABLE_LARGE_STABLES_INNER, JointType.ROLLABLE, "stable_stairs", "inner_connector_right", BlockDirection.NORTH, BlockDirection.UP, new BPos(0,0,0)),
                    new JigsawBlock(PoolType.STABLE_STAIRS, JointType.ALIGNED, "stair_1_bottom", "starting_stairs", BlockDirection.DOWN, BlockDirection.WEST, new BPos(0,0,9)),
                    new JigsawBlock(PoolType.STABLE_SMALL_STABLES_INNER, JointType.ROLLABLE, "stable_stairs", "inner_connector_left", BlockDirection.SOUTH, BlockDirection.UP, new BPos(0,0,15)),
                    new JigsawBlock(PoolType.STABLE_STAIRS, JointType.ALIGNED, "stair_1_top", "stair_2_bottom", BlockDirection.UP, BlockDirection.WEST, new BPos(0,5,9))
            ));
            this.put("hoglin_stable/stairs/stairs_1_3", Arrays.asList(
                    new JigsawBlock(PoolType.STABLE_LARGE_STABLES_INNER, JointType.ROLLABLE, "stable_stairs", "inner_connector_right", BlockDirection.NORTH, BlockDirection.UP, new BPos(0,0,0)),
                    new JigsawBlock(PoolType.STABLE_STAIRS, JointType.ALIGNED, "stair_1_bottom", "starting_stairs", BlockDirection.DOWN, BlockDirection.WEST, new BPos(0,0,9)),
                    new JigsawBlock(PoolType.STABLE_SMALL_STABLES_INNER, JointType.ROLLABLE, "stable_stairs", "inner_connector_left", BlockDirection.SOUTH, BlockDirection.UP, new BPos(0,0,15)),
                    new JigsawBlock(PoolType.STABLE_STAIRS, JointType.ALIGNED, "stair_1_top", "stair_2_bottom", BlockDirection.UP, BlockDirection.WEST, new BPos(0,5,9))
            ));
            this.put("hoglin_stable/stairs/stairs_1_4", Arrays.asList(
                    new JigsawBlock(PoolType.STABLE_LARGE_STABLES_INNER, JointType.ROLLABLE, "stable_stairs", "inner_connector_right", BlockDirection.NORTH, BlockDirection.UP, new BPos(0,0,0)),
                    new JigsawBlock(PoolType.STABLE_STAIRS, JointType.ALIGNED, "stair_1_bottom", "starting_stairs", BlockDirection.DOWN, BlockDirection.WEST, new BPos(0,0,9)),
                    new JigsawBlock(PoolType.STABLE_SMALL_STABLES_INNER, JointType.ROLLABLE, "stable_stairs", "inner_connector_left", BlockDirection.SOUTH, BlockDirection.UP, new BPos(0,0,15)),
                    new JigsawBlock(PoolType.STABLE_STAIRS, JointType.ALIGNED, "stair_1_top", "stair_2_bottom", BlockDirection.UP, BlockDirection.WEST, new BPos(0,5,9))
            ));
            this.put("hoglin_stable/starting_pieces/stairs_1_mirrored", Arrays.asList(
                    new JigsawBlock(PoolType.STABLE_SMALL_STABLES_INNER, JointType.ROLLABLE, "stable_stairs", "inner_connector_right", BlockDirection.NORTH, BlockDirection.UP, new BPos(0,0,0)),
                    new JigsawBlock(PoolType.STABLE_LARGE_STABLES_INNER, JointType.ROLLABLE, "stable_stairs", "inner_connector_left", BlockDirection.SOUTH, BlockDirection.UP, new BPos(0,0,15)),
                    new JigsawBlock(PoolType.EMPTY, JointType.ROLLABLE, "stairs_mirrored", "empty", BlockDirection.SOUTH, BlockDirection.UP, new BPos(14,0,15)),
                    new JigsawBlock(PoolType.STABLE_STAIRS, JointType.ALIGNED, "starting_stairs", "stair_1_bottom", BlockDirection.UP, BlockDirection.WEST, new BPos(0,5,9))
            ));
            this.put("hoglin_stable/stairs/stairs_2_0", Arrays.asList(
                    new JigsawBlock(PoolType.STABLE_SMALL_STABLES_INNER, JointType.ROLLABLE, "stable_stairs", "inner_connector_right", BlockDirection.NORTH, BlockDirection.UP, new BPos(0,0,0)),
                    new JigsawBlock(PoolType.STABLE_STAIRS, JointType.ALIGNED, "stair_2_bottom", "stair_1_top", BlockDirection.DOWN, BlockDirection.WEST, new BPos(0,0,9)),
                    new JigsawBlock(PoolType.STABLE_LARGE_STABLES_INNER, JointType.ROLLABLE, "stable_stairs", "inner_connector_left", BlockDirection.SOUTH, BlockDirection.UP, new BPos(0,0,15)),
                    new JigsawBlock(PoolType.STABLE_STAIRS, JointType.ALIGNED, "stair_2_top", "stair_3_bottom", BlockDirection.UP, BlockDirection.WEST, new BPos(0,5,9))
            ));
            this.put("hoglin_stable/stairs/stairs_2_1", Arrays.asList(
                    new JigsawBlock(PoolType.STABLE_SMALL_STABLES_INNER, JointType.ROLLABLE, "stable_stairs", "inner_connector_right", BlockDirection.NORTH, BlockDirection.UP, new BPos(0,0,0)),
                    new JigsawBlock(PoolType.STABLE_STAIRS, JointType.ALIGNED, "stair_2_bottom", "stair_1_top", BlockDirection.DOWN, BlockDirection.WEST, new BPos(0,0,9)),
                    new JigsawBlock(PoolType.STABLE_LARGE_STABLES_INNER, JointType.ROLLABLE, "stable_stairs", "inner_connector_left", BlockDirection.SOUTH, BlockDirection.UP, new BPos(0,0,15)),
                    new JigsawBlock(PoolType.STABLE_STAIRS, JointType.ALIGNED, "stair_2_top", "stair_3_bottom", BlockDirection.UP, BlockDirection.WEST, new BPos(0,5,9))
            ));
            this.put("hoglin_stable/stairs/stairs_2_2", Arrays.asList(
                    new JigsawBlock(PoolType.STABLE_SMALL_STABLES_INNER, JointType.ROLLABLE, "stable_stairs", "inner_connector_right", BlockDirection.NORTH, BlockDirection.UP, new BPos(0,0,0)),
                    new JigsawBlock(PoolType.STABLE_STAIRS, JointType.ALIGNED, "stair_2_bottom", "stair_1_top", BlockDirection.DOWN, BlockDirection.WEST, new BPos(0,0,9)),
                    new JigsawBlock(PoolType.STABLE_LARGE_STABLES_INNER, JointType.ROLLABLE, "stable_stairs", "inner_connector_left", BlockDirection.SOUTH, BlockDirection.UP, new BPos(0,0,15)),
                    new JigsawBlock(PoolType.STABLE_STAIRS, JointType.ALIGNED, "stair_2_top", "stair_3_bottom", BlockDirection.UP, BlockDirection.WEST, new BPos(0,5,9))
            ));
            this.put("hoglin_stable/stairs/stairs_2_3", Arrays.asList(
                    new JigsawBlock(PoolType.STABLE_SMALL_STABLES_INNER, JointType.ROLLABLE, "stable_stairs", "inner_connector_right", BlockDirection.NORTH, BlockDirection.UP, new BPos(0,0,0)),
                    new JigsawBlock(PoolType.STABLE_STAIRS, JointType.ALIGNED, "stair_2_bottom", "stair_1_top", BlockDirection.DOWN, BlockDirection.WEST, new BPos(0,0,9)),
                    new JigsawBlock(PoolType.STABLE_LARGE_STABLES_INNER, JointType.ROLLABLE, "stable_stairs", "inner_connector_left", BlockDirection.SOUTH, BlockDirection.UP, new BPos(0,0,15)),
                    new JigsawBlock(PoolType.STABLE_STAIRS, JointType.ALIGNED, "stair_2_top", "stair_3_bottom", BlockDirection.UP, BlockDirection.WEST, new BPos(0,5,9))
            ));
            this.put("hoglin_stable/stairs/stairs_2_4", Arrays.asList(
                    new JigsawBlock(PoolType.STABLE_SMALL_STABLES_INNER, JointType.ROLLABLE, "stable_stairs", "inner_connector_right", BlockDirection.NORTH, BlockDirection.UP, new BPos(0,0,0)),
                    new JigsawBlock(PoolType.STABLE_STAIRS, JointType.ALIGNED, "stair_2_bottom", "stair_1_top", BlockDirection.DOWN, BlockDirection.WEST, new BPos(0,0,9)),
                    new JigsawBlock(PoolType.STABLE_LARGE_STABLES_INNER, JointType.ROLLABLE, "stable_stairs", "inner_connector_left", BlockDirection.SOUTH, BlockDirection.UP, new BPos(0,0,15)),
                    new JigsawBlock(PoolType.STABLE_STAIRS, JointType.ALIGNED, "stair_2_top", "stair_3_bottom", BlockDirection.UP, BlockDirection.WEST, new BPos(0,5,9))
            ));
            this.put("hoglin_stable/starting_pieces/stairs_2_mirrored", Arrays.asList(
                    new JigsawBlock(PoolType.EMPTY, JointType.ROLLABLE, "stairs_mirrored", "empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(0,0,0)),
                    new JigsawBlock(PoolType.STABLE_LARGE_STABLES_INNER, JointType.ROLLABLE, "stable_stairs", "inner_connector_left", BlockDirection.NORTH, BlockDirection.UP, new BPos(14,0,0)),
                    new JigsawBlock(PoolType.STABLE_SMALL_STABLES_INNER, JointType.ROLLABLE, "stable_stairs", "inner_connector_right", BlockDirection.SOUTH, BlockDirection.UP, new BPos(14,0,15)),
                    new JigsawBlock(PoolType.STABLE_STAIRS, JointType.ALIGNED, "starting_stairs", "stair_1_bottom", BlockDirection.UP, BlockDirection.EAST, new BPos(14,5,6))
            ));
            this.put("hoglin_stable/stairs/stairs_3_0", Arrays.asList(
                    new JigsawBlock(PoolType.STABLE_LARGE_STABLES_INNER, JointType.ROLLABLE, "empty", "inner_connector_right", BlockDirection.NORTH, BlockDirection.UP, new BPos(0,0,0)),
                    new JigsawBlock(PoolType.STABLE_STAIRS, JointType.ALIGNED, "stair_3_bottom", "stair_2_top", BlockDirection.DOWN, BlockDirection.WEST, new BPos(0,0,9)),
                    new JigsawBlock(PoolType.STABLE_SMALL_STABLES_INNER, JointType.ROLLABLE, "empty", "inner_connector_left", BlockDirection.SOUTH, BlockDirection.UP, new BPos(0,0,15))
            ));
            this.put("hoglin_stable/stairs/stairs_3_1", Arrays.asList(
                    new JigsawBlock(PoolType.STABLE_LARGE_STABLES_INNER, JointType.ROLLABLE, "empty", "inner_connector_right", BlockDirection.NORTH, BlockDirection.UP, new BPos(0,0,0)),
                    new JigsawBlock(PoolType.STABLE_STAIRS, JointType.ALIGNED, "stair_3_bottom", "stair_2_top", BlockDirection.DOWN, BlockDirection.WEST, new BPos(0,0,9)),
                    new JigsawBlock(PoolType.STABLE_SMALL_STABLES_INNER, JointType.ROLLABLE, "empty", "inner_connector_left", BlockDirection.SOUTH, BlockDirection.UP, new BPos(0,0,15))
            ));
            this.put("hoglin_stable/stairs/stairs_3_2", Arrays.asList(
                    new JigsawBlock(PoolType.STABLE_LARGE_STABLES_INNER, JointType.ROLLABLE, "empty", "inner_connector_right", BlockDirection.NORTH, BlockDirection.UP, new BPos(0,0,0)),
                    new JigsawBlock(PoolType.STABLE_STAIRS, JointType.ALIGNED, "stair_3_bottom", "stair_2_top", BlockDirection.DOWN, BlockDirection.WEST, new BPos(0,0,9)),
                    new JigsawBlock(PoolType.STABLE_SMALL_STABLES_INNER, JointType.ROLLABLE, "empty", "inner_connector_left", BlockDirection.SOUTH, BlockDirection.UP, new BPos(0,0,15))
            ));
            this.put("hoglin_stable/stairs/stairs_3_3", Arrays.asList(
                    new JigsawBlock(PoolType.STABLE_LARGE_STABLES_INNER, JointType.ROLLABLE, "empty", "inner_connector_right", BlockDirection.NORTH, BlockDirection.UP, new BPos(0,0,0)),
                    new JigsawBlock(PoolType.STABLE_STAIRS, JointType.ALIGNED, "stair_3_bottom", "stair_2_top", BlockDirection.DOWN, BlockDirection.WEST, new BPos(0,0,9)),
                    new JigsawBlock(PoolType.STABLE_SMALL_STABLES_INNER, JointType.ROLLABLE, "empty", "inner_connector_left", BlockDirection.SOUTH, BlockDirection.UP, new BPos(0,0,15))
            ));
            this.put("hoglin_stable/stairs/stairs_3_4", Arrays.asList(
                    new JigsawBlock(PoolType.STABLE_LARGE_STABLES_INNER, JointType.ROLLABLE, "empty", "inner_connector_right", BlockDirection.NORTH, BlockDirection.UP, new BPos(0,0,0)),
                    new JigsawBlock(PoolType.STABLE_STAIRS, JointType.ALIGNED, "stair_3_bottom", "stair_2_top", BlockDirection.DOWN, BlockDirection.WEST, new BPos(0,0,9)),
                    new JigsawBlock(PoolType.STABLE_SMALL_STABLES_INNER, JointType.ROLLABLE, "empty", "inner_connector_left", BlockDirection.SOUTH, BlockDirection.UP, new BPos(0,0,15))
            ));
            this.put("hoglin_stable/starting_pieces/stairs_3_mirrored", Arrays.asList(
                    new JigsawBlock(PoolType.EMPTY, JointType.ROLLABLE, "stairs_mirrored", "empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(0,0,0)),
                    new JigsawBlock(PoolType.STABLE_LARGE_STABLES_INNER, JointType.ROLLABLE, "stable_stairs", "inner_connector_left", BlockDirection.NORTH, BlockDirection.UP, new BPos(14,0,0)),
                    new JigsawBlock(PoolType.STABLE_SMALL_STABLES_INNER, JointType.ROLLABLE, "stable_stairs", "inner_connector_right", BlockDirection.SOUTH, BlockDirection.UP, new BPos(14,0,15)),
                    new JigsawBlock(PoolType.STABLE_STAIRS, JointType.ALIGNED, "starting_stairs", "stair_1_bottom", BlockDirection.UP, BlockDirection.EAST, new BPos(14,5,6))
            ));
            this.put("hoglin_stable/starting_pieces/stairs_4_mirrored", Arrays.asList(
                    new JigsawBlock(PoolType.EMPTY, JointType.ROLLABLE, "stairs_mirrored", "empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(0,0,0)),
                    new JigsawBlock(PoolType.STABLE_LARGE_STABLES_INNER, JointType.ROLLABLE, "stable_stairs", "inner_connector_left", BlockDirection.NORTH, BlockDirection.UP, new BPos(14,0,0)),
                    new JigsawBlock(PoolType.STABLE_SMALL_STABLES_INNER, JointType.ROLLABLE, "stable_stairs", "inner_connector_right", BlockDirection.SOUTH, BlockDirection.UP, new BPos(14,0,15)),
                    new JigsawBlock(PoolType.STABLE_STAIRS, JointType.ALIGNED, "starting_stairs", "stair_1_bottom", BlockDirection.UP, BlockDirection.EAST, new BPos(14,5,6))
            ));
            this.put("hoglin_stable/posts/stair_post", Arrays.asList(
                    new JigsawBlock(PoolType.EMPTY, JointType.ROLLABLE, "stair_post", "empty", BlockDirection.SOUTH, BlockDirection.UP, new BPos(0,0,9)),
                    new JigsawBlock(PoolType.STABLE_MIRRORED_STARTING_PIECES, JointType.ROLLABLE, "empty", "stairs_mirrored", BlockDirection.SOUTH, BlockDirection.UP, new BPos(1,0,9)),
                    new JigsawBlock(PoolType.STABLE_CONNECTORS, JointType.ROLLABLE, "empty", "post_connector", BlockDirection.SOUTH, BlockDirection.UP, new BPos(0,23,9))
            ));
            this.put("hoglin_stable/starting_pieces/starting_stairs_0", Arrays.asList(
                    new JigsawBlock(PoolType.STABLE_SMALL_STABLES_INNER, JointType.ROLLABLE, "stable_stairs", "inner_connector_right", BlockDirection.NORTH, BlockDirection.UP, new BPos(0,0,0)),
                    new JigsawBlock(PoolType.EMPTY, JointType.ALIGNED, "starting_stairs_connector", "empty", BlockDirection.SOUTH, BlockDirection.UP, new BPos(0,0,7)),
                    new JigsawBlock(PoolType.STABLE_LARGE_STABLES_INNER, JointType.ROLLABLE, "stable_stairs", "inner_connector_left", BlockDirection.SOUTH, BlockDirection.UP, new BPos(0,0,15)),
                    new JigsawBlock(PoolType.STABLE_POSTS, JointType.ROLLABLE, "starting_stairs", "stair_post", BlockDirection.NORTH, BlockDirection.UP, new BPos(14,0,0)),
                    new JigsawBlock(PoolType.STABLE_STAIRS, JointType.ALIGNED, "starting_stairs", "stair_1_bottom", BlockDirection.UP, BlockDirection.WEST, new BPos(0,5,9))
            ));
            this.put("hoglin_stable/starting_pieces/starting_stairs_1", Arrays.asList(
                    new JigsawBlock(PoolType.STABLE_SMALL_STABLES_INNER, JointType.ROLLABLE, "stable_stairs", "inner_connector_right", BlockDirection.NORTH, BlockDirection.UP, new BPos(0,0,0)),
                    new JigsawBlock(PoolType.EMPTY, JointType.ALIGNED, "starting_stairs_connector", "empty", BlockDirection.SOUTH, BlockDirection.UP, new BPos(0,0,7)),
                    new JigsawBlock(PoolType.STABLE_LARGE_STABLES_INNER, JointType.ROLLABLE, "stable_stairs", "inner_connector_left", BlockDirection.SOUTH, BlockDirection.UP, new BPos(0,0,15)),
                    new JigsawBlock(PoolType.STABLE_POSTS, JointType.ROLLABLE, "starting_stairs", "stair_post", BlockDirection.NORTH, BlockDirection.UP, new BPos(14,0,0)),
                    new JigsawBlock(PoolType.STABLE_STAIRS, JointType.ALIGNED, "starting_stairs", "stair_1_bottom", BlockDirection.UP, BlockDirection.WEST, new BPos(0,5,9))
            ));
            this.put("hoglin_stable/starting_pieces/starting_stairs_2", Arrays.asList(
                    new JigsawBlock(PoolType.STABLE_SMALL_STABLES_INNER, JointType.ROLLABLE, "stable_stairs", "inner_connector_right", BlockDirection.NORTH, BlockDirection.UP, new BPos(0,0,0)),
                    new JigsawBlock(PoolType.EMPTY, JointType.ALIGNED, "starting_stairs_connector", "empty", BlockDirection.SOUTH, BlockDirection.UP, new BPos(0,0,7)),
                    new JigsawBlock(PoolType.STABLE_LARGE_STABLES_INNER, JointType.ROLLABLE, "stable_stairs", "inner_connector_left", BlockDirection.SOUTH, BlockDirection.UP, new BPos(0,0,15)),
                    new JigsawBlock(PoolType.STABLE_POSTS, JointType.ROLLABLE, "empty", "stair_post", BlockDirection.NORTH, BlockDirection.UP, new BPos(14,0,0)),
                    new JigsawBlock(PoolType.STABLE_STAIRS, JointType.ALIGNED, "starting_stairs", "stair_1_bottom", BlockDirection.UP, BlockDirection.WEST, new BPos(0,5,9))
            ));
            this.put("hoglin_stable/starting_pieces/starting_stairs_3", Arrays.asList(
                    new JigsawBlock(PoolType.STABLE_SMALL_STABLES_INNER, JointType.ROLLABLE, "stable_stairs", "inner_connector_right", BlockDirection.NORTH, BlockDirection.UP, new BPos(0,0,0)),
                    new JigsawBlock(PoolType.EMPTY, JointType.ALIGNED, "starting_stairs_connector", "empty", BlockDirection.SOUTH, BlockDirection.UP, new BPos(0,0,7)),
                    new JigsawBlock(PoolType.STABLE_LARGE_STABLES_INNER, JointType.ROLLABLE, "stable_stairs", "inner_connector_left", BlockDirection.SOUTH, BlockDirection.UP, new BPos(0,0,15)),
                    new JigsawBlock(PoolType.STABLE_POSTS, JointType.ROLLABLE, "starting_stairs", "stair_post", BlockDirection.NORTH, BlockDirection.UP, new BPos(14,0,0)),
                    new JigsawBlock(PoolType.STABLE_STAIRS, JointType.ALIGNED, "starting_stairs", "stair_1_bottom", BlockDirection.UP, BlockDirection.WEST, new BPos(0,5,9))
            ));
            this.put("hoglin_stable/starting_pieces/starting_stairs_4", Arrays.asList(
                    new JigsawBlock(PoolType.STABLE_SMALL_STABLES_INNER, JointType.ROLLABLE, "stable_stairs", "inner_connector_right", BlockDirection.NORTH, BlockDirection.UP, new BPos(0,0,0)),
                    new JigsawBlock(PoolType.EMPTY, JointType.ALIGNED, "starting_stairs_connector", "empty", BlockDirection.SOUTH, BlockDirection.UP, new BPos(0,0,7)),
                    new JigsawBlock(PoolType.STABLE_LARGE_STABLES_INNER, JointType.ROLLABLE, "stable_stairs", "inner_connector_left", BlockDirection.SOUTH, BlockDirection.UP, new BPos(0,0,15)),
                    new JigsawBlock(PoolType.STABLE_POSTS, JointType.ROLLABLE, "starting_stairs", "stair_post", BlockDirection.NORTH, BlockDirection.UP, new BPos(14,0,0)),
                    new JigsawBlock(PoolType.STABLE_STAIRS, JointType.ALIGNED, "starting_stairs", "stair_1_bottom", BlockDirection.UP, BlockDirection.WEST, new BPos(0,5,9))
            ));
            this.put("hoglin_stable/walls/wall_base", Arrays.asList(
                    new JigsawBlock(PoolType.STABLE_WALLS, JointType.ROLLABLE, "empty", "side_wall", BlockDirection.NORTH, BlockDirection.UP, new BPos(13,0,0)),
                    new JigsawBlock(PoolType.STABLE_WALLS, JointType.ROLLABLE, "empty", "side_wall", BlockDirection.SOUTH, BlockDirection.UP, new BPos(13,0,15)),
                    new JigsawBlock(PoolType.EMPTY, JointType.ROLLABLE, "wall_base", "empty", BlockDirection.EAST, BlockDirection.UP, new BPos(15,1,9)),
                    new JigsawBlock(PoolType.PIGLIN_MELEE, JointType.ALIGNED, "empty", "mob_connector", BlockDirection.UP, BlockDirection.EAST, new BPos(14,3,13)),
                    new JigsawBlock(PoolType.STABLE_RAMPARTS, JointType.ALIGNED, "empty", "rampart", BlockDirection.UP, BlockDirection.WEST, new BPos(0,23,15))
            ));
        }};
}