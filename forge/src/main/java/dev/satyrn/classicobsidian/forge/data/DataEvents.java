package dev.satyrn.classicobsidian.forge.data;

import dev.satyrn.classicobsidian.ClassicObsidian;
import dev.satyrn.classicobsidian.forge.data.providers.client.lang.ModUSEnglishLanguageProvider;
import dev.satyrn.classicobsidian.forge.data.providers.server.recipes.ModRecipeProvider;
import dev.satyrn.classicobsidian.forge.data.providers.server.tags.ModBlockTagsProvider;
import dev.satyrn.classicobsidian.forge.data.providers.client.models.ModItemModelProvider;
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
        final var blockTagsProvider = new ModBlockTagsProvider(event.getGenerator(), event.getModContainer().getModId(), event.getExistingFileHelper());
        event.getGenerator().addProvider(event.includeServer(), blockTagsProvider);
        event.getGenerator().addProvider(event.includeServer(), new ModItemTagsProvider(event.getGenerator(), blockTagsProvider, event.getModContainer().getModId(), event.getExistingFileHelper()));
        event.getGenerator().addProvider(event.includeClient(), new ModItemModelProvider(event.getGenerator(), event.getModContainer().getModId(), event.getExistingFileHelper()));
        event.getGenerator().addProvider(event.includeClient(), new ModUSEnglishLanguageProvider(event.getGenerator(), event.getModContainer().getModId()));
        event.getGenerator().addProvider(event.includeServer(), new ModRecipeProvider(event.getGenerator()));
    }
}
