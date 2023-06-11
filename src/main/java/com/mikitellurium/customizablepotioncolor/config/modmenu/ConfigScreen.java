package com.mikitellurium.customizablepotioncolor.config.modmenu;

import com.mikitellurium.customizablepotioncolor.CustomizablePotionColorMod;
import com.mikitellurium.customizablepotioncolor.api.TelluriumConfig;
import com.mikitellurium.customizablepotioncolor.config.VanillaPotionConfig;
import com.mikitellurium.customizablepotioncolor.util.ConfigRegistry;
import me.shedaniel.clothconfig2.api.ConfigBuilder;
import me.shedaniel.clothconfig2.api.ConfigCategory;
import me.shedaniel.clothconfig2.api.ConfigEntryBuilder;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.text.Text;

import java.io.IOException;
import java.util.Map;

public class ConfigScreen {

    protected static Screen configScreen(Screen parent) {
        ConfigBuilder builder = ConfigBuilder.create()
                .setParentScreen(parent)
                .setTitle(Text.translatable("config.customizablepotioncolor.title"));

        ConfigCategory general = builder.getOrCreateCategory(Text.empty());

        ConfigEntryBuilder entryBuilder = builder.entryBuilder();

        for (Map.Entry<StatusEffect, TelluriumConfig.ConfigEntry<String>> entry : ConfigRegistry.getConfigMap().entrySet()) {
            StatusEffectColorSetting setting = new StatusEffectColorSetting(entryBuilder,
                    Text.translatable("config.customizablepotioncolor." + entry.getValue().getKey()), entry.getKey());
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
