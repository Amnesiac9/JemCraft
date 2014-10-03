package john.jemcraft.blocks;

import john.jemcraft.lib.Constants;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.common.registry.GameRegistry;

public class AmethystBlock extends Block {

	private String name = "blockAmethyst";
	
			public AmethystBlock(){
		
		super(Material.rock);
		this.blockHardness = 1;
		this.blockResistance = 100;
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setBlockName(Constants.MODID + "_" + name);
		GameRegistry.registerBlock(this, name);
		setBlockTextureName(Constants.MODID + ":" + name);
		setLightLevel(2.0f);
		setLightOpacity(100);
		setStepSound(Block.soundTypeGlass);		
	}
}
