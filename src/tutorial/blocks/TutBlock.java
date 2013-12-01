package tutorial.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.Icon;
import tutorial.lib.ModInfo;
import tutorial.lib.Names;

public class TutBlock extends Block {

	public TutBlock(int id) {
		super(id, Material.rock);
		this.setUnlocalizedName(Names.tutBlock_unlocalizedName);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setHardness(2F);
		this.setResistance(15F);
		this.setStepSound(Block.soundGlassFootstep);
		this.setLightValue(1F);
	}
	
@SideOnly(Side.CLIENT)
	public static Icon topIcon;
@SideOnly(Side.CLIENT)
	public static Icon bottomIcon;
@SideOnly(Side.CLIENT)
	public static Icon sideIcon;

@Override
@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister icon) {
	topIcon = icon.registerIcon(ModInfo.ID.toLowerCase() + ":" + Names.tutBlock_unlocalizedName + "_top");
	bottomIcon = icon.registerIcon(ModInfo.ID.toLowerCase() + ":" + Names.tutBlock_unlocalizedName + "_bottom");
	sideIcon = icon.registerIcon(ModInfo.ID.toLowerCase() + ":" + Names.tutBlock_unlocalizedName + "_side");
	}

@Override
@SideOnly(Side.CLIENT)
public Icon getIcon(int side, int metadata) {
	if(side == 0) {
		return bottomIcon;
	}	
	
	else if(side == 1) {
		return topIcon;
	}
	
	else {
		return sideIcon;
	}
}

}

//@Override
//@SideOnly(Side.CLIENT)
//public void registerIcons(IconRegister icon) {
//	blockIcon = icon.registerIcon(ModInfo.ID.toLowerCase() + ":" + "tutBlock");
//}

