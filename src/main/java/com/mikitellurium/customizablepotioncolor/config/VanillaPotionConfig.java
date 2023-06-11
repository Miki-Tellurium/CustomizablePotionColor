package com.mikitellurium.customizablepotioncolor.config;

import com.mikitellurium.customizablepotioncolor.api.TelluriumConfig;
import com.mikitellurium.customizablepotioncolor.util.ConfigRegistry;

import java.io.IOException;

public class VanillaPotionConfig {

    public static final String DEFAULT = "default";
    public static final String OLD = "old";

    public static TelluriumConfig.Builder VANILLA_POTIONS_CONFIGS;

    public static void initConfig() throws IOException {
        VANILLA_POTIONS_CONFIGS = new TelluriumConfig.Builder("vanillapotionscolors");
        registerVanillaPotionColorConfig(VANILLA_POTIONS_CONFIGS);
        ConfigRegistry.initEffectsMap();
    }

    private static void registerVanillaPotionColorConfig(TelluriumConfig.Builder builder) throws IOException {
        builder.comment(" Vanilla effects color configuration")
                .comment("")
                .comment(" Customize effects color using:")
                .comment(" -default = use the new colors added in 1.19.4;")
                .comment(" -old = use the old vanilla colors prior to 1.19.4")
                .comment("  (Note: some of them didn't change);")
                .comment(" -hex values (example: #FFFFFF) = to specify a custom color;")
                .comment(" Changing the color of an effect will also modify")
                .comment(" the respective potions and arrows");

        ConfigRegistry.CONFIG_SPEED = builder
                .define("speedEffectColor", DEFAULT)
                .comment("Speed effect color value");

        ConfigRegistry.CONFIG_SLOWNESS = builder
                .define("slownessEffectColor", DEFAULT)
                .comment("Slowness effect color value");

        ConfigRegistry.CONFIG_HASTE = builder
                .define("hasteEffectColor", DEFAULT)
                .comment("Haste effect color value");

        ConfigRegistry.CONFIG_MINING_FATIGUE = builder
                .define("miningFatigueEffectColor", DEFAULT)
                .comment("Mining fatigue effect color value");

        ConfigRegistry.CONFIG_STRENGTH = builder
                .define("strengthEffectColor", DEFAULT)
                .comment("Strength effect color value");

        ConfigRegistry.CONFIG_INSTANT_HEALTH = builder
                .define("instantHealthEffectColor", DEFAULT)
                .comment("Instant health effect color value");

        ConfigRegistry.CONFIG_INSTANT_DAMAGE = builder
                .define("instantDamageEffectColor", DEFAULT)
                .comment("Instant damage effect color value");

        ConfigRegistry.CONFIG_JUMP_BOOST = builder
                .define("jumpBoostEffectColor", DEFAULT)
                .comment("Jump boost effect color value");

        ConfigRegistry.CONFIG_NAUSEA = builder
                .define("nauseaEffectColor", DEFAULT)
                .comment("Nausea effect color value");

        ConfigRegistry.CONFIG_REGENERATION = builder
                .define("regenerationEffectColor", DEFAULT)
                .comment("Regeneration effect color value");

        ConfigRegistry.CONFIG_RESISTANCE = builder
                .define("resistanceEffectColor", DEFAULT)
                .comment("Resistance effect color value");

        ConfigRegistry.CONFIG_FIRE_RESISTANCE = builder
                .define("fireResistanceEffectColor", DEFAULT)
                .comment("Fire resistance effect color value");

        ConfigRegistry.CONFIG_WATER_BREATHING = builder
                .define("waterBreathingEffectColor", DEFAULT)
                .comment("Water breathing effect color value");

        ConfigRegistry.CONFIG_INVISIBILITY = builder
                .define("invisibilityEffectColor", DEFAULT)
                .comment("Invisibility effect color value");

        ConfigRegistry.CONFIG_BLINDNESS = builder
                .define("blindnessEffectColor", DEFAULT)
                .comment("Blindness effect color value");

        ConfigRegistry.CONFIG_NIGHT_VISION = builder
                .define("nightVisionEffectColor", DEFAULT)
                .comment("Night vision effect color value");

        ConfigRegistry.CONFIG_HUNGER = builder
                .define("hungerEffectColor", DEFAULT)
                .comment("Hunger effect color value");

        ConfigRegistry.CONFIG_WEAKNESS = builder
                .define("weaknessEffectColor", DEFAULT)
                .comment("Weakness effect color value");

        ConfigRegistry.CONFIG_POISON = builder
                .define("poisonEffectColor", DEFAULT)
                .comment("Poison effect color value");

        ConfigRegistry.CONFIG_WITHER = builder
                .define("witherEffectColor", DEFAULT)
                .comment("Wither effect color value");

        ConfigRegistry.CONFIG_HEALTH_BOOST = builder
                .define("healthBoostEffectColor", DEFAULT)
                .comment("Health boost effect color value");

        ConfigRegistry.CONFIG_ABSORPTION = builder
                .define("absorptionEffectColor", DEFAULT)
                .comment("Absorption effect color value");

        ConfigRegistry.CONFIG_SATURATION = builder
                .define("saturationEffectColor", DEFAULT)
                .comment("Saturation effect color value");

        ConfigRegistry.CONFIG_GLOWING = builder
                .define("glowingEffectColor", DEFAULT)
                .comment("Glowing effect color value");

        ConfigRegistry.CONFIG_LEVITATION = builder
                .define("levitationEffectColor", DEFAULT)
                .comment("Levitation effect color value");

        ConfigRegistry.CONFIG_LUCK = builder
                .define("luckEffectColor", DEFAULT)
                .comment("Luck effect color value");

        ConfigRegistry.CONFIG_UNLUCK = builder
                .define("unluckEffectColor", DEFAULT)
                .comment("Unluck effect color value");

        ConfigRegistry.CONFIG_SLOW_FALLING = builder
                .define("slowFallingEffectColor", DEFAULT)
                .comment("Slow falling effect color value");

        ConfigRegistry.CONFIG_CONDUIT_POWER = builder
                .define("conduitPowerEffectColor", DEFAULT)
                .comment("Conduit power effect color value");

        ConfigRegistry.CONFIG_DOLPHIN_GRACE = builder
                .define("dolphinGraceEffectColor", DEFAULT)
                .comment("Dolphin grace effect color value");

        ConfigRegistry.CONFIG_BAD_OMEN = builder
                .define("badOmenEffectColor", DEFAULT)
                .comment("Bad omen effect color value");

        ConfigRegistry.CONFIG_HERO_OF_THE_VILLAGE = builder
                .define("heroOfTheVillageEffectColor", DEFAULT)
                .comment("Hero of the village effect color value");

        ConfigRegistry.CONFIG_DARKNESS = builder
                .define("darknessEffectColor", DEFAULT)
                .comment("Darkness effect color value");

        VANILLA_POTIONS_CONFIGS.build();
    }

}
