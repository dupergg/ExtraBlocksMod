package duper.extrablocks.block;

import duper.extrablocks.ExtraBlocks;
import duper.extrablocks.item.ModItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.block.SlabBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {
    public static final Block WHITE_CONCRETE_STAIRS = registerBlock("white_concrete_stairs", 
        new ModStairsBlock(Blocks.WHITE_CONCRETE.getDefaultState(),
        FabricBlockSettings.of(Material.STONE).strength(1.8f).requiresTool()), ModItemGroup.MCSHOT);

    public static final Block WHITE_CONCRETE_SLAB = registerBlock("white_concrete_slab", 
        new SlabBlock(FabricBlockSettings.of(Material.STONE).strength(1.8f).requiresTool()), ModItemGroup.MCSHOT);

    private static Block registerBlock(String name, Block block, ItemGroup tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(ExtraBlocks.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
        return Registry.register(Registry.ITEM, new Identifier(ExtraBlocks.MOD_ID, name),
            new BlockItem(block, new FabricItemSettings().group(tab)));
    }

    public static void registerModBlocks() {
        ExtraBlocks.LOGGER.debug("Registering Blocks for " + ExtraBlocks.MOD_ID);
    }
}
