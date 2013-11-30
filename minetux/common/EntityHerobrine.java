package minetux.common;

import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.pathfinding.PathEntity;
import net.minecraft.world.World;

public class EntityHerobrine extends EntityZombie {

	public EntityHerobrine(World world) {
		super(world);	
	}
	
	
    protected int getDropItemId()
    {
        return MineTux.HopSeed.itemID;
    }

	
	protected void applyEntityAttributes(){
		super.applyEntityAttributes();
		
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setAttribute(15.0D);
	    this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setAttribute(0.2D);
	    this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setAttribute(5.0D);
	}
	
	
	
	
}
