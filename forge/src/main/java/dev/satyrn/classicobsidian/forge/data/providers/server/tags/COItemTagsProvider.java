package dev.satyrn.classicobsidian.forge.data.providers.server.tags;

import dev.satyrn.classicobsidian.data.COTags;
import dev.satyrn.classicobsidian.item.COItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

public class COItemTagsProvider extends ItemTagsProvider {

    public COItemTagsProvider(DataGenerator arg, BlockTagsProvider arg2, String modId, @Nullable ExistingFileHelper existingFileHelper) {
        super(arg, arg2, modId, existingFileHelper);
    }

    @Override
    protected void addTags() {
        this.tag(COTags.Conventional.Items.TOOLS)
                .add(COItems.OBSIDIAN_AXE.get())
                .add(COItems.OBSIDIAN_HOE.get())
                .add(COItems.OBSIDIAN_PICKAXE.get())
                .add(COItems.OBSIDIAN_SHOVEL.get())
                .add(COItems.OBSIDIAN_SWORD.get())
                .addOptionalTag(COTags.Conventional.Items.TOOLS.location());
        this.tag(COTags.Conventional.Items.Tools.MELEE_WEAPON)
                .add(COItems.OBSIDIAN_AXE.get())
                .add(COItems.OBSIDIAN_SWORD.get())
                .addOptionalTag(COTags.Conventional.Items.Tools.MELEE_WEAPON.location());
        this.tag(COTags.Conventional.Items.Tools.MINING_TOOL)
                .add(COItems.OBSIDIAN_PICKAXE.get())
                .addOptionalTag(COTags.Conventional.Items.Tools.MELEE_WEAPON.location());
        this.tag(Tags.Items.TOOLS_AXES)
                .add(COItems.OBSIDIAN_AXE.get())
                .addOptionalTag(Tags.Items.TOOLS_AXES.location());
        this.tag(Tags.Items.TOOLS_HOES)
                .add(COItems.OBSIDIAN_HOE.get())
                .addOptionalTag(Tags.Items.TOOLS_HOES.location());
        this.tag(Tags.Items.TOOLS_PICKAXES)
                .add(COItems.OBSIDIAN_PICKAXE.get())
                .addOptionalTag(Tags.Items.TOOLS_PICKAXES.location());
        this.tag(Tags.Items.TOOLS_SHOVELS)
                .add(COItems.OBSIDIAN_SHOVEL.get())
                .addOptionalTag(Tags.Items.TOOLS_SHOVELS.location());
        this.tag(Tags.Items.TOOLS_SWORDS)
                .add(COItems.OBSIDIAN_SWORD.get())
                .addOptionalTag(Tags.Items.TOOLS_SWORDS.location());
        this.tag(Tags.Items.TOOLS)
                .add(COItems.OBSIDIAN_AXE.get())
                .add(COItems.OBSIDIAN_PICKAXE.get())
                .add(COItems.OBSIDIAN_HOE.get())
                .add(COItems.OBSIDIAN_SWORD.get())
                .add(COItems.OBSIDIAN_SHOVEL.get())
                .addOptionalTag(Tags.Items.TOOLS.location());
        this.tag(COTags.Conventional.Items.ENCHANTABLES)
                .add(COItems.OBSIDIAN_AXE.get())
                .add(COItems.OBSIDIAN_HOE.get())
                .add(COItems.OBSIDIAN_PICKAXE.get())
                .add(COItems.OBSIDIAN_SHOVEL.get())
                .add(COItems.OBSIDIAN_SWORD.get())
                .addOptionalTag(COTags.Conventional.Items.ENCHANTABLES.location());
        this.tag(COTags.Items.OBSIDIAN_CRAFTING_MATERIALS)
                .add(Items.OBSIDIAN)
                .add(Items.CRYING_OBSIDIAN)
                .addOptionalTag(Tags.Items.OBSIDIAN.location())
                .addOptionalTag(new ResourceLocation("c","obsidians"));
        this.tag(COTags.Items.STICK_CRAFTING_MATERIALS)
                .add(Items.STICK)
                .addOptionalTag(Tags.Items.RODS_WOODEN.location())
                .addOptionalTag(new ResourceLocation("c", "rods/wooden"));
    }
}
