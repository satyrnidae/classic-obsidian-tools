package dev.satyrn.classicobsidian.data;

import dev.satyrn.classicobsidian.util.NotInitializable;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public final class ConventionalItemTags {
    public static final String CONVENTIONAL = "c";
    public static final TagKey<Item> TOOLS = TagKey.create(Registry.ITEM_REGISTRY,
            new ResourceLocation(CONVENTIONAL, "tools"));
    public static final TagKey<Item> ENCHANTABLES = TagKey.create(Registry.ITEM_REGISTRY,
            new ResourceLocation(CONVENTIONAL, "enchantables"));

    private ConventionalItemTags() {
        NotInitializable.staticClass(ConventionalItemTags.class);
    }

    public static final class Tools {
        static final String PATH = "tools/";

        public static final TagKey<Item> MELEE_WEAPON = TagKey.create(Registry.ITEM_REGISTRY,
                new ResourceLocation(CONVENTIONAL, Tools.PATH + "melee_weapon"));
        public static final TagKey<Item> MINING_TOOL = TagKey.create(Registry.ITEM_REGISTRY,
                new ResourceLocation(CONVENTIONAL, Tools.PATH + "mining_tool"));
    }
}
