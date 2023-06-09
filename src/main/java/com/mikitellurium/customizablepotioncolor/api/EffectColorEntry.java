package com.mikitellurium.customizablepotioncolor.api;

public class EffectColorEntry {

    public static final String DEFAULT = "default";
    public static final String OLD = "old";

    private final TelluriumConfig.ConfigEntry<String> setting;
    private final String defaultColor;
    private final String oldColor;

    public EffectColorEntry(TelluriumConfig.Builder builder, String key, String defaultColor) {
        this(builder, key, defaultColor, defaultColor);
    }

    public EffectColorEntry(TelluriumConfig.Builder builder, String key, String defaultColor, String oldColor) {
        this.setting = builder.define(key, DEFAULT);
        this.defaultColor = defaultColor;
        this.oldColor = oldColor;
    }

    public EffectColorEntry comment(String comment) {
        setting.comment(comment);
        return this;
    }

    public TelluriumConfig.ConfigEntry<String> getConfigEntry() {
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
