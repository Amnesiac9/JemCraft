package john.jemcraft.items;

import cpw.mods.fml.common.registry.GameRegistry;
import john.jemcraft.lib.Constants;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemRuby extends Item{
	
	private String name = "gemRuby";
	
	public ItemRuby() {
		
		setUnlocalizedName(Constants.MODID + "_" + name);
		GameRegistry.registerItem(this,  name);
		setCreativeTab(CreativeTabs.tabMaterials);
		setTextureName(Constants.MODID + ":" + name);
		
	}

}
