package dev.satyrn.classicobsidian.forge.data.providers.client.models;

import dev.satyrn.classicobsidian.item.COItems;
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

public class COItemModelProvider extends ItemModelProvider {
    public COItemModelProvider(DataGenerator generator, String modid, ExistingFileHelper existingFileHelper) {
        super(generator, modid, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        this.handheldItem(COItems.OBSIDIAN_AXE);
        this.handheldItem(COItems.OBSIDIAN_HOE);
        this.handheldItem(COItems.OBSIDIAN_PICKAXE);
        this.handheldItem(COItems.OBSIDIAN_SHOVEL);
        this.handheldItem(COItems.OBSIDIAN_SWORD);
    }

    @SuppressWarnings("UnusedReturnValue")
    private ItemModelBuilder handheldItem(Supplier<? extends Item> item)
    {
        final @NotNull ResourceLocation id = Objects.requireNonNull(ForgeRegistries.ITEMS.getKey(item.get()));
        return this.withExistingParent(id.toString(), "item/handheld")
                .texture("layer0", new ResourceLocation(id.getNamespace(), "item/" + id.getPath()));
    }
}
