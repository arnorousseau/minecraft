package minetux.common;


import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.IMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;


public class EntityCephalos extends EntityMob
{
    private int task_switcher = 0;
    private RenderInfo renderdata = new RenderInfo();
    
    public EntityCephalos(World par1World)
    {
    	super(par1World);
        this.width = 2f;
        this.height = 2f;
     }

    
    protected String getLivingSound()
    {
           return null;
    }

    
    protected String getHurtSound()
    {
        return null;
    }

    
    protected String getDeathSound()
    {
        return null;
    }

   
    protected float getSoundVolume(){
        return 0.75F;
    }

    
    protected float getSoundPitch(){
        return 1.0F;
    }

    
    protected int getDropItemId()
    {
        return MineTux.GemRuby.itemID;
    }

    
    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setAttribute(75.0D);
        this.getEntityAttribute(SharedMonsterAttributes.followRange).setAttribute(35.0D);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setAttribute(0.855D);
    }

    public int getMaxSpawnedInChunk()
    {
        return 1;
    }
    
    public boolean getCanSpawnHere()
    {
    	int percentage = this.rand.nextInt(100);
    	
        int var1 = MathHelper.floor_double(this.posX);
        int var2 = MathHelper.floor_double(this.boundingBox.minY);
        int var3 = MathHelper.floor_double(this.posZ);
        return percentage < 2 && this.worldObj.getFullBlockLightValue(var1, var2, var3) > 8 && this.worldObj.checkNoEntityCollision(this.boundingBox) && this.worldObj.getCollidingBoundingBoxes(this, this.boundingBox).size() == 0 && !this.worldObj.isAnyLiquid(this.boundingBox);
    }
   
 
    
   
    
}