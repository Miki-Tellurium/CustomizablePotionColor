package com.mikitellurium.customizablepotioncolor.config;

import com.mikitellurium.customizablepotioncolor.api.ConfigManager;
import com.mikitellurium.customizablepotioncolor.api.EffectColorEntry;
import com.mikitellurium.customizablepotioncolor.util.VanillaEffectsColorsRegistry;
import com.mikitellurium.customizablepotioncolor.util.VanillaEffectsConfigRegistry;

import java.io.IOException;

public class VanillaPotionConfig {

    public static final ConfigManager.Builder VANILLA_POTIONS_CONFIGS = new ConfigManager.Builder("vanillapotionscolors");

    public static void registerVanillaPotionColorConfig() throws IOException {
        VANILLA_POTIONS_CONFIGS.comment("Vanilla effects color configuration")
                .comment("")
                .comment("Customize effects color using:")
                .comment(" default = use the new colors added in 1.19.4;")
                .comment(" old = use the old vanilla colors prior to 1.19.4;")
                .comment(" hex values (example: #FFFFFF) = to specify a custom color;")
                .comment("Changing the color of an effect will also modify")
                .comment("the respective potions and arrows")
                .comment("");

        VanillaEffectsConfigRegistry.EFFECT_SPEED = new EffectColorEntry(VANILLA_POTIONS_CONFIGS, "speedEffectColor",
                VanillaEffectsColorsRegistry.getNewColorById(1),
                VanillaEffectsColorsRegistry.getOldColorById(1))
                .comment("Speed effect color value");

        VanillaEffectsConfigRegistry.EFFECT_SLOWNESS = new EffectColorEntry(VANILLA_POTIONS_CONFIGS, "slownessEffectColor",
                VanillaEffectsColorsRegistry.getNewColorById(2),
                VanillaEffectsColorsRegistry.getOldColorById(2))
                .comment("Slowness effect color value");

        VanillaEffectsConfigRegistry.EFFECT_HASTE = new EffectColorEntry(VANILLA_POTIONS_CONFIGS, "hasteEffectColor",
                VanillaEffectsColorsRegistry.getNewColorById(3),
                VanillaEffectsColorsRegistry.getOldColorById(3))
                .comment("Haste effect color value");

        VanillaEffectsConfigRegistry.EFFECT_MINING_FATIGUE = new EffectColorEntry(VANILLA_POTIONS_CONFIGS, "miningFatigueEffectColor",
                VanillaEffectsColorsRegistry.getNewColorById(4),
                VanillaEffectsColorsRegistry.getOldColorById(4))
                .comment("Mining fatigue effect color value");

        VanillaEffectsConfigRegistry.EFFECT_STRENGTH = new EffectColorEntry(VANILLA_POTIONS_CONFIGS, "strengthEffectColor",
                VanillaEffectsColorsRegistry.getNewColorById(5),
                VanillaEffectsColorsRegistry.getOldColorById(5))
                .comment("Strength effect color value");

        VanillaEffectsConfigRegistry.EFFECT_INSTANT_HEALTH = new EffectColorEntry(VANILLA_POTIONS_CONFIGS, "instantHealthEffectColor",
                VanillaEffectsColorsRegistry.getNewColorById(6),
                VanillaEffectsColorsRegistry.getOldColorById(6))
                .comment("Instant health effect color value");

        VanillaEffectsConfigRegistry.EFFECT_INSTANT_DAMAGE = new EffectColorEntry(VANILLA_POTIONS_CONFIGS, "instantDamageEffectColor",
                VanillaEffectsColorsRegistry.getNewColorById(7),
                VanillaEffectsColorsRegistry.getOldColorById(7))
                .comment("Instant damage effect color value");

        VanillaEffectsConfigRegistry.EFFECT_JUMP_BOOST = new EffectColorEntry(VANILLA_POTIONS_CONFIGS, "jumpBoostEffectColor",
                VanillaEffectsColorsRegistry.getNewColorById(8),
                VanillaEffectsColorsRegistry.getOldColorById(8))
                .comment("Jump boost effect color value");

        VanillaEffectsConfigRegistry.EFFECT_NAUSEA = new EffectColorEntry(VANILLA_POTIONS_CONFIGS, "nauseaEffectColor",
                VanillaEffectsColorsRegistry.getNewColorById(9),
                VanillaEffectsColorsRegistry.getOldColorById(9))
                .comment("Nausea effect color value");

        VanillaEffectsConfigRegistry.EFFECT_REGENERATION = new EffectColorEntry(VANILLA_POTIONS_CONFIGS, "regenerationEffectColor",
                VanillaEffectsColorsRegistry.getNewColorById(10),
                VanillaEffectsColorsRegistry.getOldColorById(10))
                .comment("Regeneration effect color value");

        VanillaEffectsConfigRegistry.EFFECT_RESISTANCE = new EffectColorEntry(VANILLA_POTIONS_CONFIGS, "resistanceEffectColor",
                VanillaEffectsColorsRegistry.getNewColorById(11),
                VanillaEffectsColorsRegistry.getOldColorById(11))
                .comment("Resistance effect color value");

        VanillaEffectsConfigRegistry.EFFECT_FIRE_RESISTANCE = new EffectColorEntry(VANILLA_POTIONS_CONFIGS, "fireResistanceEffectColor",
                VanillaEffectsColorsRegistry.getNewColorById(12),
                VanillaEffectsColorsRegistry.getOldColorById(12))
                .comment("Fire resistance effect color value");

        VanillaEffectsConfigRegistry.EFFECT_WATER_BREATHING = new EffectColorEntry(VANILLA_POTIONS_CONFIGS, "waterBreathingEffectColor",
                VanillaEffectsColorsRegistry.getNewColorById(13),
                VanillaEffectsColorsRegistry.getOldColorById(13))
                .comment("Water breathing effect color value");

        VanillaEffectsConfigRegistry.EFFECT_INVISIBILITY = new EffectColorEntry(VANILLA_POTIONS_CONFIGS, "invisibilityEffectColor",
                VanillaEffectsColorsRegistry.getNewColorById(14),
                VanillaEffectsColorsRegistry.getOldColorById(14))
                .comment("Invisibility effect color value");

        VanillaEffectsConfigRegistry.EFFECT_BLINDNESS = new EffectColorEntry(VANILLA_POTIONS_CONFIGS, "blindnessEffectColor",
                VanillaEffectsColorsRegistry.getNewColorById(15),
                VanillaEffectsColorsRegistry.getOldColorById(15))
                .comment("Blindness effect color value");

        VanillaEffectsConfigRegistry.EFFECT_NIGHT_VISION = new EffectColorEntry(VANILLA_POTIONS_CONFIGS, "nightVisionEffectColor",
                VanillaEffectsColorsRegistry.getNewColorById(16),
                VanillaEffectsColorsRegistry.getOldColorById(16))
                .comment("Night vision effect color value");

        VanillaEffectsConfigRegistry.EFFECT_HUNGER = new EffectColorEntry(VANILLA_POTIONS_CONFIGS, "hungerEffectColor",
                VanillaEffectsColorsRegistry.getNewColorById(17),
                VanillaEffectsColorsRegistry.getOldColorById(17))
                .comment("Hunger effect color value");

        VanillaEffectsConfigRegistry.EFFECT_WEAKNESS = new EffectColorEntry(VANILLA_POTIONS_CONFIGS, "weaknessEffectColor",
                VanillaEffectsColorsRegistry.getNewColorById(18),
                VanillaEffectsColorsRegistry.getOldColorById(18))
                .comment("Weakness effect color value");

        VanillaEffectsConfigRegistry.EFFECT_POISON = new EffectColorEntry(VANILLA_POTIONS_CONFIGS, "poisonEffectColor",
                VanillaEffectsColorsRegistry.getNewColorById(19),
                VanillaEffectsColorsRegistry.getOldColorById(19))
                .comment("Poison effect color value");

        VanillaEffectsConfigRegistry.EFFECT_WITHER = new EffectColorEntry(VANILLA_POTIONS_CONFIGS, "witherEffectColor",
                VanillaEffectsColorsRegistry.getNewColorById(20),
                VanillaEffectsColorsRegistry.getOldColorById(20))
                .comment("Wither effect color value");

        VanillaEffectsConfigRegistry.EFFECT_HEALTH_BOOST = new EffectColorEntry(VANILLA_POTIONS_CONFIGS, "healthBoostEffectColor",
                VanillaEffectsColorsRegistry.getNewColorById(21),
                VanillaEffectsColorsRegistry.getOldColorById(21))
                .comment("Health boost effect color value");

        VanillaEffectsConfigRegistry.EFFECT_ABSORPTION = new EffectColorEntry(VANILLA_POTIONS_CONFIGS, "absorptionEffectColor",
                VanillaEffectsColorsRegistry.getNewColorById(22),
                VanillaEffectsColorsRegistry.getOldColorById(22))
                .comment("Absorption effect color value");

        VanillaEffectsConfigRegistry.EFFECT_SATURATION = new EffectColorEntry(VANILLA_POTIONS_CONFIGS, "saturationEffectColor",
                VanillaEffectsColorsRegistry.getNewColorById(23),
                VanillaEffectsColorsRegistry.getOldColorById(23))
                .comment("Saturation effect color value");

        VanillaEffectsConfigRegistry.EFFECT_GLOWING = new EffectColorEntry(VANILLA_POTIONS_CONFIGS, "glowingEffectColor",
                VanillaEffectsColorsRegistry.getNewColorById(24),
                VanillaEffectsColorsRegistry.getOldColorById(24))
                .comment("Glowing effect color value");

        VanillaEffectsConfigRegistry.EFFECT_LEVITATION = new EffectColorEntry(VANILLA_POTIONS_CONFIGS, "levitationEffectColor",
                VanillaEffectsColorsRegistry.getNewColorById(25),
                VanillaEffectsColorsRegistry.getOldColorById(25))
                .comment("Levitation effect color value");

        VanillaEffectsConfigRegistry.EFFECT_LUCK = new EffectColorEntry(VANILLA_POTIONS_CONFIGS, "luckEffectColor",
                VanillaEffectsColorsRegistry.getNewColorById(26),
                VanillaEffectsColorsRegistry.getOldColorById(26))
                .comment("Luck effect color value");

        VanillaEffectsConfigRegistry.EFFECT_UNLUCK = new EffectColorEntry(VANILLA_POTIONS_CONFIGS, "unluckEffectColor",
                VanillaEffectsColorsRegistry.getNewColorById(27),
                VanillaEffectsColorsRegistry.getOldColorById(27))
                .comment("Unluck effect color value");

        VanillaEffectsConfigRegistry.EFFECT_SLOW_FALLING = new EffectColorEntry(VANILLA_POTIONS_CONFIGS, "slowFallingEffectColor",
                VanillaEffectsColorsRegistry.getNewColorById(28),
                VanillaEffectsColorsRegistry.getOldColorById(28))
                .comment("Slow falling effect color value");

        VanillaEffectsConfigRegistry.EFFECT_CONDUIT_POWER = new EffectColorEntry(VANILLA_POTIONS_CONFIGS, "conduitPowerEffectColor",
                VanillaEffectsColorsRegistry.getNewColorById(29),
                VanillaEffectsColorsRegistry.getOldColorById(29))
                .comment("Conduit power effect color value");

        VanillaEffectsConfigRegistry.EFFECT_DOLPHIN_GRACE = new EffectColorEntry(VANILLA_POTIONS_CONFIGS, "dolphinGraceEffectColor",
                VanillaEffectsColorsRegistry.getNewColorById(30),
                VanillaEffectsColorsRegistry.getOldColorById(30))
                .comment("Dolphin grace effect color value");

        VanillaEffectsConfigRegistry.EFFECT_BAD_OMEN = new EffectColorEntry(VANILLA_POTIONS_CONFIGS, "badOmenEffectColor",
                VanillaEffectsColorsRegistry.getNewColorById(31),
                VanillaEffectsColorsRegistry.getOldColorById(31))
                .comment("Bad omen effect color value");

        VanillaEffectsConfigRegistry.EFFECT_HERO_OF_THE_VILLAGE = new EffectColorEntry(VANILLA_POTIONS_CONFIGS, "heroOfTheVillageEffectColor",
                VanillaEffectsColorsRegistry.getNewColorById(32),
                VanillaEffectsColorsRegistry.getOldColorById(32))
                .comment("Hero of the village effect color value");

        VanillaEffectsConfigRegistry.EFFECT_DARKNESS = new EffectColorEntry(VANILLA_POTIONS_CONFIGS, "darknessEffectColor",
                VanillaEffectsColorsRegistry.getNewColorById(33),
                VanillaEffectsColorsRegistry.getOldColorById(33))
                .comment("Darkness effect color value");

        VANILLA_POTIONS_CONFIGS.build();
        VanillaEffectsConfigRegistry.initEffects();
    }

}
