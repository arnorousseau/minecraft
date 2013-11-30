package minetux.common;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public class EntityMazeSlime extends EntitySlime{

	public EntityMazeSlime(World par1World) {
		super(par1World);
	}

	
	protected void applyEntityAttributes(){
		super.applyEntityAttributes();
		
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setAttribute(15.0D);
	    this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setAttribute(0.3D);
	}
	
	public boolean getCanSpawnHere()
    {
        return super.getCanSpawnHere();

    }
	
	protected int getDropItemId()
    {
        return 0;
    }
	
	protected boolean canDamagePlayer()
    {
        return true;
    }
	
	protected EntityMazeSlime createInstance()
    {
        return new EntityMazeSlime(this.worldObj);
    }
	
	public void setDead()
    {
        int i = this.getSlimeSize();

        if (!this.worldObj.isRemote && i > 1 && this.getHealth() <= 0.0F)
        {
            int j = 7 + this.rand.nextInt(7);

            for (int k = 0; k < j; ++k)
            {
                float f = ((float)(k % 2) - 0.5F) * (float)i / 4.0F;
                float f1 = ((float)(k / 2) - 0.5F) * (float)i / 4.0F;
                EntityMazeSlime entitymazeslime = this.createInstance();
                entitymazeslime.setSlimeSize(i / 2);
                entitymazeslime.setLocationAndAngles(this.posX + (double)f, this.posY + 0.5D, this.posZ + (double)f1, this.rand.nextFloat() * 360.0F, 0.0F);
                this.worldObj.spawnEntityInWorld(entitymazeslime);
            }
        }

        super.setDead();
    }
	
	
	protected void setSlimeSize(int par1)
    {
        this.dataWatcher.updateObject(16, new Byte((byte)par1));
        this.setSize(0.6F * (float)par1, 0.6F * (float)par1);
        this.setPosition(this.posX, this.posY, this.posZ);
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setAttribute((double)(par1 * par1));
        this.setHealth(this.getMaxHealth());
        this.experienceValue = par1;
    }
	
}
