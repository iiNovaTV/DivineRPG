package naturix.divinerpg.objects.entities.entity.projectiles;

import naturix.divinerpg.DivineRPG;
import naturix.divinerpg.client.RenderSpecialProjectile;
import naturix.divinerpg.particle.ParticleSparkler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import net.minecraftforge.fml.client.FMLClientHandler;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class EntitySparkler extends EntityThrowable {

	public EntitySparkler(World var1) {
		super(var1);
		renderMe();
	}

	public EntitySparkler(World var1, double var2, double var4, double var6) {
		super(var1, var2, var4, var6);
		renderMe();
	}

	public EntitySparkler(World var1, EntityPlayer var2) {
		super(var1, var2);
		renderMe();
	}

	@Override
	protected void onImpact(RayTraceResult var1) {
		if (var1.entityHit != null) {
			var1.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, this.getThrower()), 20);
		}

		if (!this.world.isRemote) {
			this.setDead();
		}
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void onUpdate() {
		super.onUpdate();
		for (int var3 = 0; var3 < 8; ++var3) {
			ParticleSparkler var20 = new ParticleSparkler(this.world, this.posX, this.posY, this.posZ,
			        0.25 * this.rand.nextGaussian(), 0.25 * this.rand.nextGaussian(), 0.25 * this.rand.nextGaussian());
			FMLClientHandler.instance().getClient().effectRenderer.addEffect(var20);
		}
	}

	@SideOnly(Side.CLIENT)
	public void renderMe() {
		//RenderingRegistry.registerEntityRenderingHandler(EntitySparkler.class, new RenderSpecialProjectile(new ResourceLocation(DivineRPG.modId + "textures/entity/projectiles/sparkler.png")));
	}
}