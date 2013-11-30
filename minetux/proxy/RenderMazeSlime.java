package minetux.proxy;

import minetux.common.EntityHerobrine;
import minetux.common.EntityMazeSlime;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderMazeSlime extends RenderLiving {

	protected static final ResourceLocation texture = new ResourceLocation("minetux:mazeslime.png");
	private ModelBase scaleAmount;

	public RenderMazeSlime(ModelBase par1ModelBase, ModelBase par2ModelBase, float par3)
    {
        super(par1ModelBase, par3);
        this.scaleAmount = par2ModelBase;
    }

	@Override
	protected ResourceLocation getEntityTexture(Entity entity) {
		return this.getMazeSlimeTextures((EntityMazeSlime)entity);
	}

	private ResourceLocation getMazeSlimeTextures(EntityMazeSlime entity) {
		return texture;
	}

}
