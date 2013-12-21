package minetux.proxy;

import cpw.mods.fml.client.registry.RenderingRegistry;
import minetux.common.EntityCephalos;
import minetux.common.EntityHerobrine;
import minetux.common.EntityMazeSlime;
import minetux.common.EntityOgre;
import minetux.common.EntityOstrich;
import minetux.common.EntityPopo;
import minetux.common.EntitySeaUrchin;
import minetux.common.EntityYeti;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelSlime;
import net.minecraftforge.client.MinecraftForgeClient;

public class MineTuxClientProxy extends MineTuxCommonProxy {

	@Override
	public void registerRender(){
		 
		super.registerRender();
		 
		//render
		RenderingRegistry.registerEntityRenderingHandler(EntityHerobrine.class, new RenderHerobrine(new ModelBiped(), 0.5f));
		RenderingRegistry.registerEntityRenderingHandler(EntityOgre.class, new RenderOgre(new ModelBiped(), 0.5f));
		RenderingRegistry.registerEntityRenderingHandler(EntityMazeSlime.class, new RenderMazeSlime(new ModelSlime(16), new ModelSlime(0), 0.5f));
		RenderingRegistry.registerEntityRenderingHandler(EntityOstrich.class, new RenderOstrich(new ModelOstrich(), 0.5f));
		RenderingRegistry.registerEntityRenderingHandler(EntitySeaUrchin.class, new RenderSeaUrchin(new ModelSeaUrchin(), 0.5f));
		RenderingRegistry.registerEntityRenderingHandler(EntityCephalos.class, new RenderCephalos(new ModelCephalos(), 0.4F,0.4F));
        RenderingRegistry.registerEntityRenderingHandler(EntityPopo.class, new RenderPopo(new ModelPopo(), 3.0F, 2.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityYeti.class, new RenderYeti(new ModelYeti(), 0.5F));

	}
	
}
