package naturix.divinerpg.objects.entities.assets.render.projectile;

import naturix.divinerpg.objects.entities.entity.projectiles.EntityEnderTripletsFireball;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderEnderTripletsFireball extends RenderProjectile<EntityEnderTripletsFireball> {
    private ResourceLocation TEXTURE = new ResourceLocation(
            "divinerpg:textures/entity/projectiles/ender_triplets_fireball.png");

    public RenderEnderTripletsFireball(RenderManager manager, float scaleIn) {
        super(manager, scaleIn);
        this.bindTexture(TEXTURE);
    }

    @Override
    protected ResourceLocation getEntityTexture(EntityEnderTripletsFireball entity) {
        return TEXTURE;
    }
}
