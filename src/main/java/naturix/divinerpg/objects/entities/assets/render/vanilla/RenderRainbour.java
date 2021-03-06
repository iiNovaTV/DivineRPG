package naturix.divinerpg.objects.entities.assets.render.vanilla;

import naturix.divinerpg.objects.entities.assets.model.vanilla.model.ModelRainbour;
import naturix.divinerpg.objects.entities.entity.vanilla.Rainbour;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

import javax.annotation.Nullable;

public class RenderRainbour extends RenderLiving<Rainbour> {
    public static final IRenderFactory FACTORY = new Factory();
    ResourceLocation texture = new ResourceLocation("divinerpg:textures/entity/rainbour.png");

    public RenderRainbour(RenderManager rendermanagerIn, ModelBase modelbaseIn, float shadowsizeIn) {
        super(rendermanagerIn, new ModelRainbour(), shadowsizeIn);
    }

    @Nullable
    @Override
    protected ResourceLocation getEntityTexture(Rainbour entity) {
        return texture;
    }

    public static class Factory implements IRenderFactory<Rainbour> {
        @Override
        public Render<? super Rainbour> createRenderFor(RenderManager manager) {
            return new RenderRainbour(manager, new ModelRainbour(), 0F);
        }
    }
}