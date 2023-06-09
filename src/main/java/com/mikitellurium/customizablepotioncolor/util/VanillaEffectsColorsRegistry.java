package com.mikitellurium.customizablepotioncolor.util;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffects;

import java.util.HashMap;
import java.util.Map;

public class VanillaEffectsColorsRegistry {

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

    public static Integer getOldColorByEffect(StatusEffect effect) {
        return legacyColors.get(effect);
    }

//    private static String getHexValue(int color) {
//        String hexColor = Integer.toHexString(color).toUpperCase();
//        return "#" + hexColor;
//    }

}
