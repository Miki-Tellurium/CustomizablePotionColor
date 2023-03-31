package com.mikitellurium.customizablepotioncolor.mixin;

import com.mikitellurium.customizablepotioncolor.util.VanillaEffectsConfigRegistry;
import net.minecraft.world.effect.MobEffect;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(MobEffect.class)
public abstract class MobEffectMixin {

    @Shadow @Final private int color;

    @Inject(method = "getColor", at = @At("HEAD"), cancellable = true)
    private void setColor(CallbackInfoReturnable<Integer> cir) {
        try {
            cir.setReturnValue(VanillaEffectsConfigRegistry.getColorInt(
                    VanillaEffectsConfigRegistry.VANILLA_EFFECTS.get(MobEffect.getId((MobEffect) (Object) this) - 1) // The effect ids start from 1
            ));
        } catch (IndexOutOfBoundsException e) {
            cir.setReturnValue(this.color);
        }
    }

}
