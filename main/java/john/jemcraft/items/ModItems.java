package john.jemcraft.items;

import akka.io.Tcp.Register;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public final class ModItems {
	
	//materials
	public static Item gemSapphire;
	public static Item gemRuby;
	public static Item gemAmethyst;
	
	//tools
		//Sapphire Pick-axe
	public static Item SapphirePickaxe;
	static ToolMaterial SapphireMaterial = EnumHelper.addToolMaterial("SapphireMaterial", 3, 900, 12.0F, 4, 22);
	
		//Sapphire Hoe
	public static Item SapphireHoe;
	/**uses Ruby Material*/
	
	
		//Ruby Axe
	public static Item RubyAxe;
	static ToolMaterial RubyMaterial = EnumHelper.addToolMaterial("RubyMaterialA", 3, 900, 12.0F, 5, 22);
	
		//Ruby Shovel
	public static Item RubyShovel;
	/**uses Ruby Material*/
	
	
	public static void init() {
		
		//materials
		gemRuby = new ItemRuby();
		gemSapphire = new ItemSapphire();
		gemAmethyst = new ItemAmethyst();
		
		//tools
		SapphirePickaxe = new ItemSapphirePickaxe(SapphireMaterial);
		SapphireHoe = new ItemSapphireHoe(SapphireMaterial);
		RubyAxe = new ItemRubyAxe(RubyMaterial);
		RubyShovel = new ItemRubyShovel(RubyMaterial);

		
		
	}
}
