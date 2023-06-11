package com.mikitellurium.customizablepotioncolor.util;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffects;

import java.util.HashMap;
import java.util.Map;

public class ColorsRegistry {

    private static final Map<MobEffect, Integer> defaultColors = new HashMap<>();
    static {
        defaultColors.put(MobEffects.MOVEMENT_SPEED, 3402751);
        defaultColors.put(MobEffects.MOVEMENT_SLOWDOWN, 9154528);
        defaultColors.put(MobEffects.DIG_SPEED, 14270531);
        defaultColors.put(MobEffects.DIG_SLOWDOWN, 4866583);
        defaultColors.put(MobEffects.DAMAGE_BOOST, 16762624);
        defaultColors.put(MobEffects.HEAL, 16262179);
        defaultColors.put(MobEffects.HARM, 11101546);
        defaultColors.put(MobEffects.JUMP, 16646020);
        defaultColors.put(MobEffects.CONFUSION, 5578058);
        defaultColors.put(MobEffects.REGENERATION, 13458603);
        defaultColors.put(MobEffects.DAMAGE_RESISTANCE, 9520880);
        defaultColors.put(MobEffects.FIRE_RESISTANCE, 16750848);
        defaultColors.put(MobEffects.WATER_BREATHING, 10017472);
        defaultColors.put(MobEffects.INVISIBILITY, 16185078);
        defaultColors.put(MobEffects.BLINDNESS, 2039587);
        defaultColors.put(MobEffects.NIGHT_VISION, 12779366);
        defaultColors.put(MobEffects.HUNGER, 5797459);
        defaultColors.put(MobEffects.WEAKNESS, 4738376);
        defaultColors.put(MobEffects.POISON, 8889187);
        defaultColors.put(MobEffects.WITHER, 3484199);
        defaultColors.put(MobEffects.HEALTH_BOOST, 16284963);
        defaultColors.put(MobEffects.ABSORPTION, 2445989);
        defaultColors.put(MobEffects.SATURATION, 16262179);
        defaultColors.put(MobEffects.GLOWING, 9740385);
        defaultColors.put(MobEffects.LEVITATION, 13565951);
        defaultColors.put(MobEffects.LUCK, 5882118);
        defaultColors.put(MobEffects.UNLUCK, 12624973);
        defaultColors.put(MobEffects.SLOW_FALLING, 16773073);
        defaultColors.put(MobEffects.CONDUIT_POWER, 1950417);
        defaultColors.put(MobEffects.DOLPHINS_GRACE, 8954814);
        defaultColors.put(MobEffects.BAD_OMEN, 745784);
        defaultColors.put(MobEffects.HERO_OF_THE_VILLAGE, 4521796);
        defaultColors.put(MobEffects.DARKNESS, 2696993);
    }

    private static final Map<MobEffect, Integer> legacyColors = new HashMap<>();
    static {
        legacyColors.put(MobEffects.MOVEMENT_SPEED, 8171462);
        legacyColors.put(MobEffects.MOVEMENT_SLOWDOWN, 5926017);
        legacyColors.put(MobEffects.DIG_SPEED, 14270531);
        legacyColors.put(MobEffects.DIG_SLOWDOWN, 4866583);
        legacyColors.put(MobEffects.DAMAGE_BOOST, 9643043);
        legacyColors.put(MobEffects.HEAL, 16262179);
        legacyColors.put(MobEffects.HARM, 4393481);
        legacyColors.put(MobEffects.JUMP, 2293580);
        legacyColors.put(MobEffects.CONFUSION, 5578058);
        legacyColors.put(MobEffects.REGENERATION, 13458603);
        legacyColors.put(MobEffects.DAMAGE_RESISTANCE, 10044730);
        legacyColors.put(MobEffects.FIRE_RESISTANCE, 14981690);
        legacyColors.put(MobEffects.WATER_BREATHING, 3035801);
        legacyColors.put(MobEffects.INVISIBILITY, 8356754);
        legacyColors.put(MobEffects.BLINDNESS, 2039587);
        legacyColors.put(MobEffects.NIGHT_VISION, 2039713);
        legacyColors.put(MobEffects.HUNGER, 5797459);
        legacyColors.put(MobEffects.WEAKNESS, 4738376);
        legacyColors.put(MobEffects.POISON, 5149489);
        legacyColors.put(MobEffects.WITHER, 3484199);
        legacyColors.put(MobEffects.HEALTH_BOOST, 16284963);
        legacyColors.put(MobEffects.ABSORPTION, 2445989);
        legacyColors.put(MobEffects.SATURATION, 16262179);
        legacyColors.put(MobEffects.GLOWING, 9740385);
        legacyColors.put(MobEffects.LEVITATION, 13565951);
        legacyColors.put(MobEffects.LUCK, 3381504);
        legacyColors.put(MobEffects.UNLUCK, 12624973);
        legacyColors.put(MobEffects.SLOW_FALLING, 16773073);
        legacyColors.put(MobEffects.CONDUIT_POWER, 1950417);
        legacyColors.put(MobEffects.DOLPHINS_GRACE, 8954814);
        legacyColors.put(MobEffects.BAD_OMEN, 745784);
        legacyColors.put(MobEffects.HERO_OF_THE_VILLAGE, 4521796);
        legacyColors.put(MobEffects.DARKNESS, 2696993);
    }

    public static Integer getLegacyColorByEffect(MobEffect effect) {
        return legacyColors.get(effect);
    }

    public static Integer getDefaultColorByEffect(MobEffect effect) {
        return defaultColors.get(effect);
    }

}
