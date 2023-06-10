package com.mikitellurium.customizablepotioncolor.config;

import com.mikitellurium.customizablepotioncolor.CustomizablePotionColorMod;
import com.mikitellurium.customizablepotioncolor.util.Colorinator;
import com.mikitellurium.customizablepotioncolor.util.ColorsRegistry;
import com.mikitellurium.customizablepotioncolor.util.ConfigRegistry;
import me.shedaniel.clothconfig2.api.ConfigBuilder;
import me.shedaniel.clothconfig2.api.ConfigCategory;
import me.shedaniel.clothconfig2.api.ConfigEntryBuilder;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.text.Text;

import java.io.IOException;

public class ConfigScreen {

    protected static Screen configScreen(Screen parent) {
        ConfigBuilder builder = ConfigBuilder.create()
                .setParentScreen(parent)
                .setTitle(Text.translatable("config.customizablepotioncolor.title"));

        ConfigCategory general = builder.getOrCreateCategory(Text.literal("dummy text"));

        ConfigEntryBuilder entryBuilder = builder.entryBuilder();

        general.addEntry(entryBuilder.startColorField(Text.translatable("config.customizablepotioncolor.speedEffect"),
                        Colorinator.getEffectColor(StatusEffects.SPEED, ConfigRegistry.CONFIG_SPEED))
                .setDefaultValue(ColorsRegistry.getDefaultColorByEffect(StatusEffects.SPEED))
                .setSaveConsumer((newValue) -> updateColorSettings(newValue, StatusEffects.SPEED))
                .build());

        general.addEntry(entryBuilder.startColorField(Text.translatable("config.customizablepotioncolor.slownessEffect"),
                        Colorinator.getEffectColor(StatusEffects.SLOWNESS, ConfigRegistry.CONFIG_SLOWNESS))
                .setDefaultValue(ColorsRegistry.getDefaultColorByEffect(StatusEffects.SLOWNESS))
                .setSaveConsumer((newValue) -> updateColorSettings(newValue, StatusEffects.SLOWNESS))
                .build());


        builder.setSavingRunnable(() -> {
            try {
                VanillaPotionConfig.VANILLA_POTIONS_CONFIGS.save();
                CustomizablePotionColorMod.LOGGER.info("Saved vanilla potions effect color config");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });

        return builder.build();
    }

    private static void updateColorSettings(int newValue, StatusEffect effect) {
        if (Colorinator.getHexString(newValue).equals(Colorinator.getHexString(ColorsRegistry.getDefaultColorByEffect(effect)))) {
            ConfigRegistry.getConfig(effect).setValue(VanillaPotionConfig.DEFAULT);
        } else if (Colorinator.getHexString(newValue).equals(Colorinator.getHexString(ColorsRegistry.getLegacyColorByEffect(effect)))) {
            ConfigRegistry.getConfig(effect).setValue(VanillaPotionConfig.OLD);
        } else {
            ConfigRegistry.getConfig(effect).setValue(Colorinator.getHexString(newValue));
        }
    }

}
