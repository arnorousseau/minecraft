package minetux.common;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenDesertWells;

public class BiomeGenHighlandsBiome extends BiomeGenBase
{
    
    public BiomeGenHighlandsBiome(int par1) {
        super(par1);
        
        this.maxHeight = 0.9F;
        this.minHeight = 0.2F;
        this.theBiomeDecorator.treesPerChunk = -999;
        this.spawnableMonsterList.clear();
        this.spawnableCaveCreatureList.clear();
        this.spawnableCreatureList.clear();
        this.topBlock = (byte)MineTux.BlockDiscStone.blockID;
        this.fillerBlock = (byte)MineTux.BlockDiscDirt.blockID;
        this.theBiomeDecorator.grassPerChunk = 35;
        this.waterColorMultiplier = 50;
    }
    
    public void decorate(World par1World, Random par2Random, int par3, int par4)
    {
    	super.decorate(par1World, par2Random, par3, par4);

        if (par2Random.nextInt(1500) == 0)
        {
            int k = par3 + par2Random.nextInt(16) + 8;
            int l = par4 + par2Random.nextInt(16) + 8;
            WorldGenDesertWells worldgendesertwells = new WorldGenDesertWells();
            worldgendesertwells.generate(par1World, par2Random, k, par1World.getHeightValue(k, l) + 1, l);
        }
    }

}