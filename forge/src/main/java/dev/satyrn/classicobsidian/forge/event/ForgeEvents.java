package dev.satyrn.classicobsidian.forge.event;

import dev.satyrn.classicobsidian.ClassicObsidian;
import dev.satyrn.classicobsidian.item.ModItems;
import dev.satyrn.classicobsidian.item.trades.ModItemTrade;
import dev.satyrn.classicobsidian.util.NotInitializable;
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
        if (ClassicObsidian.getConfig().trading().villagerTradingEnabled()) {
            final int weaponsmithLevelNeeded = ClassicObsidian.getConfig().trading().weaponsmithLevelNeeded();
            event.getTrades().get(weaponsmithLevelNeeded).add(new ModItemTrade(ModItems.OBSIDIAN_SWORD, 8, 3, 15));

            final int toolsmithLevelNeeded = ClassicObsidian.getConfig().trading().toolsmithLevelNeeded();
            event.getTrades().get(toolsmithLevelNeeded).add(new ModItemTrade(ModItems.OBSIDIAN_AXE, 28, 3, 15));
            event.getTrades().get(toolsmithLevelNeeded).add(new ModItemTrade(ModItems.OBSIDIAN_PICKAXE, 28, 3, 15));
            event.getTrades().get(toolsmithLevelNeeded).add(new ModItemTrade(ModItems.OBSIDIAN_HOE, 14, 3, 15));
            event.getTrades().get(toolsmithLevelNeeded).add(new ModItemTrade(ModItems.OBSIDIAN_SHOVEL, 14, 3, 15));
        }
    }
}
