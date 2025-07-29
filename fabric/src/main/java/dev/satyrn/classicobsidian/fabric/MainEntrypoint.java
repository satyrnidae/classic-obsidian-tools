package dev.satyrn.classicobsidian.fabric;

import dev.satyrn.classicobsidian.fabriclike.FabricLike;
import net.fabricmc.api.ModInitializer;

public final class MainEntrypoint implements ModInitializer {
    @Override
    public void onInitialize() {
        FabricLike.init();
    }
}
