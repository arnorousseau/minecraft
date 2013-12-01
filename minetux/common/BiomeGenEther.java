package minetux.common;

import static net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.FLOWERS;
import static net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.LAKE;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenFlowers;
import net.minecraft.world.gen.feature.WorldGenLiquids;
import net.minecraftforge.event.terraingen.TerrainGen;

public class BiomeGenEther extends BiomeGenBase {
	
	public final Material blockMaterial;
	
	public BiomeGenEther(int par1) {
		super(par1);
        this.blockMaterial = Material.water;
        this.minHeight = 0.1F;
        this.maxHeight = 0.6F;
        this.spawnableMonsterList.clear();
        this.spawnableCreatureList.clear();
        this.setBiomeName("Ether");

        this.theBiomeDecorator.bigMushroomsPerChunk = 1;
        this.theBiomeDecorator.generateLakes = true;        
	}

	
	public void decorate(World par1World, Random par2Random, int par3, int par4) {
        super.decorate(par1World, par2Random, par3, par4);
        
        WorldGenFlowers sunflowerGenerator = new WorldGenFlowers(MineTux.BlockSunFlower.blockID);
        
        boolean doGen = TerrainGen.decorate(par1World, par2Random, par3, par4, FLOWERS);
        for (int j = 0; doGen && j < 5; ++j)
        {
            int k = par3 + par2Random.nextInt(16) + 8;
            int l = par2Random.nextInt(128);
            int i1 = par4 + par2Random.nextInt(16) + 8;
            sunflowerGenerator.generate(par1World, par2Random, k, l, i1);
        }
        
        


    }
	
	
}
