package dev.satyrn.classicobsidian.config;

public enum ToolEffectivenessTier {
    WOOD(0), STONE(1), IRON(2), GOLD(0), DIAMOND(3), NETHERITE(4);

    private final int effectiveness;

    ToolEffectivenessTier(int effectiveness) {
        this.effectiveness = effectiveness;
    }

    public int getEffectiveness() {
        return this.effectiveness;
    }
}
