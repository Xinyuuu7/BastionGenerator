package Xinyuiii.reecriture;

import com.seedfinding.mccore.util.data.Pair;
import com.seedfinding.mcfeature.loot.LootContext;
import com.seedfinding.mcfeature.loot.function.LootFunction;
import com.seedfinding.mcfeature.loot.item.Item;
import com.seedfinding.mcfeature.loot.item.ItemStack;

public class NewEnchantRandomlyFunction implements LootFunction {

    public NewEnchantRandomlyFunction() {}

    @Override
    public ItemStack process(ItemStack baseStack, LootContext context) {
        Item item = baseStack.getItem();
        context.nextInt(1);
        int level = context.nextInt(3) + 1;
        item.addEnchantment(new Pair<>("soul_speed", level));
        return new ItemStack(item,1);
    }
}
