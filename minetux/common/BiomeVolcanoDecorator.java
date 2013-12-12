package minetux.common;

import static net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.SAND;
import net.minecraft.block.Block;
import net.minecraft.world.biome.BiomeDecorator;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.terraingen.DecorateBiomeEvent;
import net.minecraftforge.event.terraingen.TerrainGen;


public class BiomeVolcanoDecorator extends BiomeDecorator
{
        protected WorldGenerator peachGrassGen;
        protected WorldGenerator lavaGen;
        protected WorldGenerator ashGen;
        protected WorldGenerator pitGen;
        
        protected int peachGrassPerChunk;
        protected int lavaGenPerChunk;
        protected int lavaLakesPerChunk;
        protected int waterLakesPerChunk;
        
        public boolean generateBoulders;
        public boolean generateAsh;
        public boolean generatePits;
        
        public BiomeVolcanoDecorator(BiomeGenBase par1BiomeGenBase) {
	        super(par1BiomeGenBase);
	        biome = par1BiomeGenBase;
	        this.ashGen = new WorldGenVolcanoAsh(MineTux.BlockVolcano.blockID, 32);
	        this.peachGrassGen = new WorldGenVolcanoPeachGrass(MineTux.BlockPeachGrass.blockID, 2);
	        this.lavaGen = new WorldGenVolcanoLava();
	        pitGen = new WorldGenPit(MineTux.BlockVolcano.blockID);
	        this.peachGrassPerChunk = 0;
	        this.lavaLakesPerChunk = 0;
	        this.waterLakesPerChunk = 0;
	        this.lavaGenPerChunk = 0;
	        generateBoulders = false;
	        generateAsh = false;
        }

        protected void decorate()
        {
        	MinecraftForge.EVENT_BUS.post(new DecorateBiomeEvent.Pre(currentWorld, randomGenerator, chunk_X, chunk_Z));
        	boolean doGen = TerrainGen.decorate(currentWorld, randomGenerator, chunk_X, chunk_Z, SAND);
         
        	int var1;
	        int var2;
	        int var3;
	        int var4;
	        int var5;
        
	         for (var2 = 0; var2 < peachGrassPerChunk; ++var2)
	         {
	                 var3 = chunk_X + randomGenerator.nextInt(16) + 8;
	                 var4 = randomGenerator.nextInt(256);
	                 var5 = chunk_Z + randomGenerator.nextInt(16) + 8;
	                 peachGrassGen.generate(currentWorld, randomGenerator, var3, var4, var5);
	         }
        
	         for (var2 = 0; var2 < lavaGenPerChunk; ++var2)
	         {
	                 var3 = chunk_X + randomGenerator.nextInt(16) + 8;
	                 var4 = randomGenerator.nextInt(256);
	                 var5 = chunk_Z + randomGenerator.nextInt(16) + 8;
	                 lavaGen.generate(currentWorld, randomGenerator, var3, var4, var5);
	         }
	         
	        

	         if (generateBoulders && randomGenerator.nextInt(32) == 0)
	         {
	                 var2 = chunk_X + randomGenerator.nextInt(16) + 8;
	                 var3 = randomGenerator.nextInt(256);
	                 var4 = chunk_Z + randomGenerator.nextInt(16) + 8;
	                 (new WorldGenVolcanoBoulder()).generate(currentWorld, randomGenerator, var2, var3, var4);
	         }
	         
	         if (generateAsh)
	         {
	                 this.genStandardOre1(10, ashGen, 0, 128);
	         }
	         
	         if (generatePits)
	         {
	                 var4 = chunk_X + randomGenerator.nextInt(16) + 8;
	                 var5 = chunk_Z + randomGenerator.nextInt(16) + 8;
	                 int var6 = currentWorld.getTopSolidOrLiquidBlock(var4, var5);
	
	                 if (var6 > 0)
	                 {
	                         ;
	                 }
	
	                 pitGen.generate(currentWorld, randomGenerator, var4, var6, var5);
	         }

        }
}