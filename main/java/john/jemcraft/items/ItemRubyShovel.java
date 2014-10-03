package john.jemcraft.items;

import john.jemcraft.lib.Constants;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.Item.ToolMaterial;

public class ItemRubyShovel extends ItemSpade {

	private String name = "RubyShovel";
	
	protected ItemRubyShovel(ToolMaterial m) {
		super(m);
		setUnlocalizedName(Constants.MODID + "_" + name);
		setTextureName(Constants.MODID + ":" + name);
		setCreativeTab(CreativeTabs.tabTools);

	
}	
}
