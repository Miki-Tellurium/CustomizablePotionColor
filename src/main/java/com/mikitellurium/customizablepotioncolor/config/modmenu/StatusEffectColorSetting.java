package com.mikitellurium.customizablepotioncolor.config.modmenu;

import com.mikitellurium.customizablepotioncolor.config.VanillaPotionConfig;
import com.mikitellurium.customizablepotioncolor.util.Colorinator;
import com.mikitellurium.customizablepotioncolor.util.ColorsRegistry;
import com.mikitellurium.customizablepotioncolor.util.ConfigRegistry;
import me.shedaniel.clothconfig2.api.ConfigEntryBuilder;
import me.shedaniel.clothconfig2.gui.entries.ColorEntry;
import me.shedaniel.clothconfig2.gui.entries.SelectionListEntry;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.text.Text;

public class StatusEffectColorSetting {

    private final String CUSTOM = "custom";
    private final String[] options = new String[] {
            VanillaPotionConfig.DEFAULT,
            VanillaPotionConfig.OLD,
            CUSTOM
    };

    private final StatusEffect statusEffect;
    private final SelectionListEntry<String> listEntry;
    private final ColorEntry colorEntry;

    public StatusEffectColorSetting(ConfigEntryBuilder builder, Text nameKey, StatusEffect statusEffect) {
        this.statusEffect = statusEffect;
        this.colorEntry = builder.startColorField(Text.translatable(statusEffect.getTranslationKey())
                                .append(Text.translatable("config.customizablepotioncolor.hexValue")),
                        Colorinator.getEffectColor(this.statusEffect, ConfigRegistry.getConfig(this.statusEffect)))
                .setDefaultValue(ColorsRegistry.getDefaultColorByEffect(this.statusEffect))
                .setSaveConsumer((newValue) -> updateConfig(newValue, this.statusEffect))
                .build();
        this.listEntry = builder.startSelector(nameKey, this.options, getStartingString(this.colorEntry, statusEffect))
                .setDefaultValue(options[0])
                .setNameProvider(this::updateColorEntry)
                .build();
    }

    private String getStartingString(ColorEntry entry, StatusEffect effect) {
        if (entry.getValue().equals(ColorsRegistry.getDefaultColorByEffect(effect))) {
            return "default";
        } else if (entry.getValue().equals(ColorsRegistry.getLegacyColorByEffect(effect))) {
            return "old";
        } else {
            return "custom";
        }
    }

    private Text updateColorEntry(String option) {
        if (option.equals(options[0])) {
            this.colorEntry.setValue(ColorsRegistry.getDefaultColorByEffect(this.statusEffect));
        } else if (option.equals(options[1])) {
            this.colorEntry.setValue(ColorsRegistry.getLegacyColorByEffect(this.statusEffect));
        }
        this.colorEntry.setEditable(option.equals(options[2]));
        return Text.of(option);
    }

    private void updateConfig(int newValue, StatusEffect effect) {
        if (Colorinator.getHexString(newValue).equals(Colorinator.getHexString(ColorsRegistry.getDefaultColorByEffect(effect)))) {
            ConfigRegistry.getConfig(effect).setValue(VanillaPotionConfig.DEFAULT);
        } else if (Colorinator.getHexString(newValue).equals(Colorinator.getHexString(ColorsRegistry.getLegacyColorByEffect(effect)))) {
            ConfigRegistry.getConfig(effect).setValue(VanillaPotionConfig.OLD);
        } else {
            ConfigRegistry.getConfig(effect).setValue(Colorinator.getHexString(newValue));
        }
    }

    public StatusEffect getStatusEffect() {
        return statusEffect;
    }

    public SelectionListEntry<String> getListEntry() {
        return listEntry;
    }

    public ColorEntry getColorEntry() {
        return colorEntry;
    }

}
