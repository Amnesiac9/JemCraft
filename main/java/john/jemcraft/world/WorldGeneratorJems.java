package john.jemcraft.world;

import java.util.Random;

import john.jemcraft.blocks.ModBlocks;
import john.jemcraft.blocks.RubyoreBlock;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class WorldGeneratorJems implements IWorldGenerator {


	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider ChunkProvider) {
		switch (world.provider.dimensionId) { 
		case 0: GenerateOverworld(random, chunkX * 16, chunkZ * 16, world); break;
		case 1: GenerateEnd(random, chunkX * 16, chunkZ * 16, world); break;
		case -1: GenerateNether(random, chunkX * 16, chunkZ * 16, world); break;
		
		}
	}

	private void GenerateNether(Random random, int i, int j, World world) {
	
	}

	private void GenerateEnd(Random random, int i, int j, World world) {
		
	}

	private void GenerateOverworld(Random random, int x, int z, World world) {
		
		this.addOreSpawn(ModBlocks.oreRuby, world, random, x, z, 5, 10, 5, 1, 45);
		this.addOreSpawn(ModBlocks.oreSapphire, world, random, x, z, 4, 10, 6, 3, 55);
		this.addOreSpawn(ModBlocks.oreAmethyst, world, random, x, z, 3, 6, 3, 1, 20);
		
	
		
	}
	

	public void addOreSpawn(Block block, World world, Random random, int blockXpos, int blockZpos, int minVeinSize, int maxVeinSize, int chanceToSpawn, int minY, int maxY)
	{
		WorldGenMinable minable = new WorldGenMinable(block, minVeinSize + random.nextInt(maxVeinSize - minVeinSize), Blocks.stone);
		for(int i = 0; i < chanceToSpawn; i++){
			int posX = blockXpos + random.nextInt(15);
			int posY = minY + random.nextInt(maxY - minY);
			int posZ = blockZpos + random.nextInt(15);
			minable.generate(world, random, posX, posY, posZ);
		}		
	}
}	
	
	

