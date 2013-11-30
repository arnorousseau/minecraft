package minetux.common;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class WorldGeneratorMineTux implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,
			IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		
		if(world.provider.dimensionId == MineTux.ether_id){
			
			for(int i = 0; i < 5; i++)
			{
				(new WorldGenMinable(MineTux.BlockCopper.blockID, 0, 5, Block.stone.blockID)).generate(world, random, (chunkX*16) + random.nextInt(16), random.nextInt(32), (chunkZ*16) + random.nextInt(16));
			}
			
			for(int i = 0; i < 3; i++)
			{
				(new WorldGenMinable(MineTux.BlockSilver.blockID, 0, 5, Block.stone.blockID)).generate(world, random, (chunkX*16) + random.nextInt(16), random.nextInt(32), (chunkZ*16) + random.nextInt(16));
			}
			
			for(int i = 0; i < 2; i++)
			{
				(new WorldGenMinable(MineTux.BlockRuby.blockID, 0, 5, Block.stone.blockID)).generate(world, random, (chunkX*16) + random.nextInt(16), random.nextInt(16), (chunkZ*16) + random.nextInt(16));
			}
			
			for(int i = 0; i < 2; i++)
			{
				(new WorldGenMinable(MineTux.BlockMithril.blockID, 0, 5, Block.stone.blockID)).generate(world, random, (chunkX*16) + random.nextInt(16), random.nextInt(10), (chunkZ*16) + random.nextInt(16));
			}
		}else{
			for(int i = 0; i < 1; i++)
			{
				(new WorldGenMinable(MineTux.BlockRuby.blockID, 0, 1, Block.stone.blockID)).generate(world, random, (chunkX*16) + random.nextInt(16), random.nextInt(16), (chunkZ*16) + random.nextInt(16));
			}
		}
		
		
	}

}
