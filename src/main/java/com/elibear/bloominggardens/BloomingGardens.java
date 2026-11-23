
package com.elibear.bloominggardens;

import net.fabricmc.api.ModInitializer;
import net.minecraft.resources.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BloomingGardens implements ModInitializer {

	public static final String MOD_ID = "blooming-gardens";

	public static final Logger LOGGER =
			LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModBlocks.initialize();
		LOGGER.info("Blooming Gardens has bloomed!");
	}

	public static Identifier id(String path) {
		return Identifier.fromNamespaceAndPath(MOD_ID, path);
	}
}
