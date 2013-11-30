package minetux.common;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockSilver extends Block {

	public BlockSilver(int par1) {
		super(par1, Material.iron);
		this.setCreativeTab(CreativeTabs.tabBlock);
	}

}
