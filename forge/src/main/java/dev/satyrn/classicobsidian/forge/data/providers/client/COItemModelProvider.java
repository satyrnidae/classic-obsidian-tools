package dev.satyrn.classicobsidian.forge.data.providers.client;

import dev.satyrn.classicobsidian.item.COItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class COItemModelProvider extends ItemModelProvider {
    public COItemModelProvider(DataGenerator generator, String modid, ExistingFileHelper existingFileHelper) {
        super(generator, modid, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        this.handheldItem(COItems.OBSIDIAN_AXE.get());
        this.handheldItem(COItems.OBSIDIAN_HOE.get());
        this.handheldItem(COItems.OBSIDIAN_PICKAXE.get());
        this.handheldItem(COItems.OBSIDIAN_SHOVEL.get());
        this.handheldItem(COItems.OBSIDIAN_SWORD.get());
    }

    private ItemModelBuilder handheldItem(Item item)
    {
        final @NotNull ResourceLocation id = Objects.requireNonNull(ForgeRegistries.ITEMS.getKey(item));

        return getBuilder(id.toString())
                .parent(new ModelFile.UncheckedModelFile("item/handheld"))
                .texture("layer0", new ResourceLocation(id.getNamespace(), "item/" + id.getPath()));
    }


}
