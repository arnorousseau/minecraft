package minetux.proxy;

import minetux.common.EntityOgre;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderOgre extends RenderBiped {

	protected static final ResourceLocation texture = new ResourceLocation("minetux:ogre.png");
	
	public RenderOgre(ModelBiped biped, float ombre)
	{
		super(biped,ombre);
	}
	

	protected ResourceLocation getOgreTextures(EntityOgre herobrine)
    {
        return texture;
    }
	
	protected ResourceLocation getEntityTexture(Entity entity) {
		return this.getOgreTextures((EntityOgre)entity);
	}

}
