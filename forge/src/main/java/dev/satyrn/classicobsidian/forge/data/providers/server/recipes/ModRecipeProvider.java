package dev.satyrn.classicobsidian.forge.data.providers.server.recipes;

import dev.satyrn.classicobsidian.data.ModItemTags;
import dev.satyrn.classicobsidian.item.ModItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.registries.ForgeRegistries;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;
import java.util.function.Consumer;

public final class ModRecipeProvider extends RecipeProvider {
    public ModRecipeProvider(DataGenerator arg) {
        super(arg);
    }

    @Override
    protected void buildCraftingRecipes(@NotNull Consumer<FinishedRecipe> consumer) {
        {
            final @NotNull ResourceLocation obsidianAxeId = Objects.requireNonNull(
                    ForgeRegistries.ITEMS.getKey(ModItems.OBSIDIAN_AXE.get()));
            ShapedRecipeBuilder.shaped(ModItems.OBSIDIAN_AXE.get())
                    .group(obsidianAxeId.getPath())
                    .pattern("XX")
                    .pattern("X#")
                    .pattern(" #")
                    .define('X', Ingredient.of(ModItemTags.OBSIDIAN_CRAFTING_MATERIALS))
                    .define('#', Ingredient.of(ModItemTags.STICK_CRAFTING_MATERIALS))
                    .unlockedBy("has_obsidian", has(ModItemTags.OBSIDIAN_CRAFTING_MATERIALS))
                    .save(consumer, obsidianAxeId);
        }

        {
            final @NotNull ResourceLocation obsidianHoeId = Objects.requireNonNull(
                    ForgeRegistries.ITEMS.getKey(ModItems.OBSIDIAN_HOE.get()));
            ShapedRecipeBuilder.shaped(ModItems.OBSIDIAN_HOE.get())
                    .group(obsidianHoeId.getPath())
                    .pattern("XX")
                    .pattern(" #")
                    .pattern(" #")
                    .define('X', Ingredient.of(ModItemTags.OBSIDIAN_CRAFTING_MATERIALS))
                    .define('#', Ingredient.of(ModItemTags.STICK_CRAFTING_MATERIALS))
                    .unlockedBy("has_obsidian", has(ModItemTags.OBSIDIAN_CRAFTING_MATERIALS))
                    .save(consumer, obsidianHoeId);
        }

        {
            final @NotNull ResourceLocation obsidianPickaxeId = Objects.requireNonNull(
                    ForgeRegistries.ITEMS.getKey(ModItems.OBSIDIAN_PICKAXE.get()));
            ShapedRecipeBuilder.shaped(ModItems.OBSIDIAN_PICKAXE.get())
                    .group(obsidianPickaxeId.getPath())
                    .pattern("XXX")
                    .pattern(" # ")
                    .pattern(" # ")
                    .define('X', Ingredient.of(ModItemTags.OBSIDIAN_CRAFTING_MATERIALS))
                    .define('#', Ingredient.of(ModItemTags.STICK_CRAFTING_MATERIALS))
                    .unlockedBy("has_obsidian", has(ModItemTags.OBSIDIAN_CRAFTING_MATERIALS))
                    .save(consumer, obsidianPickaxeId);
        }

        {
            final @NotNull ResourceLocation obsidianShovelId = Objects.requireNonNull(
                    ForgeRegistries.ITEMS.getKey(ModItems.OBSIDIAN_SHOVEL.get()));
            ShapedRecipeBuilder.shaped(ModItems.OBSIDIAN_SHOVEL.get())
                    .group(obsidianShovelId.getPath())
                    .pattern("X")
                    .pattern("#")
                    .pattern("#")
                    .define('X', Ingredient.of(ModItemTags.OBSIDIAN_CRAFTING_MATERIALS))
                    .define('#', Ingredient.of(ModItemTags.STICK_CRAFTING_MATERIALS))
                    .unlockedBy("has_obsidian", has(ModItemTags.OBSIDIAN_CRAFTING_MATERIALS))
                    .save(consumer, obsidianShovelId);
        }

        {
            final @NotNull ResourceLocation obsidianSwordId = Objects.requireNonNull(
                    ForgeRegistries.ITEMS.getKey(ModItems.OBSIDIAN_SWORD.get()));
            ShapedRecipeBuilder.shaped(ModItems.OBSIDIAN_SWORD.get())
                    .group(obsidianSwordId.getPath())
                    .pattern("X")
                    .pattern("X")
                    .pattern("#")
                    .define('X', Ingredient.of(ModItemTags.OBSIDIAN_CRAFTING_MATERIALS))
                    .define('#', Ingredient.of(ModItemTags.STICK_CRAFTING_MATERIALS))
                    .unlockedBy("has_obsidian", has(ModItemTags.OBSIDIAN_CRAFTING_MATERIALS))
                    .save(consumer, obsidianSwordId);
        }
    }
}
