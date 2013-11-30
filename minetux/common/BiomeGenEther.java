package minetux.common;

import net.minecraft.block.material.Material;
import net.minecraft.world.biome.BiomeGenBase;

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

}
