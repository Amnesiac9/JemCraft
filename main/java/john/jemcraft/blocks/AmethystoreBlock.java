package john.jemcraft.blocks;

import java.util.Random;

import john.jemcraft.items.ModItems;
import john.jemcraft.lib.Constants;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class AmethystoreBlock extends Block {

	private String name = "oreAmethyst";
	
	public AmethystoreBlock(){
		
		super(Material.rock);
		this.blockHardness = 11;
		this.blockResistance = 15;
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setBlockName(Constants.MODID + "_" + name);
		GameRegistry.registerBlock(this, name);
		setBlockTextureName(Constants.MODID + ":" + name);
		
	}
	
	public Item getItemDropped(int metadata, Random rand, int fortune){
		return ModItems.gemAmethyst;
		}
		public int quantityDropped(Random rand){
		return 2;
		}
}
