package dev.satyrn.classicobsidian.quilt;

import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;

import dev.satyrn.classicobsidian.fabriclike.COModFabricLike;

public final class COModQuilt implements ModInitializer {
    @Override
    public void onInitialize(ModContainer mod) {
        // Run the Fabric-like setup.
        COModFabricLike.init();
    }
}
