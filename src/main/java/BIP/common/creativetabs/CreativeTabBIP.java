/*******************************************************************************
 * Copyright (c) 2012 Mrbrutal. All rights reserved.
 * 
 * @name TrainCraft
 * @author Mrbrutal
 ******************************************************************************/

package BIP.common.creativetabs;

import BIP.common.items.ItemBIPRollingStock;
import BIP.common.library.BIPItems;
import BIP.common.library.BIPTrainItemIDs;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import static BIP.common.library.BIPTrainItemIDs.class43;

public final class CreativeTabBIP extends CreativeTabs
{
	private final Item itemForIcon;

	public CreativeTabBIP(int tabID, String tabName, Item tabIcon) {
		super(tabID, tabName);
		setBackgroundImageName("item_search.png");
		itemForIcon = tabIcon;
	}

	@Override
	public boolean hasSearchBar() {
		return true;
	}

	@Override
	public ItemStack getIconItemStack() {
		return new ItemStack(class43.item);
	}

	@Override
	public String getTranslatedTabLabel() {
		return super.getTabLabel();
	}

	@Override
	public Item getTabIconItem(){return class43.item;}
}
