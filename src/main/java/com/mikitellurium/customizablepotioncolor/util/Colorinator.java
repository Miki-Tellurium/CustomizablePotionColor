package com.mikitellurium.customizablepotioncolor.util;

import com.mikitellurium.customizablepotioncolor.api.TelluriumConfig;
import com.mikitellurium.customizablepotioncolor.config.VanillaPotionConfig;
import net.minecraft.entity.effect.StatusEffect;

public class Colorinator {

    public static int getEffectColor(StatusEffect effect, TelluriumConfig.ConfigEntry<String> setting) {
        return getEffectColor(effect, setting.getValue());
    }

    public static int getEffectColor(StatusEffect effect, String value) {
        if (value.equals(VanillaPotionConfig.DEFAULT)) {
            return ColorsRegistry.getDefaultColorByEffect(effect);
        } else if (value.equals(VanillaPotionConfig.OLD)) {
            return ColorsRegistry.getLegacyColorByEffect(effect);
        } else {
            return getColorFromHex(value);
        }
    }

    public static int getColorFromHex(TelluriumConfig.ConfigEntry<String> setting) {
        return getColorFromHex(setting.getValue());
    }

    public static int getColorFromHex(String value) {
        if (value.indexOf('#') == 0) {
            String s = value.substring(1);
            String colorString = "0x" + s;
            return Integer.parseInt(colorString.substring(2),16);
        }

        throw new IllegalArgumentException("Invalid color value specified in config: " +
                VanillaPotionConfig.VANILLA_POTIONS_CONFIGS.getConfigFilePath());
    }

    public static String getHexString(int color) {
        String hexColor = Integer.toHexString(color).toUpperCase();
        return "#" + hexColor;
    }

}
