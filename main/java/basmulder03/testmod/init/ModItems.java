package basmulder03.testmod.init;

import basmulder03.testmod.corecomponents.EasyRegistry;
import basmulder03.testmod.items.ItemIngots;
import basmulder03.testmod.items.parts.ItemEleccirc;
import net.minecraft.item.Item;

public class ModItems {
	
	
	public static final String META_PLACEHOLDER = "PLACEHOLDER_ITEM";
	public static Item INGOTS;
	
	public static void init() throws InstantiationException, IllegalAccessException{
		INGOTS = new ItemIngots();
		registerItem(INGOTS, "ingot");
	}
	
	public static void registerItem(Item item, String name){
		item.setRegistryName(name);
		EasyRegistry.registerItem(item);
	}
}
