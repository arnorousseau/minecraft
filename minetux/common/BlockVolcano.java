package minetux.common;

import static net.minecraftforge.common.ForgeDirection.UP;

import java.util.Random;



import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeDirection;

public class BlockVolcano extends Block
{
        public BlockVolcano(int par1)
        {
            super(par1, Material.sand);
        }

        @Override
        public void registerIcons(IconRegister par1IconRegister)
        {
            blockIcon = par1IconRegister.registerIcon("minetux:BlockVolcano");
        }


        @Override
        public AxisAlignedBB getCollisionBoundingBoxFromPool(World par1World, int par2, int par3, int par4)
        {
            float var5 = 0.125F;
            return AxisAlignedBB.getAABBPool().getAABB(par2, par3, par4, par2 + 1, par3 + 1 - var5, par4 + 1);
        }


        @Override
        public void randomDisplayTick(World par1World, int par2, int par3, int par4, Random par5Random)
        {
            super.randomDisplayTick(par1World, par2, par3, par4, par5Random);

            if (par5Random.nextInt(2) == 0)
            {
                par1World.spawnParticle("smoke", par2 + par5Random.nextFloat(), par3 + 1.1F, par4 + par5Random.nextFloat(), 0.0D, 0.0D, 0.0D);
            }
        }

        @Override
        public boolean isFireSource(World world, int x, int y, int z, int metadata, ForgeDirection side)
        {
            if (blockID == MineTux.BlockVolcano.blockID && side == UP)
                    return true;
            return false;
        }

        
        @Override
        public void onEntityCollidedWithBlock(World par1World, int par2, int par3, int par4, Entity par5Entity)
        {
            par5Entity.motionX *= 0.4D;
            par5Entity.motionZ *= 0.4D;
        }

        
        @Override
        public int idDropped(int par1, Random par2Random, int par3)
        {
            return MineTux.BlockVolcano.blockID;
        }

        @Override
        public int damageDropped(int meta)
        {
            return 1;
        }

        @Override
        public int quantityDropped(Random par1Random)
        {
            return 4;
        }
}