package minetux.common;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockOre;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class BlockRuby extends BlockOre {

	public BlockRuby(int par1) {
		super(par1);
	}

	public int idDropped(int par1, Random par2Random, int par3)
    {
        return MineTux.GemRuby.itemID;
    }
}
