package Xinyuiii.reecriture.BastionPools;

import Xinyuiii.enumType.PoolType;
import com.seedfinding.mccore.util.data.Pair;

import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.List;

public class HousingPool {
    public static final EnumMap< PoolType, Pair<PoolType, List<Pair<String, Integer>>> > BASTION_POOLS = new EnumMap<>(PoolType.class) {
        private static final long serialVersionUID = 2715271377763816486L;
        {
            put(PoolType.HOUSING_BASE,new Pair<>(PoolType.EMPTY, Collections.singletonList(
                    new Pair<>("units/air_base", 1)
            )));
            put(PoolType.HOUSING_CENTER_PIECES,new Pair<>(PoolType.EMPTY, Arrays.asList(
                    new Pair<>("units/center_pieces/center_0",1),
                    new Pair<>("units/center_pieces/center_1",1),
                    new Pair<>("units/center_pieces/center_2",1)
            )));
            put(PoolType.HOUSING_PATHWAYS,new Pair<>(PoolType.EMPTY, Arrays.asList(
                    new Pair<>("units/pathways/pathway_0",1),
                    new Pair<>("units/pathways/pathway_wall_0",1)
            )));
            put(PoolType.HOUSING_WALLS_WALL_BASES,new Pair<>(PoolType.EMPTY, Arrays.asList(
                    new Pair<>("units/walls/wall_base",1),
                    new Pair<>("units/walls/connected_wall",1)
            )));
            put(PoolType.HOUSING_STAGES_STAGE_0, new Pair<>(PoolType.EMPTY, Arrays.asList(
                    new Pair<>("units/stages/stage_0_0", 1),
                    new Pair<>("units/stages/stage_0_1",1),
                    new Pair<>("units/stages/stage_0_2",1),
                    new Pair<>("units/stages/stage_0_3",1)
            )));
            put(PoolType.HOUSING_STAGES_STAGE_1, new Pair<>(PoolType.EMPTY, Arrays.asList(
                    new Pair<>("units/stages/stage_1_0", 1),
                    new Pair<>("units/stages/stage_1_1",1),
                    new Pair<>("units/stages/stage_1_2",1),
                    new Pair<>("units/stages/stage_1_3",1)
            )));
            put(PoolType.HOUSING_STAGES_ROT_STAGE_1, new Pair<>(PoolType.EMPTY, Collections.singletonList(
                    new Pair<>("units/stages/rot/stage_1_0", 1)
            )));
            put(PoolType.HOUSING_STAGES_STAGE_2, new Pair<>(PoolType.EMPTY, Arrays.asList(
                    new Pair<>("units/stages/stage_2_0", 1),
                    new Pair<>("units/stages/stage_2_1",1)
            )));
            put(PoolType.HOUSING_STAGES_STAGE_3, new Pair<>(PoolType.EMPTY, Arrays.asList(
                    new Pair<>("units/stages/stage_3_0", 1),
                    new Pair<>("units/stages/stage_3_1",1),
                    new Pair<>("units/stages/stage_3_2",1),
                    new Pair<>("units/stages/stage_3_3",1)
            )));
            put(PoolType.HOUSING_FILLERS_STAGE_0, new Pair<>(PoolType.EMPTY, Collections.singletonList(
                    new Pair<>("units/fillers/stage_0", 1)
            )));
            put(PoolType.HOUSING_EDGES, new Pair<>(PoolType.EMPTY, Collections.singletonList(
                    new Pair<>("units/edges/edge_0", 1)
            )));
            put(PoolType.HOUSING_WALL_UNITS, new Pair<>(PoolType.EMPTY, Collections.singletonList(
                    new Pair<>("units/wall_units/unit_0", 1)
            )));
            put(PoolType.HOUSING_EDGE_WALL_UNITS, new Pair<>(PoolType.EMPTY, Collections.singletonList(
                    new Pair<>("units/wall_units/edge_0_large", 1)
            )));
            put(PoolType.HOUSING_RAMPARTS, new Pair<>(PoolType.EMPTY, Arrays.asList(
                    new Pair<>("units/ramparts/ramparts_0", 1),
                    new Pair<>("units/ramparts/ramparts_1",1),
                    new Pair<>("units/ramparts/ramparts_2",1)
            )));
            put(PoolType.HOUSING_LARGE_RAMPARTS, new Pair<>(PoolType.EMPTY, Collections.singletonList(
                    new Pair<>("units/ramparts/ramparts_0", 1)
            )));
            put(PoolType.HOUSING_RAMPARTS_PLATES, new Pair<>(PoolType.EMPTY, Collections.singletonList(
                    new Pair<>("units/rampart_plates/plate_0", 1)
            )));
            putAll(MobsPool.BASTION_POOLS);
        }};
}