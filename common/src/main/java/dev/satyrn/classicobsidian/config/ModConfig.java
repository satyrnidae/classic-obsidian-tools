package dev.satyrn.classicobsidian.config;

import dev.satyrn.classicobsidian.ClassicObsidian;
import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.Nullable;

import java.beans.BeanProperty;
import java.beans.JavaBean;
import java.beans.Transient;
import java.util.Optional;

import static me.shedaniel.autoconfig.annotation.ConfigEntry.BoundedDiscrete;
import static me.shedaniel.autoconfig.annotation.ConfigEntry.Gui.CollapsibleObject;
import static me.shedaniel.autoconfig.annotation.ConfigEntry.Gui.EnumHandler;
import static me.shedaniel.autoconfig.annotation.ConfigEntry.Gui.EnumHandler.EnumDisplayOption;
import static me.shedaniel.autoconfig.annotation.ConfigEntry.Gui.Excluded;

@JavaBean(description = "The main configuration for the mod.")
@Config(name = ClassicObsidian.MOD_ID)
public final class ModConfig implements ConfigData {
    @CollapsibleObject private final ObsidianToolTierOptions tools = new ObsidianToolTierOptions();
    @CollapsibleObject(startExpanded = true) private final VillagerTradeOptions trading = new VillagerTradeOptions();

    public ModConfig() {
    }

    @BeanProperty
    public ObsidianToolTierOptions getTools() {
        return this.tools;
    }

    public void setTools(final @Nullable ObsidianToolTierOptions value) {
        this.tools.copyFrom(value == null ? new ObsidianToolTierOptions() : value);
    }

    @BeanProperty
    public VillagerTradeOptions getTrading() {
        return this.trading;
    }

    @SuppressWarnings("unused")
    public void setTrading(final @Nullable VillagerTradeOptions value) {
        this.trading.copyFrom(value == null ? new VillagerTradeOptions() : value);
    }

    @Override
    public void validatePostLoad() {
        this.tools.validatePostLoad();
        this.trading.validatePostLoad();
    }

    @JavaBean
    public static final class ObsidianToolTierOptions implements ConfigData, ApplyCopy<ObsidianToolTierOptions> {
        private float miningSpeed = 1.5F;
        private float swordCobwebSpeed = 10F;
        @EnumHandler(option = EnumDisplayOption.BUTTON) private ToolEffectivenessTier toolEffectiveness = ToolEffectivenessTier.STONE;
        private float toolAttackBonus = 1.0F;
        private int toolUses = 0;
        private int enchantability = 0;

        @BeanProperty(description = "Default tool speeds:\n - Wood: 2.0\n - Stone: 4.0\n - Iron: 6.0\n - Diamond: 8.0\n - Netherite: 9.0\n - Gold: 12.0")
        public float getMiningSpeed() {
            return miningSpeed;
        }

        @SuppressWarnings("unused")
        public void setMiningSpeed(final float value) {
            this.miningSpeed = value;
        }

        @BeanProperty
        public float getSwordCobwebSpeed() {
            return swordCobwebSpeed;
        }

        @SuppressWarnings("unused")
        public void setSwordCobwebSpeed(final float value) {
            this.swordCobwebSpeed = value;
        }

        @BeanProperty
        @SuppressWarnings("unused")
        public ToolEffectivenessTier getToolEffectiveness() {
            return toolEffectiveness;
        }

        @SuppressWarnings("unused")
        public void setToolEffectiveness(final @Nullable ToolEffectivenessTier value) {
            this.toolEffectiveness = value == null ? ToolEffectivenessTier.STONE : value;
        }

        @Transient
        public int getToolEffectivenessInt() {
            return this.toolEffectiveness.getEffectiveness();
        }

        @BeanProperty
        public float getToolAttackBonus() {
            return toolAttackBonus;
        }

        @SuppressWarnings("unused")
        public void setToolAttackBonus(final float toolAttackBonus) {
            this.toolAttackBonus = toolAttackBonus;
        }

        @BeanProperty
        public int getToolUses() {
            return toolUses;
        }

        @SuppressWarnings("unused")
        public void setToolUses(final int toolUses) {
            this.toolUses = toolUses;
        }

        @BeanProperty
        public int getEnchantability() {
            return enchantability;
        }

        @SuppressWarnings("unused")
        public void setEnchantability(final int value) {
            this.enchantability = value;
        }

        @Override
        public void copyFrom(final ObsidianToolTierOptions other) {
            this.miningSpeed = other.miningSpeed;
            this.swordCobwebSpeed = other.swordCobwebSpeed;
            this.toolEffectiveness = other.toolEffectiveness;
            this.toolAttackBonus = other.toolAttackBonus;
            this.toolUses = other.toolUses;
            this.enchantability = other.enchantability;
        }

        @Override
        public void validatePostLoad() {
            if (this.miningSpeed < Math.ulp(1.0F)) {
                ClassicObsidian.info("Fixed incorrectly configured option toolSpeed from {} to {}", this.miningSpeed,
                        Math.ulp(1.0F));
                this.miningSpeed = Math.ulp(1.0F);
            }
            if (this.swordCobwebSpeed < Math.ulp(1.0F)) {
                ClassicObsidian.info("Fixed incorrectly configured option swordCobwebSpeed from {} to {}",
                        this.swordCobwebSpeed, Math.ulp(1.0F));
                this.swordCobwebSpeed = Math.ulp(1.0F);
            }
            if (this.toolUses < 0) {
                ClassicObsidian.info("Fixed incorrectly configured option toolUses from {} to 0", this.toolUses);
                this.toolUses = 0;
            }
            if (this.enchantability < 0) {
                ClassicObsidian.info("Fixed incorrectly configured option enchantability from {} to 0",
                        this.enchantability);
                this.enchantability = 0;
            }
        }
    }

    @JavaBean
    public static final class VillagerTradeOptions implements ConfigData, ApplyCopy<VillagerTradeOptions> {
        private boolean enabled = true;
        @CollapsibleObject private final ToolsmithTradeOptions toolsmithTrades = new ToolsmithTradeOptions();
        @CollapsibleObject private final WeaponsmithTradeOptions weaponsmithTrades = new WeaponsmithTradeOptions();

        public VillagerTradeOptions() {
        }

        @BeanProperty
        public boolean getEnabled() {
            return this.enabled;
        }

        @SuppressWarnings("unused")
        public void setEnabled(boolean value) {
            this.enabled = value;
        }

        @BeanProperty
        public ToolsmithTradeOptions getToolsmithTrades() {
            return this.toolsmithTrades;
        }

        public void setToolsmithTrades(final @Nullable ToolsmithTradeOptions value) {
            this.toolsmithTrades.copyFrom(value == null ? new ToolsmithTradeOptions() : value);
        }

        @BeanProperty
        public WeaponsmithTradeOptions getWeaponsmithTrades() {
            return this.weaponsmithTrades;
        }

        public void setWeaponsmithTrades(final @Nullable WeaponsmithTradeOptions value) {
            this.weaponsmithTrades.copyFrom(value == null ? new WeaponsmithTradeOptions() : value);
        }

        @Override
        public void copyFrom(final VillagerTradeOptions other) {
            this.enabled = other.enabled;
            this.setWeaponsmithTrades(other.weaponsmithTrades);
            this.setToolsmithTrades(other.toolsmithTrades);
        }

        @Override
        public void validatePostLoad() {
            this.toolsmithTrades.validatePostLoad();
            this.weaponsmithTrades.validatePostLoad();
        }
    }

    @JavaBean
    public static class ToolsmithTradeOptions implements ConfigData, ApplyCopy<ToolsmithTradeOptions> {
        @Excluded private static final TradeOptions DEFAULT_AXE_TRADE = new TradeOptions(VillagerTradeLevels.EXPERT, 17,
                3, 15, 0.2F);
        @Excluded private static final TradeOptions DEFAULT_HOE_TRADE = new TradeOptions(VillagerTradeLevels.JOURNEYMAN,
                4, 3, 10, 0.2F);
        @Excluded private static final TradeOptions DEFAULT_PICKAXE_TRADE = new TradeOptions(VillagerTradeLevels.MASTER,
                18, 3, 30, 0.2F);
        @Excluded private static final TradeOptions DEFAULT_SHOVEL_TRADE = new TradeOptions(VillagerTradeLevels.EXPERT,
                10, 3, 15, 0.2F);
        private boolean enabled = true;
        @CollapsibleObject private final TradeOptions axeTrade = DEFAULT_AXE_TRADE;
        @CollapsibleObject private final TradeOptions hoeTrade = DEFAULT_HOE_TRADE;
        @CollapsibleObject private final TradeOptions pickaxeTrade = DEFAULT_PICKAXE_TRADE;
        @CollapsibleObject private final TradeOptions shovelTrade = DEFAULT_SHOVEL_TRADE;

        public ToolsmithTradeOptions() {
        }

        @BeanProperty
        public boolean getEnabled() {
            return this.enabled;
        }

        @SuppressWarnings("unused")
        public void setEnabled(final boolean value) {
            this.enabled = value;
        }

        @BeanProperty
        public TradeOptions getAxeTrade() {
            return this.axeTrade;
        }

        public void setAxeTrade(final @Nullable TradeOptions value) {
            this.axeTrade.copyFrom(value == null ? DEFAULT_AXE_TRADE : value);
        }

        @BeanProperty
        public TradeOptions getHoeTrade() {
            return this.hoeTrade;
        }

        public void setHoeTrade(final @Nullable TradeOptions value) {
            this.hoeTrade.copyFrom(value == null ? DEFAULT_HOE_TRADE : value);
        }

        @BeanProperty
        public TradeOptions getPickaxeTrade() {
            return this.pickaxeTrade;
        }

        public void setPickaxeTrade(final @Nullable TradeOptions value) {
            this.pickaxeTrade.copyFrom(value == null ? DEFAULT_PICKAXE_TRADE : value);
        }

        @BeanProperty
        public TradeOptions getShovelTrade() {
            return this.shovelTrade;
        }

        public void setShovelTrade(final @Nullable TradeOptions value) {
            this.shovelTrade.copyFrom(value == null ? DEFAULT_SHOVEL_TRADE : value);
        }

        @Override
        public void copyFrom(final ToolsmithTradeOptions other) {
            this.enabled = other.enabled;
            this.setAxeTrade(other.axeTrade);
            this.setHoeTrade(other.hoeTrade);
            this.setPickaxeTrade(other.pickaxeTrade);
            this.setShovelTrade(other.shovelTrade);
        }

        @Override
        public void validatePostLoad() {
            this.axeTrade.validatePostLoad();
            this.hoeTrade.validatePostLoad();
            this.pickaxeTrade.validatePostLoad();
            this.shovelTrade.validatePostLoad();
        }
    }

    @JavaBean
    public static class WeaponsmithTradeOptions implements ConfigData, ApplyCopy<WeaponsmithTradeOptions> {
        @Excluded private static final TradeOptions DEFAULT_AXE_TRADE = new TradeOptions(VillagerTradeLevels.EXPERT, 17,
                3, 15, 0.2F);
        @Excluded private static final TradeOptions DEFAULT_SWORD_TRADE = new TradeOptions(VillagerTradeLevels.MASTER,
                13, 3, 30, 0.2F);
        private boolean enabled = true;
        @CollapsibleObject private final TradeOptions axeTrade = DEFAULT_AXE_TRADE;
        @CollapsibleObject private final TradeOptions swordTrade = DEFAULT_SWORD_TRADE;

        public WeaponsmithTradeOptions() {
        }

        @BeanProperty
        public boolean getEnabled() {
            return this.enabled;
        }

        @SuppressWarnings("unused")
        public void setEnabled(final boolean value) {
            this.enabled = value;
        }

        @BeanProperty
        public TradeOptions getAxeTrade() {
            return this.axeTrade;
        }

        public void setAxeTrade(final @Nullable TradeOptions value) {
            this.axeTrade.copyFrom(value == null ? DEFAULT_AXE_TRADE : value);
        }

        @BeanProperty
        public TradeOptions getSwordTrade() {
            return this.swordTrade;
        }

        public void setSwordTrade(final @Nullable TradeOptions value) {
            this.swordTrade.copyFrom(value == null ? DEFAULT_SWORD_TRADE : value);
        }

        @Override
        public void copyFrom(final WeaponsmithTradeOptions weaponsmithTrades) {
            this.enabled = weaponsmithTrades.enabled;
            this.setAxeTrade(weaponsmithTrades.axeTrade);
            this.setSwordTrade(weaponsmithTrades.swordTrade);
        }

        @Override
        public void validatePostLoad() {
            this.axeTrade.validatePostLoad();
            this.swordTrade.validatePostLoad();
        }
    }

    @JavaBean
    public static final class TradeOptions implements ConfigData, ApplyCopy<TradeOptions> {
        private boolean enabled = true;
        @EnumHandler(option = EnumDisplayOption.BUTTON) private VillagerTradeLevels level;
        @BoundedDiscrete(min = 1L, max = 64L) private int baseCost;
        private int maxUses;
        private int villagerXp;
        private float priceMultiplier;
        private String upgradeItem = "";
        private boolean enchanted = true;

        @SuppressWarnings("unused")
        public TradeOptions() {
            this(VillagerTradeLevels.NOVICE, 1, 1, 1, 0.05F);
        }

        TradeOptions(VillagerTradeLevels defaultLevel,
                     int baseCost,
                     int maxUses,
                     int villagerXp,
                     float priceMultiplier) {
            this.level = defaultLevel;
            this.baseCost = baseCost;
            this.maxUses = maxUses;
            this.villagerXp = villagerXp;
            this.priceMultiplier = priceMultiplier;
        }

        @BeanProperty
        public boolean getEnabled() {
            return this.enabled;
        }

        @SuppressWarnings("unused")
        public void setEnabled(final boolean value) {
            this.enabled = value;
        }

        @Transient
        public int getLevelInt() {
            return this.level.getValue();
        }

        @BeanProperty
        @SuppressWarnings("unused")
        public VillagerTradeLevels getLevel() {
            return this.level;
        }

        public void setLevel(final @Nullable VillagerTradeLevels value) {
            this.level = value == null ? VillagerTradeLevels.NOVICE : value;
        }

        @BeanProperty
        public int getBaseCost() {
            return this.baseCost;
        }

        @SuppressWarnings("unused")
        public void setBaseCost(final int value) {
            this.baseCost = value;
        }

        @BeanProperty
        public int getMaxUses() {
            return this.maxUses;
        }

        @SuppressWarnings("unused")
        public void setMaxUses(final int value) {
            this.maxUses = value;
        }

        @BeanProperty
        public int getVillagerXp() {
            return this.villagerXp;
        }

        @SuppressWarnings("unused")
        public void setVillagerXp(final int value) {
            this.villagerXp = value;
        }

        @BeanProperty
        public boolean getEnchanted() {
            return this.enchanted;
        }

        @SuppressWarnings("unused")
        public void setEnchanted(final boolean value) {
            this.enchanted = value;
        }

        @BeanProperty
        public float getPriceMultiplier() {
            return this.priceMultiplier;
        }

        @SuppressWarnings("unused")
        public void setPriceMultiplier(final float value) {
            this.priceMultiplier = value;
        }

        @BeanProperty
        @SuppressWarnings("unused")
        public String getUpgradeItem() {
            return this.upgradeItem;
        }

        public void setUpgradeItem(final @Nullable String value) {
            this.upgradeItem = value == null ? "" : value;
        }

        @Transient
        public ItemStack getUpgradeItemStack() {
            if (!this.upgradeItem.isBlank()) {
                String[] itemStack = this.upgradeItem.split(" ");
                @Nullable String itemIdStr = null;
                int count = 1;
                if (itemStack.length == 1) {
                    itemIdStr = itemStack[0];
                } else if (itemStack.length >= 2) {
                    try {
                        count = Mth.clamp(Integer.parseInt(itemStack[0]), 0, 64);
                    } catch (Exception ignored) {
                    }
                    itemIdStr = itemStack[1];
                }
                if (count > 0 && itemIdStr != null && !itemIdStr.isBlank()) {
                    final @Nullable ResourceLocation itemId = ResourceLocation.tryParse(itemIdStr);
                    if (itemId != null) {
                        final Optional<Item> item = Registry.ITEM.getOptional(itemId);
                        if (item.isPresent()) {
                            return new ItemStack(item.get(), count);
                        }
                    }
                }
            }
            return ItemStack.EMPTY;
        }

        @Override
        public void copyFrom(final TradeOptions trade) {
            this.enabled = trade.enabled;
            this.setLevel(trade.level);
            this.baseCost = trade.baseCost;
            this.maxUses = trade.maxUses;
            this.villagerXp = trade.villagerXp;
            this.priceMultiplier = trade.priceMultiplier;
            this.setUpgradeItem(trade.upgradeItem);
            this.enchanted = trade.enchanted;
        }

        @Override
        public void validatePostLoad() {
            if (this.baseCost < 1 || this.baseCost > 64) {
                final int newValue = Mth.clamp(this.baseCost, 1, 64);
                ClassicObsidian.info("Corrected misconfigured trade base cost from {} to {}", this.baseCost, newValue);
                this.baseCost = newValue;
            }
            if (this.maxUses < 0) {
                ClassicObsidian.info("Corrected misconfigured trade max uses from {} to 0", this.maxUses);
                this.maxUses = 1;
            }
            if (this.villagerXp < 0) {
                ClassicObsidian.info("Corrected misconfigured trade villager XP from {} to 0", this.villagerXp);
                this.villagerXp = 1;
            }
            if (this.priceMultiplier < 0.0F || this.priceMultiplier > 1.0F) {
                final float newValue = Mth.clamp(this.priceMultiplier, 0.0F, 1.0F);
                ClassicObsidian.info("Corrected misconfigured trade price modifier from {} to {}", this.priceMultiplier,
                        newValue);
                this.priceMultiplier = newValue;
            }

            if (!this.upgradeItem.isEmpty()) {
                final ItemStack upgradeItem = this.getUpgradeItemStack();
                if (upgradeItem.isEmpty()) {
                    ClassicObsidian.info("Failed to parse secondary trade item stack \"{}\"", this.upgradeItem);
                    this.upgradeItem = "";
                } else {
                    final String canonicalStack = upgradeItem.toString();
                    if (!canonicalStack.equals(this.upgradeItem)) {
                        ClassicObsidian.info("Canonizing name for secondary trade item stack {} to {}",
                                this.upgradeItem, canonicalStack);
                        this.upgradeItem = canonicalStack;
                    }
                }
            }
        }
    }
}
