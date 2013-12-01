package tutorial.blocks;

import net.minecraft.block.Block;
import tutorial.lib.Names;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class Blocks {
public static Block block;

public static void init() {
block = new TutBlock(Ids.tutBlock);
GameRegistry.registerBlock(block, Names.tutBlock_name);
}

public static void addNames() {
LanguageRegistry.addName(block, Names.tutBlock_name);
}
}