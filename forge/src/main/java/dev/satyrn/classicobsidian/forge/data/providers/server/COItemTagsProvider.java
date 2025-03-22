package dev.satyrn.classicobsidian.forge.data.providers.server;

import dev.satyrn.classicobsidian.data.COTags;
import dev.satyrn.classicobsidian.item.COItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

public class COItemTagsProvider extends ItemTagsProvider {

    public COItemTagsProvider(DataGenerator arg, BlockTagsProvider arg2, String modId, @Nullable ExistingFileHelper existingFileHelper) {
        super(arg, arg2, modId, existingFileHelper);
    }

    @Override
    protected void addTags() {
        this.tag(COTags.Items.CONVENTIONAL_TOOL)
                .replace(false)
                .add(COItems.OBSIDIAN_AXE.get())
                .add(COItems.OBSIDIAN_HOE.get())
                .add(COItems.OBSIDIAN_PICKAXE.get())
                .add(COItems.OBSIDIAN_SHOVEL.get())
                .add(COItems.OBSIDIAN_SWORD.get());
        this.tag(COTags.Items.CONVENTIONAL_TOOLS_MELEE_WEAPON)
                .replace(false)
                .add(COItems.OBSIDIAN_AXE.get())
                .add(COItems.OBSIDIAN_SWORD.get());
        this.tag(COTags.Items.CONVENTIONAL_TOOLS_MINING_TOOL)
                .replace(false)
                .add(COItems.OBSIDIAN_PICKAXE.get());
        this.tag(COTags.Items.FORGE_TOOLS_AXES)
                .replace(false)
                .add(COItems.OBSIDIAN_AXE.get());
        this.tag(COTags.Items.FORGE_TOOLS_HOES)
                .replace(false)
                .add(COItems.OBSIDIAN_HOE.get());
        this.tag(COTags.Items.FORGE_TOOLS_PICKAXES)
                .replace(false)
                .add(COItems.OBSIDIAN_PICKAXE.get());
        this.tag(COTags.Items.FORGE_TOOLS_SHOVELS)
                .replace(false)
                .add(COItems.OBSIDIAN_SHOVEL.get());
        this.tag(COTags.Items.FORGE_TOOLS_SWORDS)
                .replace(false)
                .add(COItems.OBSIDIAN_SWORD.get());
    }
}
