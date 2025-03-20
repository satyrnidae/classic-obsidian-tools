package dev.satyrn.classicobsidian.fabric.client;

import dev.satyrn.classicobsidian.fabriclike.client.ClassicObsidianFabricLikeClient;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public final class ClassicObsidianFabricClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        // This entrypoint is suitable for setting up client-specific logic, such as rendering.
        ClassicObsidianFabricLikeClient.init();
    }
}
