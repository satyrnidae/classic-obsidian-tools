package dev.satyrn.classicobsidian.item.trades;

import dev.satyrn.classicobsidian.config.ModConfig;
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
    private final Supplier<? extends Item> item;
    private final ModConfig.TradeOptions options;

    public ModItemTrade(Supplier<? extends Item> item, ModConfig.TradeOptions options) {
        this.item = item;
        this.options = options;
    }

    @Override
    public MerchantOffer getOffer(Entity trader, RandomSource random) {
        final ItemStack result;
        final ItemStack currency;

        if (this.options.getEnchanted()) {
            final int level = 5 + random.nextInt(15);
            final int cost = Math.min(this.options.getBaseCost() + level, 64);
            currency = new ItemStack(Items.EMERALD, cost);
            result = EnchantmentHelper.enchantItem(random, new ItemStack(item.get()), level, false);
        } else {
            result = new ItemStack(item.get());
            currency = new ItemStack(Items.EMERALD, this.options.getBaseCost());
        }

        return new MerchantOffer(currency, this.options.getUpgradeItemStack(), result, this.options.getMaxUses(),
                this.options.getVillagerXp(), this.options.getPriceMultiplier());
    }
}
