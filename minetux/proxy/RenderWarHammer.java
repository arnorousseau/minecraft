package minetux.proxy;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainerCreative;
import net.minecraft.client.gui.inventory.GuiInventory;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;

import org.lwjgl.opengl.GL11;



public class RenderWarHammer implements IItemRenderer 
{
        static final Minecraft mc= Minecraft.getMinecraft();

        protected ModelWarHammer Hammer;
        public RenderWarHammer()
        {
            Hammer = new ModelWarHammer();
        }


        @Override
        public boolean handleRenderType(ItemStack ItemStack, ItemRenderType ItemRenderType) 
        {
            switch(ItemRenderType)
            {
            	case EQUIPPED_FIRST_PERSON:
            		return true;
                case EQUIPPED:
                    return true;
                default: return false;
            }
        }


        @Override
        public boolean shouldUseRenderHelper(ItemRenderType ItemRenderType, ItemStack ItemStack, ItemRendererHelper ItemRendererHelper) 
        {
           return false;
        }


        @Override
        public void renderItem(ItemRenderType ItemRenderType, ItemStack ItemStack, Object... Data) 
        {
                switch(ItemRenderType)
                {
                        case EQUIPPED_FIRST_PERSON: 
                        {
                                Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation("minetux:textures/items/ItemRender/WarHammer.png"));
                                

                                GL11.glPushMatrix();
                                

                                
                                

                                float Scale = 1.75F;

                                GL11.glRotatef(-110F, 0, 0F, 180F);
                                GL11.glTranslatef(-1.6F, -0.3F, 0.F);

                                boolean IsFirstPerson = false;

                                if (Data[1] != null && Data[1] instanceof EntityPlayer)
                                {
                                        if(!((EntityPlayer)Data[1] == Minecraft.getMinecraft().renderViewEntity && Minecraft.getMinecraft().gameSettings.thirdPersonView == 0 && !((Minecraft.getMinecraft().currentScreen instanceof GuiInventory || Minecraft.getMinecraft().currentScreen instanceof GuiContainerCreative) && RenderManager.instance.playerViewY == 180.0F)))
                                        {
                                                GL11.glTranslatef(0.165F, 0.1F, -0.75F);
                                        }
                                        else
                                        {
                                                IsFirstPerson = true;

                                                GL11.glRotatef(20F, 1.0F, -5.0F, -3.0F);
                                                GL11.glTranslatef(-0.1F, 1.6F, 0.3F);
                                        }
                                }
                                else
                                {
                                        GL11.glTranslatef(0.05F, 0F, -0.27F);
                                }

                                GL11.glScalef(Scale, Scale, Scale);
                            	Hammer.render((Entity)Data[1], 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
                
                                GL11.glPopMatrix();
                        
                }
                 break;
            case EQUIPPED:
                    Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation("minetux:textures/items/ItemRender/WarHammer.png"));
                GL11.glPushMatrix();
                                float Scale = 1.75F;

                                GL11.glRotatef(-110F, 0, 0F, 180F);
                                GL11.glTranslatef(-1.2F, -0.2F, 0.2F);

                                boolean IsFirstPerson = false;

                                if (Data[1] != null && Data[1] instanceof EntityPlayer)
                                {
                                        if(!((EntityPlayer)Data[1] == Minecraft.getMinecraft().renderViewEntity && Minecraft.getMinecraft().gameSettings.thirdPersonView == 0 && !((Minecraft.getMinecraft().currentScreen instanceof GuiInventory || Minecraft.getMinecraft().currentScreen instanceof GuiContainerCreative) && RenderManager.instance.playerViewY == 180.0F)))
                                        {
                                                GL11.glTranslatef(0.165F, 0.1F, -0.75F);
                                        }
                                        else
                                        {
                                                IsFirstPerson = true;

                                                GL11.glRotatef(20F, 1.0F, -5.0F, -3.0F);
                                                GL11.glTranslatef(-0.1F, 1.0F, 0.3F);
                                        }
                                }
                                else
                                {
                                        GL11.glTranslatef(0.05F, 0F, -0.27F);
                                }

                                GL11.glScalef(Scale, Scale, Scale);
                            	Hammer.render((Entity)Data[1], 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
                
                                GL11.glPopMatrix();
                                break;

                default:
                break;
                }        
        }
}