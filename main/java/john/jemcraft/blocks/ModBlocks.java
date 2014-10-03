package john.jemcraft.blocks;

import net.minecraft.block.Block;


public final class ModBlocks {
	
	public static Block oreSapphire;
	public static Block oreRuby;
	public static Block oreAmethyst;
	public static Block blockRuby;
	public static Block blockSapphire;
	public static Block blockAmethyst;
	
	public static void init(){
		
		oreRuby = new RubyoreBlock();
		oreSapphire = new SapphireoreBlock();
		oreAmethyst = new AmethystoreBlock();
		blockRuby = new RubyBlock();
		blockSapphire = new SapphireBlock();
		blockAmethyst = new AmethystBlock();
		
	}

}
