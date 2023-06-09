package com.mikitellurium.customizablepotioncolor;

import com.mikitellurium.customizablepotioncolor.config.VanillaPotionConfig;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientLifecycleEvents;

import java.io.IOException;

public class ModClientInit implements ClientModInitializer {

    @Override
    public void onInitializeClient() {

        ClientLifecycleEvents.CLIENT_STARTED.register((client -> {
            try {
                VanillaPotionConfig.initConfig();
                CustomizablePotionColorMod.LOGGER.info("Loaded vanilla potions colors config file");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }));

    }

}
