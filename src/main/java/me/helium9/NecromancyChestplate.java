package me.helium9;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NecromancyChestplate implements ModInitializer {
	public static final String MOD_ID = "necromancychestplate";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		LOGGER.info("Hello Fabric world!" + MOD_ID);
	}
}