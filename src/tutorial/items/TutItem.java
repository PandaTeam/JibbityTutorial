package tutorial.items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
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
	itemIcon = icon.registerIcon(ModInfo.ID.toLowerCase() + ":" + Names.tutItem_unlocalizedName);

	}

@Override
public boolean itemInteractionForEntity(ItemStack itemstack, EntityPlayer player, EntityLivingBase target){

	if(!target.worldObj.isRemote){
			if(target instanceof EntityCreeper || target instanceof EntityZombie){
				target.motionY = 2;}
	
	} else {
		player.addChatMessage("No Creepers or Zombies in range!");
	}

return false;

 }



}






