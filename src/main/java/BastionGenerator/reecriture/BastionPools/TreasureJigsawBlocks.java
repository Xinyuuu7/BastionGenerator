package BastionGenerator.reecriture.BastionPools;

import BastionGenerator.enumType.JointType;
import BastionGenerator.enumType.PoolType;
import com.seedfinding.mccore.util.block.BlockDirection;
import com.seedfinding.mccore.util.pos.BPos;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class TreasureJigsawBlocks {
    public static final HashMap<String, List<JigsawBlock>> JIGSAW_BLOCKS = new HashMap<>() {{
        this.putAll(MobsJigsawBlocks.JIGSAW_BLOCKS);
        this.put("treasure/big_air_full", Arrays.asList(
                new JigsawBlock(PoolType.TREASURE_BASES, JointType.ALIGNED, "empty", "center_piece", BlockDirection.NORTH, BlockDirection.UP, new BPos(30,0,8)),
                new JigsawBlock(PoolType.TREASURE_ENTRANCES, JointType.ROLLABLE, "empty", "entrance_bridge_connector", BlockDirection.NORTH, BlockDirection.UP, new BPos(20,35,0))
        ));
        this.put("treasure/walls/outer/bottom_corner", Arrays.asList(
                new JigsawBlock(PoolType.EMPTY, JointType.ROLLABLE, "bottom_corner_wall_connector", "empty", BlockDirection.WEST, BlockDirection.UP, new BPos(0,0,2)),
                new JigsawBlock(PoolType.TREASURE_CORNERS_EDGES, JointType.ROLLABLE, "empty", "bottom_edge_connector", BlockDirection.SOUTH, BlockDirection.UP, new BPos(0,0,4)),
                new JigsawBlock(PoolType.TREASURE_CORNERS_EDGES, JointType.ROLLABLE, "empty", "bottom_edge_connector", BlockDirection.NORTH, BlockDirection.UP, new BPos(1,0,0))
        ));
        this.put("treasure/corners/bottom/corner_0", Arrays.asList(
                new JigsawBlock(PoolType.TREASURE_WALLS_OUTER, JointType.ROLLABLE, "empty", "bottom_corner_wall_connector", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,0,0)),
                new JigsawBlock(PoolType.TREASURE_WALLS_OUTER, JointType.ROLLABLE, "empty", "bottom_corner_wall_connector", BlockDirection.EAST, BlockDirection.UP, new BPos(4,0,2)),
                new JigsawBlock(PoolType.EMPTY, JointType.ROLLABLE, "corner_connector", "empty", BlockDirection.WEST, BlockDirection.UP, new BPos(0,4,3)),
                new JigsawBlock(PoolType.EMPTY, JointType.ROLLABLE, "corner_connector", "empty", BlockDirection.SOUTH, BlockDirection.UP, new BPos(1,4,4))
        ));
        this.put("treasure/corners/bottom/corner_1", Arrays.asList(
                new JigsawBlock(PoolType.TREASURE_WALLS_OUTER, JointType.ROLLABLE, "empty", "bottom_corner_wall_connector", BlockDirection.WEST, BlockDirection.UP, new BPos(0,0,2)),
                new JigsawBlock(PoolType.TREASURE_WALLS_OUTER, JointType.ROLLABLE, "empty", "bottom_corner_wall_connector", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,0,0)),
                new JigsawBlock(PoolType.EMPTY, JointType.ROLLABLE, "corner_connector", "empty", BlockDirection.SOUTH, BlockDirection.UP, new BPos(3,4,4)),
                new JigsawBlock(PoolType.EMPTY, JointType.ROLLABLE, "corner_connector", "empty", BlockDirection.EAST, BlockDirection.UP, new BPos(4,4,3))
        ));
        this.put("treasure/ramparts/bottom_wall_0", Collections.singletonList(
                new JigsawBlock(PoolType.EMPTY, JointType.ALIGNED, "ramparts_bottom_connector", "empty", BlockDirection.UP, BlockDirection.NORTH, new BPos(6,23,0))
        ));
        this.put("treasure/bases/centers/center_0", Arrays.asList(
                new JigsawBlock(PoolType.PIGLIN_MELEE, JointType.ROLLABLE, "empty", "melee_connector", BlockDirection.UP, BlockDirection.NORTH, new BPos(1,2,5)),
                new JigsawBlock(PoolType.EMPTY, JointType.ROLLABLE, "treasure", "empty", BlockDirection.EAST, BlockDirection.UP, new BPos(6,2,2))
        ));
        this.put("treasure/bases/centers/center_1", Arrays.asList(
                new JigsawBlock(PoolType.PIGLIN_MELEE, JointType.ROLLABLE, "empty", "melee_connector", BlockDirection.UP, BlockDirection.EAST, new BPos(5,2,3)),
                new JigsawBlock(PoolType.PIGLIN_MELEE, JointType.ROLLABLE, "empty", "melee_connector", BlockDirection.UP, BlockDirection.NORTH, new BPos(5,2,4)),
                new JigsawBlock(PoolType.EMPTY, JointType.ROLLABLE, "treasure", "empty", BlockDirection.EAST, BlockDirection.UP, new BPos(6,2,2))
        ));
        this.put("treasure/bases/centers/center_2", Arrays.asList(
                new JigsawBlock(PoolType.PIGLIN_MELEE, JointType.ROLLABLE, "empty", "melee_connector", BlockDirection.UP, BlockDirection.EAST, new BPos(1,1,1)),
                new JigsawBlock(PoolType.PIGLIN, JointType.ROLLABLE, "empty", "mob_connector", BlockDirection.UP, BlockDirection.WEST, new BPos(4,1,6)),
                new JigsawBlock(PoolType.EMPTY, JointType.ROLLABLE, "treasure", "empty", BlockDirection.EAST, BlockDirection.UP, new BPos(6,2,2))
        ));
        this.put("treasure/bases/centers/center_3", Arrays.asList(
                new JigsawBlock(PoolType.PIGLIN_MELEE, JointType.ROLLABLE, "empty", "melee_connector", BlockDirection.UP, BlockDirection.NORTH, new BPos(1,1,6)),
                new JigsawBlock(PoolType.EMPTY, JointType.ROLLABLE, "treasure", "empty", BlockDirection.EAST, BlockDirection.UP, new BPos(6,2,2))
        ));
        this.put("treasure/brains/center_brain", Arrays.asList(
                new JigsawBlock(PoolType.EMPTY, JointType.ALIGNED, "center_brain", "empty", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(0,0,0)),
                new JigsawBlock(PoolType.TREASURE_CONNECTORS, JointType.ROLLABLE, "empty", "mid_connector", BlockDirection.WEST, BlockDirection.UP, new BPos(0,5,0)),
                new JigsawBlock(PoolType.TREASURE_CONNECTORS, JointType.ROLLABLE, "empty", "mid_connector", BlockDirection.SOUTH, BlockDirection.UP, new BPos(0,5,1)),
                new JigsawBlock(PoolType.TREASURE_CONNECTORS, JointType.ROLLABLE, "empty", "mid_connector", BlockDirection.NORTH, BlockDirection.UP, new BPos(1,5,0)),
                new JigsawBlock(PoolType.TREASURE_CONNECTORS, JointType.ROLLABLE, "empty", "mid_connector", BlockDirection.EAST, BlockDirection.UP, new BPos(1,5,1)),
                new JigsawBlock(PoolType.TREASURE_CONNECTORS, JointType.ROLLABLE, "empty", "top_connector", BlockDirection.WEST, BlockDirection.UP, new BPos(0,20,0)),
                new JigsawBlock(PoolType.TREASURE_CONNECTORS, JointType.ROLLABLE, "empty", "top_connector", BlockDirection.SOUTH, BlockDirection.UP, new BPos(0,20,1)),
                new JigsawBlock(PoolType.TREASURE_CONNECTORS, JointType.ROLLABLE, "empty", "top_connector_entrance", BlockDirection.NORTH, BlockDirection.UP, new BPos(1,20,0)),
                new JigsawBlock(PoolType.TREASURE_CONNECTORS, JointType.ROLLABLE, "empty", "top_connector", BlockDirection.EAST, BlockDirection.UP, new BPos(1,20,1)),
                new JigsawBlock(PoolType.TREASURE_ROOFS, JointType.ALIGNED, "empty", "center_roof_connector", BlockDirection.UP, BlockDirection.NORTH, new BPos(1,34,0))
        ));
        this.put("treasure/roofs/center_roof", Collections.singletonList(
                new JigsawBlock(PoolType.EMPTY, JointType.ALIGNED, "center_roof_connector", "empty", BlockDirection.DOWN, BlockDirection.WEST, new BPos(11,0,11))
        ));
        this.put("treasure/connectors/center_to_wall_middle", Arrays.asList(
                new JigsawBlock(PoolType.TREASURE_WALLS_MID, JointType.ROLLABLE, "empty", "center_connector", BlockDirection.WEST, BlockDirection.UP, new BPos(0,0,0)),
                new JigsawBlock(PoolType.EMPTY, JointType.ROLLABLE, "mid_connector", "empty", BlockDirection.EAST, BlockDirection.UP, new BPos(10,0,0))
        ));
        this.put("treasure/connectors/center_to_wall_top", Arrays.asList(
                new JigsawBlock(PoolType.TREASURE_WALLS_TOP, JointType.ROLLABLE, "empty", "center_connector", BlockDirection.WEST, BlockDirection.UP, new BPos(0,0,0)),
                new JigsawBlock(PoolType.EMPTY, JointType.ROLLABLE, "top_connector", "empty", BlockDirection.EAST, BlockDirection.UP, new BPos(10,0,0))
        ));
        this.put("treasure/connectors/center_to_wall_top_entrance", Arrays.asList(
                new JigsawBlock(PoolType.TREASURE_WALLS_TOP, JointType.ROLLABLE, "empty", "entrance_connector", BlockDirection.WEST, BlockDirection.UP, new BPos(0,0,0)),
                new JigsawBlock(PoolType.EMPTY, JointType.ROLLABLE, "top_connector_entrance", "empty", BlockDirection.EAST, BlockDirection.UP, new BPos(10,0,0))
        ));
        this.put("treasure/roofs/corner_roof", Collections.singletonList(
                new JigsawBlock(PoolType.EMPTY, JointType.ROLLABLE, "corner_roof_connector", "empty", BlockDirection.DOWN, BlockDirection.SOUTH, new BPos(2,0,2))
        ));
        this.put("treasure/corners/edges/bottom", Collections.singletonList(
                new JigsawBlock(PoolType.EMPTY, JointType.ROLLABLE, "bottom_edge_connector", "empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(0,0,0))
        ));
        this.put("treasure/corners/edges/middle", Collections.singletonList(
                new JigsawBlock(PoolType.EMPTY, JointType.ROLLABLE, "middle_edge_connector", "empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(0,0,0))
        ));
        this.put("treasure/corners/edges/top", Collections.singletonList(
                new JigsawBlock(PoolType.EMPTY, JointType.ROLLABLE, "top_edge_connector", "empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(0,0,0))
        ));
        this.put("treasure/extensions/empty", Collections.singletonList(
                new JigsawBlock(PoolType.EMPTY, JointType.ROLLABLE, "extension_connector", "empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(0,0,0))
        ));
        this.put("treasure/entrances/entrance_0", Arrays.asList(
                new JigsawBlock(PoolType.TREASURE_RAMPARTS, JointType.ROLLABLE, "empty", "bridge_wall_connector", BlockDirection.WEST, BlockDirection.UP, new BPos(0,2,5)),
                new JigsawBlock(PoolType.PIGLIN, JointType.ROLLABLE, "empty", "mob_connector", BlockDirection.UP, BlockDirection.WEST, new BPos(3,2,7)),
                new JigsawBlock(PoolType.EMPTY, JointType.ROLLABLE, "entrance_bridge_connector", "empty", BlockDirection.EAST, BlockDirection.UP, new BPos(18,2,5))
        ));
        this.put("treasure/walls/entrance_wall", Arrays.asList(
                new JigsawBlock(PoolType.EMPTY, JointType.ROLLABLE, "entrance_wall_connector", "empty", BlockDirection.EAST, BlockDirection.UP, new BPos(1,0,23)),
                new JigsawBlock(PoolType.TREASURE_ENTRANCES, JointType.ROLLABLE, "empty", "entrance_bridge_connector", BlockDirection.WEST, BlockDirection.UP, new BPos(0,4,10))
        ));
        this.put("treasure/extensions/fire_room", Collections.singletonList(
                new JigsawBlock(PoolType.EMPTY, JointType.ROLLABLE, "extension_connector", "empty", BlockDirection.WEST, BlockDirection.UP, new BPos(0,1,5))
        ));
        this.put("treasure/extensions/house_0", Collections.singletonList(
                new JigsawBlock(PoolType.EMPTY, JointType.ROLLABLE, "house_connector", "empty", BlockDirection.WEST, BlockDirection.UP, new BPos(0,0,1))
        ));
        this.put("treasure/extensions/house_1", Collections.singletonList(
                new JigsawBlock(PoolType.EMPTY, JointType.ROLLABLE, "house_connector", "empty", BlockDirection.WEST, BlockDirection.UP, new BPos(0,0,1))
        ));
        this.put("treasure/extensions/large_bridge_0", Collections.singletonList(
                new JigsawBlock(PoolType.EMPTY, JointType.ROLLABLE, "extension_connector", "empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(3,1,0))
        ));
        this.put("treasure/extensions/large_bridge_1", Collections.singletonList(
                new JigsawBlock(PoolType.EMPTY, JointType.ROLLABLE, "extension_connector", "empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(3,1,0))
        ));
        this.put("treasure/extensions/large_bridge_2", Collections.singletonList(
                new JigsawBlock(PoolType.EMPTY, JointType.ROLLABLE, "extension_connector", "empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(3,1,0))
        ));
        this.put("treasure/extensions/large_bridge_3", Collections.singletonList(
                new JigsawBlock(PoolType.EMPTY, JointType.ROLLABLE, "extension_connector", "empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(3,1,0))
        ));
        this.put("treasure/bases/lava_basin", Arrays.asList(
                new JigsawBlock(PoolType.EMPTY, JointType.ALIGNED, "center_piece", "empty", BlockDirection.SOUTH, BlockDirection.UP, new BPos(23,0,0)),
                new JigsawBlock(PoolType.TREASURE_WALLS_BOTTOM, JointType.ROLLABLE, "empty", "center_connector", BlockDirection.WEST, BlockDirection.UP, new BPos(0,3,13)),
                new JigsawBlock(PoolType.TREASURE_WALLS_BOTTOM, JointType.ROLLABLE, "empty", "center_connector", BlockDirection.NORTH, BlockDirection.UP, new BPos(10,3,0)),
                new JigsawBlock(PoolType.TREASURE_WALLS_BOTTOM, JointType.ROLLABLE, "empty", "center_connector", BlockDirection.SOUTH, BlockDirection.UP, new BPos(13,3,23)),
                new JigsawBlock(PoolType.TREASURE_BASES_CENTERS, JointType.ALIGNED, "empty", "treasure", BlockDirection.WEST, BlockDirection.UP, new BPos(15,3,10)),
                new JigsawBlock(PoolType.TREASURE_WALLS_BOTTOM, JointType.ROLLABLE, "empty", "center_connector", BlockDirection.EAST, BlockDirection.UP, new BPos(23,3,10)),
                new JigsawBlock(PoolType.TREASURE_STAIRS, JointType.ALIGNED, "empty", "lower_stairs", BlockDirection.UP, BlockDirection.WEST, new BPos(11,10,4)),
                new JigsawBlock(PoolType.TREASURE_BRAINS, JointType.ALIGNED, "empty", "center_brain", BlockDirection.UP, BlockDirection.NORTH, new BPos(11,10,11)),
                new JigsawBlock(PoolType.PIGLIN_MELEE, JointType.ROLLABLE, "empty", "melee_connector", BlockDirection.UP, BlockDirection.NORTH, new BPos(12,10,8)),
                new JigsawBlock(PoolType.PIGLIN_MELEE, JointType.ROLLABLE, "empty", "mob_connector", BlockDirection.UP, BlockDirection.NORTH, new BPos(12,10,20))
        ));
        this.put("treasure/ramparts/lava_basin_main", Arrays.asList(
                new JigsawBlock(PoolType.EMPTY, JointType.ROLLABLE, "lava_basin_connector_side", "empty", BlockDirection.WEST, BlockDirection.UP, new BPos(0,29,0)),
                new JigsawBlock(PoolType.TREASURE_WALLS, JointType.ROLLABLE, "empty", "lava_wall", BlockDirection.EAST, BlockDirection.UP, new BPos(18,29,13))
        ));
        this.put("treasure/ramparts/lava_basin_side", Arrays.asList(
                new JigsawBlock(PoolType.EMPTY, JointType.ROLLABLE, "lava_basin_connector_main", "empty", BlockDirection.WEST, BlockDirection.UP, new BPos(0,29,0)),
                new JigsawBlock(PoolType.TREASURE_WALLS, JointType.ROLLABLE, "empty", "lava_wall", BlockDirection.EAST, BlockDirection.UP, new BPos(18,29,13))
        ));
        this.put("treasure/walls/lava_wall", Collections.singletonList(
                new JigsawBlock(PoolType.EMPTY, JointType.ROLLABLE, "lava_wall", "empty", BlockDirection.WEST, BlockDirection.UP, new BPos(0,29,13))
        ));
        this.put("treasure/stairs/lower_stairs", Collections.singletonList(
                new JigsawBlock(PoolType.EMPTY, JointType.ALIGNED, "lower_stairs", "empty", BlockDirection.DOWN, BlockDirection.WEST, new BPos(0,0,4))
        ));
        this.put("treasure/walls/top/main_entrance", Arrays.asList(
                new JigsawBlock(PoolType.TREASURE_WALLS, JointType.ROLLABLE, "empty", "entrance_wall_connector", BlockDirection.WEST, BlockDirection.UP, new BPos(0,0,23)),
                new JigsawBlock(PoolType.TREASURE_CORNERS_TOP, JointType.ROLLABLE, "empty", "corner_connector", BlockDirection.NORTH, BlockDirection.UP, new BPos(3,0,0)),
                new JigsawBlock(PoolType.TREASURE_CORNERS_TOP, JointType.ROLLABLE, "empty", "corner_connector", BlockDirection.SOUTH, BlockDirection.UP, new BPos(3,0,23)),
                new JigsawBlock(PoolType.EMPTY, JointType.ROLLABLE, "entrance_connector", "empty", BlockDirection.EAST, BlockDirection.UP, new BPos(4,0,11)),
                new JigsawBlock(PoolType.PIGLIN_MELEE, JointType.ROLLABLE, "empty", "mob_connector", BlockDirection.UP, BlockDirection.EAST, new BPos(2,4,10)),
                new JigsawBlock(PoolType.PIGLIN_MELEE, JointType.ROLLABLE, "empty", "mob_connector", BlockDirection.UP, BlockDirection.EAST, new BPos(2,4,12)),
                new JigsawBlock(PoolType.PIGLIN_MELEE, JointType.ROLLABLE, "empty", "melee_connector", BlockDirection.UP, BlockDirection.EAST, new BPos(3,4,11)),
                new JigsawBlock(PoolType.TREASURE_EXTENSIONS_SMALL_POOL, JointType.ROLLABLE, "empty", "extension_connector", BlockDirection.EAST, BlockDirection.UP, new BPos(4,4,10)),
                new JigsawBlock(PoolType.TREASURE_EXTENSIONS_SMALL_POOL, JointType.ROLLABLE, "empty", "extension_connector", BlockDirection.EAST, BlockDirection.UP, new BPos(4,4,15)),
                new JigsawBlock(PoolType.TREASURE_EXTENSIONS_SMALL_POOL, JointType.ROLLABLE, "empty", "extension_connector", BlockDirection.EAST, BlockDirection.UP, new BPos(4,4,19)),
                new JigsawBlock(PoolType.TREASURE_EXTENSIONS_SMALL_POOL, JointType.ROLLABLE, "empty", "extension_connector", BlockDirection.EAST, BlockDirection.UP, new BPos(4,9,2)),
                new JigsawBlock(PoolType.TREASURE_EXTENSIONS_SMALL_POOL, JointType.ROLLABLE, "empty", "extension_connector", BlockDirection.EAST, BlockDirection.UP, new BPos(4,9,6)),
                new JigsawBlock(PoolType.TREASURE_ROOFS, JointType.ALIGNED, "empty", "wall_roof_connector", BlockDirection.UP, BlockDirection.NORTH, new BPos(0,14,0))
        ));
        this.put("treasure/walls/outer/medium_outer_wall", Collections.singletonList(
                new JigsawBlock(PoolType.EMPTY, JointType.ROLLABLE, "medium_outer_wall_connector", "empty", BlockDirection.EAST, BlockDirection.UP, new BPos(1,0,23))
        ));
        this.put("treasure/corners/middle/corner_0", Arrays.asList(
                new JigsawBlock(PoolType.TREASURE_WALLS_OUTER, JointType.ROLLABLE, "empty", "middle_corner_wall_connector", BlockDirection.WEST, BlockDirection.UP, new BPos(0,0,2)),
                new JigsawBlock(PoolType.TREASURE_WALLS_OUTER, JointType.ROLLABLE, "empty", "middle_corner_wall_connector", BlockDirection.SOUTH, BlockDirection.UP, new BPos(2,0,4)),
                new JigsawBlock(PoolType.EMPTY, JointType.ROLLABLE, "corner_connector", "empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(3,0,0)),
                new JigsawBlock(PoolType.EMPTY, JointType.ROLLABLE, "corner_connector", "empty", BlockDirection.EAST, BlockDirection.UP, new BPos(4,0,1))
        ));
        this.put("treasure/corners/middle/corner_1", Arrays.asList(
                new JigsawBlock(PoolType.TREASURE_WALLS_OUTER, JointType.ROLLABLE, "empty", "middle_corner_wall_connector", BlockDirection.WEST, BlockDirection.UP, new BPos(0,0,2)),
                new JigsawBlock(PoolType.TREASURE_WALLS_OUTER, JointType.ROLLABLE, "empty", "middle_corner_wall_connector", BlockDirection.SOUTH, BlockDirection.UP, new BPos(2,0,4)),
                new JigsawBlock(PoolType.EMPTY, JointType.ROLLABLE, "corner_connector", "empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(3,0,0)),
                new JigsawBlock(PoolType.EMPTY, JointType.ROLLABLE, "corner_connector", "empty", BlockDirection.EAST, BlockDirection.UP, new BPos(4,0,1))
        ));
        this.put("treasure/walls/outer/mid_corner", Arrays.asList(
                new JigsawBlock(PoolType.TREASURE_CORNERS_EDGES, JointType.ROLLABLE, "empty", "middle_edge_connector", BlockDirection.WEST, BlockDirection.UP, new BPos(0,0,0)),
                new JigsawBlock(PoolType.EMPTY, JointType.ROLLABLE, "middle_corner_wall_connector", "empty", BlockDirection.SOUTH, BlockDirection.UP, new BPos(2,0,1)),
                new JigsawBlock(PoolType.TREASURE_CORNERS_EDGES, JointType.ROLLABLE, "empty", "middle_edge_connector", BlockDirection.EAST, BlockDirection.UP, new BPos(4,0,1))
        ));
        this.put("treasure/walls/mid/wall_0", Arrays.asList(
                new JigsawBlock(PoolType.TREASURE_WALLS_OUTER, JointType.ROLLABLE, "empty", "outer_wall_connector", BlockDirection.WEST, BlockDirection.UP, new BPos(0,0,23)),
                new JigsawBlock(PoolType.TREASURE_CORNERS_MIDDLE, JointType.ROLLABLE, "empty", "corner_connector", BlockDirection.NORTH, BlockDirection.UP, new BPos(3,0,0)),
                new JigsawBlock(PoolType.TREASURE_CORNERS_MIDDLE, JointType.ROLLABLE, "empty", "corner_connector", BlockDirection.SOUTH, BlockDirection.UP, new BPos(3,0,23)),
                new JigsawBlock(PoolType.EMPTY, JointType.ROLLABLE, "center_connector", "empty", BlockDirection.EAST, BlockDirection.UP, new BPos(4,0,11)),
                new JigsawBlock(PoolType.PIGLIN, JointType.ALIGNED, "empty", "mob_connector", BlockDirection.UP, BlockDirection.WEST, new BPos(1,1,10)),
                new JigsawBlock(PoolType.PIGLIN, JointType.ALIGNED, "empty", "mob_connector", BlockDirection.UP, BlockDirection.WEST, new BPos(1,1,13)),
                new JigsawBlock(PoolType.TREASURE_EXTENSIONS_LARGE_POOL, JointType.ROLLABLE, "empty", "extension_connector", BlockDirection.EAST, BlockDirection.UP, new BPos(4,6,10)),
                new JigsawBlock(PoolType.PIGLIN_MELEE, JointType.ALIGNED, "empty", "melee_connector", BlockDirection.UP, BlockDirection.WEST, new BPos(2,10,21)),
                new JigsawBlock(PoolType.TREASURE_EXTENSIONS_SMALL_POOL, JointType.ROLLABLE, "empty", "extension_connector", BlockDirection.EAST, BlockDirection.UP, new BPos(4,10,2)),
                new JigsawBlock(PoolType.TREASURE_EXTENSIONS_SMALL_POOL, JointType.ROLLABLE, "empty", "extension_connector", BlockDirection.EAST, BlockDirection.UP, new BPos(4,10,15)),
                new JigsawBlock(PoolType.TREASURE_EXTENSIONS_SMALL_POOL, JointType.ROLLABLE, "empty", "extension_connector", BlockDirection.EAST, BlockDirection.UP, new BPos(4,10,19)),
                new JigsawBlock(PoolType.TREASURE_EXTENSIONS_LARGE_POOL, JointType.ROLLABLE, "empty", "extension_connector", BlockDirection.EAST, BlockDirection.UP, new BPos(4,14,3)),
                new JigsawBlock(PoolType.TREASURE_EXTENSIONS_LARGE_POOL, JointType.ROLLABLE, "empty", "extension_connector", BlockDirection.EAST, BlockDirection.UP, new BPos(4,14,17))
        ));
        this.put("treasure/walls/mid/wall_1", Arrays.asList(
                new JigsawBlock(PoolType.TREASURE_WALLS_OUTER, JointType.ROLLABLE, "empty", "outer_wall_connector", BlockDirection.WEST, BlockDirection.UP, new BPos(0,0,23)),
                new JigsawBlock(PoolType.TREASURE_CORNERS_MIDDLE, JointType.ROLLABLE, "empty", "corner_connector", BlockDirection.NORTH, BlockDirection.UP, new BPos(3,0,0)),
                new JigsawBlock(PoolType.TREASURE_CORNERS_MIDDLE, JointType.ROLLABLE, "empty", "corner_connector", BlockDirection.SOUTH, BlockDirection.UP, new BPos(3,0,23)),
                new JigsawBlock(PoolType.EMPTY, JointType.ROLLABLE, "center_connector", "empty", BlockDirection.EAST, BlockDirection.UP, new BPos(4,0,11)),
                new JigsawBlock(PoolType.TREASURE_EXTENSIONS_LARGE_POOL, JointType.ROLLABLE, "empty", "extension_connector", BlockDirection.EAST, BlockDirection.UP, new BPos(4,0,17)),
                new JigsawBlock(PoolType.PIGLIN, JointType.ROLLABLE, "empty", "mob_connector", BlockDirection.UP, BlockDirection.WEST, new BPos(1,6,1)),
                new JigsawBlock(PoolType.PIGLIN, JointType.ROLLABLE, "empty", "mob_connector", BlockDirection.UP, BlockDirection.WEST, new BPos(1,6,4)),
                new JigsawBlock(PoolType.TREASURE_EXTENSIONS_LARGE_POOL, JointType.ROLLABLE, "empty", "extension_connector", BlockDirection.EAST, BlockDirection.UP, new BPos(4,6,10)),
                new JigsawBlock(PoolType.PIGLIN, JointType.ROLLABLE, "empty", "mob_connector", BlockDirection.UP, BlockDirection.SOUTH, new BPos(2,10,20)),
                new JigsawBlock(PoolType.TREASURE_EXTENSIONS_SMALL_POOL, JointType.ROLLABLE, "empty", "extension_connector", BlockDirection.EAST, BlockDirection.UP, new BPos(4,14,2)),
                new JigsawBlock(PoolType.TREASURE_EXTENSIONS_SMALL_POOL, JointType.ROLLABLE, "empty", "extension_connector", BlockDirection.EAST, BlockDirection.UP, new BPos(4,14,6)),
                new JigsawBlock(PoolType.TREASURE_EXTENSIONS_SMALL_POOL, JointType.ROLLABLE, "empty", "extension_connector", BlockDirection.EAST, BlockDirection.UP, new BPos(4,14,15)),
                new JigsawBlock(PoolType.TREASURE_EXTENSIONS_SMALL_POOL, JointType.ROLLABLE, "empty", "extension_connector", BlockDirection.EAST, BlockDirection.UP, new BPos(4,14,19))
        ));
        this.put("treasure/walls/mid/wall_2", Arrays.asList(
                new JigsawBlock(PoolType.TREASURE_WALLS_OUTER, JointType.ROLLABLE, "empty", "outer_wall_connector", BlockDirection.WEST, BlockDirection.UP, new BPos(0,0,23)),
                new JigsawBlock(PoolType.TREASURE_CORNERS_MIDDLE, JointType.ROLLABLE, "empty", "corner_connector", BlockDirection.NORTH, BlockDirection.UP, new BPos(3,0,0)),
                new JigsawBlock(PoolType.TREASURE_CORNERS_MIDDLE, JointType.ROLLABLE, "empty", "corner_connector", BlockDirection.SOUTH, BlockDirection.UP, new BPos(3,0,23)),
                new JigsawBlock(PoolType.EMPTY, JointType.ROLLABLE, "center_connector", "empty", BlockDirection.EAST, BlockDirection.UP, new BPos(4,0,11)),
                new JigsawBlock(PoolType.PIGLIN, JointType.ROLLABLE, "empty", "mob_connector", BlockDirection.UP, BlockDirection.SOUTH, new BPos(1,10,16)),
                new JigsawBlock(PoolType.PIGLIN, JointType.ROLLABLE, "empty", "mob_connector", BlockDirection.UP, BlockDirection.WEST, new BPos(1,10,22)),
                new JigsawBlock(PoolType.TREASURE_EXTENSIONS_SMALL_POOL, JointType.ROLLABLE, "empty", "extension_connector", BlockDirection.EAST, BlockDirection.UP, new BPos(4,10,2)),
                new JigsawBlock(PoolType.TREASURE_EXTENSIONS_SMALL_POOL, JointType.ROLLABLE, "empty", "extension_connector", BlockDirection.EAST, BlockDirection.UP, new BPos(4,10,19))
        ));
        this.put("treasure/ramparts/mid_wall_main", Arrays.asList(
                new JigsawBlock(PoolType.TREASURE_RAMPARTS, JointType.ALIGNED, "empty", "ramparts_bottom_connector", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(7,0,0)),
                new JigsawBlock(PoolType.PIGLIN, JointType.ROLLABLE, "empty", "mob_connector", BlockDirection.UP, BlockDirection.NORTH, new BPos(13,0,5)),
                new JigsawBlock(PoolType.TREASURE_RAMPARTS, JointType.ROLLABLE, "empty", "rampart_mid_side_wall_connector", BlockDirection.SOUTH, BlockDirection.UP, new BPos(14,0,13)),
                new JigsawBlock(PoolType.TREASURE_RAMPARTS, JointType.ROLLABLE, "empty", "lava_basin_connector_main", BlockDirection.EAST, BlockDirection.UP, new BPos(16,5,0)),
                new JigsawBlock(PoolType.EMPTY, JointType.ROLLABLE, "bridge_wall_connector", "empty", BlockDirection.EAST, BlockDirection.UP, new BPos(16,14,5)),
                new JigsawBlock(PoolType.PIGLIN_MELEE, JointType.ROLLABLE, "empty", "mob_connector", BlockDirection.UP, BlockDirection.SOUTH, new BPos(11,28,4)),
                new JigsawBlock(PoolType.PIGLIN_MELEE, JointType.ROLLABLE, "empty", "melee_connector", BlockDirection.UP, BlockDirection.EAST, new BPos(12,28,6)),
                new JigsawBlock(PoolType.PIGLIN_MELEE, JointType.ROLLABLE, "empty", "mob_connector", BlockDirection.UP, BlockDirection.NORTH, new BPos(12,28,8)),
                new JigsawBlock(PoolType.TREASURE_RAMPARTS, JointType.ALIGNED, "empty", "ramparts_top_connector", BlockDirection.UP, BlockDirection.NORTH, new BPos(7,31,0))
        ));
        this.put("treasure/ramparts/mid_wall_side", Arrays.asList(
                new JigsawBlock(PoolType.TREASURE_RAMPARTS, JointType.ALIGNED, "empty", "ramparts_bottom_connector", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(7,0,0)),
                new JigsawBlock(PoolType.PIGLIN, JointType.ROLLABLE, "empty", "mob_connector", BlockDirection.UP, BlockDirection.SOUTH, new BPos(12,0,3)),
                new JigsawBlock(PoolType.EMPTY, JointType.ROLLABLE, "rampart_mid_side_wall_connector", "empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(16,0,0)),
                new JigsawBlock(PoolType.TREASURE_RAMPARTS, JointType.ROLLABLE, "empty", "lava_basin_connector_side", BlockDirection.EAST, BlockDirection.UP, new BPos(16,5,0)),
                new JigsawBlock(PoolType.PIGLIN, JointType.ROLLABLE, "empty", "mob_connector", BlockDirection.UP, BlockDirection.SOUTH, new BPos(15,8,7)),
                new JigsawBlock(PoolType.PIGLIN_MELEE, JointType.ROLLABLE, "empty", "mob_connector", BlockDirection.UP, BlockDirection.NORTH, new BPos(11,27,5)),
                new JigsawBlock(PoolType.PIGLIN_MELEE, JointType.ROLLABLE, "empty", "mob_connector", BlockDirection.UP, BlockDirection.NORTH, new BPos(11,27,9)),
                new JigsawBlock(PoolType.PIGLIN_MELEE, JointType.ROLLABLE, "empty", "mob_connector", BlockDirection.UP, BlockDirection.WEST, new BPos(13,27,7)),
                new JigsawBlock(PoolType.TREASURE_RAMPARTS, JointType.ALIGNED, "empty", "ramparts_top_connector", BlockDirection.UP, BlockDirection.NORTH, new BPos(7,30,0))
        ));
        this.put("treasure/walls/outer/outer_wall", Collections.singletonList(
                new JigsawBlock(PoolType.EMPTY, JointType.ROLLABLE, "outer_wall_connector", "empty", BlockDirection.EAST, BlockDirection.UP, new BPos(1,0,23))
        ));
        this.put("treasure/extensions/roofed_bridge", Collections.singletonList(
                new JigsawBlock(PoolType.EMPTY, JointType.ROLLABLE, "extension_connector", "empty", BlockDirection.WEST, BlockDirection.UP, new BPos(0,5,0))
        ));
        this.put("treasure/extensions/small_bridge_0", Collections.singletonList(
                new JigsawBlock(PoolType.EMPTY, JointType.ROLLABLE, "extension_connector", "empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,1,0))
        ));
        this.put("treasure/extensions/small_bridge_1", Collections.singletonList(
                new JigsawBlock(PoolType.EMPTY, JointType.ROLLABLE, "extension_connector", "empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,1,0))
        ));
        this.put("treasure/extensions/small_bridge_2", Collections.singletonList(
                new JigsawBlock(PoolType.EMPTY, JointType.ROLLABLE, "extension_connector", "empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,1,0))
        ));
        this.put("treasure/extensions/small_bridge_3", Collections.singletonList(
                new JigsawBlock(PoolType.EMPTY, JointType.ROLLABLE, "extension_connector", "empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,1,0))
        ));
        this.put("treasure/walls/outer/tall_outer_wall", Collections.singletonList(
                new JigsawBlock(PoolType.EMPTY, JointType.ROLLABLE, "tall_outer_wall_connector", "empty", BlockDirection.EAST, BlockDirection.UP, new BPos(1,0,23))
        ));
        this.put("treasure/walls/outer/top_corner", Arrays.asList(
                new JigsawBlock(PoolType.EMPTY, JointType.ROLLABLE, "top_corner_wall_connector", "empty", BlockDirection.WEST, BlockDirection.UP, new BPos(0,0,2)),
                new JigsawBlock(PoolType.TREASURE_CORNERS_EDGES, JointType.ROLLABLE, "empty", "top_edge_connector", BlockDirection.SOUTH, BlockDirection.UP, new BPos(0,0,4)),
                new JigsawBlock(PoolType.TREASURE_CORNERS_EDGES, JointType.ROLLABLE, "empty", "top_edge_connector", BlockDirection.NORTH, BlockDirection.UP, new BPos(1,0,0))
        ));
        this.put("treasure/corners/top/corner_0", Arrays.asList(
                new JigsawBlock(PoolType.TREASURE_WALLS_OUTER, JointType.ROLLABLE, "empty", "top_corner_wall_connector", BlockDirection.WEST, BlockDirection.UP, new BPos(0,0,2)),
                new JigsawBlock(PoolType.TREASURE_WALLS_OUTER, JointType.ROLLABLE, "empty", "top_corner_wall_connector", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,0,0)),
                new JigsawBlock(PoolType.EMPTY, JointType.ROLLABLE, "corner_connector", "empty", BlockDirection.SOUTH, BlockDirection.UP, new BPos(3,0,4)),
                new JigsawBlock(PoolType.EMPTY, JointType.ROLLABLE, "corner_connector", "empty", BlockDirection.EAST, BlockDirection.UP, new BPos(4,0,3)),
                new JigsawBlock(PoolType.TREASURE_ROOFS, JointType.ROLLABLE, "empty", "corner_roof_connector", BlockDirection.UP, BlockDirection.NORTH, new BPos(2,14,2))
        ));
        this.put("treasure/corners/top/corner_1", Arrays.asList(
                new JigsawBlock(PoolType.TREASURE_WALLS_OUTER, JointType.ROLLABLE, "empty", "top_corner_wall_connector", BlockDirection.WEST, BlockDirection.UP, new BPos(0,0,2)),
                new JigsawBlock(PoolType.TREASURE_WALLS_OUTER, JointType.ROLLABLE, "empty", "top_corner_wall_connector", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,0,0)),
                new JigsawBlock(PoolType.EMPTY, JointType.ROLLABLE, "corner_connector", "empty", BlockDirection.SOUTH, BlockDirection.UP, new BPos(3,0,4)),
                new JigsawBlock(PoolType.EMPTY, JointType.ROLLABLE, "corner_connector", "empty", BlockDirection.EAST, BlockDirection.UP, new BPos(4,0,3)),
                new JigsawBlock(PoolType.TREASURE_ROOFS, JointType.ROLLABLE, "empty", "corner_roof_connector", BlockDirection.UP, BlockDirection.NORTH, new BPos(2,14,2))
        ));
        this.put("treasure/ramparts/top_wall", Collections.singletonList(
                new JigsawBlock(PoolType.EMPTY, JointType.ALIGNED, "ramparts_top_connector", "empty", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(7,0,0))
        ));
        this.put("treasure/walls/top/wall_0", Arrays.asList(
                new JigsawBlock(PoolType.TREASURE_WALLS_OUTER, JointType.ROLLABLE, "empty", "tall_outer_wall_connector", BlockDirection.WEST, BlockDirection.UP, new BPos(0,0,23)),
                new JigsawBlock(PoolType.TREASURE_CORNERS_TOP, JointType.ROLLABLE, "empty", "corner_connector", BlockDirection.NORTH, BlockDirection.UP, new BPos(3,0,0)),
                new JigsawBlock(PoolType.TREASURE_CORNERS_TOP, JointType.ROLLABLE, "empty", "corner_connector", BlockDirection.SOUTH, BlockDirection.UP, new BPos(3,0,23)),
                new JigsawBlock(PoolType.EMPTY, JointType.ROLLABLE, "center_connector", "empty", BlockDirection.EAST, BlockDirection.UP, new BPos(4,0,11)),
                new JigsawBlock(PoolType.TREASURE_EXTENSIONS_HOUSES, JointType.ROLLABLE, "empty", "house_connector", BlockDirection.EAST, BlockDirection.UP, new BPos(4,3,8)),
                new JigsawBlock(PoolType.TREASURE_ROOFS, JointType.ALIGNED, "empty", "wall_roof_connector", BlockDirection.UP, BlockDirection.NORTH, new BPos(0,14,0)),
                new JigsawBlock(PoolType.TREASURE_EXTENSIONS_SMALL_POOL, JointType.ROLLABLE, "empty", "extension_connector", BlockDirection.EAST, BlockDirection.UP, new BPos(4,14,2)),
                new JigsawBlock(PoolType.TREASURE_EXTENSIONS_SMALL_POOL, JointType.ROLLABLE, "empty", "extension_connector", BlockDirection.EAST, BlockDirection.UP, new BPos(4,14,6)),
                new JigsawBlock(PoolType.TREASURE_EXTENSIONS_SMALL_POOL, JointType.ROLLABLE, "empty", "extension_connector", BlockDirection.EAST, BlockDirection.UP, new BPos(4,14,15)),
                new JigsawBlock(PoolType.TREASURE_EXTENSIONS_SMALL_POOL, JointType.ROLLABLE, "empty", "extension_connector", BlockDirection.EAST, BlockDirection.UP, new BPos(4,14,19))
        ));
        this.put("treasure/walls/top/wall_1", Arrays.asList(
                new JigsawBlock(PoolType.TREASURE_WALLS_OUTER, JointType.ROLLABLE, "empty", "tall_outer_wall_connector", BlockDirection.WEST, BlockDirection.UP, new BPos(0,0,23)),
                new JigsawBlock(PoolType.TREASURE_CORNERS_TOP, JointType.ROLLABLE, "empty", "corner_connector", BlockDirection.NORTH, BlockDirection.UP, new BPos(3,0,0)),
                new JigsawBlock(PoolType.TREASURE_CORNERS_TOP, JointType.ROLLABLE, "empty", "corner_connector", BlockDirection.SOUTH, BlockDirection.UP, new BPos(3,0,23)),
                new JigsawBlock(PoolType.EMPTY, JointType.ROLLABLE, "center_connector", "empty", BlockDirection.EAST, BlockDirection.UP, new BPos(4,0,11)),
                new JigsawBlock(PoolType.PIGLIN, JointType.ROLLABLE, "empty", "mob_connector", BlockDirection.UP, BlockDirection.NORTH, new BPos(2,4,3)),
                new JigsawBlock(PoolType.PIGLIN, JointType.ROLLABLE, "empty", "mob_connector", BlockDirection.UP, BlockDirection.NORTH, new BPos(2,4,5)),
                new JigsawBlock(PoolType.TREASURE_EXTENSIONS_SMALL_POOL, JointType.ROLLABLE, "empty", "extension_connector", BlockDirection.EAST, BlockDirection.UP, new BPos(4,4,15)),
                new JigsawBlock(PoolType.TREASURE_EXTENSIONS_SMALL_POOL, JointType.ROLLABLE, "empty", "extension_connector", BlockDirection.EAST, BlockDirection.UP, new BPos(4,4,19)),
                new JigsawBlock(PoolType.TREASURE_ROOFS, JointType.ALIGNED, "empty", "wall_roof_connector", BlockDirection.UP, BlockDirection.NORTH, new BPos(0,14,0))
        ));
        this.put("treasure/walls/bottom/wall_0", Arrays.asList(
                new JigsawBlock(PoolType.TREASURE_WALLS_OUTER, JointType.ROLLABLE, "empty", "medium_outer_wall_connector", BlockDirection.WEST, BlockDirection.UP, new BPos(0,0,23)),
                new JigsawBlock(PoolType.EMPTY, JointType.ROLLABLE, "center_connector", "empty", BlockDirection.EAST, BlockDirection.UP, new BPos(4,3,13)),
                new JigsawBlock(PoolType.TREASURE_CORNERS_BOTTOM, JointType.ROLLABLE, "empty", "corner_connector", BlockDirection.NORTH, BlockDirection.UP, new BPos(3,4,0)),
                new JigsawBlock(PoolType.TREASURE_CORNERS_BOTTOM, JointType.ROLLABLE, "empty", "corner_connector", BlockDirection.SOUTH, BlockDirection.UP, new BPos(3,4,23)),
                new JigsawBlock(PoolType.PIGLIN_MELEE, JointType.ROLLABLE, "empty", "melee_connector", BlockDirection.UP, BlockDirection.SOUTH, new BPos(2,5,3)),
                new JigsawBlock(PoolType.PIGLIN, JointType.ROLLABLE, "empty", "mob_connector", BlockDirection.UP, BlockDirection.NORTH, new BPos(2,5,22)),
                new JigsawBlock(PoolType.TREASURE_EXTENSIONS_LARGE_POOL, JointType.ROLLABLE, "empty", "extension_connector", BlockDirection.EAST, BlockDirection.UP, new BPos(4,15,2)),
                new JigsawBlock(PoolType.TREASURE_EXTENSIONS_LARGE_POOL, JointType.ROLLABLE, "empty", "extension_connector", BlockDirection.EAST, BlockDirection.UP, new BPos(4,15,19))
        ));
        this.put("treasure/walls/bottom/wall_1", Arrays.asList(
                new JigsawBlock(PoolType.TREASURE_WALLS_OUTER, JointType.ROLLABLE, "empty", "medium_outer_wall_connector", BlockDirection.WEST, BlockDirection.UP, new BPos(0,0,23)),
                new JigsawBlock(PoolType.EMPTY, JointType.ROLLABLE, "center_connector", "empty", BlockDirection.EAST, BlockDirection.UP, new BPos(4,3,13)),
                new JigsawBlock(PoolType.TREASURE_CORNERS_BOTTOM, JointType.ROLLABLE, "empty", "corner_connector", BlockDirection.NORTH, BlockDirection.UP, new BPos(3,4,0)),
                new JigsawBlock(PoolType.TREASURE_CORNERS_BOTTOM, JointType.ROLLABLE, "empty", "corner_connector", BlockDirection.SOUTH, BlockDirection.UP, new BPos(3,4,23)),
                new JigsawBlock(PoolType.PIGLIN, JointType.ROLLABLE, "empty", "mob_connector", BlockDirection.UP, BlockDirection.WEST, new BPos(1,5,3)),
                new JigsawBlock(PoolType.PIGLIN, JointType.ROLLABLE, "empty", "mob_connector", BlockDirection.UP, BlockDirection.WEST, new BPos(1,5,5)),
                new JigsawBlock(PoolType.TREASURE_EXTENSIONS_LARGE_POOL, JointType.ROLLABLE, "empty", "extension_connector", BlockDirection.EAST, BlockDirection.UP, new BPos(4,11,5)),
                new JigsawBlock(PoolType.TREASURE_EXTENSIONS_LARGE_POOL, JointType.ROLLABLE, "empty", "extension_connector", BlockDirection.EAST, BlockDirection.UP, new BPos(4,11,16)),
                new JigsawBlock(PoolType.TREASURE_EXTENSIONS_LARGE_POOL, JointType.ROLLABLE, "empty", "extension_connector", BlockDirection.EAST, BlockDirection.UP, new BPos(4,15,6)),
                new JigsawBlock(PoolType.TREASURE_EXTENSIONS_LARGE_POOL, JointType.ROLLABLE, "empty", "extension_connector", BlockDirection.EAST, BlockDirection.UP, new BPos(4,15,19))
        ));
        this.put("treasure/walls/bottom/wall_2", Arrays.asList(
                new JigsawBlock(PoolType.TREASURE_WALLS_OUTER, JointType.ROLLABLE, "empty", "medium_outer_wall_connector", BlockDirection.WEST, BlockDirection.UP, new BPos(0,0,23)),
                new JigsawBlock(PoolType.EMPTY, JointType.ROLLABLE, "center_connector", "empty", BlockDirection.EAST, BlockDirection.UP, new BPos(4,3,13)),
                new JigsawBlock(PoolType.TREASURE_CORNERS_BOTTOM, JointType.ROLLABLE, "empty", "corner_connector", BlockDirection.NORTH, BlockDirection.UP, new BPos(3,4,0)),
                new JigsawBlock(PoolType.TREASURE_CORNERS_BOTTOM, JointType.ROLLABLE, "empty", "corner_connector", BlockDirection.SOUTH, BlockDirection.UP, new BPos(3,4,23)),
                new JigsawBlock(PoolType.PIGLIN, JointType.ROLLABLE, "empty", "mob_connector", BlockDirection.UP, BlockDirection.NORTH, new BPos(1,5,6)),
                new JigsawBlock(PoolType.PIGLIN, JointType.ROLLABLE, "empty", "mob_connector", BlockDirection.UP, BlockDirection.WEST, new BPos(1,5,20)),
                new JigsawBlock(PoolType.PIGLIN, JointType.ROLLABLE, "empty", "mob_connector", BlockDirection.UP, BlockDirection.WEST, new BPos(2,5,15))
        ));
        this.put("treasure/walls/bottom/wall_3", Arrays.asList(
                new JigsawBlock(PoolType.TREASURE_WALLS_OUTER, JointType.ROLLABLE, "empty", "medium_outer_wall_connector", BlockDirection.WEST, BlockDirection.UP, new BPos(0,0,23)),
                new JigsawBlock(PoolType.EMPTY, JointType.ROLLABLE, "center_connector", "empty", BlockDirection.EAST, BlockDirection.UP, new BPos(4,3,13)),
                new JigsawBlock(PoolType.TREASURE_CORNERS_BOTTOM, JointType.ROLLABLE, "empty", "corner_connector", BlockDirection.NORTH, BlockDirection.UP, new BPos(3,4,0)),
                new JigsawBlock(PoolType.TREASURE_CORNERS_BOTTOM, JointType.ROLLABLE, "empty", "corner_connector", BlockDirection.SOUTH, BlockDirection.UP, new BPos(3,4,23)),
                new JigsawBlock(PoolType.PIGLIN, JointType.ROLLABLE, "empty", "mob_connector", BlockDirection.UP, BlockDirection.NORTH, new BPos(2,5,4)),
                new JigsawBlock(PoolType.PIGLIN, JointType.ROLLABLE, "empty", "mob_connector", BlockDirection.UP, BlockDirection.NORTH, new BPos(2,5,20))
        ));
        this.put("treasure/roofs/wall_roof", Collections.singletonList(
                new JigsawBlock(PoolType.EMPTY, JointType.ALIGNED, "wall_roof_connector", "empty", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(0,0,0))
        ));
    }};
}
