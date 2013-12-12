package minetux.common;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class WorldGenVolcanoPeachGrass extends WorldGenerator
{
    private int peachGrassBottomID;
    private int peachGrassBottomMetadata;

    public WorldGenVolcanoPeachGrass(int par1, int par2)
    {
        this.peachGrassBottomID = par1;
        this.peachGrassBottomMetadata = par2;
    }

    public boolean generate(World par1World, Random par2Random, int par3, int par4, int par5)
    {
        int var11;

        for (boolean var6 = false; ((var11 = par1World.getBlockId(par3, par4, par5)) == 0 || var11 == Block.leaves.blockID) && par4 > 0; --par4)
        {
            ;
        }

        for (int var7 = 0; var7 < 128; ++var7)
        {
            int var8 = par3 + par2Random.nextInt(8) - par2Random.nextInt(8);
            int var9 = par4 + par2Random.nextInt(4) - par2Random.nextInt(4);
            int var10 = par5 + par2Random.nextInt(8) - par2Random.nextInt(8);

            if (par1World.isAirBlock(var8, var9, var10) && Block.blocksList[this.peachGrassBottomID].canBlockStay(par1World, var8, var9, var10))
            {
                par1World.setBlock(var8, var9, var10, MineTux.BlockPeachGrass.blockID, this.peachGrassBottomMetadata, 1);par1World.setBlock(var8, var9 + 1, var10, MineTux.BlockPeachGrass.blockID, this.peachGrassBottomMetadata, 1);
            }
        }

        return true;
    }
}