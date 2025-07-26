package dev.satyrn.classicobsidian.data;

import dev.satyrn.classicobsidian.COModCommon;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public final class COTags {
    private COTags() {}

    public static final class Items {
        private Items() {}

        public static final TagKey<Item> OBSIDIAN_CRAFTING_MATERIALS = TagKey.create(Registry.ITEM_REGISTRY, new ResourceLocation(COModCommon.MOD_ID, "obsidian_crafting_materials"));
        public static final TagKey<Item> STICK_CRAFTING_MATERIALS = TagKey.create(Registry.ITEM_REGISTRY, new ResourceLocation(COModCommon.MOD_ID, "stick_crafting_materials"));
    }

    public static final class Conventional {
        private Conventional() {}

        public static final String MOD_ID = "c";

        public static final class Items {
            private Items() {}

            public static final TagKey<Item> TOOLS = TagKey.create(Registry.ITEM_REGISTRY,
                    new ResourceLocation(Conventional.MOD_ID, "tools"));
            public static final TagKey<Item> ENCHANTABLES = TagKey.create(Registry.ITEM_REGISTRY,
                    new ResourceLocation(Conventional.MOD_ID, "enchantables"));

            public static final class Tools {
                static final String PATH = "tools/";

                public static final TagKey<Item> MELEE_WEAPON = TagKey.create(Registry.ITEM_REGISTRY,
                        new ResourceLocation(Conventional.MOD_ID, Tools.PATH + "melee_weapon"));
                public static final TagKey<Item> MINING_TOOL = TagKey.create(Registry.ITEM_REGISTRY,
                        new ResourceLocation(Conventional.MOD_ID, Tools.PATH + "mining_tool"));
            }
        }
    }
}
