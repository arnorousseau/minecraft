package minetux.common;

import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public class EntityYeti extends EntityMob {

        public EntityYeti(World par1World) {
                super(par1World);
                this.experienceValue = 10;
                this.tasks.addTask(0, new EntityAISwimming(this));
                this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityPlayer.class, 0.5D, false));
                this.tasks.addTask(6, new EntityAIWander(this,0.5D));
                this.tasks.addTask(7, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
                this.tasks.addTask(7, new EntityAILookIdle(this));
                this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, true));
                this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 0, true));
        }

        protected boolean isAIEnabled(){
                return true;
        }
        
        
        protected String getHurtSound(){
                return "mob.zombie.hurt";
        }
        
        protected String getDeathSound(){
                return "mob.zombie.death";
        }
        
        protected void playStepSound(int par1, int par2, int par3, int par4){
                this.playSound("mob.zombie.step", 0.15F, 1.0F);
        }
        
        protected int getDropItemId(){
                return Item.skull.itemID;
        }
        
        protected void dropRareDrop(int par1){
                switch(this.rand.nextInt(3)){
                case 0:
                        this.dropItem(Item.cookie.itemID, 1);
                break;
                }
        }
        
        public EnumCreatureAttribute getCreatureAttribute(){
                return EnumCreatureAttribute.UNDEAD;
                
        }

        public void onLivingUpdate(){
                super.onLivingUpdate();
        }
        
}