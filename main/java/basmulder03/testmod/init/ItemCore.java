package basmulder03.testmod.init;

import basmulder03.testmod.Main;
import net.minecraft.item.Item;
	
	public class ItemCore extends Item{
		public ItemCore(){
			setNoRepair();
			setCreativeTab(Main.testmodtab);
		}
	}

