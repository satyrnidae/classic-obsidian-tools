package dev.satyrn.classicobsidian.config;

public enum VillagerTradeLevels {

    NOVICE(1), APPRENTICE(2), JOURNEYMAN(3), EXPERT(4), MASTER(5);

    private final int value;

    VillagerTradeLevels(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
}
