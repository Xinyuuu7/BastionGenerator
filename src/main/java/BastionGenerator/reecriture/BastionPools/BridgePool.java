package BastionGenerator.reecriture.BastionPools;

import BastionGenerator.enumType.PoolType;
import com.seedfinding.mccore.util.data.Pair;

import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.List;

public class BridgePool {
    public static final EnumMap< PoolType, Pair<PoolType, List<Pair<String, Integer>>> > BASTION_POOLS = new EnumMap<>(PoolType.class) {
		private static final long serialVersionUID = -5991569046822071892L;
	{
        put(PoolType.BRIDGE_START,new Pair<>(PoolType.EMPTY, Collections.singletonList(
                new Pair<>("bridge/starting_pieces/entrance_base", 1)
        )));
        put(PoolType.BRIDGE_STARTING_PIECES,new Pair<>(PoolType.EMPTY, Arrays.asList(
                new Pair<>("bridge/starting_pieces/entrance",1),
                new Pair<>("bridge/starting_pieces/entrance_face",1)
        )));
        put(PoolType.BRIDGE_BRIDGE_PIECES,new Pair<>(PoolType.EMPTY, Collections.singletonList(
                new Pair<>("bridge/bridge_pieces/bridge",1)
        )));
        put(PoolType.BRIDGE_LEGS,new Pair<>(PoolType.EMPTY, Arrays.asList(
                new Pair<>("bridge/legs/leg_0",1),
                new Pair<>("bridge/legs/leg_1",1)
        )));
        put(PoolType.BRIDGE_WALLS, new Pair<>(PoolType.EMPTY, Arrays.asList(
                new Pair<>("bridge/walls/wall_base_0", 1),
                new Pair<>("bridge/walls/wall_base_1",1)
        )));
        put(PoolType.BRIDGE_RAMPARTS, new Pair<>(PoolType.EMPTY, Arrays.asList(
                new Pair<>("bridge/ramparts/rampart_0", 1),
                new Pair<>("bridge/ramparts/rampart_1",1)
        )));
        put(PoolType.BRIDGE_RAMPART_PLATES, new Pair<>(PoolType.EMPTY, Collections.singletonList(
                new Pair<>("bridge/rampart_plates/plate_0", 1)
        )));
        put(PoolType.BRIDGE_CONNECTORS, new Pair<>(PoolType.EMPTY, Arrays.asList(
                new Pair<>("bridge/connectors/back_bridge_top", 1),
                new Pair<>("bridge/connectors/back_bridge_bottom",1)
        )));
        putAll(MobsPool.BASTION_POOLS);
    }};
}