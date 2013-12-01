package tutorial.items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import tutorial.lib.ModInfo;
import tutorial.lib.Names;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class TutItem extends Item {
public TutItem(int id) {
	super(id);
	this.setCreativeTab(CreativeTabs.tabMisc);
	this.setUnlocalizedName(Names.tutItem_unlocalizedName);
	}
@Override
@SideOnly(Side.CLIENT)
public void registerIcons(IconRegister icon) {
	itemIcon = icon.registerIcon(ModInfo.ID.toLowerCase() + ":" + "tutItem");
	}
}

