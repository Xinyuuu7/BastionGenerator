package BastionGenerator.reecriture.BastionPools;

import BastionGenerator.enumType.PoolType;
import BastionGenerator.properties.BastionGenerator;
import com.seedfinding.mccore.util.data.Pair;
import com.seedfinding.mccore.util.data.Triplet;

import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.List;

public class MobsPool {
    public static final EnumMap<PoolType, Triplet<PoolType, List<Pair<String, Integer>>, BastionGenerator.PlacementBehaviour>> BASTION_POOLS = new EnumMap<>(PoolType.class) {{
        put(PoolType.PIGLIN,new Triplet<>(PoolType.EMPTY, Arrays.asList(
                new Pair<>("mobs/melee_piglin",1),
                new Pair<>("mobs/sword_piglin",4),
                new Pair<>("mobs/crossbow_piglin",4),
                new Pair<>("empty",1)
        ),BastionGenerator.PlacementBehaviour.RIGID));
        put(PoolType.HOGLIN,new Triplet<>(PoolType.EMPTY, Arrays.asList(
                new Pair<>("mobs/hoglin",2),
                new Pair<>("empty",1)
        ),BastionGenerator.PlacementBehaviour.RIGID));
        put(PoolType.GOLD,new Triplet<>(PoolType.EMPTY, Arrays.asList(
                new Pair<>("blocks/air",3),
                new Pair<>("blocks/gold",1)
        ),BastionGenerator.PlacementBehaviour.RIGID));
        put(PoolType.PIGLIN_MELEE,new Triplet<>(PoolType.EMPTY, Arrays.asList(
                new Pair<>("mobs/melee_piglin_always",1),
                new Pair<>("mobs/melee_piglin",5),
                new Pair<>("mobs/sword_piglin",1)
        ),BastionGenerator.PlacementBehaviour.RIGID));
        put(PoolType.EMPTY, new Triplet<>(PoolType.EMPTY, Collections.singletonList(
                new Pair<>("empty", 0)
        ), BastionGenerator.PlacementBehaviour.RIGID));
    }};
}