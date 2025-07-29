package dev.satyrn.classicobsidian.forge.data.providers.client.models;

import dev.satyrn.classicobsidian.item.ModItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;
import java.util.function.Supplier;

public final class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(DataGenerator generator, String modid, ExistingFileHelper existingFileHelper) {
        super(generator, modid, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        this.handheldItem(ModItems.OBSIDIAN_AXE);
        this.handheldItem(ModItems.OBSIDIAN_HOE);
        this.handheldItem(ModItems.OBSIDIAN_PICKAXE);
        this.handheldItem(ModItems.OBSIDIAN_SHOVEL);
        this.handheldItem(ModItems.OBSIDIAN_SWORD);
    }

    @SuppressWarnings("UnusedReturnValue")
    private ItemModelBuilder handheldItem(Supplier<? extends Item> item) {
        final @NotNull ResourceLocation id = Objects.requireNonNull(ForgeRegistries.ITEMS.getKey(item.get()));
        return this.withExistingParent(id.toString(), "item/handheld")
                .texture("layer0", new ResourceLocation(id.getNamespace(), "item/" + id.getPath()));
    }
}
