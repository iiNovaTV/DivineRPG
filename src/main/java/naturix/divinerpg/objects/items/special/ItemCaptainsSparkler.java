package naturix.divinerpg.objects.items.special;

import java.util.List;

import naturix.divinerpg.objects.entities.entity.projectiles.EntitySparkler;
import naturix.divinerpg.objects.items.ItemModRanged;
import naturix.divinerpg.registry.DRPGSoundHandler;
import naturix.divinerpg.utils.TooltipLocalizer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

public class ItemCaptainsSparkler extends ItemModRanged {

	public ItemCaptainsSparkler(String name) {
		super(name, -1, DRPGSoundHandler.SPARKLER, EntitySparkler.class);
		this.setFull3D();
	}

	@Override
	protected void addAdditionalInformation(ItemStack stack, EntityPlayer player, List list, boolean par4) {
		list.add(TooltipLocalizer.rangedDam(20));
		list.add(TooltipLocalizer.arcanaConsumed(7));
	}

	// @Override
	// protected boolean additionalRightClickChecks(EntityPlayer player) {
	// return ArcanaHelper.getProperties(player).useBar(15);
	// }
}