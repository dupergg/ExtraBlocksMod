package duper.extrablocks.item;

import duper.extrablocks.ExtraBlocks;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup MCSHOT = FabricItemGroupBuilder.build(
            new Identifier(ExtraBlocks.MOD_ID, "mcshot"), () -> new ItemStack(ModItems.MCSHOT));
}
