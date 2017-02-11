package init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class ModCrafting 
{
	public static void register()
	{
		//Item Crafting
		GameRegistry.addRecipe(new ShapedOreRecipe (new ItemStack(ModItems.bugtablet), "ICI", "CRC", "ICI", 'I', "ingotIron", 'C', Items.COAL, 'R', Blocks.REDSTONE_BLOCK));
		
		//Block Crafting
		GameRegistry.addRecipe(new ShapedOreRecipe (new ItemStack(ModBlocks.solidblox), "III", "ITI", "III", 'I', Blocks.IRON_BLOCK, 'T', ModItems.bugtablet));
	}
}
