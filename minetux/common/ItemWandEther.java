package minetux.common;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.relauncher.Side;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;

public class ItemWandEther extends Item {

	public ItemWandEther(int par1) {
		super(par1);
		this.setCreativeTab(CreativeTabs.tabMisc);
	}

	
	public ItemStack onItemRightClick(ItemStack var1, World var2, EntityPlayer var3)
	{
		Side side = FMLCommonHandler.instance().getEffectiveSide();
		if (side == Side.SERVER)
		{
			if (var3 instanceof EntityPlayerMP)
			{
				WorldServer worldserver = (WorldServer)var2;
				
				EntityPlayerMP var4 = (EntityPlayerMP)var3;
				if (var3.ridingEntity == null && var3.riddenByEntity == null && var3.dimension != MineTux.ether_id)
				{
					var4.mcServer.getConfigurationManager().transferPlayerToDimension(var4, MineTux.ether_id, new EtherTeleporter(worldserver));
				}else{
					var4.mcServer.getConfigurationManager().transferPlayerToDimension(var4, 0, new EtherTeleporter(worldserver));
				}
			}
		}
		return var1;
	}
}
