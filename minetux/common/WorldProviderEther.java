package minetux.common;

import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.WorldChunkManagerHell;
import net.minecraft.world.chunk.IChunkProvider;

public class WorldProviderEther extends WorldProvider  {

	public void registerWorldChunkManager()
    {
            this.worldChunkMgr = new WorldChunkManagerHell(MineTux.EtherBiome, MineTux.ether_id, MineTux.ether_id);
            this.dimensionId = MineTux.ether_id;
    }
	
	public IChunkProvider createChunkGenerator()
    {
            return new ChunkProviderEther(this.worldObj, this.worldObj.getSeed(), false);
    }
	
	@Override
	public String getDimensionName() {
		return "Ether";
	}

}
