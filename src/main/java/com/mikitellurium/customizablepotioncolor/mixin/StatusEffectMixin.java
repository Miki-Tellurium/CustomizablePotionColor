package com.mikitellurium.customizablepotioncolor.mixin;

import com.mikitellurium.customizablepotioncolor.api.TelluriumConfig;
import com.mikitellurium.customizablepotioncolor.config.VanillaPotionConfig;
import com.mikitellurium.customizablepotioncolor.util.VanillaEffectsColorsRegistry;
import com.mikitellurium.customizablepotioncolor.util.VanillaEffectsConfigRegistry;
import net.minecraft.entity.effect.StatusEffect;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(StatusEffect.class)
public class StatusEffectMixin {

    @Shadow @Final private int color;

    @Inject(method = "getColor", at = @At("HEAD"), cancellable = true)
    private void setColor(CallbackInfoReturnable<Integer> cir) {
        StatusEffect effect = (StatusEffect) (Object) this; // Get the instance of the current status effect
        TelluriumConfig.ConfigEntry<String> setting = VanillaEffectsConfigRegistry.getConfig(effect); // Get the corresponding config entry
        try {
            if (setting.getValue().equals(VanillaPotionConfig.DEFAULT)) {
                cir.setReturnValue(this.color);
            } else if (setting.getValue().equals(VanillaPotionConfig.OLD)) {
                cir.setReturnValue(VanillaEffectsColorsRegistry.getOldColorByEffect(effect));
            } else {
                cir.setReturnValue(VanillaEffectsConfigRegistry.getColorInt(setting));
            }
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
            cir.setReturnValue(this.color);
        }
    }

}
