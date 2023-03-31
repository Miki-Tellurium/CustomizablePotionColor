package com.mikitellurium.customizablepotioncolor.api;

public class EffectColorEntry {

    private final ConfigManager.ConfigEntry<String> defaultColor;
    private final String oldColor;

    public EffectColorEntry(ConfigManager.Builder builder, String key, String defaultColor) {
        this.defaultColor = builder.define(key, defaultColor, "default");
        this.oldColor = defaultColor;
    }

    public EffectColorEntry(ConfigManager.Builder builder, String key, String defaultColor, String oldColor) {
        this.defaultColor = builder.define(key, defaultColor, "default");
        this.oldColor = oldColor;
    }

    public EffectColorEntry comment(String comment) {
        defaultColor.comment(comment);
        return this;
    }

    public ConfigManager.ConfigEntry<String> getConfigEntry() {
        return defaultColor;
    }

    public String getValue() {
        return defaultColor.getValue();
    }

    public String getDefaultValue() {
        return defaultColor.getDefaultValue();
    }

    public String getOldValue() {
        return oldColor;
    }

}
