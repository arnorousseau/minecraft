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


	protected BiomeGenWaterSwamp(int i)
    {
        super(i);
        this.minHeight = 0.3F;
        this.maxHeight = 1.6F;
        this.theBiomeDecorator.treesPerChunk = 7;
    	this.theBiomeDecorator.grassPerChunk = 3;
    }
    

   
}