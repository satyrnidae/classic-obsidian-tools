package dev.satyrn.classicobsidian.forge.data.providers.server.tags;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

public class ModBlockTagsProvider extends BlockTagsProvider {
    public ModBlockTagsProvider(DataGenerator arg, String modId, @Nullable ExistingFileHelper existingFileHelper) {
        super(arg, modId, existingFileHelper);
    }

    @Override
    protected void addTags() { }
}
