package minetux.common;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntityMobSpawner;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.BiomeGenSwamp;
import net.minecraft.world.gen.feature.WorldGenSwamp;
import net.minecraft.world.gen.feature.WorldGenerator;

public class BiomeGenWaterSwamp extends BiomeGenSwamp
{

    private WorldGenSwampBiome worldGeneratorSwampBiome;


	protected BiomeGenWaterSwamp(int i)
    {
        super(i);
     
        this.theBiomeDecorator.treesPerChunk = 4;
        this.theBiomeDecorator.flowersPerChunk = -999;
        this.theBiomeDecorator.deadBushPerChunk = 1;
        this.theBiomeDecorator.mushroomsPerChunk = 8;
        this.theBiomeDecorator.reedsPerChunk = 10;
        this.theBiomeDecorator.clayPerChunk = 1;
        this.theBiomeDecorator.waterlilyPerChunk = 10;
        this.waterColorMultiplier = 1000000;
        this.worldGeneratorSwampBiome = new WorldGenSwampBiome();
    }
    
    @Override
    public WorldGenerator getRandomWorldGenForTrees(Random par1Random)
    {
        return this.worldGeneratorSwampBiome;
    }

   
}