package minetux.common;

import net.minecraft.entity.Entity;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemMithrilArmor extends ItemArmor {

	public ItemMithrilArmor(int par1, EnumArmorMaterial par2EnumArmorMaterial,int par3, int par4) {
		super(par1, par2EnumArmorMaterial, par3, par4);
	}
	
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, int layer)
	{
		if(stack.itemID == MineTux.MithrilLeggings.itemID){
			return "minetux:textures/models/armor/mithril_layer_2.png";
		}
		else{
			return "minetux:textures/models/armor/mithril_layer_1.png";
		}
	}

}
