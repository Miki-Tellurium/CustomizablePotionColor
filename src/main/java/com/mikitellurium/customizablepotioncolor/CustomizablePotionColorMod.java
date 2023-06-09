package com.mikitellurium.customizablepotioncolor;

import com.mikitellurium.customizablepotioncolor.config.VanillaPotionConfig;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class CustomizablePotionColorMod implements ModInitializer {

	public static final Logger LOGGER = LoggerFactory.getLogger("customizablepotioncolor");

	@Override
	public void onInitialize() {
		try {
			VanillaPotionConfig.initConfig();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

}