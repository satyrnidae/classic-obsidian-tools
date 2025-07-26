package dev.satyrn.classicobsidian.forge.data.providers.server.tags;

import dev.satyrn.classicobsidian.data.ConventionalItemTags;
import dev.satyrn.classicobsidian.data.ModItemTags;
import dev.satyrn.classicobsidian.item.ModItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

public class ModItemTagsProvider extends ItemTagsProvider {

    public ModItemTagsProvider(DataGenerator arg, BlockTagsProvider arg2, String modId, @Nullable ExistingFileHelper existingFileHelper) {
        super(arg, arg2, modId, existingFileHelper);
    }

    @Override
    protected void addTags() {
        this.tag(ConventionalItemTags.TOOLS)
                .add(ModItems.OBSIDIAN_AXE.get())
                .add(ModItems.OBSIDIAN_HOE.get())
                .add(ModItems.OBSIDIAN_PICKAXE.get())
                .add(ModItems.OBSIDIAN_SHOVEL.get())
                .add(ModItems.OBSIDIAN_SWORD.get());
        this.tag(ConventionalItemTags.Tools.MELEE_WEAPON)
                .add(ModItems.OBSIDIAN_AXE.get())
                .add(ModItems.OBSIDIAN_SWORD.get());
        this.tag(ConventionalItemTags.Tools.MINING_TOOL)
                .add(ModItems.OBSIDIAN_PICKAXE.get());
        this.tag(Tags.Items.TOOLS_AXES)
                .add(ModItems.OBSIDIAN_AXE.get());
        this.tag(Tags.Items.TOOLS_HOES)
                .add(ModItems.OBSIDIAN_HOE.get());
        this.tag(Tags.Items.TOOLS_PICKAXES)
                .add(ModItems.OBSIDIAN_PICKAXE.get());
        this.tag(Tags.Items.TOOLS_SHOVELS)
                .add(ModItems.OBSIDIAN_SHOVEL.get());
        this.tag(Tags.Items.TOOLS_SWORDS)
                .add(ModItems.OBSIDIAN_SWORD.get());
        this.tag(Tags.Items.TOOLS)
                .add(ModItems.OBSIDIAN_AXE.get())
                .add(ModItems.OBSIDIAN_PICKAXE.get())
                .add(ModItems.OBSIDIAN_HOE.get())
                .add(ModItems.OBSIDIAN_SWORD.get())
                .add(ModItems.OBSIDIAN_SHOVEL.get());
        this.tag(ConventionalItemTags.ENCHANTABLES)
                .add(ModItems.OBSIDIAN_AXE.get())
                .add(ModItems.OBSIDIAN_HOE.get())
                .add(ModItems.OBSIDIAN_PICKAXE.get())
                .add(ModItems.OBSIDIAN_SHOVEL.get())
                .add(ModItems.OBSIDIAN_SWORD.get());
        this.tag(ModItemTags.OBSIDIAN_CRAFTING_MATERIALS)
                .add(Items.OBSIDIAN)
                .add(Items.CRYING_OBSIDIAN)
                .addOptionalTag(Tags.Items.OBSIDIAN.location())
                .addOptionalTag(new ResourceLocation("c","obsidians"));
        this.tag(ModItemTags.STICK_CRAFTING_MATERIALS)
                .add(Items.STICK)
                .addOptionalTag(Tags.Items.RODS_WOODEN.location())
                .addOptionalTag(new ResourceLocation("c", "rods/wooden"));
    }
}
