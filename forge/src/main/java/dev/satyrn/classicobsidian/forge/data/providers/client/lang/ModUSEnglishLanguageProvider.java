package dev.satyrn.classicobsidian.forge.data.providers.client.lang;

import dev.satyrn.classicobsidian.ClassicObsidian;
import dev.satyrn.classicobsidian.item.ModItems;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

public class ModUSEnglishLanguageProvider extends LanguageProvider {
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

        this.addConfig("title", "Classic Obsidian");
        this.addConfigOption("trading", "Villager Trades");
        this.addConfigOption("trading.villagerTradingEnabled", "Enable villager trades");
        this.addConfigOption("trading.enchantedTrades", "Trade for enchanted obsidian items");
        this.addConfigOption("trading.toolsmithLevelNeeded", "Toolsmith trade level (1-5)");
        this.addConfigOption("trading.weaponsmithLevelNeeded", "Weaponsmith trade level (1-5)");
    }

    private void addConfig(String key, String name) {
        this.add("text.autoconfig." + ClassicObsidian.MOD_ID + "." + key, name);
    }

    private void addConfigOption(String key, String name) {
        this.addConfig("option." + key, name);
    }
}
