package minetux.proxy;

import minetux.common.EntityHerobrine;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderHerobrine extends RenderBiped {

	protected static final ResourceLocation texture = new ResourceLocation("minetux:herobrine.png");
	
	public RenderHerobrine(ModelBiped biped, float ombre)
	{
		super(biped,ombre);
	}
	

	protected ResourceLocation getHerobrineTextures(EntityHerobrine herobrine)
    {
        return texture;
    }
	
	protected ResourceLocation getEntityTexture(Entity entity) {
		return this.getHerobrineTextures((EntityHerobrine)entity);
	}

}
