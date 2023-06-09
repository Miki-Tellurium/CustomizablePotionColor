package com.mikitellurium.customizablepotioncolor;

import com.mikitellurium.customizablepotioncolor.config.VanillaPotionConfig;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class CustomizablePotionColorMod implements ModInitializer {

	public static final String MOD_ID = "customizablepotioncolor";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		try {
			VanillaPotionConfig.initConfig();
			CustomizablePotionColorMod.LOGGER.info("Loaded vanilla potions colors config file");
		} catch (IOException e) {
			throw new RuntimeException(e);
		}

	}

}