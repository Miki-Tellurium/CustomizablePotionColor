package com.mikitellurium.customizablepotioncolor.util;

import com.mikitellurium.customizablepotioncolor.api.EffectColorEntry;
import com.mikitellurium.customizablepotioncolor.config.ModConfig;

import java.util.ArrayList;
import java.util.List;

public class VanillaEffectsConfigRegistry {

    public static ArrayList<EffectColorEntry> VANILLA_EFFECTS = new ArrayList<>();
    public static EffectColorEntry EFFECT_SPEED;
    public static EffectColorEntry EFFECT_SLOWNESS;
    public static EffectColorEntry EFFECT_HASTE;
    public static EffectColorEntry EFFECT_MINING_FATIGUE;
    public static EffectColorEntry EFFECT_STRENGTH;
    public static EffectColorEntry EFFECT_INSTANT_HEALTH;
    public static EffectColorEntry EFFECT_INSTANT_DAMAGE;
    public static EffectColorEntry EFFECT_JUMP_BOOST;
    public static EffectColorEntry EFFECT_NAUSEA;
    public static EffectColorEntry EFFECT_REGENERATION;
    public static EffectColorEntry EFFECT_RESISTANCE;
    public static EffectColorEntry EFFECT_FIRE_RESISTANCE;
    public static EffectColorEntry EFFECT_WATER_BREATHING;
    public static EffectColorEntry EFFECT_INVISIBILITY;
    public static EffectColorEntry EFFECT_BLINDNESS;
    public static EffectColorEntry EFFECT_NIGHT_VISION;
    public static EffectColorEntry EFFECT_HUNGER;
    public static EffectColorEntry EFFECT_WEAKNESS;
    public static EffectColorEntry EFFECT_POISON;
    public static EffectColorEntry EFFECT_WITHER;
    public static EffectColorEntry EFFECT_HEALTH_BOOST;
    public static EffectColorEntry EFFECT_ABSORPTION;
    public static EffectColorEntry EFFECT_SATURATION;
    public static EffectColorEntry EFFECT_GLOWING;
    public static EffectColorEntry EFFECT_LEVITATION;
    public static EffectColorEntry EFFECT_LUCK;
    public static EffectColorEntry EFFECT_UNLUCK;
    public static EffectColorEntry EFFECT_SLOW_FALLING;
    public static EffectColorEntry EFFECT_CONDUIT_POWER;
    public static EffectColorEntry EFFECT_DOLPHIN_GRACE;
    public static EffectColorEntry EFFECT_BAD_OMEN;
    public static EffectColorEntry EFFECT_HERO_OF_THE_VILLAGE;
    public static EffectColorEntry EFFECT_DARKNESS;

    public static void initEffects() {
        VANILLA_EFFECTS.addAll(List.of(
                EFFECT_SPEED,
                EFFECT_SLOWNESS,
                EFFECT_HASTE,
                EFFECT_MINING_FATIGUE,
                EFFECT_STRENGTH,
                EFFECT_INSTANT_HEALTH,
                EFFECT_INSTANT_DAMAGE,
                EFFECT_JUMP_BOOST,
                EFFECT_NAUSEA,
                EFFECT_REGENERATION,
                EFFECT_RESISTANCE,
                EFFECT_FIRE_RESISTANCE,
                EFFECT_WATER_BREATHING,
                EFFECT_INVISIBILITY,
                EFFECT_BLINDNESS,
                EFFECT_NIGHT_VISION,
                EFFECT_HUNGER,
                EFFECT_WEAKNESS,
                EFFECT_POISON,
                EFFECT_WITHER,
                EFFECT_HEALTH_BOOST,
                EFFECT_ABSORPTION,
                EFFECT_SATURATION,
                EFFECT_GLOWING,
                EFFECT_LEVITATION,
                EFFECT_LUCK,
                EFFECT_UNLUCK,
                EFFECT_SLOW_FALLING,
                EFFECT_CONDUIT_POWER,
                EFFECT_DOLPHIN_GRACE,
                EFFECT_BAD_OMEN,
                EFFECT_HERO_OF_THE_VILLAGE,
                EFFECT_DARKNESS
        ));
    }

    public static int getColorInt(EffectColorEntry entry) {
        String value = entry.getValue();

        if (value.equals("default")) {
            String s = entry.getDefaultValue().substring(1);
            String colorString = "0x" + s;
            return Integer.parseInt(colorString.substring(2), 16);
        } else if (value.equals("old")) {
            String s = entry.getOldValue().substring(1);
            String colorString = "0x" + s;
            return Integer.parseInt(colorString.substring(2), 16);
        } else if (value.indexOf('#') == 0) {
            String s = value.substring(1);
            String colorString = "0x" + s;
            return Integer.parseInt(colorString.substring(2),16);
        }

        throw new IllegalArgumentException("Invalid color value specified in config: " + ModConfig.CONFIGS.getConfigFilePath());
    }

}
