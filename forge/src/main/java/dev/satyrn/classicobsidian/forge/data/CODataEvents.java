package dev.satyrn.classicobsidian.forge.data;

import dev.satyrn.classicobsidian.COModCommon;
import dev.satyrn.classicobsidian.forge.data.providers.client.lang.COLanguageProvider;
import dev.satyrn.classicobsidian.forge.data.providers.server.recipes.CORecipeProvider;
import dev.satyrn.classicobsidian.forge.data.providers.server.tags.COBlockTagsProvider;
import dev.satyrn.classicobsidian.forge.data.providers.client.models.COItemModelProvider;
import dev.satyrn.classicobsidian.forge.data.providers.server.tags.COItemTagsProvider;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.jetbrains.annotations.NotNull;

@Mod.EventBusSubscriber(modid = COModCommon.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class CODataEvents {
    @SubscribeEvent
    static void onGatherData(final @NotNull GatherDataEvent event) {
        final var blockTagsProvider = new COBlockTagsProvider(event.getGenerator(), event.getModContainer().getModId(), event.getExistingFileHelper());
        event.getGenerator().addProvider(event.includeServer(), blockTagsProvider);
        event.getGenerator().addProvider(event.includeServer(), new COItemTagsProvider(event.getGenerator(), blockTagsProvider, event.getModContainer().getModId(), event.getExistingFileHelper()));
        event.getGenerator().addProvider(event.includeClient(), new COItemModelProvider(event.getGenerator(), event.getModContainer().getModId(), event.getExistingFileHelper()));
        event.getGenerator().addProvider(event.includeClient(), new COLanguageProvider(event.getGenerator(), event.getModContainer().getModId()));
        event.getGenerator().addProvider(event.includeServer(), new CORecipeProvider(event.getGenerator()));
    }
}
