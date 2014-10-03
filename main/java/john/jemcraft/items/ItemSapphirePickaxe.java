package john.jemcraft.items;

import john.jemcraft.lib.Constants;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemPickaxe;
import net.minecraftforge.common.util.EnumHelper;





public class ItemSapphirePickaxe extends ItemPickaxe {

	private String name = "SapphirePickaxe";
	
	protected ItemSapphirePickaxe(ToolMaterial M ) {
		super(M);
		setUnlocalizedName(Constants.MODID + "_" + name);
		setTextureName(Constants.MODID + ":" + name);
		setCreativeTab(CreativeTabs.tabTools);
		
		
		
}
}
