package john.jemcraft.items;

import john.jemcraft.lib.Constants;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemSapphire extends Item {
	
	private String name = "gemSapphire";
	
	public ItemSapphire() {
		
		setUnlocalizedName(Constants.MODID + "_" + name);
		GameRegistry.registerItem(this,  name);
		setCreativeTab(CreativeTabs.tabMaterials);
		setTextureName(Constants.MODID + ":" + name);
	}

}
