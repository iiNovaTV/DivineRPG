package naturix.divinerpg.objects.entities.assets.render;


import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;

import javax.annotation.Nonnull;

public class LayerHat implements LayerRenderer<EntityPlayer> {

	private final ModelRenderer modelRenderer;

	public LayerHat(ModelRenderer modelRenderer)
	{
		this.modelRenderer = modelRenderer;
	}

	@Override
	public void doRenderLayer(@Nonnull EntityPlayer player, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
		ItemStack itemstack = player.getItemStackFromSlot(EntityEquipmentSlot.HEAD);

		}

	@Override
	public boolean shouldCombineTextures() {
		return false;
	}
	public static enum Type {
		RED, BLUE;
	}
	private String getTexture(Type type) {
		switch (type) {
		case RED:
			return "textures/models/devhat.png";
		case BLUE:
			return "textures/models/devhat_b.png";
		}
		return "";
	}
}