package dev.satyrn.classicobsidian.item;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import dev.satyrn.classicobsidian.ClassicObsidian;
import dev.satyrn.classicobsidian.util.NotInitializable;
import net.minecraft.core.Registry;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;

public final class ModItems {
    public static final RegistrySupplier<Item> OBSIDIAN_SWORD;
    public static final RegistrySupplier<Item> OBSIDIAN_SHOVEL;
    public static final RegistrySupplier<Item> OBSIDIAN_PICKAXE;
    public static final RegistrySupplier<Item> OBSIDIAN_AXE;
    public static final RegistrySupplier<Item> OBSIDIAN_HOE;
    private static final int OBSIDIAN_TOOL_ENCHANTMENT_VALUE = 1;
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ClassicObsidian.MOD_ID,
            Registry.ITEM_REGISTRY);

    static {
        OBSIDIAN_SWORD = ITEMS.register("obsidian_sword", () -> new SwordItem(ModTiers.OBSIDIAN, 3, -2.4F,
                new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)) {
            @Override
            public int getEnchantmentValue() {
                return OBSIDIAN_TOOL_ENCHANTMENT_VALUE;
            }

            @Override
            public boolean isEnchantable(ItemStack itemStack) {
                return true;
            }

            @Override
            public float getDestroySpeed(ItemStack stack, BlockState state) {
                if (state.is(Blocks.COBWEB)) {
                    return ClassicObsidian.getConfig().getTools().getSwordCobwebSpeed();
                } else {
                    Material material = state.getMaterial();
                    return material != Material.PLANT &&
                            material != Material.REPLACEABLE_PLANT &&
                            !state.is(BlockTags.LEAVES) &&
                            material != Material.VEGETABLE ? 1.0F : 1.5F;
                }
            }
        });
        OBSIDIAN_SHOVEL = ITEMS.register("obsidian_shovel", () -> new ShovelItem(ModTiers.OBSIDIAN, 1.5F, -3,
                new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)) {
            @Override
            public boolean isValidRepairItem(ItemStack itemStack, ItemStack itemStack2) {
                return false;
            }

            @Override
            public int getEnchantmentValue() {
                return OBSIDIAN_TOOL_ENCHANTMENT_VALUE;
            }

            @Override
            public boolean isEnchantable(ItemStack itemStack) {
                return true;
            }
        });
        OBSIDIAN_PICKAXE = ITEMS.register("obsidian_pickaxe", () -> new PickaxeItem(ModTiers.OBSIDIAN, 1, -2.8F,
                new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)) {
            @Override
            public boolean isValidRepairItem(ItemStack itemStack, ItemStack itemStack2) {
                return false;
            }

            @Override
            public int getEnchantmentValue() {
                return OBSIDIAN_TOOL_ENCHANTMENT_VALUE;
            }

            @Override
            public boolean isEnchantable(ItemStack itemStack) {
                return true;
            }
        });
        OBSIDIAN_AXE = ITEMS.register("obsidian_axe",
                () -> new AxeItem(ModTiers.OBSIDIAN, 7, -3.2F, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)) {
                    @Override
                    public boolean isValidRepairItem(ItemStack itemStack, ItemStack itemStack2) {
                        return false;
                    }

                    @Override
                    public int getEnchantmentValue() {
                        return OBSIDIAN_TOOL_ENCHANTMENT_VALUE;
                    }

                    @Override
                    public boolean isEnchantable(ItemStack itemStack) {
                        return true;
                    }
                });
        OBSIDIAN_HOE = ITEMS.register("obsidian_hoe", () -> {
            final HoeItem item = new HoeItem(ModTiers.OBSIDIAN, -1, -2,
                    new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)) {
                @Override
                public boolean isValidRepairItem(ItemStack itemStack, ItemStack itemStack2) {
                    return false;
                }

                @Override
                public int getEnchantmentValue() {
                    return OBSIDIAN_TOOL_ENCHANTMENT_VALUE;
                }

                @Override
                public boolean isEnchantable(ItemStack itemStack) {
                    return true;
                }
            };
            return item;
        });
    }

    private ModItems() {
        NotInitializable.staticClass(ModItems.class);
    }

    public static void register() {
        ITEMS.register();
    }
}
