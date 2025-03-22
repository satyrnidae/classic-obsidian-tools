package dev.satyrn.classicobsidian;

import dev.satyrn.classicobsidian.item.COItems;

public final class COModCommon {
    public static final String MOD_ID = "classicobsidian";

    public static void init() {
        COItems.register();
    }
}
