package duper.extrablocks;

import duper.extrablocks.block.ModBlocks;
import duper.extrablocks.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExtraBlocks implements ModInitializer {
	public static final String MOD_ID = "extrablocks";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}