package com.mikitellurium.customizablepotioncolor.mixin;

import com.mikitellurium.customizablepotioncolor.api.TelluriumConfig;
import com.mikitellurium.customizablepotioncolor.config.VanillaPotionConfig;
import com.mikitellurium.customizablepotioncolor.util.Colorinator;
import com.mikitellurium.customizablepotioncolor.util.ColorsRegistry;
import com.mikitellurium.customizablepotioncolor.util.ConfigRegistry;
import net.minecraft.world.effect.MobEffect;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(MobEffect.class)
public class StatusEffectMixin {

    @Shadow @Final private int color;

    @Inject(method = "getColor", at = @At("HEAD"), cancellable = true)
    private void setColor(CallbackInfoReturnable<Integer> cir) {
        MobEffect effect = (MobEffect) (Object) this; // Get the instance of the current status effect
        TelluriumConfig.ConfigEntry<String> setting = ConfigRegistry.getConfig(effect); // Get the corresponding config entry
        try {
            if (setting.getValue().equals(VanillaPotionConfig.DEFAULT)) {
                cir.setReturnValue(this.color);
            } else if (setting.getValue().equals(VanillaPotionConfig.OLD)) {
                cir.setReturnValue(ColorsRegistry.getLegacyColorByEffect(effect));
            } else {
                cir.setReturnValue(Colorinator.getColorFromHex(setting.getValue()));
            }
        } catch (Exception e) {
            e.printStackTrace();
            cir.setReturnValue(this.color);
        }
    }

}
