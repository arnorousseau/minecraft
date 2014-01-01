package minetux.common;
import static net.minecraftforge.common.ChestGenHooks.BONUS_CHEST;

import java.util.ArrayList;
import java.util.Random;

import minetux.common.entities.EntityZombieKing;
import net.minecraft.block.Block;
import net.minecraft.block.BlockChest;
import net.minecraft.entity.boss.EntityWither;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraft.world.gen.feature.WorldGeneratorBonusChest;
import net.minecraftforge.common.ChestGenHooks;

public class WorldGenTower extends WorldGenerator
{
        protected int[] GetValidSpawnBlocks() {
            return new int[] {MineTux.BlockDiscStone.blockID};
        }

        public boolean LocationIsValidSpawn(World world, int i, int j, int k){
                int distanceToAir = 0;
                int checkID = world.getBlockId(i, j, k);

                while (checkID != 0){
                        distanceToAir++;
                        checkID = world.getBlockId(i, j + distanceToAir, k);
                }

                if (distanceToAir > 3){
                        return false;
                }
                j += distanceToAir - 1;

                int blockID = world.getBlockId(i, j, k);
                int blockIDAbove = world.getBlockId(i, j+1, k);
                int blockIDBelow = world.getBlockId(i, j-1, k);
                
                for (int x : GetValidSpawnBlocks()){
                        
                		if (blockIDAbove != 0){
                        	return false;
                        }
                        
                        if (blockID == x){
                                return true;
                        }else if (blockID == MineTux.BlockDiscStone.blockID && blockIDBelow == x){
                                return true;
                        }
                }
                return false;
        }

        public WorldGenTower() { }

        public boolean generate(World world, Random rand, int i, int j, int k) {

        		if(
        				!LocationIsValidSpawn(world, i, j, k) 
    				 || !LocationIsValidSpawn(world, i-3, j, k) 
    				 || !LocationIsValidSpawn(world, i + 3, j, k)
				 	 || !LocationIsValidSpawn(world, i, j, k-3) 
				 	 || !LocationIsValidSpawn(world, i, j, k+3)
				 	 
				 	 || !LocationIsValidSpawn(world, i+36, j, k) 
    				 || !LocationIsValidSpawn(world, i+33, j, k) 
    				 || !LocationIsValidSpawn(world, i+39, j, k)
				 	 || !LocationIsValidSpawn(world, i+36, j, k-3) 
				 	 || !LocationIsValidSpawn(world, i+36, j, k+3)
				 	 
				 /*	 ||	!LocationIsValidSpawn(world, i, j, k+36) 
    				 || !LocationIsValidSpawn(world, i-3, j, k+36) 
    				 || !LocationIsValidSpawn(world, i + 3, j, k+36)
				 	 || !LocationIsValidSpawn(world, i, j, k+33) 
				 	 || !LocationIsValidSpawn(world, i, j, k+39)*/
			 	)
                {
                    return false;
                }
        		
        		
        		//remove block
        		for(int u=i-3; u<i+39; u++){
                	for(int v=k-3; v<k+39; v++){
                		for(int y=j; y<j+18; y++){
                			world.setBlockToAir(u, y, v);
                		}
                	}
                }
        		
        		

                this.makeTower(world, i, j, k, rand);
                this.makeTower(world, i+36, j, k, rand);
                this.makeTower(world, i, j, k+36, rand);
                this.makeTower(world, i+36, j, k+36, rand);
                
                //walls 1
                for(int u=(i+3); u<(i+33); u++){
                	for(int y=j; y<(j+18); y++){
                		world.setBlock(u,y,k, Block.cobblestone.blockID);
                	}
                }
                //wall 2
                for(int u=(i+3); u<(i+33); u++){
                	for(int y=j; y<(j+18); y++){
                		world.setBlock(u,y,k+36, Block.cobblestone.blockID);
                	}
                }
                
                for(int v=(k+3); v<(k+33); v++){
                	for(int y=j; y<(j+18); y++){
                		world.setBlock(i,y,v, Block.cobblestone.blockID);
                	}
                }
                
                for(int v=(k+3); v<(k+33); v++){
                	for(int y=j; y<(j+18); y++){
                		world.setBlock(i+36,y,v, Block.cobblestone.blockID);
                	}
                }
                
                for(int u=(i-3); u<(i+39); u++){
                	for(int v=(k-3); v<(k+39); v++){
                		world.setBlock(u,j,v, Block.stoneDoubleSlab.blockID);
                	}
                }
                
            	//door
                for(int u=(i+14); u<(i+25); u++){
                	for(int y=j+1; y<(j+8); y++){
                		world.setBlockToAir(u, y, k);
                		
                		if(y>j+3){
                			world.setBlock(u,y,k, Block.fenceIron.blockID);
                		}
                	}
                }
                
                
                this.makeHouse(world, i+25, j, k+25);
                
                if(!world.isRemote){
                	for(int n=0;n<=10;n++){
                		EntityOgre orc = new EntityOgre(world);
                		orc.setLocationAndAngles(i+10,j,k+10, 360.0F, 0.0F);
            			world.spawnEntityInWorld(orc);
                    }
                	
        		}
                
                return true;
        }
        
        
        
        public boolean makeTower(World world, int i, int j, int k, Random par2Random){
        	
        	for(int y=j; y<(j+25); y++){
      	 	 	 world.setBlock(i+1,y,k+3, Block.cobblestone.blockID);
      	 	 	 world.setBlock(i,y,k+3, Block.cobblestone.blockID);
        	 	 world.setBlock(i-1,y,k+3, Block.cobblestone.blockID);
         	 	 world.setBlock(i-2,y,k+2, Block.cobblestone.blockID);
          	 	 world.setBlock(i-3,y,k+1, Block.cobblestone.blockID);
	           	 world.setBlock(i-3,y,k, Block.cobblestone.blockID);
	           	 world.setBlock(i-3,y,k-1, Block.cobblestone.blockID);
	           	 world.setBlock(i-2,y,k-2, Block.cobblestone.blockID);
	           	 world.setBlock(i-1,y,k-3, Block.cobblestone.blockID);
	           	 
	           	 if(y>(j+2)){
	           		 world.setBlock(i,y,k-3, Block.cobblestone.blockID);
	           	 }
           	                 	 
	           	 world.setBlock(i+1,y,k-3, Block.cobblestone.blockID);
	           	 world.setBlock(i+2,y,k-2, Block.cobblestone.blockID);
	           	 world.setBlock(i+3,y,k-1, Block.cobblestone.blockID);
	           	 world.setBlock(i+3,y,k, Block.cobblestone.blockID);
	           	 world.setBlock(i+3,y,k+1, Block.cobblestone.blockID);
	           	 world.setBlock(i+2,y,k+2, Block.cobblestone.blockID);
           	 
	           	 if(y == (j+10) || y == (j+20)){
	           		 world.setBlock(i-2,y,k, Block.cobblestone.blockID);
	           		 world.setBlock(i-1,y,k, Block.cobblestone.blockID);
	           		 world.setBlock(i,y,k, Block.cobblestone.blockID);
	           		 world.setBlock(i+1,y,k, Block.cobblestone.blockID);
	           		 world.setBlock(i-2,y,k-1, Block.cobblestone.blockID);
	           		 world.setBlock(i-1,y,k-1, Block.cobblestone.blockID);
	           		 world.setBlock(i,y,k-1, Block.cobblestone.blockID);
	           		 world.setBlock(i+1,y,k-1, Block.cobblestone.blockID);
	           		 world.setBlock(i+2,y,k-1, Block.cobblestone.blockID);
	           		 world.setBlock(i-2,y,k+1, Block.cobblestone.blockID);
	           		 world.setBlock(i-1,y,k+1, Block.cobblestone.blockID);
	           		 world.setBlock(i,y,k+1, Block.cobblestone.blockID);
	           		 world.setBlock(i+1,y,k+1, Block.cobblestone.blockID);
	           		 world.setBlock(i+2,y,k+1, Block.cobblestone.blockID);
	           		 world.setBlock(i-1,y,k+2, Block.cobblestone.blockID);
	           		 world.setBlock(i,y,k+2, Block.cobblestone.blockID);
	           		 world.setBlock(i+1,y,k+2, Block.cobblestone.blockID);
	           		 world.setBlock(i-1,y,k-2, Block.cobblestone.blockID);
	           		 world.setBlock(i,y,k-2, Block.cobblestone.blockID);
	           		 world.setBlock(i+1,y,k-2, Block.cobblestone.blockID);
	           		 
	           		 
	           		 WeightedRandomChestContent[] chestContents = new WeightedRandomChestContent[] {new WeightedRandomChestContent(Item.diamond.itemID, 0, 1, 3, 3), new WeightedRandomChestContent(Item.ingotIron.itemID, 0, 1, 5, 10), new WeightedRandomChestContent(Item.ingotGold.itemID, 0, 1, 3, 5), new WeightedRandomChestContent(Item.bread.itemID, 0, 1, 3, 15), new WeightedRandomChestContent(Item.appleRed.itemID, 0, 1, 3, 15), new WeightedRandomChestContent(Item.pickaxeIron.itemID, 0, 1, 1, 5), new WeightedRandomChestContent(Item.swordIron.itemID, 0, 1, 1, 5), new WeightedRandomChestContent(Item.plateIron.itemID, 0, 1, 1, 5), new WeightedRandomChestContent(Item.helmetIron.itemID, 0, 1, 1, 5), new WeightedRandomChestContent(Item.legsIron.itemID, 0, 1, 1, 5), new WeightedRandomChestContent(Item.bootsIron.itemID, 0, 1, 1, 5), new WeightedRandomChestContent(Block.obsidian.blockID, 0, 3, 7, 5), new WeightedRandomChestContent(Block.sapling.blockID, 0, 3, 7, 5), new WeightedRandomChestContent(Item.saddle.itemID, 0, 1, 1, 3), new WeightedRandomChestContent(Item.horseArmorIron.itemID, 0, 1, 1, 1), new WeightedRandomChestContent(Item.horseArmorGold.itemID, 0, 1, 1, 1), new WeightedRandomChestContent(Item.horseArmorDiamond.itemID, 0, 1, 1, 1)};
	           		 WorldGeneratorBonusChest chestBonus = new WorldGeneratorBonusChest(chestContents,2);
	           		 chestBonus.generate(world, par2Random, i, y+1, k);
	           		 
	           		 if(!world.isRemote){
	           			EntitySkeleton skeleton = new EntitySkeleton(world);
	           			skeleton.setSkeletonType(1);
	           			skeleton.setLocationAndAngles(i,y+1,k, 360.0F, 0.0F);
             			world.spawnEntityInWorld(skeleton);
	           		 }
	           	 }
    		}
        	
        	return true;
        }
        
        
        
        public boolean makeHouse(World world, int i, int j, int k){
        	
        	//wall N/S
        	for(int u=i; u<i+10; u++){
            	for(int y=j; y<j+6; y++){
            		world.setBlock(u,y,k, Block.stoneBrick.blockID);
            		world.setBlock(u,y,k+5, Block.stoneBrick.blockID);
            	}
            }
  
        	//wall O/E
        	for(int v=k; v<k+6; v++){
            	for(int y=j; y<j+6; y++){
            		world.setBlock(i,y,v, Block.netherBrick.blockID);
            		world.setBlock(i+10,y,v, Block.netherBrick.blockID);
            	}
            }
        	
        	//door
        	world.setBlockToAir(i, j+1, k+2);
        	world.setBlockToAir(i, j+1, k+3);
        	world.setBlockToAir(i, j+2, k+2);
        	world.setBlockToAir(i, j+2, k+3);
        	world.setBlockToAir(i, j+3, k+2);
        	world.setBlockToAir(i, j+3, k+3);
        	
        	//top
        	for(int u=0;u<=10;u++){
        		world.setBlock(i+u,j+6,k,Block.stairsWoodOak.blockID, 2, 1);
        		world.setBlock(i+u,j+7,k+1,Block.stairsWoodOak.blockID, 2, 1);
        		world.setBlock(i+u,j+8,k+2,Block.stairsWoodOak.blockID, 2, 1);
        		world.setBlock(i+u,j+6,k+5,Block.stairsWoodOak.blockID, 3, 1);
        		world.setBlock(i+u,j+7,k+4,Block.stairsWoodOak.blockID, 3, 1);
        		world.setBlock(i+u,j+8,k+3,Block.stairsWoodOak.blockID, 3, 1);
        	}
        	
        	world.setBlock(i,j+6,k+1,Block.wood.blockID, 0, 1);
        	world.setBlock(i,j+6,k+2,Block.wood.blockID, 0, 1);
        	world.setBlock(i,j+6,k+3,Block.wood.blockID, 0, 1);
        	world.setBlock(i,j+6,k+4,Block.wood.blockID, 0, 1);
        	world.setBlock(i,j+7,k+2,Block.wood.blockID, 0, 1);
        	world.setBlock(i,j+7,k+3,Block.wood.blockID, 0, 1);
        	
        	world.setBlock(i+10,j+6,k+1,Block.wood.blockID, 0, 1);
        	world.setBlock(i+10,j+6,k+2,Block.wood.blockID, 0, 1);
        	world.setBlock(i+10,j+6,k+3,Block.wood.blockID, 0, 1);
        	world.setBlock(i+10,j+6,k+4,Block.wood.blockID, 0, 1);
        	world.setBlock(i+10,j+7,k+2,Block.wood.blockID, 0, 1);
        	world.setBlock(i+10,j+7,k+3,Block.wood.blockID, 0, 1);
        	
        	//prison
        	for(int v=k;v<k+5;v++){
        		for(int y=j;y<j+5;y++){
        			world.setBlock(i+7,y,v, Block.fenceIron.blockID);
        		}
        	}
        	
        	 if(!world.isRemote){
             	EntityVillager villager = new EntityVillager(world);
             	villager.setLocationAndAngles(i+9,j+1,k+3, 360.0F, 0.0F);
             	villager.setProfession(1);
     			world.spawnEntityInWorld(villager);
     		}
        	
        	//bottom
        	for(int u=i;u<i+10;u++){
        		for(int v=k; v<k+5; v++){
        			world.setBlock(u,j,v,Block.sandStone.blockID, 0, 1);
        		}
        	}
        	
        	return true;
        }
}