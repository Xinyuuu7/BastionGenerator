package Xinyuiii.reecriture.BastionPools;

import Xinyuiii.enumType.PoolType;
import com.seedfinding.mccore.util.data.Pair;

import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.List;

public class TreasurePool {
    public static final EnumMap< PoolType, Pair<PoolType, List<Pair<String, Integer>>> > BASTION_POOLS = new EnumMap<>(PoolType.class) {
        private static final long serialVersionUID = -3976265110983243212L;
        {
            put(PoolType.TREASURE_STARTERS,new Pair<>(PoolType.EMPTY, Collections.singletonList(
                    new Pair<>("treasure/big_air_full", 1)
            )));
            put(PoolType.TREASURE_BASES,new Pair<>(PoolType.EMPTY, Collections.singletonList(
                    new Pair<>("treasure/bases/lava_basin",1)
            )));
            put(PoolType.TREASURE_STAIRS,new Pair<>(PoolType.EMPTY, Collections.singletonList(
                    new Pair<>("treasure/stairs/lower_stairs",1)
            )));
            put(PoolType.TREASURE_BASES_CENTERS,new Pair<>(PoolType.EMPTY, Arrays.asList(
                    new Pair<>("treasure/bases/centers/center_0",1),
                    new Pair<>("treasure/bases/centers/center_1",1),
                    new Pair<>("treasure/bases/centers/center_2",1),
                    new Pair<>("treasure/bases/centers/center_3",1)
            )));
            put(PoolType.TREASURE_BRAINS, new Pair<>(PoolType.EMPTY, Collections.singletonList(
                    new Pair<>("treasure/brains/center_brain", 1)
            )));
            put(PoolType.TREASURE_WALLS, new Pair<>(PoolType.EMPTY, Arrays.asList(
                    new Pair<>("treasure/walls/lava_wall", 1),
                    new Pair<>("treasure/walls/entrance_wall", 1)
            )));
            put(PoolType.TREASURE_WALLS_OUTER, new Pair<>(PoolType.EMPTY, Arrays.asList(
                    new Pair<>("treasure/walls/outer/top_corner", 1),
                    new Pair<>("treasure/walls/outer/mid_corner", 1),
                    new Pair<>("treasure/walls/outer/bottom_corner", 1),
                    new Pair<>("treasure/walls/outer/outer_wall", 1),
                    new Pair<>("treasure/walls/outer/medium_outer_wall", 1),
                    new Pair<>("treasure/walls/outer/tall_outer_wall", 1)
            )));
            put(PoolType.TREASURE_WALLS_BOTTOM, new Pair<>(PoolType.EMPTY, Arrays.asList(
                    new Pair<>("treasure/walls/bottom/wall_0", 1),
                    new Pair<>("treasure/walls/bottom/wall_1", 1),
                    new Pair<>("treasure/walls/bottom/wall_2", 1),
                    new Pair<>("treasure/walls/bottom/wall_3", 1)
            )));
            put(PoolType.TREASURE_WALLS_MID, new Pair<>(PoolType.EMPTY, Arrays.asList(
                    new Pair<>("treasure/walls/mid/wall_0", 1),
                    new Pair<>("treasure/walls/mid/wall_1",1),
                    new Pair<>("treasure/walls/mid/wall_2",1)
            )));
            put(PoolType.TREASURE_WALLS_TOP, new Pair<>(PoolType.EMPTY, Arrays.asList(
                    new Pair<>("treasure/walls/top/main_entrance", 1),
                    new Pair<>("treasure/walls/top/wall_0",1),
                    new Pair<>("treasure/walls/top/wall_1",1)
            )));
            put(PoolType.TREASURE_CONNECTORS, new Pair<>(PoolType.EMPTY, Arrays.asList(
                    new Pair<>("treasure/connectors/center_to_wall_middle", 1),
                    new Pair<>("treasure/connectors/center_to_wall_top", 1),
                    new Pair<>("treasure/connectors/center_to_wall_top_entrance", 1)
            )));
            put(PoolType.TREASURE_ENTRANCES, new Pair<>(PoolType.EMPTY, Collections.singletonList(
                    new Pair<>("treasure/entrances/entrance_0", 1)
            )));
            put(PoolType.TREASURE_RAMPARTS, new Pair<>(PoolType.EMPTY, Arrays.asList(
                    new Pair<>("treasure/ramparts/mid_wall_main", 1),
                    new Pair<>("treasure/ramparts/mid_wall_side", 1),
                    new Pair<>("treasure/ramparts/bottom_wall_0", 1),
                    new Pair<>("treasure/ramparts/top_wall", 1),
                    new Pair<>("treasure/ramparts/lava_basin_side", 1),
                    new Pair<>("treasure/ramparts/lava_basin_main", 1)
            )));
            put(PoolType.TREASURE_CORNERS_BOTTOM, new Pair<>(PoolType.EMPTY, Arrays.asList(
                    new Pair<>("treasure/corners/bottom/corner_0", 1),
                    new Pair<>("treasure/corners/bottom/corner_1", 1)
            )));
            put(PoolType.TREASURE_CORNERS_EDGES, new Pair<>(PoolType.EMPTY, Arrays.asList(
                    new Pair<>("treasure/corners/edges/bottom", 1),
                    new Pair<>("treasure/corners/edges/middle", 1),
                    new Pair<>("treasure/corners/edges/top", 1)
            )));
            put(PoolType.TREASURE_CORNERS_MIDDLE, new Pair<>(PoolType.EMPTY, Arrays.asList(
                    new Pair<>("treasure/corners/middle/corner_0", 1),
                    new Pair<>("treasure/corners/middle/corner_1", 1)
            )));
            put(PoolType.TREASURE_CORNERS_TOP, new Pair<>(PoolType.EMPTY, Arrays.asList(
                    new Pair<>("treasure/corners/top/corner_0", 1),
                    new Pair<>("treasure/corners/top/corner_1", 1)
            )));
            put(PoolType.TREASURE_EXTENSIONS_LARGE_POOL, new Pair<>(PoolType.EMPTY, Arrays.asList(
                    new Pair<>("treasure/extensions/empty", 1),
                    new Pair<>("treasure/extensions/empty", 1),
                    new Pair<>("treasure/extensions/fire_room", 1),
                    new Pair<>("treasure/extensions/large_bridge_0", 1),
                    new Pair<>("treasure/extensions/large_bridge_1", 1),
                    new Pair<>("treasure/extensions/large_bridge_2", 1),
                    new Pair<>("treasure/extensions/large_bridge_3", 1),
                    new Pair<>("treasure/extensions/roofed_bridge", 1),
                    new Pair<>("treasure/extensions/empty", 1)
            )));
            put(PoolType.TREASURE_EXTENSIONS_SMALL_POOL, new Pair<>(PoolType.EMPTY, Arrays.asList(
                    new Pair<>("treasure/extensions/empty", 1),
                    new Pair<>("treasure/extensions/fire_room", 1),
                    new Pair<>("treasure/extensions/empty", 1),
                    new Pair<>("treasure/extensions/small_bridge_0", 1),
                    new Pair<>("treasure/extensions/small_bridge_1", 1),
                    new Pair<>("treasure/extensions/small_bridge_2", 1),
                    new Pair<>("treasure/extensions/small_bridge_3", 1)
            )));
            put(PoolType.TREASURE_EXTENSIONS_HOUSES, new Pair<>(PoolType.EMPTY, Arrays.asList(
                    new Pair<>("treasure/extensions/house_0", 1),
                    new Pair<>("treasure/extensions/house_1", 1)
            )));
            put(PoolType.TREASURE_ROOFS, new Pair<>(PoolType.EMPTY, Arrays.asList(
                    new Pair<>("treasure/roofs/wall_roof", 1),
                    new Pair<>("treasure/roofs/corner_roof", 1),
                    new Pair<>("treasure/roofs/center_roof", 1)
            )));
            putAll(MobsPool.BASTION_POOLS);
        }};
}