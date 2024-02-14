package me.helium9;

import me.helium9.block.ModBlocks;
import me.helium9.item.ModItemGroups;
import me.helium9.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NecromancyChestplate implements ModInitializer {
	public static final String MOD_ID = "necromancychestplate";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Init " + MOD_ID);


		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModItemGroups.registerItemGroups();
	}
}