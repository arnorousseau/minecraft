package minetux.proxy;

import minetux.common.EntityCephalos;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderCephalos extends RenderLiving
{
    private static final ResourceLocation textureLocation = new ResourceLocation("minetux:cephalos.png");
    private float scale = 1.0F;
        
    public RenderCephalos(ModelBase par1ModelBase, float par2, float par3)
    {
        super(par1ModelBase, par2 * par3);
    }
    
    public void renderCow(EntityCephalos par1EntityKirin, double par2, double par4, double par6, float par8, float par9)
    {
        super.doRenderLiving(par1EntityKirin, par2, par4, par6, par8, par9);
    }

    public void doRenderLiving(EntityLiving par1EntityLiving, double par2, double par4, double par6, float par8, float par9)
    {
        this.renderCow((EntityCephalos)par1EntityLiving, par2, par4, par6, par8, par9);
    }
            
    public void doRender(Entity par1Entity, double par2, double par4, double par6, float par8, float par9)
    {
        this.renderCow((EntityCephalos)par1Entity, par2, par4, par6, par8, par9);
    }
    
    @Override
    protected ResourceLocation getEntityTexture(Entity entity) {
        return textureLocation;
    }
}