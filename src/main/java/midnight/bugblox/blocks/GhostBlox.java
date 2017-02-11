package midnight.bugblox.blocks;

import javax.annotation.Nullable;

import midnight.bugblox.Refrence;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class GhostBlox extends Block 
{
	public GhostBlox() 
	{
		super(Material.GLASS);
		setUnlocalizedName(Refrence.BugBloxBlocks.GHOSTBLOX.getUnlocalizedName());
		setRegistryName(Refrence.BugBloxBlocks.GHOSTBLOX.getRegistryName());
		
		//Block Properties
		setHardness(-1.0F);
		setResistance(6000.0F);
		setLightLevel(0F);
	}
	
	//Block Attributes
	@SideOnly(Side.CLIENT)
    public BlockRenderLayer getBlockLayer()
    {
        return BlockRenderLayer.TRANSLUCENT;
    }

	
	public boolean isOpaqueCube(IBlockState state)
    {
        return false;
    }
	
	@Nullable
    public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, IBlockAccess worldIn, BlockPos pos)
    {
        return NULL_AABB;
    }
	
	public boolean isFullCube(IBlockState state)
    {
        return false;
    }
}
