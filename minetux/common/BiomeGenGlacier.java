package minetux.common;

import net.minecraft.block.Block;
import net.minecraft.world.biome.BiomeGenBase;

public class BiomeGenGlacier extends BiomeGenBase {

	public BiomeGenGlacier(int par1) {
		
        super(par1);
        
        this.topBlock = (byte)Block.ice.blockID;
        this.fillerBlock = (byte)Block.blockSnow.blockID;
        
        this.spawnableCreatureList.clear();
        this.setMinMaxHeight(1.4F, 2.1F);
        this.setTemperatureRainfall(0.0F, 0.0F);
        this.setBiomeName("Glacier");
        
	}
	
}
