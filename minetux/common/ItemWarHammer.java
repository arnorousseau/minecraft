package minetux.common;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

public class ItemWarHammer extends ItemSword
{
    private float weaponDamage;
    private int timer;
    private final EnumToolMaterial toolMaterial;
        private Icon iconIndex;

    public ItemWarHammer(int i, EnumToolMaterial material)
    {
        super(i, material);
        toolMaterial = material;
        maxStackSize = 1;
        setMaxDamage(material.getMaxUses());
        weaponDamage = 4 + material.getDamageVsEntity();
        
    }

   
    public float getStrVsBlock(ItemStack itemstack, Block block)
    {
        return block.blockID != Block.stone.blockID ? 1.0F : 5F;
    }

    
    public boolean onBlockDestroyed(ItemStack itemstack, int i, int j, int k, int l, EntityLiving entityliving)
    {
        itemstack.damageItem(1, entityliving);
        return true;
    }

  
    public float getDamageVsEntity(Entity entity)
    {
        return weaponDamage;
    }

    public boolean isFull3D()
    {
        return true;
    }

    
    public EnumAction getItemUseAction(ItemStack itemstack)
    {
        return EnumAction.block;
    }

    
    public int getMaxItemUseDuration(ItemStack itemstack)
    {
        return 0x11940;
    }

 
    public boolean canHarvestBlock(Block block)
    {
            return false;
    }

   
    public int getItemEnchantability()
    {
        return toolMaterial.getEnchantability();
    }
   
    public boolean hasEffect(ItemStack par1ItemStack)
    {
             return false;
    }
    public void onCreated(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
             par1ItemStack.addEnchantment(Enchantment.knockback, 6);
    }
   

    public void registerIcons(IconRegister iconRegister)
    {
            itemIcon = iconRegister.registerIcon("minetux:WarHammer");
    }
    
    public boolean onLeftClickEntity(ItemStack stack, EntityPlayer player, Entity entity)
    {
    	
    	if (!player.worldObj.isRemote)
        {
            EntityLightningBolt entitylightningbolt = new EntityLightningBolt(player.worldObj, entity.posX, entity.posY, entity.posZ);
            entitylightningbolt.setLocationAndAngles(entity.posX, entity.posY, entity.posZ, 0.0F, 0.0F);
            player.worldObj.addWeatherEffect(entitylightningbolt);
        }
    	return true;
    }
    
    

}