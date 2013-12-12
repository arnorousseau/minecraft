package minetux.common;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAvoidEntity;
import net.minecraft.entity.ai.EntityAIEatGrass;
import net.minecraft.entity.ai.EntityAIFollowParent;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMate;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class EntityPopo extends EntityAnimal
{
    private EntityAIEatGrass aiEatGrass = new EntityAIEatGrass(this);
    private int attackTimer;

    public EntityPopo(World par1World)
    {
        super(par1World);
        this.setSize(2.6F, 2.7F);
        this.isImmuneToFire = false;
        this.experienceValue = 25;
        this.getNavigator().setAvoidsWater(true);
        this.targetTasks.addTask(2, new EntityAIHurtByTarget(this, true));
        this.tasks.addTask(1, this.aiEatGrass);
        this.tasks.addTask(2, new EntityAIPanic(this, 0.38F));
        this.tasks.addTask(3, new EntityAIMate(this, 0.2F));
        this.tasks.addTask(4, new EntityAITempt(this, 0.25F, Item.wheat.itemID, false));
        this.tasks.addTask(5, new EntityAIFollowParent(this, 0.25F));
        this.tasks.addTask(6, new EntityAIWander(this, 0.4F));
        this.tasks.addTask(7, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
        this.tasks.addTask(8, new EntityAILookIdle(this));
        this.tasks.addTask(9, new EntityAIAvoidEntity(this, EntityCephalos.class, 5.0F, 0.3F, 0.35F));
    }

    
    public boolean isAIEnabled()
    {
        return true;
    }

    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setAttribute(45.0D);
        this.getEntityAttribute(SharedMonsterAttributes.followRange).setAttribute(25.0D);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setAttribute(0.5D);
    }

    public boolean getCanSpawnHere()
    {
    	int percentage = this.rand.nextInt(100);
        return (percentage < 2);
    }
    
    
    protected String getLivingSound()
    {
        return "mob.cow.say";
    }

   
    protected String getHurtSound()
    {
        return "mob.cow.hurt";
    }

   
    protected String getDeathSound()
    {
        return "mob.cow.hurt";
    }

    
    protected void playStepSound(int par1, int par2, int par3, int par4)
    {
        this.playSound("mob.cow.step", 0.15F, 1.0F);
    }

    
    protected float getSoundVolume()
    {
        return 0.4F;
    }

   
    protected int getDropItemId()
    {
        return Item.leather.itemID;
    }

    
    protected void dropFewItems(boolean par1, int par2)
    {
        int j = this.rand.nextInt(3) + this.rand.nextInt(1 + par2);

        for (int k = 0; k < j; ++k)
        {
            this.dropItem(Item.leather.itemID, 2);
        }
                
    }
    

    public EntityPopo spawnBabyAnimal(EntityAgeable par1EntityAgeable)
    {
        return new EntityPopo(this.worldObj);
    }

    public EntityAgeable createChild(EntityAgeable par1EntityAgeable)
    {
        return this.spawnBabyAnimal(par1EntityAgeable);
    }
        
    public int getMaxSpawnedInChunk()
    {
    	return 1;
    }
    
    protected boolean canDespawn()
    {
        return false;
    }

}