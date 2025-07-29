package dev.satyrn.classicobsidian.config;

public interface ApplyCopy<T extends ApplyCopy<T>> {
    void copyFrom(T other);
}
