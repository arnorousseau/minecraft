package minetux.common;

import java.util.Random;

import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockOre;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class BlockDiscStone extends BlockOre {


	public BlockDiscStone(int par1, String texture) {
			super(par1);
			this.setCreativeTab(CreativeTabs.tabBlock);
	}

	public int idDropped(int par1, Random par2Random, int par3)
	{
		return MineTux.BlockDiscStone.blockID;
	}
		
	public int quantityDropped(Random random)
	{
		return 1;
	}


	@Override
	public void registerIcons(IconRegister par1IconRegister)
	{
        this.blockIcon = par1IconRegister.registerIcon("minetux:BlockDiscStone");
	}

}