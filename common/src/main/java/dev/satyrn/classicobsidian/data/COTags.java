package dev.satyrn.classicobsidian.data;

import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public final class COTags {
    private COTags() {}

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
                public static final String PATH = "tools/";

                public static final TagKey<Item> MELEE_WEAPON = TagKey.create(Registry.ITEM_REGISTRY,
                        new ResourceLocation(Conventional.MOD_ID, Tools.PATH + "melee_weapon"));
                public static final TagKey<Item> MINING_TOOL = TagKey.create(Registry.ITEM_REGISTRY,
                        new ResourceLocation(Conventional.MOD_ID, Tools.PATH + "mining_tool"));
            }
        }
    }

    public static final class Forge {
        private Forge() {}

        public static final String MOD_ID = "forge";

        public static final class Items {
            private Items() {}

            public static final class Tools {
                public static final String PATH = "tools/";

                public static final TagKey<Item> AXES = TagKey.create(Registry.ITEM_REGISTRY,
                        new ResourceLocation(Forge.MOD_ID, Tools.PATH + "axes"));
                public static final TagKey<Item> HOES = TagKey.create(Registry.ITEM_REGISTRY,
                        new ResourceLocation(Forge.MOD_ID, Tools.PATH + "hoes"));
                public static final TagKey<Item> PICKAXES = TagKey.create(Registry.ITEM_REGISTRY,
                        new ResourceLocation(Forge.MOD_ID, Tools.PATH + "pickaxes"));
                public static final TagKey<Item> SHOVELS = TagKey.create(Registry.ITEM_REGISTRY,
                        new ResourceLocation(Forge.MOD_ID, Tools.PATH + "axes"));
                public static final TagKey<Item> SWORDS = TagKey.create(Registry.ITEM_REGISTRY,
                        new ResourceLocation(Forge.MOD_ID, Tools.PATH + "swords"));
            }
        }
    }
}
