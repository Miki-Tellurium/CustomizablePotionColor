package com.mikitellurium.customizablepotioncolor.config.screen;

import com.mikitellurium.customizablepotioncolor.CustomizablePotionColorMod;
import com.mikitellurium.customizablepotioncolor.api.TelluriumConfig;
import com.mikitellurium.customizablepotioncolor.config.VanillaPotionConfig;
import com.mikitellurium.customizablepotioncolor.util.ConfigRegistry;
import me.shedaniel.clothconfig2.api.ConfigBuilder;
import me.shedaniel.clothconfig2.api.ConfigCategory;
import me.shedaniel.clothconfig2.api.ConfigEntryBuilder;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.effect.MobEffect;

import java.io.IOException;
import java.util.Map;

public class ConfigScreen {

    protected static Screen configScreen(Screen parent) {
        ConfigBuilder builder = ConfigBuilder.create()
                .setParentScreen(parent)
                .setTitle(Component.translatable("config.customizablepotioncolor.title"));

        ConfigCategory general = builder.getOrCreateCategory(Component.empty());

        ConfigEntryBuilder entryBuilder = builder.entryBuilder();

        for (Map.Entry<MobEffect, TelluriumConfig.ConfigEntry<String>> entry : ConfigRegistry.getConfigMap().entrySet()) {
            StatusEffectColorSetting setting = new StatusEffectColorSetting(entryBuilder,
                    Component.translatable("config.customizablepotioncolor." + entry.getValue().getKey()), entry.getKey());
            general.addEntry(setting.getListEntry());
            general.addEntry(setting.getColorEntry());
        }

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

}
