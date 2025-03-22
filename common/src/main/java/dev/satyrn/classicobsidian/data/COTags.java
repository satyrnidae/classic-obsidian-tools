package dev.satyrn.classicobsidian.data;

import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class COTags {
    public static final String CONVENTIONAL_MODID = "c";
    public static final String FORGE_MODID = "forge";

    public interface Items {
        TagKey<Item> CONVENTIONAL_TOOL = TagKey.create(Registry.ITEM_REGISTRY,
                new ResourceLocation(CONVENTIONAL_MODID, "tools"));
        TagKey<Item> CONVENTIONAL_TOOLS_MELEE_WEAPON = TagKey.create(Registry.ITEM_REGISTRY,
                new ResourceLocation(CONVENTIONAL_MODID, "tools/melee_weapon"));
        TagKey<Item> CONVENTIONAL_TOOLS_MINING_TOOL = TagKey.create(Registry.ITEM_REGISTRY,
                new ResourceLocation(CONVENTIONAL_MODID, "tools/mining_tool"));
        TagKey<Item> FORGE_TOOLS_AXES = TagKey.create(Registry.ITEM_REGISTRY,
                new ResourceLocation(FORGE_MODID, "tools/axes"));
        TagKey<Item> FORGE_TOOLS_HOES = TagKey.create(Registry.ITEM_REGISTRY,
                new ResourceLocation(FORGE_MODID, "tools/hoes"));
        TagKey<Item> FORGE_TOOLS_PICKAXES = TagKey.create(Registry.ITEM_REGISTRY,
                new ResourceLocation(FORGE_MODID, "tools/pickaxes"));
        TagKey<Item> FORGE_TOOLS_SHOVELS = TagKey.create(Registry.ITEM_REGISTRY,
                new ResourceLocation(FORGE_MODID, "tools/axes"));
        TagKey<Item> FORGE_TOOLS_SWORDS = TagKey.create(Registry.ITEM_REGISTRY,
                new ResourceLocation(FORGE_MODID, "tools/swords"));
    }

}
