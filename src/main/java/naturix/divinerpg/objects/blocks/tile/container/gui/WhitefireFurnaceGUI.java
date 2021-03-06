package naturix.divinerpg.objects.blocks.tile.container.gui;

import naturix.divinerpg.objects.blocks.tile.block.TileEntityInfiniteFurnace;
import naturix.divinerpg.utils.Reference;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;

public class WhitefireFurnaceGUI extends InfiniteFurnaceGUI {
    private static final ResourceLocation TEXTURES = new ResourceLocation(
            Reference.MODID + ":textures/gui/whitefire_furnace.png");

    public WhitefireFurnaceGUI(InventoryPlayer player, TileEntityInfiniteFurnace tileEntity) {
        super(player, tileEntity);
    }

    public ResourceLocation getTexture() {
        return TEXTURES;
    }
}