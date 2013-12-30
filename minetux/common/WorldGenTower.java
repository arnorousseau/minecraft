package minetux.common;
import java.util.Random;

import minetux.common.entities.EntityZombieKing;
import net.minecraft.block.Block;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

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

        		if(!LocationIsValidSpawn(world, i, j, k) || !LocationIsValidSpawn(world, i-3, j, k) || !LocationIsValidSpawn(world, i + 3, j, k) || !LocationIsValidSpawn(world, i, j, k-3) || !LocationIsValidSpawn(world, i, j, k+3))
                {
                        return false;
                }

                for(int y=j; y<(j+25); y++){
           	 	 	 world.setBlock(i+1,y,k+3, MineTux.BlockBrickHigh.blockID);
            	 	 world.setBlock(i,y,k+3, MineTux.BlockBrickHigh.blockID);
             	 	 world.setBlock(i-1,y,k+3, MineTux.BlockBrickHigh.blockID);
              	 	 world.setBlock(i-2,y,k+2, MineTux.BlockBrickHigh.blockID);
               	 	 world.setBlock(i-3,y,k+1, MineTux.BlockBrickHigh.blockID);
                	 world.setBlock(i-3,y,k, MineTux.BlockBrickHigh.blockID);
                	 world.setBlock(i-3,y,k-1, MineTux.BlockBrickHigh.blockID);
                	 world.setBlock(i-2,y,k-2, MineTux.BlockBrickHigh.blockID);
                	 world.setBlock(i-1,y,k-3, MineTux.BlockBrickHigh.blockID);
                	 
                	 if(y>(j+2)){
                		 world.setBlock(i,y,k-3, MineTux.BlockBrickHigh.blockID);
                	 }
                	                 	 
                	 world.setBlock(i+1,y,k-3, MineTux.BlockBrickHigh.blockID);
                	 world.setBlock(i+2,y,k-2, MineTux.BlockBrickHigh.blockID);
                	 world.setBlock(i+3,y,k-1, MineTux.BlockBrickHigh.blockID);
                	 world.setBlock(i+3,y,k, MineTux.BlockBrickHigh.blockID);
                	 world.setBlock(i+3,y,k+1, MineTux.BlockBrickHigh.blockID);
                	 world.setBlock(i+2,y,k+2, MineTux.BlockBrickHigh.blockID);
                	 
                	 if(y == (j+10) || y == (j+20)){
                		 world.setBlock(i-2,y,k, MineTux.BlockBrickHigh.blockID);
                		 world.setBlock(i-1,y,k, MineTux.BlockBrickHigh.blockID);
                		 world.setBlock(i,y,k, MineTux.BlockBrickHigh.blockID);
                		 world.setBlock(i+1,y,k, MineTux.BlockBrickHigh.blockID);
                		 world.setBlock(i-2,y,k-1, MineTux.BlockBrickHigh.blockID);
                		 world.setBlock(i-1,y,k-1, MineTux.BlockBrickHigh.blockID);
                		 world.setBlock(i,y,k-1, MineTux.BlockBrickHigh.blockID);
                		 world.setBlock(i+1,y,k-1, MineTux.BlockBrickHigh.blockID);
                		 world.setBlock(i+2,y,k-1, MineTux.BlockBrickHigh.blockID);
                		 world.setBlock(i-2,y,k+1, MineTux.BlockBrickHigh.blockID);
                		 world.setBlock(i-1,y,k+1, MineTux.BlockBrickHigh.blockID);
                		 world.setBlock(i,y,k+1, MineTux.BlockBrickHigh.blockID);
                		 world.setBlock(i+1,y,k+1, MineTux.BlockBrickHigh.blockID);
                		 world.setBlock(i+2,y,k+1, MineTux.BlockBrickHigh.blockID);
                		 world.setBlock(i-1,y,k+2, MineTux.BlockBrickHigh.blockID);
                		 world.setBlock(i,y,k+2, MineTux.BlockBrickHigh.blockID);
                		 world.setBlock(i+1,y,k+2, MineTux.BlockBrickHigh.blockID);
                		 world.setBlock(i-1,y,k-2, MineTux.BlockBrickHigh.blockID);
                		 world.setBlock(i,y,k-2, MineTux.BlockBrickHigh.blockID);
                		 world.setBlock(i+1,y,k-2, MineTux.BlockBrickHigh.blockID);
                	 }
                	 
                	 
                }
                
                if(!world.isRemote){
                	EntityZombieKing king = new EntityZombieKing(world);
                	king.setLocationAndAngles(i,j+11,k,360.0F, 0.0F);
        			world.spawnEntityInWorld(king);
        		}
                                
                return true;
        }
}