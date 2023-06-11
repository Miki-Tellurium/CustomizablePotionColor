package com.mikitellurium.customizablepotioncolor.util;

import com.mikitellurium.customizablepotioncolor.api.TelluriumConfig;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffects;

import java.util.LinkedHashMap;
import java.util.Map;

public class ConfigRegistry {

    public static TelluriumConfig.ConfigEntry<String> CONFIG_SPEED;
    public static TelluriumConfig.ConfigEntry<String> CONFIG_SLOWNESS;
    public static TelluriumConfig.ConfigEntry<String> CONFIG_HASTE;
    public static TelluriumConfig.ConfigEntry<String> CONFIG_MINING_FATIGUE;
    public static TelluriumConfig.ConfigEntry<String> CONFIG_STRENGTH;
    public static TelluriumConfig.ConfigEntry<String> CONFIG_INSTANT_HEALTH;
    public static TelluriumConfig.ConfigEntry<String> CONFIG_INSTANT_DAMAGE;
    public static TelluriumConfig.ConfigEntry<String> CONFIG_JUMP_BOOST;
    public static TelluriumConfig.ConfigEntry<String> CONFIG_NAUSEA;
    public static TelluriumConfig.ConfigEntry<String> CONFIG_REGENERATION;
    public static TelluriumConfig.ConfigEntry<String> CONFIG_RESISTANCE;
    public static TelluriumConfig.ConfigEntry<String> CONFIG_FIRE_RESISTANCE;
    public static TelluriumConfig.ConfigEntry<String> CONFIG_WATER_BREATHING;
    public static TelluriumConfig.ConfigEntry<String> CONFIG_INVISIBILITY;
    public static TelluriumConfig.ConfigEntry<String> CONFIG_BLINDNESS;
    public static TelluriumConfig.ConfigEntry<String> CONFIG_NIGHT_VISION;
    public static TelluriumConfig.ConfigEntry<String> CONFIG_HUNGER;
    public static TelluriumConfig.ConfigEntry<String> CONFIG_WEAKNESS;
    public static TelluriumConfig.ConfigEntry<String> CONFIG_POISON;
    public static TelluriumConfig.ConfigEntry<String> CONFIG_WITHER;
    public static TelluriumConfig.ConfigEntry<String> CONFIG_HEALTH_BOOST;
    public static TelluriumConfig.ConfigEntry<String> CONFIG_ABSORPTION;
    public static TelluriumConfig.ConfigEntry<String> CONFIG_SATURATION;
    public static TelluriumConfig.ConfigEntry<String> CONFIG_GLOWING;
    public static TelluriumConfig.ConfigEntry<String> CONFIG_LEVITATION;
    public static TelluriumConfig.ConfigEntry<String> CONFIG_LUCK;
    public static TelluriumConfig.ConfigEntry<String> CONFIG_UNLUCK;
    public static TelluriumConfig.ConfigEntry<String> CONFIG_SLOW_FALLING;
    public static TelluriumConfig.ConfigEntry<String> CONFIG_CONDUIT_POWER;
    public static TelluriumConfig.ConfigEntry<String> CONFIG_DOLPHIN_GRACE;
    public static TelluriumConfig.ConfigEntry<String> CONFIG_BAD_OMEN;
    public static TelluriumConfig.ConfigEntry<String> CONFIG_HERO_OF_THE_VILLAGE;
    public static TelluriumConfig.ConfigEntry<String> CONFIG_DARKNESS;

    private static final Map<MobEffect, TelluriumConfig.ConfigEntry<String>> vanillaEffectsColorConfigs = new LinkedHashMap<>();
    public static void initEffectsMap() {
        vanillaEffectsColorConfigs.put(MobEffects.MOVEMENT_SPEED, CONFIG_SPEED);
        vanillaEffectsColorConfigs.put(MobEffects.MOVEMENT_SLOWDOWN, CONFIG_SLOWNESS);
        vanillaEffectsColorConfigs.put(MobEffects.DIG_SPEED, CONFIG_HASTE);
        vanillaEffectsColorConfigs.put(MobEffects.DIG_SLOWDOWN, CONFIG_MINING_FATIGUE);
        vanillaEffectsColorConfigs.put(MobEffects.DAMAGE_BOOST, CONFIG_STRENGTH);
        vanillaEffectsColorConfigs.put(MobEffects.HEAL, CONFIG_INSTANT_HEALTH);
        vanillaEffectsColorConfigs.put(MobEffects.HARM, CONFIG_INSTANT_DAMAGE);
        vanillaEffectsColorConfigs.put(MobEffects.JUMP, CONFIG_JUMP_BOOST);
        vanillaEffectsColorConfigs.put(MobEffects.CONFUSION, CONFIG_NAUSEA);
        vanillaEffectsColorConfigs.put(MobEffects.REGENERATION, CONFIG_REGENERATION);
        vanillaEffectsColorConfigs.put(MobEffects.DAMAGE_RESISTANCE, CONFIG_RESISTANCE);
        vanillaEffectsColorConfigs.put(MobEffects.FIRE_RESISTANCE, CONFIG_FIRE_RESISTANCE);
        vanillaEffectsColorConfigs.put(MobEffects.WATER_BREATHING, CONFIG_WATER_BREATHING);
        vanillaEffectsColorConfigs.put(MobEffects.INVISIBILITY, CONFIG_INVISIBILITY);
        vanillaEffectsColorConfigs.put(MobEffects.BLINDNESS, CONFIG_BLINDNESS);
        vanillaEffectsColorConfigs.put(MobEffects.NIGHT_VISION, CONFIG_NIGHT_VISION);
        vanillaEffectsColorConfigs.put(MobEffects.HUNGER, CONFIG_HUNGER);
        vanillaEffectsColorConfigs.put(MobEffects.WEAKNESS, CONFIG_WEAKNESS);
        vanillaEffectsColorConfigs.put(MobEffects.POISON, CONFIG_POISON);
        vanillaEffectsColorConfigs.put(MobEffects.WITHER, CONFIG_WITHER);
        vanillaEffectsColorConfigs.put(MobEffects.HEALTH_BOOST, CONFIG_HEALTH_BOOST);
        vanillaEffectsColorConfigs.put(MobEffects.ABSORPTION, CONFIG_ABSORPTION);
        vanillaEffectsColorConfigs.put(MobEffects.SATURATION, CONFIG_SATURATION);
        vanillaEffectsColorConfigs.put(MobEffects.GLOWING, CONFIG_GLOWING);
        vanillaEffectsColorConfigs.put(MobEffects.LEVITATION, CONFIG_LEVITATION);
        vanillaEffectsColorConfigs.put(MobEffects.LUCK, CONFIG_LUCK);
        vanillaEffectsColorConfigs.put(MobEffects.UNLUCK, CONFIG_UNLUCK);
        vanillaEffectsColorConfigs.put(MobEffects.SLOW_FALLING, CONFIG_SLOW_FALLING);
        vanillaEffectsColorConfigs.put(MobEffects.CONDUIT_POWER, CONFIG_CONDUIT_POWER);
        vanillaEffectsColorConfigs.put(MobEffects.DOLPHINS_GRACE, CONFIG_DOLPHIN_GRACE);
        vanillaEffectsColorConfigs.put(MobEffects.BAD_OMEN, CONFIG_BAD_OMEN);
        vanillaEffectsColorConfigs.put(MobEffects.HERO_OF_THE_VILLAGE, CONFIG_HERO_OF_THE_VILLAGE);
        vanillaEffectsColorConfigs.put(MobEffects.DARKNESS, CONFIG_DARKNESS);
    }

    public static TelluriumConfig.ConfigEntry<String> getConfig(MobEffect effect) {
        return vanillaEffectsColorConfigs.get(effect);
    }

    public static Map<MobEffect, TelluriumConfig.ConfigEntry<String>> getConfigMap() {
        return vanillaEffectsColorConfigs;
    }

}
