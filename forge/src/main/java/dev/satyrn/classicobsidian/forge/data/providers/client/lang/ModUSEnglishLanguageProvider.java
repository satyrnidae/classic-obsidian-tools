package dev.satyrn.classicobsidian.forge.data.providers.client.lang;

import dev.satyrn.classicobsidian.ClassicObsidian;
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

        this.addConfig("title", "Classic Obsidian Tools Options");
        this.addConfigOption("trading", "Villager Trades");
        this.addConfigOption("trading.villagerTradingEnabled", "Enable villager trades");
        this.addConfigOption("trading.enchantedTrades", "Trade for enchanted obsidian items");
        this.addConfigOption("trading.toolsmithLevelNeeded", "Toolsmith trade level (1-5)");
        this.addConfigOption("trading.weaponsmithLevelNeeded", "Weaponsmith trade level (1-5)");

        this.addTip("title", "Classic Obsidian Tools Tip");
        this.addTip("toolsmith", "Toolsmiths can sell unbreakable obsidian tools!");
        this.addTip("weaponsmith", "Weaponsmiths can sell unbreakable obsidian swords!");
        this.addTip("mining_speed", "Obsidian tools are unbreakable, but don't offer any bonus to mining speed.");
        this.addTip("stone_equivalent", "Obsidian tools are equivalent to stone tools, but never wear out.");
        this.addTip("create_machines", "Because they never break, obsidian tools are ideal for automation!");
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
}
