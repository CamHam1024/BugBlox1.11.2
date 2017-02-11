package midnight.bugblox.blocks;

import midnight.bugblox.Refrence;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlastBlox extends Block 
{
	public BlastBlox() 
	{
		super(Material.CLOTH);
		setUnlocalizedName(Refrence.BugBloxBlocks.BLASTBLOX.getUnlocalizedName());
		setRegistryName(Refrence.BugBloxBlocks.BLASTBLOX.getRegistryName());
		
		//Block Properties
		setHardness(1F);
		setResistance(1.0F);
		setLightLevel(1F);
	}
}
