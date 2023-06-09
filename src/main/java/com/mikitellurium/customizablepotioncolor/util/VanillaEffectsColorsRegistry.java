package com.mikitellurium.customizablepotioncolor.util;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffects;

import java.util.HashMap;
import java.util.Map;

public class VanillaEffectsColorsRegistry {

    private static final Map<StatusEffect, Integer> legacyColors = new HashMap<>();
    static {
        legacyColors.put(StatusEffects.SPEED, 8171462);
        legacyColors.put(StatusEffects.SLOWNESS, 5926017);
        legacyColors.put(StatusEffects.HASTE, 14270531);
        legacyColors.put(StatusEffects.MINING_FATIGUE, 4866583);
        legacyColors.put(StatusEffects.STRENGTH, 9643043);
        legacyColors.put(StatusEffects.INSTANT_HEALTH, 16262179);
        legacyColors.put(StatusEffects.INSTANT_DAMAGE, 4393481);
        legacyColors.put(StatusEffects.JUMP_BOOST, 2293580);
        legacyColors.put(StatusEffects.NAUSEA, 5578058);
        legacyColors.put(StatusEffects.REGENERATION, 13458603);
        legacyColors.put(StatusEffects.RESISTANCE, 10044730);
        legacyColors.put(StatusEffects.FIRE_RESISTANCE, 14981690);
        legacyColors.put(StatusEffects.WATER_BREATHING, 3035801);
        legacyColors.put(StatusEffects.INVISIBILITY, 8356754);
        legacyColors.put(StatusEffects.BLINDNESS, 2039587);
        legacyColors.put(StatusEffects.NIGHT_VISION, 2039713);
        legacyColors.put(StatusEffects.HUNGER, 5797459);
        legacyColors.put(StatusEffects.WEAKNESS, 4738376);
        legacyColors.put(StatusEffects.POISON, 5149489);
        legacyColors.put(StatusEffects.WITHER, 3484199);
        legacyColors.put(StatusEffects.HEALTH_BOOST, 16284963);
        legacyColors.put(StatusEffects.ABSORPTION, 2445989);
        legacyColors.put(StatusEffects.SATURATION, 16262179);
        legacyColors.put(StatusEffects.GLOWING, 9740385);
        legacyColors.put(StatusEffects.LEVITATION, 13565951);
        legacyColors.put(StatusEffects.LUCK, 3381504);
        legacyColors.put(StatusEffects.UNLUCK, 12624973);
        legacyColors.put(StatusEffects.SLOW_FALLING, 16773073);
        legacyColors.put(StatusEffects.CONDUIT_POWER, 1950417);
        legacyColors.put(StatusEffects.DOLPHINS_GRACE, 8954814);
        legacyColors.put(StatusEffects.BAD_OMEN, 745784);
        legacyColors.put(StatusEffects.HERO_OF_THE_VILLAGE, 4521796);
        legacyColors.put(StatusEffects.DARKNESS, 2696993);
    }

    public static Integer getOldColorByEffect(StatusEffect effect) {
        return legacyColors.get(effect);
    }

//    private static String getHexValue(int color) {
//        String hexColor = Integer.toHexString(color).toUpperCase();
//        return "#" + hexColor;
//    }

}
