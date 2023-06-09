package com.mikitellurium.customizablepotioncolor.util;

import com.mikitellurium.customizablepotioncolor.api.EffectColorEntry;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffects;

import java.util.HashMap;
import java.util.Map;

public class VanillaEffectsColorsRegistry {
    // Colors have to be in the correct order to be correct

    private static final int[] vanillaNewColors = { // Post 1.19.4 colors
            3402751,    // Speed
            9154528,    // Slowness
            14270531,   // Haste
            4866583,    // Mining Fatigue
            16762624,   // Strength
            16262179,   // Instant Health
            11101546,   // Instant Damage
            16646020,   // Jump boost
            5578058,    // Nausea
            13458603,   // Regeneration
            9520880,    // Resistance
            16750848,   // Fire Resistance
            10017472,   // Water Breathing
            16185078,   // Invisibility
            2039587,    // Blindness
            12779366,   // Night Vision
            5797459,    // Hunger
            4738376,    // Weakness
            8889187,    // Poison
            3484199,    // Wither
            16284963,   // Health Boost
            2445989,    // Absorption
            16262179,   // Saturation
            9740385,    // Glowing
            13565951,   // Levitation
            5882118,    // Luck
            12624973,   // Unlock
            16773073,   // Slow Falling
            1950417,    // Conduit Power
            8954814,    // Dolphin Grace
            745784,     // Bad Omen
            4521796,    // Hero of the village
            2696993     // Darkness
    };

    private static final Map<StatusEffect, Integer> legacyColors = new HashMap<>();
    static {
        legacyColors.put(StatusEffects.SPEED, 8171462); // Speed
        legacyColors.put(StatusEffects.SLOWNESS, 5926017);    // Slowness
        legacyColors.put(StatusEffects.HASTE, 14270531);   // Haste
        legacyColors.put(StatusEffects.MINING_FATIGUE, 4866583);    // Mining Fatigue
        legacyColors.put(StatusEffects.STRENGTH, 9643043);    // Strength
        legacyColors.put(StatusEffects.INSTANT_HEALTH, 16262179);   // Instant Health
        legacyColors.put(StatusEffects.INSTANT_DAMAGE, 4393481);    // Instant Damage
        legacyColors.put(StatusEffects.JUMP_BOOST, 2293580);    // Jump boost
        legacyColors.put(StatusEffects.NAUSEA, 5578058);    // Nausea
        legacyColors.put(StatusEffects.REGENERATION, 13458603);   // Regeneration
        legacyColors.put(StatusEffects.RESISTANCE, 10044730);   // Resistance
        legacyColors.put(StatusEffects.FIRE_RESISTANCE, 14981690);   // Fire Resistance
        legacyColors.put(StatusEffects.WATER_BREATHING, 3035801);    // Water Breathing
        legacyColors.put(StatusEffects.INVISIBILITY, 8356754);    // Invisibility
        legacyColors.put(StatusEffects.BLINDNESS, 2039587);    // Blindness
        legacyColors.put(StatusEffects.NIGHT_VISION, 2039713);    // Night Vision
        legacyColors.put(StatusEffects.HUNGER, 5797459);    // Hunger
        legacyColors.put(StatusEffects.WEAKNESS, 4738376);    // Weakness
        legacyColors.put(StatusEffects.POISON, 5149489);    // Poison
        legacyColors.put(StatusEffects.WITHER, 3484199);    // Wither
        legacyColors.put(StatusEffects.HEALTH_BOOST, 16284963);   // Health Boost
        legacyColors.put(StatusEffects.ABSORPTION, 2445989);    // Absorption
        legacyColors.put(StatusEffects.SATURATION, 16262179);   // Saturation
        legacyColors.put(StatusEffects.GLOWING, 9740385);    // Glowing
        legacyColors.put(StatusEffects.LEVITATION, 13565951);   // Levitation
        legacyColors.put(StatusEffects.LUCK, 3381504);    // Luck
        legacyColors.put(StatusEffects.UNLUCK, 12624973);   // Unluck
        legacyColors.put(StatusEffects.SLOW_FALLING, 16773073);   // Slow Falling
        legacyColors.put(StatusEffects.CONDUIT_POWER, 1950417);    // Conduit Power
        legacyColors.put(StatusEffects.DOLPHINS_GRACE, 8954814);    // Dolphins Grace
        legacyColors.put(StatusEffects.BAD_OMEN, 745784);     // Bad Omen
        legacyColors.put(StatusEffects.HERO_OF_THE_VILLAGE, 4521796);   // Hero of the village
        legacyColors.put(StatusEffects.DARKNESS, 2696993);     // Darkness
    }

    private static final int[] vanillaOldColors = { // Prior to 1.19.4 colors
            8171462,    // Speed
            5926017,    // Slowness
            14270531,   // Haste
            4866583,    // Mining Fatigue
            9643043,    // Strength
            16262179,   // Instant Health
            4393481,    // Instant Damage
            2293580,    // Jump boost
            5578058,    // Nausea
            13458603,   // Regeneration
            10044730,   // Resistance
            14981690,   // Fire Resistance
            3035801,    // Water Breathing
            8356754,    // Invisibility
            2039587,    // Blindness
            2039713,    // Night Vision
            5797459,    // Hunger
            4738376,    // Weakness
            5149489,    // Poison
            3484199,    // Wither
            16284963,   // Health Boost
            2445989,    // Absorption
            16262179,   // Saturation
            9740385,    // Glowing
            13565951,   // Levitation
            3381504,    // Luck
            12624973,   // Unlock
            16773073,   // Slow Falling
            1950417,    // Conduit Power
            8954814,    // Dolphin Grace
            745784,     // Bad Omen
            4521796,    // Hero of the village
            2696993     // Darkness
    };

    public static String getNewColorById(int id) {
        return getHexValue(vanillaNewColors[id - 1]);
    }

    public static String getOldColorById(int id) {
        return getHexValue(vanillaOldColors[id - 1]);
    }

    public static Integer getOldColorByEffect(StatusEffect effect) {
        return legacyColors.get(effect);
    }

    private static String getHexValue(int color) {
        String hexColor = Integer.toHexString(color).toUpperCase();
        return "#" + hexColor;
    }

}
