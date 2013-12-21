package minetux.common;

import static net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.FLOWERS;
import static net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.LAKE;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntityMobSpawner;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenDungeons;
import net.minecraft.world.gen.feature.WorldGenFlowers;
import net.minecraft.world.gen.feature.WorldGenLakes;
import net.minecraft.world.gen.feature.WorldGenLiquids;
import net.minecraftforge.common.DungeonHooks;
import net.minecraftforge.event.terraingen.TerrainGen;

public class BiomeGenEther extends BiomeGenBase {
	
	public final Material blockMaterial;
	
	public BiomeGenEther(int par1) {
		super(par1);
        this.blockMaterial = Material.water;
        this.minHeight = 0.1F;
        this.maxHeight = 0.1F;
        this.spawnableMonsterList.clear();
        this.spawnableCreatureList.clear();
        this.setBiomeName("Ether");

        this.theBiomeDecorator.bigMushroomsPerChunk = 0;
        this.theBiomeDecorator.treesPerChunk = -999;
        this.theBiomeDecorator.flowersPerChunk = 4;
        this.theBiomeDecorator.grassPerChunk = 10;       
	}

	
	public void decorate(World par1World, Random par2Random, int par3, int par4) {
        super.decorate(par1World, par2Random, par3, par4);
        
       
        int k = par3 + par2Random.nextInt(16) + 8;
        int l = par2Random.nextInt(128);
        int i1 = par4 + par2Random.nextInt(16) + 8;
        
        WorldGenHouse house = new WorldGenHouse();
        house.generate(par1World, par2Random, k, l, i1);
        
        
        WorldGenFlowers sunflowerGenerator = new WorldGenFlowers(MineTux.BlockSunFlower.blockID);
        
        boolean doGen = TerrainGen.decorate(par1World, par2Random, par3, par4, FLOWERS);
        for (int j = 0; doGen && j < 3; ++j)
        {
            int m = par3 + par2Random.nextInt(16) + 8;
            int n = par2Random.nextInt(128);
            int o = par4 + par2Random.nextInt(16) + 8;
            sunflowerGenerator.generate(par1World, par2Random, m, n, o);
        }
    }
	
	
}
