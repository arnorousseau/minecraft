package minetux.common;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.ai.EntityAIFollowParent;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMate;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class EntityOstrich extends EntityCreature {

	public int timeUntilNextEgg;
	
	public EntityOstrich(World par1World) {
		super(par1World);
		
		this.timeUntilNextEgg = this.rand.nextInt(24000) + 24000;
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(1, new EntityAIPanic(this, 0.5D));
        this.tasks.addTask(3, new EntityAITempt(this, 1.0D, Item.seeds.itemID, false));
        this.tasks.addTask(5, new EntityAIWander(this, 1.0D));
	}
	
	public boolean isAIEnabled()
    {
        return true;
    }
	
	public boolean getCanSpawnHere()
    {
        return super.getCanSpawnHere();
    }
	
	
	protected int getDropItemId()
    {
        return Item.feather.itemID;
    }
	
	 public void onLivingUpdate()
	 {
	        super.onLivingUpdate();

	        if (!this.worldObj.isRemote && this.worldObj.provider.dimensionId == MineTux.ether_id && --this.timeUntilNextEgg <= 0)
	        {
	            this.playSound("mob.chicken.plop", 1.0F, (this.rand.nextFloat() - this.rand.nextFloat()) * 0.2F + 1.0F);
	            this.dropItem(MineTux.OstrichEgg.itemID, 1);
	            this.timeUntilNextEgg = this.rand.nextInt(24000) + 24000;
	        }
     }

	

	

}
