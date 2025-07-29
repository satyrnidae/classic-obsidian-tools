package dev.satyrn.classicobsidian;

import com.google.common.collect.Maps;
import dev.satyrn.classicobsidian.config.ModConfig;
import dev.satyrn.classicobsidian.item.ModItems;
import dev.satyrn.classicobsidian.util.NotInitializable;
import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.YamlConfigSerializer;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.DumperOptions;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.Yaml;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class ClassicObsidian {
    public static final String MOD_ID = "classic_obsidian";
    private static final Logger LOGGER = LogManager.getLogger();

    private ClassicObsidian() {
        NotInitializable.staticClass(ClassicObsidian.class);
    }

    public static void init() {
        final DumperOptions dumperOptions = new DumperOptions();
        dumperOptions.setPrettyFlow(true);
        dumperOptions.setCanonical(false);
        dumperOptions.setDefaultFlowStyle(DumperOptions.FlowStyle.BLOCK);
        dumperOptions.setNonPrintableStyle(DumperOptions.NonPrintableStyle.ESCAPE);
        dumperOptions.setAllowReadOnlyProperties(false);
        dumperOptions.setIndent(4);
        dumperOptions.setIndentWithIndicator(true);
        dumperOptions.setIndicatorIndent(1);
        dumperOptions.setTags(Maps.newHashMap());

        AutoConfig.register(ModConfig.class,
                (config, clazz) -> new YamlConfigSerializer<>(config, clazz, new Yaml(dumperOptions)));

        ModItems.register();
    }

    public static ModConfig getConfig() {
        return AutoConfig.getConfigHolder(ModConfig.class).getConfig();
    }

    public static void info(String message, Object... params) {
        LOGGER.info(message, params);
    }
}
