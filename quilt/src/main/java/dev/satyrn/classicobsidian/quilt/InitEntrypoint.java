package dev.satyrn.classicobsidian.quilt;

import dev.satyrn.classicobsidian.fabriclike.FabricLike;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;

public final class InitEntrypoint implements ModInitializer {
    @Override
    public void onInitialize(ModContainer mod) {
        // Run the Fabric-like setup.
        FabricLike.init();
    }
}
