package naturix.divinerpg.bases.blocks.tile.entity.render;

import org.lwjgl.opengl.GL11;

import naturix.divinerpg.DivineRPG;
import naturix.divinerpg.bases.blocks.tile.model.ParasectaAltarModel;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

public class TileEntityParasectaAltarRender extends TileEntitySpecialRenderer {

	private ParasectaAltarModel model;
 
	public TileEntityParasectaAltarRender() {
		model = new ParasectaAltarModel();
	}

	@Override
	public void render(TileEntity te, double x, double y, double z, float partialTicks, int destroyStage, float alpha)
    {	
		Minecraft.getMinecraft().getTextureManager().bindTexture(new ResourceLocation(DivineRPG.modId + ":textures/model/altar_parasecta.png"));
		GL11.glPushMatrix();
		GL11.glTranslatef((float)x + 0.5F, (float)y - 0.6F, (float)z + 0.5F);
		model.render(0.0625F);
		GL11.glPopMatrix();
	}
}