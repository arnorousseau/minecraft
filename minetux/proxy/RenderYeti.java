package minetux.proxy;

import minetux.common.EntityYeti;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderYeti extends RenderLiving {

	protected static final ResourceLocation texture = new ResourceLocation("minetux:yeti.png");

	public RenderYeti(ModelBase par1ModelBase, float par2)
    {
        super(par1ModelBase, par2);
    }

	@Override
	protected ResourceLocation getEntityTexture(Entity entity) {
		return this.getYetiTextures((EntityYeti)entity);
	}

	private ResourceLocation getYetiTextures(EntityYeti entity) {
		return texture;
	}

}
