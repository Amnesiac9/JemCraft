package john.jemcraft.items;

import john.jemcraft.lib.Constants;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemHoe;

public class ItemSapphireHoe extends ItemHoe {

	private String name = "SapphireHoe";
	
	public ItemSapphireHoe(ToolMaterial m) {
		super(m);
		setUnlocalizedName(Constants.MODID + "_" + name);
		setTextureName(Constants.MODID + ":" + name);
		setCreativeTab(CreativeTabs.tabTools);
		

	}

}
