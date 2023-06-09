package com.mikitellurium.customizablepotioncolor.util;

import com.mikitellurium.customizablepotioncolor.api.EffectColorEntry;
import com.mikitellurium.customizablepotioncolor.config.VanillaPotionConfig;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffects;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VanillaEffectsConfigRegistry {

    public static EffectColorEntry CONFIG_SPEED;
    public static EffectColorEntry CONFIG_SLOWNESS;
    public static EffectColorEntry CONFIG_HASTE;
    public static EffectColorEntry CONFIG_MINING_FATIGUE;
    public static EffectColorEntry CONFIG_STRENGTH;
    public static EffectColorEntry CONFIG_INSTANT_HEALTH;
    public static EffectColorEntry CONFIG_INSTANT_DAMAGE;
    public static EffectColorEntry CONFIG_JUMP_BOOST;
    public static EffectColorEntry CONFIG_NAUSEA;
    public static EffectColorEntry CONFIG_REGENERATION;
    public static EffectColorEntry CONFIG_RESISTANCE;
    public static EffectColorEntry CONFIG_FIRE_RESISTANCE;
    public static EffectColorEntry CONFIG_WATER_BREATHING;
    public static EffectColorEntry CONFIG_INVISIBILITY;
    public static EffectColorEntry CONFIG_BLINDNESS;
    public static EffectColorEntry CONFIG_NIGHT_VISION;
    public static EffectColorEntry CONFIG_HUNGER;
    public static EffectColorEntry CONFIG_WEAKNESS;
    public static EffectColorEntry CONFIG_POISON;
    public static EffectColorEntry CONFIG_WITHER;
    public static EffectColorEntry CONFIG_HEALTH_BOOST;
    public static EffectColorEntry CONFIG_ABSORPTION;
    public static EffectColorEntry CONFIG_SATURATION;
    public static EffectColorEntry CONFIG_GLOWING;
    public static EffectColorEntry CONFIG_LEVITATION;
    public static EffectColorEntry CONFIG_LUCK;
    public static EffectColorEntry CONFIG_UNLUCK;
    public static EffectColorEntry CONFIG_SLOW_FALLING;
    public static EffectColorEntry CONFIG_CONDUIT_POWER;
    public static EffectColorEntry CONFIG_DOLPHIN_GRACE;
    public static EffectColorEntry CONFIG_BAD_OMEN;
    public static EffectColorEntry CONFIG_HERO_OF_THE_VILLAGE;
    public static EffectColorEntry CONFIG_DARKNESS;

    private static final Map<StatusEffect, EffectColorEntry> vanillaEffectsColorConfigs = new HashMap<>();
    public static void initEffectsMap() {
        vanillaEffectsColorConfigs.put(StatusEffects.SPEED, CONFIG_SPEED);
        vanillaEffectsColorConfigs.put(StatusEffects.SLOWNESS, CONFIG_SLOWNESS);
        vanillaEffectsColorConfigs.put(StatusEffects.HASTE, CONFIG_HASTE);
        vanillaEffectsColorConfigs.put(StatusEffects.MINING_FATIGUE, CONFIG_MINING_FATIGUE);
        vanillaEffectsColorConfigs.put(StatusEffects.STRENGTH, CONFIG_STRENGTH);
        vanillaEffectsColorConfigs.put(StatusEffects.INSTANT_HEALTH, CONFIG_INSTANT_HEALTH);
        vanillaEffectsColorConfigs.put(StatusEffects.INSTANT_DAMAGE, CONFIG_INSTANT_DAMAGE);
        vanillaEffectsColorConfigs.put(StatusEffects.JUMP_BOOST, CONFIG_JUMP_BOOST);
        vanillaEffectsColorConfigs.put(StatusEffects.NAUSEA, CONFIG_NAUSEA);
        vanillaEffectsColorConfigs.put(StatusEffects.REGENERATION, CONFIG_REGENERATION);
        vanillaEffectsColorConfigs.put(StatusEffects.RESISTANCE, CONFIG_RESISTANCE);
        vanillaEffectsColorConfigs.put(StatusEffects.FIRE_RESISTANCE, CONFIG_FIRE_RESISTANCE);
        vanillaEffectsColorConfigs.put(StatusEffects.WATER_BREATHING, CONFIG_WATER_BREATHING);
        vanillaEffectsColorConfigs.put(StatusEffects.INVISIBILITY, CONFIG_INVISIBILITY);
        vanillaEffectsColorConfigs.put(StatusEffects.BLINDNESS, CONFIG_BLINDNESS);
        vanillaEffectsColorConfigs.put(StatusEffects.NIGHT_VISION, CONFIG_NIGHT_VISION);
        vanillaEffectsColorConfigs.put(StatusEffects.HUNGER, CONFIG_HUNGER);
        vanillaEffectsColorConfigs.put(StatusEffects.WEAKNESS, CONFIG_WEAKNESS);
        vanillaEffectsColorConfigs.put(StatusEffects.POISON, CONFIG_POISON);
        vanillaEffectsColorConfigs.put(StatusEffects.WITHER, CONFIG_WITHER);
        vanillaEffectsColorConfigs.put(StatusEffects.HEALTH_BOOST, CONFIG_HEALTH_BOOST);
        vanillaEffectsColorConfigs.put(StatusEffects.ABSORPTION, CONFIG_ABSORPTION);
        vanillaEffectsColorConfigs.put(StatusEffects.SATURATION, CONFIG_SATURATION);
        vanillaEffectsColorConfigs.put(StatusEffects.GLOWING, CONFIG_GLOWING);
        vanillaEffectsColorConfigs.put(StatusEffects.LEVITATION, CONFIG_LEVITATION);
        vanillaEffectsColorConfigs.put(StatusEffects.LUCK, CONFIG_LUCK);
        vanillaEffectsColorConfigs.put(StatusEffects.UNLUCK, CONFIG_UNLUCK);
        vanillaEffectsColorConfigs.put(StatusEffects.SLOW_FALLING, CONFIG_SLOW_FALLING);
        vanillaEffectsColorConfigs.put(StatusEffects.CONDUIT_POWER, CONFIG_CONDUIT_POWER);
        vanillaEffectsColorConfigs.put(StatusEffects.DOLPHINS_GRACE, CONFIG_DOLPHIN_GRACE);
        vanillaEffectsColorConfigs.put(StatusEffects.BAD_OMEN, CONFIG_BAD_OMEN);
        vanillaEffectsColorConfigs.put(StatusEffects.HERO_OF_THE_VILLAGE, CONFIG_HERO_OF_THE_VILLAGE);
        vanillaEffectsColorConfigs.put(StatusEffects.DARKNESS, CONFIG_DARKNESS);
    }

    public static EffectColorEntry getConfig(StatusEffect effect) {
        return vanillaEffectsColorConfigs.get(effect);
    }

    public static int getColorInt(EffectColorEntry entry) {
        String value = entry.getValue();

        if (value.indexOf('#') == 0) {
            String s = value.substring(1);
            String colorString = "0x" + s;
            return Integer.parseInt(colorString.substring(2),16);
        }

        throw new IllegalArgumentException("Invalid color value specified in config: " + VanillaPotionConfig.VANILLA_POTIONS_CONFIGS.getConfigFilePath());
    }

}
