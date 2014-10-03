package john.jemcraft.blocks;

import john.jemcraft.lib.Constants;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class RubyBlock extends Block {
	
	private String name = "blockRuby";
	
	public RubyBlock(){
		
		super(Material.rock);
		this.blockHardness = 1;
		this.blockResistance = 100;
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setBlockName(Constants.MODID + "_" + name);
		GameRegistry.registerBlock(this, name);
		setBlockTextureName(Constants.MODID + ":" + name);
		setLightLevel(3.0f);
		setLightOpacity(200);
		setStepSound(Block.soundTypeGlass);		
		
	}

}
