package com.mikitellurium.customizablepotioncolor.test;

import net.minecraft.network.chat.Component;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import org.jetbrains.annotations.Nullable;

public class CustomEffect extends MobEffect {

    protected CustomEffect(MobEffectCategory pCategory, int pColor) {
        super(pCategory, pColor);
    }

    @Override
    public void applyInstantenousEffect(@Nullable Entity pSource, @Nullable Entity pIndirectSource, LivingEntity pLivingEntity, int pAmplifier, double pHealth) {
        if (!pLivingEntity.getLevel().isClientSide)
            pLivingEntity.sendSystemMessage(Component.literal(pLivingEntity.getScoreboardName() + " got a custom effect"));
    }

    @Override
    public boolean isInstantenous() {
        return true;
    }

}
