package tutorial.items;

import net.minecraft.item.Item;
import tutorial.lib.Names;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class Items {
public static Item item;

public static void init() {
	item = new TutItem(Ids.tutItem);
}

public static void addNames() {
	LanguageRegistry.addName(item, Names.tutItem_name);
}


}
