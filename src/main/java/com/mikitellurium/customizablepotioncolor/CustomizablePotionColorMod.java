package com.mikitellurium.customizablepotioncolor;

import com.mikitellurium.customizablepotioncolor.config.VanillaPotionConfig;
import com.mikitellurium.customizablepotioncolor.config.screen.ConfigScreen;
import com.mojang.logging.LogUtils;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.Screen;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.ConfigScreenHandler;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.GameShuttingDownEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

import java.io.IOException;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(CustomizablePotionColorMod.MOD_ID)
public class CustomizablePotionColorMod {
    public static final String MOD_ID = "customizablepotioncolor";
    public static final Logger LOGGER = LogUtils.getLogger();

    public CustomizablePotionColorMod() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        modEventBus.addListener(this::commonSetup);
        MinecraftForge.EVENT_BUS.register(this);

        init();
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    public static void init() {
        try {
            VanillaPotionConfig.initConfig();
            LOGGER.info("Loaded vanilla potions effect color config");
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (ModList.get().isLoaded("cloth_config")) {
            ModLoadingContext.get().registerExtensionPoint(ConfigScreenHandler.ConfigScreenFactory.class,
                    () -> new ConfigScreenHandler.ConfigScreenFactory((mc, screen) -> ConfigScreen.configScreen(screen)));
            LOGGER.info("ClothConfig found. Loaded in-game config menu");
        }
    }

    @SubscribeEvent
    public void onGameShuttingDown(GameShuttingDownEvent event) {
        try {
            VanillaPotionConfig.VANILLA_POTIONS_CONFIGS.save();
            LOGGER.info("Saved vanilla potions effect color config");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

        }

    }

}
