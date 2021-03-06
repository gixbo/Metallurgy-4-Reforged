package it.hurts.metallurgy_5.world;

import it.hurts.metallurgy_5.block.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.Random;

/***************************
*
* Author : ItHurtsLikeHell
* Project: Metallurgy-5
* Date   : 28 ago 2018
* Time   : 18:24:07
*
***************************/

public class ModWorldGen implements IWorldGenerator {

  @Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
	  switch (world.provider.getDimension()){
			case -1:
				generateNether(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
				break;

			case 0:
				generateOverworld(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
				break;

			case 1:
				generateEnd(random, chunkZ, chunkZ, world, chunkGenerator, chunkProvider);
			default:
				break;
	  }
	}

	//Overworld
//	X : (Max 16), Z : (Max 16), MinY (Min 0), MaxY (Max 265), GrandezzaVena (Min 1), VenePerChunk (Min 1)
	private void generateOverworld(Random random, int chunkX, int chunkY, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider1) {
//		(ModBlocks.getDefaultState(), world, random, chunkX * 16, chunkY * 16, , , , );
		generateOre(ModBlocks.oreCopper, world, random, chunkX, chunkY, 4, 7, 8, 10, 60, Blocks.STONE);
		generateOre(ModBlocks.oreDeepIron, world, random, chunkX, chunkY, 3, 5, 7, 10, 30, Blocks.STONE);
		generateOre(ModBlocks.oreTin, world, random, chunkX, chunkY, 6, 8, 10, 25, 48, Blocks.STONE);
		generateOre(ModBlocks.orePrometheum, world, random, chunkX, chunkY, 6, 10, 10, 0, 64, Blocks.STONE);
		generateOre(ModBlocks.oreManganese,world, random, chunkX, chunkY, 4, 5, 11, 0, 128, Blocks.STONE);
		generateOre(ModBlocks.oreOureclase, world, random, chunkX, chunkY, 3, 4, 15, 0, 128, Blocks.STONE);
		generateOre(ModBlocks.oreInfuscolium, world, random, chunkX, chunkY, 4, 5, 8, 10, 72, Blocks.STONE);
	    generateOre(ModBlocks.oreAdamantine, world, random, chunkX, chunkY, 2, 6, 4, 0, 64, Blocks.STONE);
		generateOre(ModBlocks.oreRubracium, world, random, chunkX, chunkY, 2, 3, 7, 10, 40, Blocks.STONE);
		generateOre(ModBlocks.oreAtlarus, world, random, chunkX, chunkY, 2, 6, 4, 0, 64,  Blocks.STONE);
		generateOre(ModBlocks.oreCarmot, world, random, chunkX, chunkY, 2, 6, 20, 0, 64, Blocks.STONE);
		generateOre(ModBlocks.oreMithril, world, random, chunkX, chunkY, 2, 5, 3, 32, 128, Blocks.STONE);
		generateOre(ModBlocks.oreZinc, world, random, chunkX, chunkY, 4, 5, 4, 0, 128, Blocks.STONE);
		generateOre(ModBlocks.oreOrichalcum, world, random, chunkX, chunkY, 2, 4, 10, 0, 128, Blocks.STONE);
		generateOre(ModBlocks.oreAstralSilver, world, random, chunkX, chunkY, 3, 3, 8, 0, 64, Blocks.STONE);
		generateOre(ModBlocks.oreSilver, world, random, chunkX, chunkY, 2, 3, 17, 0, 128, Blocks.STONE);
		generateOre(ModBlocks.orePlatinum, world, random, chunkX, chunkY, 2, 3 +random.nextInt(3), 2, 0, 80, Blocks.STONE);
		generateOre(ModBlocks.oreSulfur, world, random, chunkX, chunkY, 4, 6, 18, 0, 15, Blocks.STONE);
		generateOre(ModBlocks.orePhosphorite, world, random, chunkX, chunkY, 4, 5, 17, 0, 100, Blocks.STONE);
		generateOre(ModBlocks.oreBitumen, world, random, chunkX, chunkY, 2, 4 + random.nextInt(3), 10, 64, 128, Blocks.STONE);
		generateOre(ModBlocks.orePotash, world, random, chunkX, chunkY,  2, 4 + random.nextInt(3), 11, 32, 72, Blocks.STONE);
	}

	//Nether
	private void generateNether(Random random, int chunkX, int chunkY, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider){
		generateOre(ModBlocks.oreIgnatius, world, random, chunkX, chunkY, 3, 8, 4, 0, 128, Blocks.NETHERRACK); //backup chances: 4
		generateOre(ModBlocks.oreShadowIron, world, random, chunkX, chunkY, 1, 6, 7, 0, 72, Blocks.NETHERRACK);
		generateOre(ModBlocks.oreLemurite, world, random, chunkX, chunkY, 1, 6, 6, 0, 100, Blocks.NETHERRACK);
		generateOre(ModBlocks.oreMidasium, world, random, chunkX, chunkY, 1, 6, 5, 0, 72, Blocks.NETHERRACK);
		generateOre(ModBlocks.oreVyroxeres, world, random, chunkX, chunkY, 1, 7, 4, 0, 64, Blocks.NETHERRACK);
		generateOre(ModBlocks.oreCeruclase, world, random, chunkX, chunkY, 1, 4, 4, 0, 128, Blocks.NETHERRACK);
		generateOre(ModBlocks.oreAlduorite, world, random, chunkX, chunkY, 1, 4, 3, 0, 128, Blocks.NETHERRACK);
		generateOre(ModBlocks.oreKalendrite, world, random, chunkX, chunkY, 1, 4, 3, 27, 64, Blocks.NETHERRACK);
		generateOre(ModBlocks.oreVulcanite, world, random, chunkX, chunkY, 1, 4, 2, 0, 128, Blocks.NETHERRACK);
		generateOre(ModBlocks.oreSanguinite, world, random, chunkX, chunkY, 2, 4, 3, 0, 72, Blocks.NETHERRACK);
	}

	private void generateEnd(Random random, int chunkX, int chunkY, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		generateOre(ModBlocks.oreEximite, world, random, chunkX, chunkY, 1, 3, 3, 0, 128, Blocks.END_STONE);
		generateOre(ModBlocks.oreMeutoite, world, random, chunkX, chunkY, 2, 5, 3, 0, 128, Blocks.END_STONE);
	}

	private void generateOre(Block block, World world, Random random, int chunkX, int chunkZ, int minVeinSize, int maxVeinSize, int chance, int minY, int maxY, Block generateIn) {
  	int veinSize;
  	if(maxVeinSize != minVeinSize)
		veinSize = minVeinSize + random.nextInt(Math.abs(maxVeinSize - minVeinSize));
  	else
  		veinSize = minVeinSize;
		int heightRange = maxY - minY;
		WorldGenMinable gen = new WorldGenMinable(block.getDefaultState(), veinSize, BlockMatcher.forBlock(generateIn));
		for (int i = 0; i < chance; i++){
			int xRand = chunkX * 16 + random.nextInt(16);
			int yRand = random.nextInt(heightRange) + minY;
			int zRand = chunkZ * 16 + random.nextInt(16);
			gen.generate(world, random, new BlockPos(xRand, yRand, zRand));
		}
	}

}
