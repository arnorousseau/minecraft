package minetux.common;

import static net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.FLOWERS;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntityMobSpawner;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenFlowers;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.event.terraingen.TerrainGen;


public class BiomeGenVolcano extends BiomeGenBase
{
        private BiomeVolcanoDecorator customBiomeDecorator;
        private WorldGenerator theWorldGenerator;
   
		public BiomeGenVolcano(int par1)
		{
		        
		        super(par1);
		        
		        spawnableCreatureList.clear();
		        spawnableMonsterList.clear();
		        spawnableWaterCreatureList.clear();
		        this.setMinMaxHeight(0.2F, 0.6F);
		        		       
		        topBlock = (byte)MineTux.BlockVolcano.blockID;
		        fillerBlock = (byte)MineTux.BlockVolcano.blockID;
		        
		        theBiomeDecorator = new BiomeVolcanoDecorator(this);
		        customBiomeDecorator = (BiomeVolcanoDecorator)theBiomeDecorator;
		        customBiomeDecorator.treesPerChunk = -999;
		        customBiomeDecorator.grassPerChunk = 15;
		        customBiomeDecorator.flowersPerChunk = -999;
		        customBiomeDecorator.mushroomsPerChunk = -999;
		        customBiomeDecorator.sandPerChunk = -999;
		        customBiomeDecorator.sandPerChunk2 = -999;
		        customBiomeDecorator.lavaLakesPerChunk = 15;
		        customBiomeDecorator.generatePits = true;
		        customBiomeDecorator.lavaGenPerChunk = 2;
		        waterColorMultiplier = 16711680;
		                
		}

		@Override
		public int getSkyColorByTemp(float par1)
		{
			return 8026746;
		}
         
		public int getWaterColor()
        {
            return 50;
 		}
		
		public void decorate(World par1World, Random par2Random, int par3, int par4) {
	        super.decorate(par1World, par2Random, par3, par4);
	        
	        int k = par3 + par2Random.nextInt(16) + 8;
	        int l = par2Random.nextInt(128);
	        int i1 = par4 + par2Random.nextInt(16) + 8;
	        
	        Material material = par1World.getBlockMaterial(k, l, i1-1);
	        if(material.isSolid()){
	        	par1World.setBlock(k, l, i1, Block.mobSpawner.blockID, 0, 2);
	        	TileEntityMobSpawner tileentitymobspawner = (TileEntityMobSpawner)par1World.getBlockTileEntity(k, l, i1);

	            if (tileentitymobspawner != null) {
	            	tileentitymobspawner.getSpawnerLogic().setMobID("MazeSlime");	
	            }
	        }
	    }
}