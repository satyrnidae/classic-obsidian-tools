package dev.satyrn.classicobsidian.fabriclike;

import dev.satyrn.classicobsidian.ClassicObsidian;
import dev.satyrn.classicobsidian.item.ModItems;
import dev.satyrn.classicobsidian.item.trades.ModItemTrade;
import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.world.entity.npc.VillagerProfession;

public final class FabricLike {
    public static void init() {
        // Run our common setup.
        ClassicObsidian.init();

        if(ClassicObsidian.getConfig().trading().villagerTradingEnabled()) {
            final int toolsmithLevelNeeded = ClassicObsidian.getConfig().trading().toolsmithLevelNeeded();
            final int weaponsmithLevelNeeded = ClassicObsidian.getConfig().trading().weaponsmithLevelNeeded();

            ClassicObsidian.info("Adding trades to toolsmith at level {}", toolsmithLevelNeeded);
            TradeOfferHelper.registerVillagerOffers(VillagerProfession.TOOLSMITH, toolsmithLevelNeeded,
                    itemListings -> itemListings.add(new ModItemTrade(ModItems.OBSIDIAN_AXE, 28, 3, 15)));
            TradeOfferHelper.registerVillagerOffers(VillagerProfession.TOOLSMITH, weaponsmithLevelNeeded,
                    itemListings -> itemListings.add(new ModItemTrade(ModItems.OBSIDIAN_HOE, 14, 3, 15)));
            TradeOfferHelper.registerVillagerOffers(VillagerProfession.TOOLSMITH, toolsmithLevelNeeded,
                    itemListings -> itemListings.add(new ModItemTrade(ModItems.OBSIDIAN_PICKAXE, 28, 3, 15)));
            TradeOfferHelper.registerVillagerOffers(VillagerProfession.TOOLSMITH, toolsmithLevelNeeded,
                    itemListings -> itemListings.add(new ModItemTrade(ModItems.OBSIDIAN_SHOVEL, 14, 3,15)));

            ClassicObsidian.info("Adding trades to weaponsmith at level {}", weaponsmithLevelNeeded);
            TradeOfferHelper.registerVillagerOffers(VillagerProfession.WEAPONSMITH, weaponsmithLevelNeeded,
                    itemListings -> itemListings.add(new ModItemTrade(ModItems.OBSIDIAN_SWORD, 8, 3, 15)));
        }
    }
}
