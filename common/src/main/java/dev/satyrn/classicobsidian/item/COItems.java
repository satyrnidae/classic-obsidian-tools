package dev.satyrn.classicobsidian.item;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import dev.satyrn.classicobsidian.COModCommon;
import dev.satyrn.classicobsidian.mixin.ItemAccessor;
import net.minecraft.core.Registry;
import net.minecraft.world.item.*;

public class COItems {
    private static final int OBSIDIAN_TOOL_ENCHANTMENT_VALUE = 1;

    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(COModCommon.MOD_ID,
            Registry.ITEM_REGISTRY);

    public static final RegistrySupplier<SwordItem> OBSIDIAN_SWORD = ITEMS.register("obsidian_sword", () -> {
        final SwordItem item = new SwordItem(Tiers.STONE, 3, -2.4F, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)) {
            @Override
            public int getEnchantmentValue() {
                return OBSIDIAN_TOOL_ENCHANTMENT_VALUE;
            }

            @Override
            public boolean isEnchantable(ItemStack itemStack) {
                return true;
            }
        };
        ((ItemAccessor)item).setMaxDamage(0);
        return item;
    });
    public static final RegistrySupplier<ShovelItem> OBSIDIAN_SHOVEL = ITEMS.register("obsidian_shovel", () -> {
        final ShovelItem item = new ShovelItem(Tiers.STONE, 1.5F, -3, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)) {
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
        ((ItemAccessor)item).setMaxDamage(0);
        return item;
    });
    public static final RegistrySupplier<PickaxeItem> OBSIDIAN_PICKAXE = ITEMS.register("obsidian_pickaxe", () -> {
        final PickaxeItem item = new PickaxeItem(Tiers.STONE, 1, -2.8F, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)) {
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
        ((ItemAccessor)item).setMaxDamage(0);
        return item;
    });
    public static final RegistrySupplier<AxeItem> OBSIDIAN_AXE = ITEMS.register("obsidian_axe", () -> {
       final AxeItem item = new AxeItem(Tiers.STONE, 7, -3.2F, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)) {
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
        ((ItemAccessor)item).setMaxDamage(0);
        return item;
    });
    public static final RegistrySupplier<HoeItem> OBSIDIAN_HOE = ITEMS.register("obsidian_hoe", () -> {
        final HoeItem item = new HoeItem(Tiers.STONE, -1, -2, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)) {
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
        ((ItemAccessor)item).setMaxDamage(0);
        return item;
    });

    public static void register() {
        ITEMS.register();
    }
}
