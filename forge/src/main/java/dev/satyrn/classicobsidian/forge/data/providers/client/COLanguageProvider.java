package dev.satyrn.classicobsidian.forge.data.providers.client;

import dev.satyrn.classicobsidian.item.COItems;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

public class COLanguageProvider extends LanguageProvider {
    public COLanguageProvider(DataGenerator gen, String modid) {
        super(gen, modid, "en_us");
    }

    @Override
    protected void addTranslations() {
        this.add(COItems.OBSIDIAN_AXE.get(), "Obsidian Axe");
        this.add(COItems.OBSIDIAN_HOE.get(), "Obsidian Hoe");
        this.add(COItems.OBSIDIAN_PICKAXE.get(), "Obsidian Pickaxe");
        this.add(COItems.OBSIDIAN_SHOVEL.get(), "Obsidian Shovel");
        this.add(COItems.OBSIDIAN_SWORD.get(), "Obsidian Sword");
    }
}
