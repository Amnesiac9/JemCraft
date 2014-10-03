package john.jemcraft.items;

import john.jemcraft.lib.Constants;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;

public class ItemRubyAxe extends ItemAxe {

	private String name = "RubyAxe";
	
	protected ItemRubyAxe(ToolMaterial m) {
		super(m);
		setUnlocalizedName(Constants.MODID + "_" + name);
		setTextureName(Constants.MODID + ":" + name);
		setCreativeTab(CreativeTabs.tabTools);
		
}
}
