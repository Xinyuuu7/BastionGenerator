package Xinyuiii.reecriture.BastionPools;

import Xinyuiii.enumType.PoolType;
import com.seedfinding.mccore.util.data.Pair;

import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.List;

public class MobsPool {
    public static final EnumMap<PoolType, Pair<PoolType, List<Pair<String, Integer>>> > BASTION_POOLS = new EnumMap<>(PoolType.class) {
        private static final long serialVersionUID = 5909788015589185250L;
        {
            put(PoolType.PIGLIN,new Pair<>(PoolType.EMPTY, Arrays.asList(
                    new Pair<>("mobs/melee_piglin",1),
                    new Pair<>("mobs/sword_piglin",4),
                    new Pair<>("mobs/crossbow_piglin",4),
                    new Pair<>("mobs/empty",1)
            )));
            put(PoolType.HOGLIN,new Pair<>(PoolType.EMPTY, Arrays.asList(
                    new Pair<>("mobs/hoglin",2),
                    new Pair<>("mobs/empty",1)
            )));
            put(PoolType.GOLD,new Pair<>(PoolType.EMPTY, Arrays.asList(
                    new Pair<>("blocks/air",3),
                    new Pair<>("blocks/gold",1)
            )));
            put(PoolType.PIGLIN_MELEE,new Pair<>(PoolType.EMPTY, Arrays.asList(
                    new Pair<>("mobs/melee_piglin_always",1),
                    new Pair<>("mobs/melee_piglin",5),
                    new Pair<>("mobs/sword_piglin",1)
            )));
            put(PoolType.EMPTY, new Pair<>(PoolType.EMPTY, Collections.singletonList(
                    new Pair<>("empty", 0)
            )));
        }};
}