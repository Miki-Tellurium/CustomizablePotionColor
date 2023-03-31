package com.mikitellurium.customizablepotioncolor.test;

import com.mikitellurium.customizablepotioncolor.CustomizablePotionColorMod;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class CustomPotionTest {

    public static final DeferredRegister<MobEffect> EFFECTS =
            DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, CustomizablePotionColorMod.MOD_ID);

    public static final DeferredRegister<Potion> POTIONS =
            DeferredRegister.create(ForgeRegistries.POTIONS, CustomizablePotionColorMod.MOD_ID);

    //public static final RegistryObject<MobEffect> CUSTOM_EFFECT = EFFECTS.register("custom_effect",
     //       () -> new CustomEffect(MobEffectCategory.HARMFUL, PotionColorTools.getColorInt(ModConfig.CUSTOM_EFFECT)));

   // public static final RegistryObject<Potion> CUSTOM_POTION = POTIONS.register("custom_potion",
    //        () -> new Potion(new MobEffectInstance(CUSTOM_EFFECT.get())));

    public static void register(IEventBus eventBus) {
        EFFECTS.register(eventBus);
        POTIONS.register(eventBus);
    }

}
