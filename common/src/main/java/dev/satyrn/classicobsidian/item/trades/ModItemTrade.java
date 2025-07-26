package dev.satyrn.classicobsidian.item.trades;

import dev.satyrn.classicobsidian.ClassicObsidian;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.trading.MerchantOffer;

import java.util.function.Supplier;

public final class ModItemTrade implements VillagerTrades.ItemListing {
    private final int baseEmeraldCost;
    private final int maxUses;
    private final int villagerXp;
    private final Supplier<? extends Item> item;

    public ModItemTrade(Supplier<? extends Item> item, int baseEmeraldCost, int maxUses, int villagerXp) {
        this.item = item;
        this.baseEmeraldCost = baseEmeraldCost;
        this.maxUses = maxUses;
        this.villagerXp = villagerXp;
    }

    @Override
    public MerchantOffer getOffer(Entity trader, RandomSource random) {
        final ItemStack result;
        final int level = 5 + random.nextInt(15);
        final int cost = Math.min(this.baseEmeraldCost + level, 64);
        final ItemStack currency = new ItemStack(Items.EMERALD, cost);

        if (ClassicObsidian.getConfig().trading().enchantedTrades()) {
            result = EnchantmentHelper.enchantItem(random, new ItemStack(item.get()), level, false);
        } else {
            result = new ItemStack(item.get());
        }

        return new MerchantOffer(currency, result, this.maxUses, this.villagerXp, 0.2F);
    }
}
