package net.skyrimcraft.mod.drinks;

import net.skyrimcraft.mod.Reference;
import net.skyrimcraft.mod.SkyrimCraft;
import net.skyrimcraft.mod.items.ItemDrink;

public class DrinkSkooma extends ItemDrink {

	public DrinkSkooma() {
		super(0, 0, false);
		setCreativeTab(SkyrimCraft.DRINK_TAB);
		setUnlocalizedName(Reference.SCDrinks.SKOOMA.getUnlocalizedName());
		setRegistryName(Reference.SCDrinks.SKOOMA.getRegistryName());
	}
	
}
