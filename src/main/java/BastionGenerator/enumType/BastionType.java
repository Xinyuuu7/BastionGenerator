package BastionGenerator.enumType;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;

import com.seedfinding.mccore.block.Block;
import com.seedfinding.mccore.rand.ChunkRand;
import com.seedfinding.mccore.util.block.BlockDirection;
import com.seedfinding.mccore.util.data.Pair;
import com.seedfinding.mccore.util.data.Quad;
import com.seedfinding.mccore.util.data.Triplet;
import com.seedfinding.mccore.util.pos.BPos;

import BastionGenerator.properties.BastionGenerator;
import BastionGenerator.reecriture.BastionPools.BridgeJigsawBlocks;
import BastionGenerator.reecriture.BastionPools.BridgePool;
import BastionGenerator.reecriture.BastionPools.HousingJigsawBlocks;
import BastionGenerator.reecriture.BastionPools.HousingPool;
import BastionGenerator.reecriture.BastionPools.StableJigsawBlocks;
import BastionGenerator.reecriture.BastionPools.StablePool;
import BastionGenerator.reecriture.BastionPools.TreasureJigsawBlocks;
import BastionGenerator.reecriture.BastionPools.TreasurePool;

public enum BastionType {
	HOUSING,
	STABLES,
	TREASURE,
	BRIDGE;
	
	public static BastionType getRandom(ChunkRand rand) {
		return rand.getRandom(BastionType.values());
	}
	
	public HashMap<String, List<Pair<Quad<PoolType, Pair<String,String>, Pair<BlockDirection,BlockDirection>, Block>, BPos>>> getJigsawBlocks() {
		switch(this) {
		case HOUSING:
			// return HousingJigsawBlocks.JIGSAW_BLOCKS;
		case STABLES:
			// return StableJigsawBlocks.JIGSAW_BLOCKS;
		case TREASURE:
			// return TreasureJigsawBlocks.JIGSAW_BLOCKS;
		case BRIDGE:
			// return BridgeJigsawBlocks.JIGSAW_BLOCKS;
		}
		return null;
	}
	
	public EnumMap<PoolType, Triplet<PoolType, List<Pair<String, Integer>>, BastionGenerator.PlacementBehaviour>> getPool() {
		switch(this) {
		case HOUSING:
			return HousingPool.BASTION_POOLS;
		case STABLES:
			return StablePool.BASTION_POOLS;
		case TREASURE:
			return TreasurePool.BASTION_POOLS;
		case BRIDGE:
			return BridgePool.BASTION_POOLS;
		}
		return null;
	}

	public List<Pair<String, Integer>> getStartTemplates() {
		switch(this) {
		case HOUSING:
			return HousingPool.BASTION_POOLS.get(PoolType.HOUSING_BASE).getSecond() ;
		case STABLES:
			return StablePool.BASTION_POOLS.get(PoolType.STABLE_ORIGIN).getSecond();
		case TREASURE:
			return TreasurePool.BASTION_POOLS.get(PoolType.TREASURE_STARTERS).getSecond();
		case BRIDGE:
			return BridgePool.BASTION_POOLS.get(PoolType.BRIDGE_START).getSecond();
		}
		return null;
	}
}
