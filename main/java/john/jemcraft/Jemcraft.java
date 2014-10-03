package john.jemcraft;

import john.jemcraft.blocks.ModBlocks;
import john.jemcraft.items.ModItems;
import john.jemcraft.lib.Achievements;
import john.jemcraft.lib.Constants;
import john.jemcraft.lib.JemcraftAchievementPage;
import john.jemcraft.lib.Recipes;
import john.jemcraft.world.PlayerEventJem;
import john.jemcraft.world.WorldGeneratorJems;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.AchievementPage;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.oredict.OreDictionary;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = Constants.MODID, name = Constants.MODNAME, version = Constants.VERSION)
public class Jemcraft {
	

	
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		
		/** PreInitializations */
		
		ModBlocks.init();
		ModItems.init();
		
		// Registrations
		
		GameRegistry.registerWorldGenerator(new WorldGeneratorJems(), 1);
		GameRegistry.registerItem(ModItems.SapphirePickaxe, "SapphirePickaxe", Constants.MODID);
		GameRegistry.registerItem(ModItems.RubyAxe, "RubyAxe", Constants.MODID);
		GameRegistry.registerItem(ModItems.RubyShovel, "RubyShovel", Constants.MODID);
		GameRegistry.registerItem(ModItems.SapphireHoe, "SapphireHoe", Constants.MODID);
		

	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		
		
		/* Ore Dictionary Additions */
		
		OreDictionary.registerOre("oreRuby", new ItemStack(ModBlocks.oreRuby));
		OreDictionary.registerOre("gemRuby", new ItemStack(ModItems.gemRuby));
		OreDictionary.registerOre("oreSapphire", new ItemStack(ModBlocks.oreSapphire));
		OreDictionary.registerOre("gemSapphire", new ItemStack(ModItems.gemSapphire));
		OreDictionary.registerOre("oreAmethyst", new ItemStack(ModBlocks.oreAmethyst));
		OreDictionary.registerOre("gemAmethyst", new ItemStack(ModItems.gemAmethyst));		
		
		/* Initializations */
		
		Recipes.loadRecipes();
		Achievements.init();
		AchievementPage.registerAchievementPage(JemcraftAchievementPage.Jemcraftpage);
		
		FMLCommonHandler.instance().bus().register(new PlayerEventJem());
		/** MinecraftForge.EVENT_BUS.register(event); Forge event, register if needed. */
		
		
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
	}
}
