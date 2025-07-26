package dev.satyrn.classicobsidian;

import dev.satyrn.classicobsidian.config.ModConfig;
import dev.satyrn.classicobsidian.item.ModItems;
import dev.satyrn.classicobsidian.util.NotInitializable;
import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.GsonConfigSerializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class ClassicObsidian {
    public static final String MOD_ID = "classicobsidian";
    private static final Logger LOGGER = LogManager.getLogger();

    private ClassicObsidian() {
        NotInitializable.staticClass(ClassicObsidian.class);
    }

    public static void init() {
        AutoConfig.register(ModConfig.class, GsonConfigSerializer::new);

        ModItems.register();
    }

    public static ModConfig getConfig() {
        return AutoConfig.getConfigHolder(ModConfig.class).getConfig();
    }

    public static void info(String message, Object...params) {
        LOGGER.info(message, params);
    }
}
