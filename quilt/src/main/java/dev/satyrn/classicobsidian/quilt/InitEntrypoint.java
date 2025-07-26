package dev.satyrn.classicobsidian.quilt;

import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;

import dev.satyrn.classicobsidian.fabriclike.FabricLike;

public final class InitEntrypoint implements ModInitializer {
    @Override
    public void onInitialize(ModContainer mod) {
        // Run the Fabric-like setup.
        FabricLike.init();
    }
}
