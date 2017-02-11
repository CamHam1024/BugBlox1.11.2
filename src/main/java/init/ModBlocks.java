package init;

import items.ItemBugTablet;
import midnight.bugblox.blocks.BlastBlox;
import midnight.bugblox.blocks.GhostBlox;
import midnight.bugblox.blocks.NormalBlox;
import midnight.bugblox.blocks.SolidBlox;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks 
{
	public static Block solidblox;
	public static Block normalblox;
	public static Block ghostblox;
	public static Block blastblox;
	
	public static void init()
	{
		//New Block
		solidblox = new SolidBlox();
		normalblox = new NormalBlox();
		ghostblox = new GhostBlox();
		blastblox = new BlastBlox();
	}
	
	public static void register()
	{
		//Register Block
		registerBlock(solidblox);
		registerBlock(normalblox);
		registerBlock(ghostblox);
		registerBlock(blastblox);
	}
	
	private static void registerBlock(Block block)
	{
		GameRegistry.register(solidblox);
		GameRegistry.register(normalblox);
		GameRegistry.register(ghostblox);
		GameRegistry.register(blastblox);
		
		ItemBlock item = new ItemBlock(block);
		item.setRegistryName(block.getRegistryName());
		GameRegistry.register(item);
	}
	
	public static void registerRenders()
	{
		//Register Block Renders
		registerRenders(solidblox);
		registerRenders(normalblox);
		registerRenders(ghostblox);
		registerRenders(blastblox);
	}
	
	private static void registerRenders(Block block)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
	}
}
