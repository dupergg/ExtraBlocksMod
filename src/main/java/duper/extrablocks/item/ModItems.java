package duper.extrablocks.item;

import duper.extrablocks.ExtraBlocks;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item MAYO = registerItem("mayo",
            new Item(new FabricItemSettings().group(ModItemGroup.MCSHOT)));

    public static final Item MCSHOT = registerItem("mcshot",
            new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(6).saturationModifier(6).build())
                    .group(ModItemGroup.MCSHOT)));

    private static Item registerItem(String name, Item item) {
            return Registry.register(Registry.ITEM, new Identifier(ExtraBlocks.MOD_ID, name), item);
    }

    public static void registerModItems() {
        ExtraBlocks.LOGGER.debug("Registering Mod Items for " + ExtraBlocks.MOD_ID);
    }
}
