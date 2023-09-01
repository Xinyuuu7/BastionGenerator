package Xinyuiii.reecriture.BastionPools;

import Xinyuiii.enumType.PoolType;
import com.seedfinding.mccore.util.data.Pair;

import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.List;

public class StablePool {
    public static final EnumMap<PoolType, Pair<PoolType, List<Pair<String, Integer>>> > BASTION_POOLS = new EnumMap<>(PoolType.class) {
        private static final long serialVersionUID = 4134843558205869884L;
        {
            put(PoolType.STABLE_ORIGIN,new Pair<>(PoolType.EMPTY, Collections.singletonList(
                    new Pair<>("hoglin_stable/air_base", 1)
            )));
            put(PoolType.STABLE_STARTING_PIECES,new Pair<>(PoolType.EMPTY, Arrays.asList(
                    new Pair<>("hoglin_stable/starting_pieces/starting_stairs_0",1),
                    new Pair<>("hoglin_stable/starting_pieces/starting_stairs_1",1),
                    new Pair<>("hoglin_stable/starting_pieces/starting_stairs_2",1),
                    new Pair<>("hoglin_stable/starting_pieces/starting_stairs_3",1),
                    new Pair<>("hoglin_stable/starting_pieces/starting_stairs_4",1)
            )));
            put(PoolType.STABLE_MIRRORED_STARTING_PIECES,new Pair<>(PoolType.EMPTY, Arrays.asList(
                    new Pair<>("hoglin_stable/starting_pieces/stairs_0_mirrored",1),
                    new Pair<>("hoglin_stable/starting_pieces/stairs_1_mirrored",1),
                    new Pair<>("hoglin_stable/starting_pieces/stairs_2_mirrored",1),
                    new Pair<>("hoglin_stable/starting_pieces/stairs_3_mirrored",1),
                    new Pair<>("hoglin_stable/starting_pieces/stairs_4_mirrored",1)
            )));
            put(PoolType.STABLE_WALL_BASES,new Pair<>(PoolType.EMPTY, Collections.singletonList(
                    new Pair<>("hoglin_stable/walls/wall_base",1)
            )));
            put(PoolType.STABLE_WALLS, new Pair<>(PoolType.EMPTY, Arrays.asList(
                    new Pair<>("hoglin_stable/walls/side_wall_0", 1),
                    new Pair<>("hoglin_stable/walls/side_wall_1",1)
            )));
            put(PoolType.STABLE_STAIRS, new Pair<>(PoolType.EMPTY, Arrays.asList(
                    new Pair<>("hoglin_stable/stairs/stairs_1_0", 1),
                    new Pair<>("hoglin_stable/stairs/stairs_1_1", 1),
                    new Pair<>("hoglin_stable/stairs/stairs_1_2", 1),
                    new Pair<>("hoglin_stable/stairs/stairs_1_3", 1),
                    new Pair<>("hoglin_stable/stairs/stairs_1_4", 1),
                    new Pair<>("hoglin_stable/stairs/stairs_2_0", 1),
                    new Pair<>("hoglin_stable/stairs/stairs_2_1", 1),
                    new Pair<>("hoglin_stable/stairs/stairs_2_2", 1),
                    new Pair<>("hoglin_stable/stairs/stairs_2_3", 1),
                    new Pair<>("hoglin_stable/stairs/stairs_2_4", 1),
                    new Pair<>("hoglin_stable/stairs/stairs_3_0", 1),
                    new Pair<>("hoglin_stable/stairs/stairs_3_1", 1),
                    new Pair<>("hoglin_stable/stairs/stairs_3_2", 1),
                    new Pair<>("hoglin_stable/stairs/stairs_3_3", 1),
                    new Pair<>("hoglin_stable/stairs/stairs_3_4", 1)
            )));
            put(PoolType.STABLE_SMALL_STABLES_INNER, new Pair<>(PoolType.EMPTY, Arrays.asList(
                    new Pair<>("hoglin_stable/small_stables/inner_0", 1),
                    new Pair<>("hoglin_stable/small_stables/inner_1", 1),
                    new Pair<>("hoglin_stable/small_stables/inner_2", 1),
                    new Pair<>("hoglin_stable/small_stables/inner_3", 1)
            )));
            put(PoolType.STABLE_SMALL_STABLES_OUTER, new Pair<>(PoolType.EMPTY, Arrays.asList(
                    new Pair<>("hoglin_stable/small_stables/outer_0", 1),
                    new Pair<>("hoglin_stable/small_stables/outer_1", 1),
                    new Pair<>("hoglin_stable/small_stables/outer_2", 1),
                    new Pair<>("hoglin_stable/small_stables/outer_3", 1)
            )));
            put(PoolType.STABLE_LARGE_STABLES_INNER, new Pair<>(PoolType.EMPTY, Arrays.asList(
                    new Pair<>("hoglin_stable/large_stables/inner_0", 1),
                    new Pair<>("hoglin_stable/large_stables/inner_1",1),
                    new Pair<>("hoglin_stable/large_stables/inner_2",1),
                    new Pair<>("hoglin_stable/large_stables/inner_3",1),
                    new Pair<>("hoglin_stable/large_stables/inner_4",1)
            )));
            put(PoolType.STABLE_LARGE_STABLES_OUTER, new Pair<>(PoolType.EMPTY, Arrays.asList(
                    new Pair<>("hoglin_stable/large_stables/outer_0", 1),
                    new Pair<>("hoglin_stable/large_stables/outer_1",1),
                    new Pair<>("hoglin_stable/large_stables/outer_2",1),
                    new Pair<>("hoglin_stable/large_stables/outer_3",1),
                    new Pair<>("hoglin_stable/large_stables/outer_4",1)
            )));
            put(PoolType.STABLE_POSTS, new Pair<>(PoolType.EMPTY, Arrays.asList(
                    new Pair<>("hoglin_stable/posts/stair_post", 1),
                    new Pair<>("hoglin_stable/posts/end_post", 1)
            )));
            put(PoolType.STABLE_RAMPARTS, new Pair<>(PoolType.EMPTY, Arrays.asList(
                    new Pair<>("hoglin_stable/ramparts/ramparts_1", 1),
                    new Pair<>("hoglin_stable/ramparts/ramparts_2", 1),
                    new Pair<>("hoglin_stable/ramparts/ramparts_3", 1)
            )));
            put(PoolType.STABLE_RAMPART_PLATES, new Pair<>(PoolType.EMPTY, Collections.singletonList(
                    new Pair<>("hoglin_stable/rampart_plates/rampart_plate_1", 1)
            )));
            put(PoolType.STABLE_CONNECTORS, new Pair<>(PoolType.EMPTY, Collections.singletonList(
                    new Pair<>("hoglin_stable/connectors/end_post_connector", 1)
            )));
            putAll(MobsPool.BASTION_POOLS);
        }};
}
