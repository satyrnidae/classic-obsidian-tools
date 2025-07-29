package dev.satyrn.classicobsidian.forge.data.providers.client.lang;

import dev.satyrn.classicobsidian.ClassicObsidian;
import dev.satyrn.classicobsidian.config.ToolEffectivenessTier;
import dev.satyrn.classicobsidian.config.VillagerTradeLevels;
import dev.satyrn.classicobsidian.item.ModItems;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

public final class ModUSEnglishLanguageProvider extends LanguageProvider {
    public ModUSEnglishLanguageProvider(DataGenerator gen, String modid) {
        super(gen, modid, "en_us");
    }

    @Override
    protected void addTranslations() {
        this.add(ModItems.OBSIDIAN_AXE.get(), "Obsidian Axe");
        this.add(ModItems.OBSIDIAN_HOE.get(), "Obsidian Hoe");
        this.add(ModItems.OBSIDIAN_PICKAXE.get(), "Obsidian Pickaxe");
        this.add(ModItems.OBSIDIAN_SHOVEL.get(), "Obsidian Shovel");
        this.add(ModItems.OBSIDIAN_SWORD.get(), "Obsidian Sword");

        this.add(ToolEffectivenessTier.WOOD, "Wood");
        this.add(ToolEffectivenessTier.STONE, "Stone");
        this.add(ToolEffectivenessTier.IRON, "Iron");
        this.add(ToolEffectivenessTier.GOLD, "Gold");
        this.add(ToolEffectivenessTier.DIAMOND, "Diamond");
        this.add(ToolEffectivenessTier.NETHERITE, "Netherite");

        this.add(VillagerTradeLevels.NOVICE, "Novice");
        this.add(VillagerTradeLevels.APPRENTICE, "Apprentice");
        this.add(VillagerTradeLevels.JOURNEYMAN, "Journeyman");
        this.add(VillagerTradeLevels.EXPERT, "Expert");
        this.add(VillagerTradeLevels.MASTER, "Master");

        this.addConfig("title", "Classic Obsidian Tools Options");
        this.addConfigOption("tools", "Obsidian Tool Options");
        this.addToolOption("miningSpeed", "Mining speed bonus");
        this.addToolOption("swordCobwebSpeed", "Cobweb mining speed bonus for swords");
        this.addToolOption("toolEffectiveness", "Equivalent effectiveness tier");
        this.addToolOption("toolAttackBonus", "Attack bonus");
        this.addToolOption("toolUses", "Durability (set to 0 to disable)");
        this.addToolOption("enchantability", "Enchantability");
        this.addConfigOption("swordCobwebSpeed", "Obsidian tool base mining speed");
        this.addConfigOption("trading", "Villager Trading Options");
        this.addTradeConfigOption("enabled", "Enable villager trades?");
        this.addTradeConfigOption("toolsmithTrades", "Toolsmith Trade Options");
        this.addProfessionOption("toolsmith", "enabled", "Enable toolsmith trades?");
        this.addListing("toolsmith", "axe", "Obsidian Axe Trade Options");
        this.addListingOption("toolsmith", "axe", "enabled", "Enable axe trade?");
        this.addListingOption("toolsmith", "axe", "level", "Villager level to offer trade");
        this.addListingOption("toolsmith", "axe", "baseCost", "Base cost of items");
        this.addListingOption("toolsmith", "axe", "maxUses", "Items to stock");
        this.addListingOption("toolsmith", "axe", "villagerXp", "Amount of XP to grant villager on trade");
        this.addListingOption("toolsmith", "axe", "priceMultiplier", "Price multiplier");
        this.addListingOption("toolsmith", "axe", "upgradeItem", "Secondary price item stack");
        this.addListingOption("toolsmith", "axe", "enchanted", "Sell enchanted items?");
        this.addListing("toolsmith", "hoe", "Obsidian Hoe Trade Options");
        this.addListingOption("toolsmith", "hoe", "enabled", "Enable hoe trade?");
        this.addListingOption("toolsmith", "hoe", "level", "Villager level to offer trade");
        this.addListingOption("toolsmith", "hoe", "baseCost", "Base cost of items");
        this.addListingOption("toolsmith", "hoe", "maxUses", "Items to stock");
        this.addListingOption("toolsmith", "hoe", "villagerXp", "Amount of XP to grant villager on trade");
        this.addListingOption("toolsmith", "hoe", "priceMultiplier", "Price multiplier");
        this.addListingOption("toolsmith", "hoe", "upgradeItem", "Secondary price item stack");
        this.addListingOption("toolsmith", "hoe", "enchanted", "Sell enchanted items?");
        this.addListing("toolsmith", "pickaxe", "Obsidian Pickaxe Trade Options");
        this.addListingOption("toolsmith", "pickaxe", "enabled", "Enable pickaxe trade?");
        this.addListingOption("toolsmith", "pickaxe", "level", "Villager level to offer trade");
        this.addListingOption("toolsmith", "pickaxe", "baseCost", "Base cost of items");
        this.addListingOption("toolsmith", "pickaxe", "maxUses", "Items to stock");
        this.addListingOption("toolsmith", "pickaxe", "villagerXp", "Amount of XP to grant villager on trade");
        this.addListingOption("toolsmith", "pickaxe", "priceMultiplier", "Price multiplier");
        this.addListingOption("toolsmith", "pickaxe", "upgradeItem", "Secondary price item stack");
        this.addListingOption("toolsmith", "pickaxe", "enchanted", "Sell enchanted items?");
        this.addListing("toolsmith", "shovel", "Obsidian Shovel Trade Options");
        this.addListingOption("toolsmith", "shovel", "enabled", "Enable shovel trade?");
        this.addListingOption("toolsmith", "shovel", "level", "Villager level to offer trade");
        this.addListingOption("toolsmith", "shovel", "baseCost", "Base cost of items");
        this.addListingOption("toolsmith", "shovel", "maxUses", "Items to stock");
        this.addListingOption("toolsmith", "shovel", "villagerXp", "Amount of XP to grant villager on trade");
        this.addListingOption("toolsmith", "shovel", "priceMultiplier", "Price multiplier");
        this.addListingOption("toolsmith", "shovel", "upgradeItem", "Secondary price item stack");
        this.addListingOption("toolsmith", "shovel", "enchanted", "Sell enchanted items?");
        this.addTradeConfigOption("weaponsmithTrades", "Weaponsmith Trade Options");
        this.addProfessionOption("weaponsmith", "enabled", "Enable weaponsmith trades?");
        this.addListing("weaponsmith", "axe", "Obsidian Axe Trade Options");
        this.addListingOption("weaponsmith", "axe", "enabled", "Enable axe trade?");
        this.addListingOption("weaponsmith", "axe", "level", "Villager level to offer trade");
        this.addListingOption("weaponsmith", "axe", "baseCost", "Base cost of items");
        this.addListingOption("weaponsmith", "axe", "maxUses", "Items to stock");
        this.addListingOption("weaponsmith", "axe", "villagerXp", "Amount of XP to grant villager on trade");
        this.addListingOption("weaponsmith", "axe", "priceMultiplier", "Price multiplier");
        this.addListingOption("weaponsmith", "axe", "upgradeItem", "Secondary price item stack");
        this.addListingOption("weaponsmith", "axe", "enchanted", "Sell enchanted items?");
        this.addListing("weaponsmith", "sword", "Obsidian Sword Trade Options");
        this.addListingOption("weaponsmith", "sword", "enabled", "Enable sword trade?");
        this.addListingOption("weaponsmith", "sword", "level", "Villager level to offer trade");
        this.addListingOption("weaponsmith", "sword", "baseCost", "Base cost of items");
        this.addListingOption("weaponsmith", "sword", "maxUses", "Items to stock");
        this.addListingOption("weaponsmith", "sword", "villagerXp", "Amount of XP to grant villager on trade");
        this.addListingOption("weaponsmith", "sword", "priceMultiplier", "Price multiplier");
        this.addListingOption("weaponsmith", "sword", "upgradeItem", "Secondary price item stack");
        this.addListingOption("weaponsmith", "sword", "enchanted", "Sell enchanted items?");

        this.addTip("title", "Obsidian Tools");
        this.addTip("toolsmith", "Toolsmiths can sell unbreakable obsidian tools!");
        this.addTip("weaponsmith", "Weaponsmiths can sell unbreakable obsidian swords and axes!");
        this.addTip("mining_speed", "Obsidian tools are unbreakable, but don't offer any bonus to mining speed.");
        this.addTip("stone_equivalent", "Obsidian tools are equivalent to stone tools, but never wear out.");
        this.addTip("create_machines", "Because they never break, obsidian tools are ideal for automation!");
    }

    private void add(Enum<?> enumValue, String name) {
        this.add(enumValue.name(), name);
    }

    private void addConfig(String key, String name) {
        this.add("text.autoconfig." + ClassicObsidian.MOD_ID + "." + key, name);
    }

    private void addTip(String key, String name) {
        this.add(ClassicObsidian.MOD_ID + ".tip." + key, name);
    }

    private void addConfigOption(String key, String name) {
        this.addConfig("option." + key, name);
    }

    private void addToolOption(String key, String name) {
        this.addConfigOption("tools." + key, name);
    }

    private void addTradeConfigOption(String key, String name) {
        this.addConfigOption("trading." + key, name);
    }

    private void addProfessionOption(String profession, String key, String name) {
        this.addTradeConfigOption(profession + "Trades." + key, name);
    }

    private void addListing(String profession, String key, String name) {
        this.addProfessionOption(profession, key + "Trade", name);
    }

    private void addListingOption(String profession, String listItem, String key, String name) {
        this.addProfessionOption(profession, listItem + "Trade." + key, name);
    }
}
