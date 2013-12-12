package minetux.common;

import net.minecraft.block.Block;
import net.minecraft.block.BlockOre;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class BlockDiscDirt extends BlockOre
{

    public BlockDiscDirt(int par1) {
        super(par1);
        this.setCreativeTab(CreativeTabs.tabBlock);
    }
    
    
    public void registerIcons(IconRegister par1IconRegister)
    {
        this.blockIcon = par1IconRegister.registerIcon("minetux:BlockDiscDirt");
    }

}