package minetux.common;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.pathfinding.PathEntity;
import net.minecraft.world.World;

public class EntityOgre extends EntityMob  {

	public EntityOgre(World world) {
		super(world);	
		this.isImmuneToFire = true;
		this.setCurrentItemOrArmor(0, new ItemStack(Item.axeGold));		
	}
	
	
	
	protected String getLivingSound()
    {
        return "mob.zombiepig.zpig";
    }
	
	
	public boolean getCanSpawnHere(){
		int percentage = this.rand.nextInt(100);
        return (percentage < 5);
	}
	
	
	protected void applyEntityAttributes(){
		super.applyEntityAttributes();
		
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setAttribute(15.0D);
	    this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setAttribute(0.5D);
	    this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setAttribute(5.0D);
	}

	
	protected void dropRareDrop(int par1)
    {
        this.dropItem(MineTux.GemRuby.itemID, 1);
    }
	
	
}
