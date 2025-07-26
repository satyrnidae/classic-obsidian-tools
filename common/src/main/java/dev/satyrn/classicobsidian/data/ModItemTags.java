package dev.satyrn.classicobsidian.data;

import dev.satyrn.classicobsidian.ClassicObsidian;
import dev.satyrn.classicobsidian.util.NotInitializable;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public final class ModItemTags {
    public static final TagKey<Item> OBSIDIAN_CRAFTING_MATERIALS = TagKey.create(Registry.ITEM_REGISTRY,
            new ResourceLocation(ClassicObsidian.MOD_ID, "obsidian_crafting_materials"));
    public static final TagKey<Item> STICK_CRAFTING_MATERIALS = TagKey.create(Registry.ITEM_REGISTRY,
            new ResourceLocation(ClassicObsidian.MOD_ID, "stick_crafting_materials"));

    private ModItemTags() {
        NotInitializable.staticClass(ModItemTags.class);
    }
}
