package BastionGenerator.reecriture.BastionPools;

import BastionGenerator.enumType.PoolType;
import BastionGenerator.properties.BastionGenerator;
import com.seedfinding.mccore.util.data.Pair;
import com.seedfinding.mccore.util.data.Triplet;

import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.List;

public class BridgePool {
    public static final EnumMap<PoolType, Triplet<PoolType, List<Pair<String, Integer>>, BastionGenerator.PlacementBehaviour>> BASTION_POOLS = new EnumMap<>(PoolType.class) {{
        put(PoolType.BRIDGE_START,new Triplet<>(PoolType.EMPTY, Collections.singletonList(
                new Pair<>("bridge/starting_pieces/entrance_base", 1)
        ),BastionGenerator.PlacementBehaviour.RIGID));
        put(PoolType.BRIDGE_STARTING_PIECES,new Triplet<>(PoolType.EMPTY, Arrays.asList(
                new Pair<>("bridge/starting_pieces/entrance",1),
                new Pair<>("bridge/starting_pieces/entrance_face",1)
        ),BastionGenerator.PlacementBehaviour.RIGID));
        put(PoolType.BRIDGE_BRIDGE_PIECES,new Triplet<>(PoolType.EMPTY, Collections.singletonList(
                new Pair<>("bridge/bridge_pieces/bridge",1)
        ),BastionGenerator.PlacementBehaviour.RIGID));
        put(PoolType.BRIDGE_LEGS,new Triplet<>(PoolType.EMPTY, Arrays.asList(
                new Pair<>("bridge/legs/leg_0",1),
                new Pair<>("bridge/legs/leg_1",1)
        ),BastionGenerator.PlacementBehaviour.RIGID));
        put(PoolType.BRIDGE_WALLS, new Triplet<>(PoolType.EMPTY, Arrays.asList(
                new Pair<>("bridge/walls/wall_base_0", 1),
                new Pair<>("bridge/walls/wall_base_1",1)
        ), BastionGenerator.PlacementBehaviour.RIGID));
        put(PoolType.BRIDGE_RAMPARTS, new Triplet<>(PoolType.EMPTY, Arrays.asList(
                new Pair<>("bridge/ramparts/rampart_0", 1),
                new Pair<>("bridge/ramparts/rampart_1",1)
        ), BastionGenerator.PlacementBehaviour.RIGID));
        put(PoolType.BRIDGE_RAMPART_PLATES, new Triplet<>(PoolType.EMPTY, Collections.singletonList(
                new Pair<>("bridge/rampart_plates/plate_0", 1)
        ), BastionGenerator.PlacementBehaviour.RIGID));
        put(PoolType.BRIDGE_CONNECTORS, new Triplet<>(PoolType.EMPTY, Arrays.asList(
                new Pair<>("bridge/connectors/back_bridge_top", 1),
                new Pair<>("bridge/connectors/back_bridge_bottom",1)
        ), BastionGenerator.PlacementBehaviour.RIGID));
        putAll(MobsPool.BASTION_POOLS);
    }};
}