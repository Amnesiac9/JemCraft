package john.jemcraft.lib;

import john.jemcraft.blocks.ModBlocks;
import john.jemcraft.items.ModItems;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapelessOreRecipe;
import cpw.mods.fml.common.registry.GameRegistry;


public class Recipes {
	
	public static void loadRecipes(){
		
		GameRegistry.addRecipe(new ItemStack(ModBlocks.blockRuby), new Object[]{
			"ggg",
			"ggg",
			"ggg",
			'g', ModItems.gemRuby});
		
		GameRegistry.addRecipe(new ItemStack(ModBlocks.blockSapphire), new Object[]{
			"ggg",
			"ggg",
			"ggg",
			'g', ModItems.gemSapphire});
		
		GameRegistry.addRecipe(new ItemStack(ModBlocks.blockAmethyst), new Object[]{
			"ggg",
			"ggg",
			"ggg",
			'g', ModItems.gemAmethyst});
		
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.gemAmethyst, 1), new Object[]{
			"gemRuby", "gemSapphire", "gemRuby", "gemSapphire"
			}));

	}
}	
