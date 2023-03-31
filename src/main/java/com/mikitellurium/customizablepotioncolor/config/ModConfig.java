package com.mikitellurium.customizablepotioncolor.config;

import com.mikitellurium.customizablepotioncolor.CustomizablePotionColorMod;
import com.mikitellurium.customizablepotioncolor.api.ConfigManager;

import java.io.IOException;

public class ModConfig {

    public static ConfigManager.Builder CONFIGS = new ConfigManager.Builder(CustomizablePotionColorMod.MOD_ID);

    public static ConfigManager.ConfigEntry<String> CUSTOM_EFFECT;

    public static void registerConfig() throws IOException {
        CONFIGS.comment("Customizable Potion Color Config File")
                .comment("Customize potions by using hex color values");

        CUSTOM_EFFECT = CONFIGS.define("customEffect", "#F93A00")
                .comment("Custom effect color value");

        CONFIGS.build();
    }

}
