package Xinyuiii.reecriture.BastionPools;

import Xinyuiii.enumType.JointType;
import Xinyuiii.enumType.PoolType;
import com.seedfinding.mccore.util.block.BlockDirection;
import com.seedfinding.mccore.util.pos.BPos;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class BridgeJigsawBlocks {
    public static final HashMap<String, List<JigsawBlock>> JIGSAW_BLOCKS = new HashMap<>() {
        private static final long serialVersionUID = -2323373856562970371L;

        {
            this.putAll(MobsJigsawBlocks.JIGSAW_BLOCKS);

            this.put("bridge/connectors/back_bridge_bottom", Collections.singletonList(
                    new JigsawBlock(PoolType.EMPTY, JointType.ROLLABLE, "back_bridge_connector_bottom", "empty", BlockDirection.WEST, BlockDirection.UP, new BPos(0, 2, 8))
            ));
            this.put("bridge/connectors/back_bridge_top", Collections.singletonList(
                    new JigsawBlock(PoolType.EMPTY, JointType.ROLLABLE, "back_bridge_connector_top", "empty", BlockDirection.WEST, BlockDirection.UP, new BPos(0, 0, 3))
            ));
            this.put("bridge/bridge_pieces/bridge", Arrays.asList(
                    new JigsawBlock(PoolType.BRIDGE_LEGS, JointType.ALIGNED, "empty", "leg_connector", BlockDirection.DOWN, BlockDirection.WEST, new BPos(6, 0, 8)),
                    new JigsawBlock(PoolType.BRIDGE_LEGS, JointType.ALIGNED, "empty", "leg_connector", BlockDirection.DOWN, BlockDirection.WEST, new BPos(24, 0, 8)),
                    new JigsawBlock(PoolType.PIGLIN, JointType.ROLLABLE, "empty", "mob_connector", BlockDirection.UP, BlockDirection.NORTH, new BPos(26, 3, 6)),
                    new JigsawBlock(PoolType.EMPTY, JointType.ROLLABLE, "bridge_connector", "empty", BlockDirection.EAST, BlockDirection.UP, new BPos(30, 13, 4))
            ));
            this.put("bridge/starting_pieces/entrance", Arrays.asList(
                    new JigsawBlock(PoolType.EMPTY, JointType.ALIGNED, "entrance_base_connector", "empty", BlockDirection.DOWN, BlockDirection.WEST, new BPos(0, 0, 0)),
                    new JigsawBlock(PoolType.BRIDGE_CONNECTORS, JointType.ROLLABLE, "empty", "back_bridge_connector_top", BlockDirection.EAST, BlockDirection.UP, new BPos(16, 0, 11)),
                    new JigsawBlock(PoolType.HOGLIN, JointType.ROLLABLE, "empty", "mob_connector", BlockDirection.UP, BlockDirection.WEST, new BPos(5, 1, 14)),
                    new JigsawBlock(PoolType.PIGLIN, JointType.ROLLABLE, "empty", "mob_connector", BlockDirection.UP, BlockDirection.NORTH, new BPos(7, 1, 19)),
                    new JigsawBlock(PoolType.PIGLIN, JointType.ROLLABLE, "empty", "mob_connector", BlockDirection.UP, BlockDirection.WEST, new BPos(8, 1, 16)),
                    new JigsawBlock(PoolType.PIGLIN, JointType.ROLLABLE, "empty", "mob_connector", BlockDirection.UP, BlockDirection.WEST, new BPos(10, 1, 15)),
                    new JigsawBlock(PoolType.PIGLIN, JointType.ROLLABLE, "empty", "mob_connector", BlockDirection.UP, BlockDirection.WEST, new BPos(12, 1, 15)),
                    new JigsawBlock(PoolType.BRIDGE_BRIDGE_PIECES, JointType.ROLLABLE, "empty", "bridge_connector", BlockDirection.WEST, BlockDirection.UP, new BPos(0, 2, 11)),
                    new JigsawBlock(PoolType.HOGLIN, JointType.ROLLABLE, "empty", "mob_connector", BlockDirection.UP, BlockDirection.NORTH, new BPos(14, 2, 17)),
                    new JigsawBlock(PoolType.PIGLIN, JointType.ROLLABLE, "empty", "mob_connector", BlockDirection.UP, BlockDirection.SOUTH, new BPos(15, 2, 14)),
                    new JigsawBlock(PoolType.PIGLIN, JointType.ROLLABLE, "empty", "mob_connector", BlockDirection.UP, BlockDirection.EAST, new BPos(2, 7, 28)),
                    new JigsawBlock(PoolType.PIGLIN, JointType.ROLLABLE, "empty", "mob_connector", BlockDirection.UP, BlockDirection.EAST, new BPos(4, 7, 28)),
                    new JigsawBlock(PoolType.PIGLIN, JointType.ROLLABLE, "empty", "mob_connector", BlockDirection.UP, BlockDirection.EAST, new BPos(10, 7, 27)),
                    new JigsawBlock(PoolType.BRIDGE_STARTING_PIECES, JointType.ROLLABLE, "empty", "entrance_face", BlockDirection.WEST, BlockDirection.UP, new BPos(0, 8, 0)),
                    new JigsawBlock(PoolType.PIGLIN, JointType.ROLLABLE, "empty", "mob_connector", BlockDirection.UP, BlockDirection.EAST, new BPos(12, 8, 28)),
                    new JigsawBlock(PoolType.PIGLIN, JointType.ROLLABLE, "empty", "mob_connector", BlockDirection.UP, BlockDirection.SOUTH, new BPos(7, 14, 4)),
                    new JigsawBlock(PoolType.PIGLIN, JointType.ROLLABLE, "empty", "mob_connector", BlockDirection.UP, BlockDirection.SOUTH, new BPos(11, 14, 4)),
                    new JigsawBlock(PoolType.PIGLIN_MELEE, JointType.ROLLABLE, "empty", "mob_connector", BlockDirection.UP, BlockDirection.SOUTH, new BPos(12, 15, 4)),
                    new JigsawBlock(PoolType.PIGLIN, JointType.ROLLABLE, "empty", "mob_connector", BlockDirection.UP, BlockDirection.EAST, new BPos(9, 18, 6)),
                    new JigsawBlock(PoolType.PIGLIN, JointType.ROLLABLE, "empty", "mob_connector", BlockDirection.UP, BlockDirection.EAST, new BPos(7, 19, 16)),
                    new JigsawBlock(PoolType.PIGLIN, JointType.ROLLABLE, "empty", "mob_connector", BlockDirection.UP, BlockDirection.NORTH, new BPos(13, 19, 27))
            ));
            this.put("bridge/starting_pieces/entrance_base", Arrays.asList(
                    new JigsawBlock(PoolType.BRIDGE_WALLS, JointType.ALIGNED, "empty", "wall_base_connector_right", BlockDirection.NORTH, BlockDirection.UP, new BPos(2, 0, 0)),
                    new JigsawBlock(PoolType.BRIDGE_WALLS, JointType.ALIGNED, "empty", "wall_base_connector_left", BlockDirection.SOUTH, BlockDirection.UP, new BPos(2, 0, 31)),
                    new JigsawBlock(PoolType.PIGLIN, JointType.ROLLABLE, "empty", "mob_connector", BlockDirection.UP, BlockDirection.WEST, new BPos(2, 24, 19)),
                    new JigsawBlock(PoolType.PIGLIN, JointType.ROLLABLE, "empty", "mob_connector", BlockDirection.UP, BlockDirection.NORTH, new BPos(4, 24, 16)),
                    new JigsawBlock(PoolType.PIGLIN, JointType.ROLLABLE, "empty", "mob_connector", BlockDirection.UP, BlockDirection.WEST, new BPos(5, 24, 18)),
                    new JigsawBlock(PoolType.PIGLIN, JointType.ROLLABLE, "empty", "mob_connector", BlockDirection.UP, BlockDirection.SOUTH, new BPos(8, 24, 16)),
                    new JigsawBlock(PoolType.PIGLIN, JointType.ROLLABLE, "empty", "mob_connector", BlockDirection.UP, BlockDirection.EAST, new BPos(2, 25, 15)),
                    new JigsawBlock(PoolType.PIGLIN, JointType.ROLLABLE, "empty", "mob_connector", BlockDirection.UP, BlockDirection.WEST, new BPos(6, 25, 16)),
                    new JigsawBlock(PoolType.PIGLIN, JointType.ROLLABLE, "empty", "mob_connector", BlockDirection.UP, BlockDirection.EAST, new BPos(11, 25, 15)),
                    new JigsawBlock(PoolType.BRIDGE_CONNECTORS, JointType.ROLLABLE, "empty", "back_bridge_connector_bottom", BlockDirection.EAST, BlockDirection.UP, new BPos(15, 26, 16)),
                    new JigsawBlock(PoolType.BRIDGE_STARTING_PIECES, JointType.ALIGNED, "empty", "entrance_base_connector", BlockDirection.UP, BlockDirection.WEST, new BPos(0, 31, 0))
            ));
            this.put("bridge/starting_pieces/entrance_face", Collections.singletonList(
                    new JigsawBlock(PoolType.EMPTY, JointType.ROLLABLE, "entrance_face", "empty", BlockDirection.EAST, BlockDirection.UP, new BPos(4, 0, 0))
            ));
            this.put("bridge/legs/leg_0", Collections.singletonList(
                    new JigsawBlock(PoolType.EMPTY, JointType.ALIGNED, "leg_connector", "empty", BlockDirection.UP, BlockDirection.WEST, new BPos(0, 21, 1))
            ));
            this.put("bridge/legs/leg_1", Collections.singletonList(
                    new JigsawBlock(PoolType.EMPTY, JointType.ALIGNED, "leg_connector", "empty", BlockDirection.UP, BlockDirection.WEST, new BPos(0, 21, 1))
            ));
            this.put("bridge/rampart_plates/plate_0", Collections.singletonList(
                    new JigsawBlock(PoolType.EMPTY, JointType.ALIGNED, "rampart_plate_connector", "empty", BlockDirection.EAST, BlockDirection.UP, new BPos(1, 18, 8))
            ));
            this.put("bridge/ramparts/rampart_0", Arrays.asList(
                    new JigsawBlock(PoolType.EMPTY, JointType.ALIGNED, "ramparts", "empty", BlockDirection.DOWN, BlockDirection.WEST, new BPos(0, 0, 0)),
                    new JigsawBlock(PoolType.PIGLIN, JointType.ROLLABLE, "empty", "mob_connector", BlockDirection.UP, BlockDirection.EAST, new BPos(14, 2, 9)),
                    new JigsawBlock(PoolType.PIGLIN, JointType.ROLLABLE, "empty", "mob_connector", BlockDirection.UP, BlockDirection.EAST, new BPos(13, 4, 6))
            ));
            this.put("bridge/ramparts/rampart_1", Arrays.asList(
                    new JigsawBlock(PoolType.EMPTY, JointType.ALIGNED, "ramparts", "empty", BlockDirection.DOWN, BlockDirection.WEST, new BPos(0, 0, 0)),
                    new JigsawBlock(PoolType.PIGLIN, JointType.ROLLABLE, "empty", "mob_connector", BlockDirection.UP, BlockDirection.EAST, new BPos(13, 3, 6)),
                    new JigsawBlock(PoolType.PIGLIN_MELEE, JointType.ROLLABLE, "empty", "mob_connector", BlockDirection.UP, BlockDirection.EAST, new BPos(7, 16, 6)),
                    new JigsawBlock(PoolType.PIGLIN_MELEE, JointType.ROLLABLE, "empty", "mob_connector", BlockDirection.UP, BlockDirection.EAST, new BPos(8, 16, 7)),
                    new JigsawBlock(PoolType.PIGLIN_MELEE, JointType.ROLLABLE, "empty", "mob_connector", BlockDirection.UP, BlockDirection.EAST, new BPos(8, 16, 11)),
                    new JigsawBlock(PoolType.PIGLIN, JointType.ROLLABLE, "empty", "mob_connector", BlockDirection.UP, BlockDirection.NORTH, new BPos(9, 16, 9)),
                    new JigsawBlock(PoolType.PIGLIN, JointType.ROLLABLE, "empty", "mob_connector", BlockDirection.UP, BlockDirection.EAST, new BPos(3, 18, 5)),
                    new JigsawBlock(PoolType.BRIDGE_RAMPART_PLATES, JointType.ALIGNED, "empty", "rampart_plate_connector", BlockDirection.WEST, BlockDirection.UP, new BPos(0, 31, 8))
            ));
            this.put("bridge/walls/wall_base_0", Arrays.asList(
                    new JigsawBlock(PoolType.EMPTY, JointType.ALIGNED, "wall_base_connector_right", "empty", BlockDirection.SOUTH, BlockDirection.UP, new BPos(0, 0, 15)),
                    new JigsawBlock(PoolType.PIGLIN, JointType.ROLLABLE, "empty", "mob_connector", BlockDirection.UP, BlockDirection.WEST, new BPos(5, 1, 12)),
                    new JigsawBlock(PoolType.PIGLIN, JointType.ROLLABLE, "empty", "mob_connector", BlockDirection.UP, BlockDirection.EAST, new BPos(5, 3, 8)),
                    new JigsawBlock(PoolType.BRIDGE_RAMPARTS, JointType.ALIGNED, "empty", "ramparts", BlockDirection.UP, BlockDirection.WEST, new BPos(0, 23, 0))
            ));
            this.put("bridge/walls/wall_base_1", Arrays.asList(
                    new JigsawBlock(PoolType.EMPTY, JointType.ALIGNED, "wall_base_connector_left", "empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(0, 0, 0)),
                    new JigsawBlock(PoolType.BRIDGE_RAMPARTS, JointType.ALIGNED, "empty", "ramparts", BlockDirection.UP, BlockDirection.WEST, new BPos(0, 23, 0))
            ));
        }
    };
}