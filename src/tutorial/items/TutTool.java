package tutorial.items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import tutorial.lib.ModInfo;
import tutorial.lib.Names;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class TutTool extends ItemOmniTool {
public TutTool(int id, EnumToolMaterial material) {
	super(id, material);
	setUnlocalizedName(Names.tutTool_unlocalizedName);
	setCreativeTab(CreativeTabs.tabTools);
	setMaxStackSize(1);
	}

@Override
@SideOnly(Side.CLIENT)
public void registerIcons(IconRegister icon) {
	itemIcon = icon.registerIcon(ModInfo.ID.toLowerCase() + ":" + getUnlocalizedName());
}

}
