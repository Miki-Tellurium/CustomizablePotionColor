package com.mikitellurium.customizablepotioncolor.api;

public class EffectColorEntry {

    private final ConfigManager.ConfigEntry<String> setting;
    private final String defaultColor;
    private final String oldColor;

    public EffectColorEntry(ConfigManager.Builder builder, String key, String defaultColor) {
        this(builder, key, defaultColor, defaultColor);
    }

    public EffectColorEntry(ConfigManager.Builder builder, String key, String defaultColor, String oldColor) {
        this.setting = builder.define(key, "default");
        this.defaultColor = defaultColor;
        this.oldColor = oldColor;
    }

    public EffectColorEntry comment(String comment) {
        setting.comment(comment);
        return this;
    }

    public ConfigManager.ConfigEntry<String> getConfigEntry() {
        return setting;
    }

    public String getValue() {
        return setting.getValue();
    }

    public String getDefaultValue() {
        return defaultColor;
    }

    public String getOldValue() {
        return oldColor;
    }

}
