package com.mikitellurium.customizablepotioncolor.util;

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

    private static String getHexValue(int color) {
        String hexColor = Integer.toHexString(color).toUpperCase();
        return "#" + hexColor;
    }

}
