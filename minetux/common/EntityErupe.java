package minetux.common;

import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAvoidEntity;
import net.minecraft.entity.ai.EntityAIEatGrass;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.world.World;



public class EntityErupe extends EntityCreature {

    public EntityErupe(World par1World) {
        super(par1World);
            
        this.experienceValue = 15;
        this.getNavigator().setAvoidsWater(true);
        this.tasks.addTask(1, new EntityAIPanic(this, 0.21F));
        this.tasks.addTask(2, new EntityAITempt(this, 0.35F, Item.wheat.itemID, false));
        this.tasks.addTask(3, new EntityAIWander(this, 0.4F));
        this.tasks.addTask(5, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
        this.tasks.addTask(6, new EntityAILookIdle(this));
        this.tasks.addTask(7, new EntityAIAvoidEntity(this, EntityOgre.class, 5.0F, 0.4F, 0.4F));
        this.stepHeight = 1.0F;
    }

	public boolean isAIEnabled()
	{
        return true;
	}
     
   protected int getDropItemId()
   {
        return 0;
   }

        
   protected String getLivingSound()
   {
	    return "mob.villager.zpig";
   }

       
    protected String getHurtSound()
    {
        return "mob.villager.zpighurt";
    }

        
    protected String getDeathSound()
    {
        return "mob.villager.zpigdeath";
    }
    
    public int getMaxSpawnedInChunk()
    {
        return 2;
    }
       
    protected boolean canDespawn()
    {
        return true;
    }
        
    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setAttribute(12.0D);
        this.getEntityAttribute(SharedMonsterAttributes.followRange).setAttribute(2.0D);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setAttribute(0.6D);
    }
           
}