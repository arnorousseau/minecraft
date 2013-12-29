package minetux.proxy;

import minetux.common.entities.EntityZombieKing;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderZombieKing extends RenderBiped {

	protected static final ResourceLocation texture = new ResourceLocation("minetux:zombieking.png");
	
	public RenderZombieKing(ModelBiped biped, float ombre)
	{
		super(biped,ombre);
	}
	

	protected ResourceLocation getZombieKingTextures(EntityZombieKing king)
    {
        return texture;
    }
	
	protected ResourceLocation getEntityTexture(Entity entity) {
		return this.getZombieKingTextures((EntityZombieKing)entity);
	}

}
