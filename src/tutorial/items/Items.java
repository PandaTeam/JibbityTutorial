package tutorial.items;

import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import tutorial.lib.Names;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class Items {
public static Item item;

public static Item tool;

public static void init() {
	item = new TutItem(Ids.tutItem);
	tool = new TutTool(Ids.tutTool, EnumToolMaterial.EMERALD);
}

public static void addNames() {
	LanguageRegistry.addName(item, Names.tutItem_name);
	LanguageRegistry.addName(tool, Names.tutTool_name);
	
}


}
