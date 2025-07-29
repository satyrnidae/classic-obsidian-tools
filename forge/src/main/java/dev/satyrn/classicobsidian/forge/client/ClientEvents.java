package dev.satyrn.classicobsidian.forge.client;

import dev.satyrn.classicobsidian.ClassicObsidian;
import dev.satyrn.classicobsidian.config.ModConfig;
import dev.satyrn.classicobsidian.util.NotInitializable;
import me.shedaniel.autoconfig.AutoConfig;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.ConfigScreenHandler;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(value = Dist.CLIENT, modid = ClassicObsidian.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public final class ClientEvents {
    private ClientEvents() {
        NotInitializable.staticClass(ClientEvents.class);
    }

    @SubscribeEvent
    @Deprecated(forRemoval = true, since = "1.21.1")
    @SuppressWarnings("removal")
    static void onClient(FMLClientSetupEvent event) {
        ModLoadingContext.get()
                .registerExtensionPoint(ConfigScreenHandler.ConfigScreenFactory.class,
                        () -> new ConfigScreenHandler.ConfigScreenFactory(
                                (client, parent) -> AutoConfig.getConfigScreen(ModConfig.class, parent).get()));
    }
}
