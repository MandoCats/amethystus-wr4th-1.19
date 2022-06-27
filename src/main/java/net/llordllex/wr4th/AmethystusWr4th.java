package net.llordllex.wr4th;

import net.fabricmc.api.ModInitializer;
import net.llordllex.wr4th.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AmethystusWr4th implements ModInitializer {
	public static final String MOD_ID = "wrath";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();

		LOGGER.info("Meow!");
	}
}
