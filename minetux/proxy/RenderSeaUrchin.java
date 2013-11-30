package minetux.proxy;

import minetux.common.EntityOstrich;
import minetux.common.EntitySeaUrchin;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderSeaUrchin extends RenderLiving {

	protected static final ResourceLocation texture = new ResourceLocation("minetux:seaurchin.png");
	
	public RenderSeaUrchin(ModelBase par1ModelBase, float par2) {
		super(par1ModelBase, par2);
	}

	protected ResourceLocation getEntityTexture(Entity entity) {
		return this.getSeaUrchinTextures((EntitySeaUrchin)entity);
	}

	private ResourceLocation getSeaUrchinTextures(EntitySeaUrchin entity) {
		return texture;
	}

	
}
