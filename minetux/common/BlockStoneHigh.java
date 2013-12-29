package minetux.common;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockStoneHigh extends Block {
	
	public BlockStoneHigh(int par1) {
		super(par1,Material.rock);
		this.setCreativeTab(CreativeTabs.tabBlock);
	}
	
}
