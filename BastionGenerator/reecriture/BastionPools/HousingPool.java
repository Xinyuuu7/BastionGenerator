package BastionGenerator.reecriture.BastionPools;

import BastionGenerator.enumType.PoolType;
import BastionGenerator.properties.BastionGenerator;
import com.seedfinding.mccore.util.data.Pair;
import com.seedfinding.mccore.util.data.Triplet;

import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.List;

public class HousingPool {
    public static final EnumMap<PoolType, Triplet<PoolType, List<Pair<String, Integer>>, BastionGenerator.PlacementBehaviour>> BASTION_POOLS = new EnumMap<>(PoolType.class) {{
        put(PoolType.HOUSING_BASE,new Triplet<>(PoolType.EMPTY, Collections.singletonList(
                new Pair<>("units/air_base", 1)
        ),BastionGenerator.PlacementBehaviour.RIGID));
        put(PoolType.HOUSING_CENTER_PIECES,new Triplet<>(PoolType.EMPTY, Arrays.asList(
                new Pair<>("units/center_pieces/center_0",1),
                new Pair<>("units/center_pieces/center_1",1),
                new Pair<>("units/center_pieces/center_2",1)
        ),BastionGenerator.PlacementBehaviour.RIGID));
        put(PoolType.HOUSING_PATHWAYS,new Triplet<>(PoolType.EMPTY, Arrays.asList(
                new Pair<>("units/pathways/pathway_0",1),
                new Pair<>("units/pathways/pathway_wall_0",1)
        ),BastionGenerator.PlacementBehaviour.RIGID));
        put(PoolType.HOUSING_WALLS_WALL_BASES,new Triplet<>(PoolType.EMPTY, Arrays.asList(
                new Pair<>("units/walls/wall_base",1),
                new Pair<>("units/walls/connected_wall",1)
        ),BastionGenerator.PlacementBehaviour.RIGID));
        put(PoolType.HOUSING_STAGES_STAGE_0, new Triplet<>(PoolType.EMPTY, Arrays.asList(
                new Pair<>("units/stages/stage_0_0", 1),
                new Pair<>("units/stages/stage_0_1",1),
                new Pair<>("units/stages/stage_0_2",1),
                new Pair<>("units/stages/stage_0_3",1)
        ), BastionGenerator.PlacementBehaviour.RIGID));
        put(PoolType.HOUSING_STAGES_STAGE_1, new Triplet<>(PoolType.EMPTY, Arrays.asList(
                new Pair<>("units/stages/stage_1_0", 1),
                new Pair<>("units/stages/stage_1_1",1),
                new Pair<>("units/stages/stage_1_2",1),
                new Pair<>("units/stages/stage_1_3",1)
        ), BastionGenerator.PlacementBehaviour.RIGID));
        put(PoolType.HOUSING_STAGES_ROT_STAGE_1, new Triplet<>(PoolType.EMPTY, Collections.singletonList(
                new Pair<>("units/stages/rot/stage_1_0", 1)
        ), BastionGenerator.PlacementBehaviour.RIGID));
        put(PoolType.HOUSING_STAGES_STAGE_2, new Triplet<>(PoolType.EMPTY, Arrays.asList(
                new Pair<>("units/stages/stage_2_0", 1),
                new Pair<>("units/stages/stage_2_1",1)
        ), BastionGenerator.PlacementBehaviour.RIGID));
        put(PoolType.HOUSING_STAGES_STAGE_3, new Triplet<>(PoolType.EMPTY, Arrays.asList(
                new Pair<>("units/stages/stage_3_0", 1),
                new Pair<>("units/stages/stage_3_1",1),
                new Pair<>("units/stages/stage_3_2",1),
                new Pair<>("units/stages/stage_3_3",1)
        ), BastionGenerator.PlacementBehaviour.RIGID));
        put(PoolType.HOUSING_FILLERS_STAGE_0, new Triplet<>(PoolType.EMPTY, Collections.singletonList(
                new Pair<>("units/fillers/stage_0", 1)
        ), BastionGenerator.PlacementBehaviour.RIGID));
        put(PoolType.HOUSING_EDGES, new Triplet<>(PoolType.EMPTY, Collections.singletonList(
                new Pair<>("units/edges/edge_0", 1)
        ), BastionGenerator.PlacementBehaviour.RIGID));
        put(PoolType.HOUSING_WALL_UNITS, new Triplet<>(PoolType.EMPTY, Collections.singletonList(
                new Pair<>("units/wall_units/unit_0", 1)
        ), BastionGenerator.PlacementBehaviour.RIGID));
        put(PoolType.HOUSING_EDGE_WALL_UNITS, new Triplet<>(PoolType.EMPTY, Collections.singletonList(
                new Pair<>("units/wall_units/edge_0_large", 1)
        ), BastionGenerator.PlacementBehaviour.RIGID));
        put(PoolType.HOUSING_RAMPARTS, new Triplet<>(PoolType.EMPTY, Arrays.asList(
                new Pair<>("units/ramparts/ramparts_0", 1),
                new Pair<>("units/ramparts/ramparts_1",1),
                new Pair<>("units/ramparts/ramparts_2",1)
        ), BastionGenerator.PlacementBehaviour.RIGID));
        put(PoolType.HOUSING_LARGE_RAMPARTS, new Triplet<>(PoolType.EMPTY, Collections.singletonList(
                new Pair<>("units/ramparts/ramparts_0", 1)
        ), BastionGenerator.PlacementBehaviour.RIGID));
        put(PoolType.HOUSING_RAMPARTS_PLATES, new Triplet<>(PoolType.EMPTY, Collections.singletonList(
                new Pair<>("units/rampart_plates/plate_0", 1)
        ), BastionGenerator.PlacementBehaviour.RIGID));
        putAll(MobsPool.BASTION_POOLS);
    }};
}