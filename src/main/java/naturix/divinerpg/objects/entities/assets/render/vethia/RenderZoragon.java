package naturix.divinerpg.objects.entities.assets.render.vethia;

import naturix.divinerpg.objects.entities.assets.model.vethea.model.ModelZoragon;
import naturix.divinerpg.objects.entities.entity.vethia.Zoragon;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

import javax.annotation.Nullable;

public class RenderZoragon extends RenderLiving<Zoragon> {
	
	public static final IRenderFactory FACTORY = new Factory();
	ResourceLocation texture = new ResourceLocation("divinerpg:textures/entity/zoragon.png");
	private final ModelZoragon modelEntity;
    
	public RenderZoragon(RenderManager rendermanagerIn, ModelBase modelbaseIn, float shadowsizeIn) {
        super(rendermanagerIn, new ModelZoragon(), 1F);
        modelEntity = (ModelZoragon) super.mainModel;

    }


	@Nullable
    @Override
    protected ResourceLocation getEntityTexture(Zoragon entity) {
        return texture;
    }

	 public static class Factory implements IRenderFactory<Zoragon> {

	        @Override
	        public Render<? super Zoragon> createRenderFor(RenderManager manager) {
	            return new RenderZoragon(manager, new ModelZoragon(), 1F);
	        }
	    }

	}