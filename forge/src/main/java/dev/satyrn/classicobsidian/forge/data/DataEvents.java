package dev.satyrn.classicobsidian.forge.data;

import dev.satyrn.classicobsidian.ClassicObsidian;
import dev.satyrn.classicobsidian.forge.data.providers.client.lang.ModUSEnglishLanguageProvider;
import dev.satyrn.classicobsidian.forge.data.providers.client.models.ModItemModelProvider;
import dev.satyrn.classicobsidian.forge.data.providers.server.recipes.ModRecipeProvider;
import dev.satyrn.classicobsidian.forge.data.providers.server.tags.ModBlockTagsProvider;
import dev.satyrn.classicobsidian.forge.data.providers.server.tags.ModItemTagsProvider;
import dev.satyrn.classicobsidian.util.NotInitializable;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.jetbrains.annotations.NotNull;

@Mod.EventBusSubscriber(modid = ClassicObsidian.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public final class DataEvents {
    private DataEvents() {
        NotInitializable.staticClass(DataEvents.class);
    }

    @SubscribeEvent
    static void onGatherData(final @NotNull GatherDataEvent event) {
        final var generator = event.getGenerator();
        final var modId = event.getModContainer().getModId();
        final var existingFileHelper = event.getExistingFileHelper();
        if (event.includeServer()) {
            final var blockTagsProvider = new ModBlockTagsProvider(generator, modId, existingFileHelper);
            generator.addProvider(true, blockTagsProvider);
            generator.addProvider(true, new ModItemTagsProvider(generator, blockTagsProvider, modId, existingFileHelper));
            generator.addProvider(true, new ModRecipeProvider(generator));
        }
        if (event.includeClient()) {
            generator.addProvider(true, new ModItemModelProvider(generator, modId, existingFileHelper));
            generator.addProvider(true, new ModUSEnglishLanguageProvider(generator, modId));;
        }
    }
}
