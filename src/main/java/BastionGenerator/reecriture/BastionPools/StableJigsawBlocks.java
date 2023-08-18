package BastionGenerator.reecriture.BastionPools;

import BastionGenerator.enumType.PoolType;
import com.seedfinding.mccore.block.Block;
import com.seedfinding.mccore.util.block.BlockDirection;
import com.seedfinding.mccore.util.data.Pair;
import com.seedfinding.mccore.util.data.Quad;
import com.seedfinding.mccore.util.pos.BPos;

import java.util.HashMap;
import java.util.List;

public class StableJigsawBlocks {
    public static final HashMap<String, List<Pair<Quad<PoolType, String, Pair<BlockDirection, BlockDirection>, Block>, BPos>>> JIGSAW_BLOCKS = new HashMap<>() {{
            this.putAll(MobsJigsawBlocks.JIGSAW_BLOCKS);
    }};
}