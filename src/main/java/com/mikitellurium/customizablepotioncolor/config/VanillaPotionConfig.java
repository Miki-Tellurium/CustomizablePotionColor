package com.mikitellurium.customizablepotioncolor.config;

import com.mikitellurium.customizablepotioncolor.api.TelluriumConfig;
import com.mikitellurium.customizablepotioncolor.util.VanillaEffectsConfigRegistry;

import java.io.IOException;

public class VanillaPotionConfig {

    public static final String DEFAULT = "default";
    public static final String OLD = "old";

    public static TelluriumConfig.Builder VANILLA_POTIONS_CONFIGS;

    public static void initConfig() throws IOException {
        VANILLA_POTIONS_CONFIGS = new TelluriumConfig.Builder("vanillapotionscolors");
        registerVanillaPotionColorConfig(VANILLA_POTIONS_CONFIGS);
        VanillaEffectsConfigRegistry.initEffectsMap();
    }

    private static void registerVanillaPotionColorConfig(TelluriumConfig.Builder builder) throws IOException {
        builder.comment(" Vanilla effects color configuration")
                .comment("")
                .comment(" Customize effects color using:")
                .comment(" -default = use the new colors added in 1.19.4;")
                .comment(" -old = use the old vanilla colors prior to 1.19.4;")
                .comment(" -hex values (example: #FFFFFF) = to specify a custom color;")
                .comment(" Changing the color of an effect will also modify")
                .comment(" the respective potions and arrows");

        VanillaEffectsConfigRegistry.CONFIG_SPEED = builder
                .define("speedEffectColor", DEFAULT)
                .comment("Speed effect color value");

        VanillaEffectsConfigRegistry.CONFIG_SLOWNESS = builder
                .define("slownessEffectColor", DEFAULT)
                .comment("Slowness effect color value");

        VanillaEffectsConfigRegistry.CONFIG_HASTE = builder
                .define("hasteEffectColor", DEFAULT)
                .comment("Haste effect color value");

        VanillaEffectsConfigRegistry.CONFIG_MINING_FATIGUE = builder
                .define("miningFatigueEffectColor", DEFAULT)
                .comment("Mining fatigue effect color value");

        VanillaEffectsConfigRegistry.CONFIG_STRENGTH = builder
                .define("strengthEffectColor", DEFAULT)
                .comment("Strength effect color value");

        VanillaEffectsConfigRegistry.CONFIG_INSTANT_HEALTH = builder
                .define("instantHealthEffectColor", DEFAULT)
                .comment("Instant health effect color value");

        VanillaEffectsConfigRegistry.CONFIG_INSTANT_DAMAGE = builder
                .define("instantDamageEffectColor", DEFAULT)
                .comment("Instant damage effect color value");

        VanillaEffectsConfigRegistry.CONFIG_JUMP_BOOST = builder
                .define("jumpBoostEffectColor", DEFAULT)
                .comment("Jump boost effect color value");

        VanillaEffectsConfigRegistry.CONFIG_NAUSEA = builder
                .define("nauseaEffectColor", DEFAULT)
                .comment("Nausea effect color value");

        VanillaEffectsConfigRegistry.CONFIG_REGENERATION = builder
                .define("regenerationEffectColor", DEFAULT)
                .comment("Regeneration effect color value");

        VanillaEffectsConfigRegistry.CONFIG_RESISTANCE = builder
                .define("resistanceEffectColor", DEFAULT)
                .comment("Resistance effect color value");

        VanillaEffectsConfigRegistry.CONFIG_FIRE_RESISTANCE = builder
                .define("fireResistanceEffectColor", DEFAULT)
                .comment("Fire resistance effect color value");

        VanillaEffectsConfigRegistry.CONFIG_WATER_BREATHING = builder
                .define("waterBreathingEffectColor", DEFAULT)
                .comment("Water breathing effect color value");

        VanillaEffectsConfigRegistry.CONFIG_INVISIBILITY = builder
                .define("invisibilityEffectColor", DEFAULT)
                .comment("Invisibility effect color value");

        VanillaEffectsConfigRegistry.CONFIG_BLINDNESS = builder
                .define("blindnessEffectColor", DEFAULT)
                .comment("Blindness effect color value");

        VanillaEffectsConfigRegistry.CONFIG_NIGHT_VISION = builder
                .define("nightVisionEffectColor", DEFAULT)
                .comment("Night vision effect color value");

        VanillaEffectsConfigRegistry.CONFIG_HUNGER = builder
                .define("hungerEffectColor", DEFAULT)
                .comment("Hunger effect color value");

        VanillaEffectsConfigRegistry.CONFIG_WEAKNESS = builder
                .define("weaknessEffectColor", DEFAULT)
                .comment("Weakness effect color value");

        VanillaEffectsConfigRegistry.CONFIG_POISON = builder
                .define("poisonEffectColor", DEFAULT)
                .comment("Poison effect color value");

        VanillaEffectsConfigRegistry.CONFIG_WITHER = builder
                .define("witherEffectColor", DEFAULT)
                .comment("Wither effect color value");

        VanillaEffectsConfigRegistry.CONFIG_HEALTH_BOOST = builder
                .define("healthBoostEffectColor", DEFAULT)
                .comment("Health boost effect color value");

        VanillaEffectsConfigRegistry.CONFIG_ABSORPTION = builder
                .define("absorptionEffectColor", DEFAULT)
                .comment("Absorption effect color value");

        VanillaEffectsConfigRegistry.CONFIG_SATURATION = builder
                .define("saturationEffectColor", DEFAULT)
                .comment("Saturation effect color value");

        VanillaEffectsConfigRegistry.CONFIG_GLOWING = builder
                .define("glowingEffectColor", DEFAULT)
                .comment("Glowing effect color value");

        VanillaEffectsConfigRegistry.CONFIG_LEVITATION = builder
                .define("levitationEffectColor", DEFAULT)
                .comment("Levitation effect color value");

        VanillaEffectsConfigRegistry.CONFIG_LUCK = builder
                .define("luckEffectColor", DEFAULT)
                .comment("Luck effect color value");

        VanillaEffectsConfigRegistry.CONFIG_UNLUCK = builder
                .define("unluckEffectColor", DEFAULT)
                .comment("Unluck effect color value");

        VanillaEffectsConfigRegistry.CONFIG_SLOW_FALLING = builder
                .define("slowFallingEffectColor", DEFAULT)
                .comment("Slow falling effect color value");

        VanillaEffectsConfigRegistry.CONFIG_CONDUIT_POWER = builder
                .define("conduitPowerEffectColor", DEFAULT)
                .comment("Conduit power effect color value");

        VanillaEffectsConfigRegistry.CONFIG_DOLPHIN_GRACE = builder
                .define("dolphinGraceEffectColor", DEFAULT)
                .comment("Dolphin grace effect color value");

        VanillaEffectsConfigRegistry.CONFIG_BAD_OMEN = builder
                .define("badOmenEffectColor", DEFAULT)
                .comment("Bad omen effect color value");

        VanillaEffectsConfigRegistry.CONFIG_HERO_OF_THE_VILLAGE = builder
                .define("heroOfTheVillageEffectColor", DEFAULT)
                .comment("Hero of the village effect color value");

        VanillaEffectsConfigRegistry.CONFIG_DARKNESS = builder
                .define("darknessEffectColor", DEFAULT)
                .comment("Darkness effect color value");

        VANILLA_POTIONS_CONFIGS.build();
    }

}
