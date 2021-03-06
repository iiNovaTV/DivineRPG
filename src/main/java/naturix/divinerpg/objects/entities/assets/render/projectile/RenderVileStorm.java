package naturix.divinerpg.objects.entities.assets.render.projectile;

import naturix.divinerpg.objects.entities.entity.projectiles.EntityVileStorm;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderVileStorm extends RenderProjectile<EntityVileStorm> {
    private ResourceLocation TEXTURE = new ResourceLocation("divinerpg:textures/items/vilestorm.png");

    public RenderVileStorm(RenderManager manager, float scaleIn) {
        super(manager, scaleIn);
        this.bindTexture(TEXTURE);
    }

    @Override
    protected ResourceLocation getEntityTexture(EntityVileStorm entity) {
        return TEXTURE;
    }
}
