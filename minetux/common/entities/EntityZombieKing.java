package minetux.common.entities;

import net.minecraft.block.Block;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIBreakDoor;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveThroughVillage;
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public class EntityZombieKing extends EntityMob
{
       
		public EntityZombieKing(World par1World)
        {
            super(par1World);
	        this.getNavigator().setBreakDoors(true);
	        this.tasks.addTask(0, new EntityAISwimming(this));
	        this.tasks.addTask(1, new EntityAIBreakDoor(this));
	        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityPlayer.class, 1.0D, false));
	        this.tasks.addTask(3, new EntityAIAttackOnCollide(this, EntityVillager.class, 1.0D, true));
	        this.tasks.addTask(4, new EntityAIMoveTowardsRestriction(this, 1.0D));
	        this.tasks.addTask(5, new EntityAIMoveThroughVillage(this, 1.0D, false));
	        this.tasks.addTask(6, new EntityAIWander(this, 1.0D));
	        this.tasks.addTask(7, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
	        this.tasks.addTask(7, new EntityAILookIdle(this));
	        this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, true));
	        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 0, true));
	        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityVillager.class, 0, false));
        }
        
		
		public boolean getCanSpawnHere()
	    {
	        return true;
	    }
		
	    protected String getLivingSound()
	    {
	        return "mob.zombie.say";
	    }
    
	    protected String getHurtSound()
	    {
	        return "mob.zombie.hurt";
	    }
	    
	    protected String getDeathSound()
	    {
	        return "mob.zombie.death";
	    }
        
	    protected void playStepSound(int par1, int par2, int par3, int par4)
	    {
	        this.playSound("mob.zombie.step", 0.15F, 1.0F);
	    }
        
	    protected int getDropItemId()
	    {
	            return Block.obsidian.blockID;
	    }
    
	    protected void dropRareDrop(int var1)
	    {
	        switch (this.rand.nextInt(3))
	        {
	            case 0:
	                this.dropItem(Item.helmetChain.itemID, 1);
	                break;
	
	            case 1:
	                this.dropItem(Item.plateChain.itemID, 1);
	                break;
	
	            case 2:
	                this.dropItem(Item.legsChain.itemID, 1);
	        }
	    }
	    
}