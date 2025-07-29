package dev.satyrn.classicobsidian.forge.event;

import dev.satyrn.classicobsidian.ClassicObsidian;
import dev.satyrn.classicobsidian.item.ModItems;
import dev.satyrn.classicobsidian.item.trades.ModItemTrade;
import dev.satyrn.classicobsidian.util.NotInitializable;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = ClassicObsidian.MOD_ID)
public final class ForgeEvents {
    private ForgeEvents() {
        NotInitializable.staticClass(ForgeEvents.class);
    }

    @SubscribeEvent
    static void onVillagerTrades(VillagerTradesEvent event) {
        final var tradingConfig = ClassicObsidian.getConfig().getTrading();
        if (tradingConfig.getEnabled()) {
            final var toolsmithTrades = tradingConfig.getToolsmithTrades();
            final var weaponsmithTrades = tradingConfig.getWeaponsmithTrades();

            if (event.getType() == VillagerProfession.TOOLSMITH && toolsmithTrades.getEnabled()) {
                final var axeTrade = toolsmithTrades.getAxeTrade();
                final var hoeTrade = toolsmithTrades.getHoeTrade();
                final var pickaxeTrade = toolsmithTrades.getPickaxeTrade();
                final var shovelTrade = toolsmithTrades.getShovelTrade();

                if (axeTrade.getEnabled()) {
                    ClassicObsidian.info("Adding axe trade to toolsmith at level {}", axeTrade.getLevelInt());
                    event.getTrades()
                            .get(axeTrade.getLevelInt())
                            .add(new ModItemTrade(ModItems.OBSIDIAN_AXE, axeTrade));
                }

                if (hoeTrade.getEnabled()) {
                    ClassicObsidian.info("Adding hoe trade to toolsmith at level {}", hoeTrade.getLevelInt());
                    event.getTrades()
                            .get(hoeTrade.getLevelInt())
                            .add(new ModItemTrade(ModItems.OBSIDIAN_HOE, hoeTrade));
                }

                if (pickaxeTrade.getEnabled()) {
                    ClassicObsidian.info("Adding pickaxe trade to toolsmith at level {}", pickaxeTrade.getLevelInt());
                    event.getTrades()
                            .get(pickaxeTrade.getLevelInt())
                            .add(new ModItemTrade(ModItems.OBSIDIAN_PICKAXE, pickaxeTrade));
                }

                if (shovelTrade.getEnabled()) {
                    ClassicObsidian.info("Adding shovel trade to toolsmith at level {}", shovelTrade.getLevelInt());
                    event.getTrades()
                            .get(shovelTrade.getLevelInt())
                            .add(new ModItemTrade(ModItems.OBSIDIAN_SHOVEL, shovelTrade));
                }
            }

            if (event.getType() == VillagerProfession.WEAPONSMITH && weaponsmithTrades.getEnabled()) {
                final var axeTrade = weaponsmithTrades.getAxeTrade();
                final var swordTrade = weaponsmithTrades.getSwordTrade();

                if (axeTrade.getEnabled()) {
                    ClassicObsidian.info("Adding axe trade to weaponsmith at level {}", axeTrade.getLevelInt());
                    event.getTrades()
                            .get(axeTrade.getLevelInt())
                            .add(new ModItemTrade(ModItems.OBSIDIAN_AXE, axeTrade));
                }

                if (swordTrade.getEnabled()) {
                    ClassicObsidian.info("Adding sword trade to weaponsmith at level {}", swordTrade.getLevelInt());
                    event.getTrades()
                            .get(swordTrade.getLevelInt())
                            .add(new ModItemTrade(ModItems.OBSIDIAN_SWORD, swordTrade));
                }
            }
        }
    }
}
