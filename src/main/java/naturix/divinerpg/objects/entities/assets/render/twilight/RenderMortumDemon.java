package naturix.divinerpg.objects.entities.assets.render.twilight;

import naturix.divinerpg.objects.entities.assets.model.twilight.model.ModelTwilightDemon;
import naturix.divinerpg.objects.entities.entity.twilight.MortumDemon;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

import javax.annotation.Nullable;

public class RenderMortumDemon extends RenderLiving<MortumDemon> {
	
	public static final IRenderFactory FACTORY = new Factory();
	ResourceLocation texture = new ResourceLocation("divinerpg:textures/entity/mortum_demon.png");
	private final ModelTwilightDemon ModelTwilightDemon;
    
	public RenderMortumDemon(RenderManager rendermanagerIn, ModelBase modelbaseIn, float shadowsizeIn) {
        super(rendermanagerIn, new ModelTwilightDemon(), 1F);
        ModelTwilightDemon = (ModelTwilightDemon) super.mainModel;

    }


	@Nullable
    @Override
    protected ResourceLocation getEntityTexture(MortumDemon entity) {
        return texture;
    }

	 public static class Factory implements IRenderFactory<MortumDemon> {

	        @Override
	        public Render<? super MortumDemon> createRenderFor(RenderManager manager) {
	            return new RenderMortumDemon(manager, new ModelTwilightDemon(), 0.5F);
	        }
	    }

	}