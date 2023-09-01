package Xinyuiii.properties;

import com.seedfinding.mccore.rand.ChunkRand;
import com.seedfinding.mccore.rand.seed.WorldSeed;
import com.seedfinding.mccore.util.data.Pair;
import com.seedfinding.mccore.util.pos.BPos;
import com.seedfinding.mccore.util.pos.CPos;
import com.seedfinding.mccore.version.MCVersion;
import com.seedfinding.mcfeature.loot.item.ItemStack;
import com.seedfinding.mcfeature.structure.BastionRemnant;

import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        ChunkRand rand = new ChunkRand();
        BastionRemnant bastionRemnant = new BastionRemnant(MCVersion.v1_20);
        while (true) {
            long seed = random.nextLong();
            long structureSeed = WorldSeed.toStructureSeed(seed);
            CPos pos = bastionRemnant.getInRegion(structureSeed,0,0,rand);
            if (pos == null) {
                continue;
            }
            BastionGenerator generator = new BastionGenerator(MCVersion.v1_20);
            generator.generate(seed,pos);
            System.out.println(seed);
            System.out.println(pos.toBlockPos());
            for (Pair<BPos, List<ItemStack>> chest : generator.generateLoot()) {
                System.out.println(chest.getFirst());
                for (ItemStack item : chest.getSecond()) {
                    System.out.println(item.getCount() + " " + item.getItem().getEnchantments() + " " + item.getItem().getName());
                }
            }
            return;
        }
    }
}
