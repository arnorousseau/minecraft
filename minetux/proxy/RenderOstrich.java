package minetux.proxy;

import minetux.common.EntityOstrich;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.util.ResourceLocation;

public class RenderOstrich extends RenderLiving {

	protected static final ResourceLocation texture = new ResourceLocation("minetux:ostrich.png");
	
	public RenderOstrich(ModelBase par1ModelBase, float par2)
    {
        super(par1ModelBase, par2);
    }
	
	protected ResourceLocation getOstrichTextures(EntityOstrich entity)
    {
        return texture;
    }

	
	protected ResourceLocation getEntityTexture(Entity entity) {
		return this.getOstrichTextures((EntityOstrich)entity);
	}
	


}
