package duper.extrablocks.datagen;

import java.util.function.BiConsumer;

import duper.extrablocks.ExtraBlocks;
import duper.extrablocks.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.SimpleFabricLootTableProvider;
import net.minecraft.data.server.BlockLootTableGenerator;
import net.minecraft.loot.LootTable.Builder;
import net.minecraft.loot.context.LootContextTypes;
import net.minecraft.util.Identifier;

public class ModLootTableGenerator extends SimpleFabricLootTableProvider{

    public ModLootTableGenerator(FabricDataGenerator dataGenerator) {
        super(dataGenerator, LootContextTypes.BLOCK);
    }

    @Override
    public void accept(BiConsumer<Identifier, Builder> t) {
        t.accept(new Identifier(ExtraBlocks.MOD_ID, "blocks/white_concrete_slab"), 
            BlockLootTableGenerator.drops(ModBlocks.WHITE_CONCRETE_SLAB));

        t.accept(new Identifier(ExtraBlocks.MOD_ID, "blocks/white_concrete_stairs"), 
            BlockLootTableGenerator.drops(ModBlocks.WHITE_CONCRETE_STAIRS));
    }
}
