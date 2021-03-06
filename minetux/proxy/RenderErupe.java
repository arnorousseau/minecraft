package minetux.proxy;

import minetux.common.EntityErupe;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderErupe extends RenderLiving
{
    private static final ResourceLocation field_110871_a = new ResourceLocation("minetux:erupe.png");

    private float scale;

    public RenderErupe(ModelBase par1ModelBase, float par2, float par3)
    {
        super(par1ModelBase, par2 * par3);
        this.scale = par3;
    }

   
    protected void preRenderScale(EntityErupe par1EntityErupe, float par2)
    {
        GL11.glScalef(this.scale, this.scale, this.scale);
    }

    protected ResourceLocation func_110870_a(EntityErupe par1EntityErupe)
    {
        return field_110871_a;
    }

   
    protected void preRenderCallback(EntityLivingBase par1EntityLivingBase, float par2)
    {
        this.preRenderScale((EntityErupe)par1EntityLivingBase, par2);
    }

    protected ResourceLocation getEntityTexture(Entity par1Entity)
    {
        return this.func_110870_a((EntityErupe)par1Entity);
    }
}