package net.tavi.tutorialmod;

import net.fabricmc.api.ModInitializer;

import net.tavi.tutorialmod.TavBlocks.ModBlocks;
import net.tavi.tutorialmod.TavItems.ModItemGroups;
import net.tavi.tutorialmod.TavItems.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TutorialMod implements ModInitializer {
	public static final String MOD_ID = "tutorialmodtav";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
        ModItemGroups.registeritemgroups();
        ModItems.registerModItems();
        ModBlocks.registerModBlocks();
		LOGGER.info("Hello Fabric world!");
	}
}