package midnight.bugblox.blocks;

import midnight.bugblox.Refrence;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class NormalBlox extends Block 
{
	public NormalBlox() 
	{
		super(Material.CLOTH);
		setUnlocalizedName(Refrence.BugBloxBlocks.NORMALBLOX.getUnlocalizedName());
		setRegistryName(Refrence.BugBloxBlocks.NORMALBLOX.getRegistryName());
		
		//Block Properties
		setHardness(0.5F);
		setResistance(15.0F);
		setLightLevel(0F);
	}

}
