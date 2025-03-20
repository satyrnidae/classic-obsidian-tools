package dev.satyrn.classicobsidian.quilt.client;

import dev.satyrn.classicobsidian.fabriclike.client.ClassicObsidianFabricLikeClient;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.loader.api.minecraft.ClientOnly;
import org.quiltmc.qsl.base.api.entrypoint.client.ClientModInitializer;

@ClientOnly
public final class ClassicObsidianQuiltClient implements ClientModInitializer {
    @Override
    public void onInitializeClient(ModContainer mod) {
        // Run the Fabric-like setup.
        ClassicObsidianFabricLikeClient.init();
    }
}
