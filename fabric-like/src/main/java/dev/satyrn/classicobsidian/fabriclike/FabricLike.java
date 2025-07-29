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

        final var tradingConfig = ClassicObsidian.getConfig().getTrading();
        if (tradingConfig.getEnabled()) {
            final var toolsmithTrades = tradingConfig.getToolsmithTrades();
            if (toolsmithTrades.getEnabled()) {
                final var axeTrade = toolsmithTrades.getAxeTrade();
                final var hoeTrade = toolsmithTrades.getHoeTrade();
                final var pickaxeTrade = toolsmithTrades.getPickaxeTrade();
                final var shovelTrade = toolsmithTrades.getShovelTrade();

                if (axeTrade.getEnabled()) {
                    ClassicObsidian.info("Adding axe trade to toolsmith at level {}", axeTrade.getLevelInt());
                    TradeOfferHelper.registerVillagerOffers(VillagerProfession.TOOLSMITH, axeTrade.getLevelInt(),
                            listings -> listings.add(new ModItemTrade(ModItems.OBSIDIAN_AXE, axeTrade)));
                }

                if (hoeTrade.getEnabled()) {
                    ClassicObsidian.info("Adding hoe trade to toolsmith at level {}", hoeTrade.getLevelInt());
                    TradeOfferHelper.registerVillagerOffers(VillagerProfession.TOOLSMITH, hoeTrade.getLevelInt(),
                            listings -> listings.add(new ModItemTrade(ModItems.OBSIDIAN_HOE, hoeTrade)));
                }

                if (pickaxeTrade.getEnabled()) {
                    ClassicObsidian.info("Adding pickaxe trade to toolsmith at level {}", pickaxeTrade.getLevelInt());
                    TradeOfferHelper.registerVillagerOffers(VillagerProfession.TOOLSMITH, pickaxeTrade.getLevelInt(),
                            listings -> listings.add(new ModItemTrade(ModItems.OBSIDIAN_PICKAXE, pickaxeTrade)));
                }

                if (shovelTrade.getEnabled()) {
                    ClassicObsidian.info("Adding shovel trade to toolsmith at level {}", shovelTrade.getLevelInt());
                    TradeOfferHelper.registerVillagerOffers(VillagerProfession.TOOLSMITH, shovelTrade.getLevelInt(),
                            listings -> listings.add(new ModItemTrade(ModItems.OBSIDIAN_SHOVEL, shovelTrade)));
                }
            }

            final var weaponsmithTrades = tradingConfig.getWeaponsmithTrades();
            if (weaponsmithTrades.getEnabled()) {
                final var axeTrade = weaponsmithTrades.getAxeTrade();
                final var swordTrade = weaponsmithTrades.getSwordTrade();

                if (axeTrade.getEnabled()) {
                    ClassicObsidian.info("Adding axe trade to weaponsmith at level {}", axeTrade.getLevelInt());
                    TradeOfferHelper.registerVillagerOffers(VillagerProfession.WEAPONSMITH, axeTrade.getLevelInt(),
                            listings -> listings.add(new ModItemTrade(ModItems.OBSIDIAN_AXE, axeTrade)));
                }

                if (swordTrade.getEnabled()) {
                    ClassicObsidian.info("Adding sword trade to weaponsmith at level {}", swordTrade.getLevelInt());
                    TradeOfferHelper.registerVillagerOffers(VillagerProfession.WEAPONSMITH, swordTrade.getLevelInt(),
                            listings -> listings.add(new ModItemTrade(ModItems.OBSIDIAN_SWORD, swordTrade)));
                }
            }
        }
    }
}
