package dev.satyrn.classicobsidian.forge;

import dev.architectury.platform.forge.EventBuses;
import dev.satyrn.classicobsidian.ClassicObsidianCommon;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(ClassicObsidianCommon.MOD_ID)
public final class ClassicObsidianForge {
    public ClassicObsidianForge() {
        // Submit our event bus to let Architectury API register our content on the right time.
        EventBuses.registerModEventBus(ClassicObsidianCommon.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());

        // Run our common setup.
        ClassicObsidianCommon.init();
    }
}
