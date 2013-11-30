package minetux.common;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.relauncher.Side;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;

public class ItemOstrichEgg extends Item {

	public ItemOstrichEgg(int par1) {
		super(par1);
	}

	public ItemStack onItemRightClick(ItemStack var1, World var2, EntityPlayer var3)
	{
		
		if(var2.isRemote){
			EntityOstrich entityostrich = new EntityOstrich(var2);
			entityostrich.setLocationAndAngles(var3.posX + 2, var3.posY + 0.5D, var3.posZ + 2, 360.0F, 0.0F);
			var2.spawnEntityInWorld(entityostrich);
	    
			var1.stackSize--;
		}
		
	    return var1;
	}
	
	
	
	
}
