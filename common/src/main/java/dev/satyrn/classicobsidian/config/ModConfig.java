package dev.satyrn.classicobsidian.config;

import dev.satyrn.classicobsidian.ClassicObsidian;
import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;

@Config(name = ClassicObsidian.MOD_ID)
public final class ModConfig implements ConfigData {

    @ConfigEntry.Gui.CollapsibleObject(startExpanded = true) VillagerTradeOptions trading = new VillagerTradeOptions();

    public VillagerTradeOptions trading() {
        return this.trading;
    }

    @Override
    public void validatePostLoad() throws ValidationException {
        final int weaponsmithLevelNeeded = this.trading.weaponsmithLevelNeeded;
        if (weaponsmithLevelNeeded < 1 || weaponsmithLevelNeeded > 5) {
            final int newValue = Math.max(1, Math.min(5, weaponsmithLevelNeeded));
            ClassicObsidian.info("Corrected trading.weaponsmithLevelNeeded from {} to {}", weaponsmithLevelNeeded,
                    newValue);
            this.trading.weaponsmithLevelNeeded = newValue;
        }

        final int toolsmithLevelNeeded = this.trading.toolsmithLevelNeeded;
        if (toolsmithLevelNeeded < 1 || toolsmithLevelNeeded > 5) {
            final int newValue = Math.max(1, Math.min(5, toolsmithLevelNeeded));
            ClassicObsidian.info("Corrected trading.toolsmithLevelNeeded from {} to {}", toolsmithLevelNeeded,
                    newValue);
            this.trading.toolsmithLevelNeeded = newValue;
        }
    }

    public static final class VillagerTradeOptions {
        boolean villagerTradingEnabled = true;
        boolean enchantedTrades = true;
        @ConfigEntry.BoundedDiscrete(min = 1L, max = 5L) int toolsmithLevelNeeded = 4;
        @ConfigEntry.BoundedDiscrete(min = 1L, max = 5L) int weaponsmithLevelNeeded = 4;

        public boolean villagerTradingEnabled() {
            return villagerTradingEnabled;
        }

        public boolean enchantedTrades() {
            return enchantedTrades;
        }

        public int toolsmithLevelNeeded() {
            return toolsmithLevelNeeded;
        }

        public int weaponsmithLevelNeeded() {
            return weaponsmithLevelNeeded;
        }
    }
}
