package dev.satyrn.classicobsidian.forge;

import dev.architectury.platform.forge.EventBuses;
import dev.satyrn.classicobsidian.COModCommon;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.jetbrains.annotations.NotNull;

@Mod(COModCommon.MOD_ID)
public final class COModForge {
    public COModForge(final @NotNull FMLJavaModLoadingContext modLoadingContext) {
        // Submit our event bus to let Architectury API register our content on the right time.
        EventBuses.registerModEventBus(COModCommon.MOD_ID, modLoadingContext.getModEventBus());

        // Run our common setup.
        COModCommon.init();
    }
}
