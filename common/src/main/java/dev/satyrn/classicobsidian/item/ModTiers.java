package dev.satyrn.classicobsidian.item;

import dev.satyrn.classicobsidian.ClassicObsidian;
import dev.satyrn.classicobsidian.data.ModItemTags;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

public enum ModTiers implements Tier {
    OBSIDIAN;

    @Override
    public int getUses() {
        return ClassicObsidian.getConfig().getTools().getToolUses();
    }

    @Override
    public float getSpeed() {
        return ClassicObsidian.getConfig().getTools().getMiningSpeed();
    }

    @Override
    public float getAttackDamageBonus() {
        return ClassicObsidian.getConfig().getTools().getToolAttackBonus();
    }

    @Override
    public int getLevel() {
        return ClassicObsidian.getConfig().getTools().getToolEffectivenessInt();
    }

    @Override
    public int getEnchantmentValue() {
        return ClassicObsidian.getConfig().getTools().getEnchantability();
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.of(ModItemTags.OBSIDIAN_CRAFTING_MATERIALS);
    }
}
