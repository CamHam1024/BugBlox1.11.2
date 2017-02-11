package midnight.bugblox.blocks;

import midnight.bugblox.Refrence;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextFormatting;

public class SolidBlox extends Block 
{
	public SolidBlox() 
	{
		super(Material.ROCK);
		setUnlocalizedName(Refrence.BugBloxBlocks.SOLIDBLOX.getUnlocalizedName());
		setRegistryName(Refrence.BugBloxBlocks.SOLIDBLOX.getRegistryName());
		
		//Block Properties
		setHardness(-1.0F);
		setResistance(15.0F);
		setLightLevel(0.5F);
		
		//Name Text Formatting
		
	}
	
	
}
