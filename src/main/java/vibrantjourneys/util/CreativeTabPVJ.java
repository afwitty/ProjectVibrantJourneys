package vibrantjourneys.util;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityList;
import net.minecraft.init.Items;
import net.minecraft.item.ItemMonsterPlacer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import vibrantjourneys.init.PVJBlocks;

public class CreativeTabPVJ extends CreativeTabs
{
	public static final CreativeTabs instance = new CreativeTabPVJ();
	
	public CreativeTabPVJ()
	{
		super(CreativeTabs.getNextID(), "tabProjectVibrantJourneys");
	}
	
	@Override
	public ItemStack getTabIconItem()
	{
		return new ItemStack(PVJBlocks.redwood_leaves);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void displayAllRelevantItems(NonNullList<ItemStack> itemList)
	{
		super.displayAllRelevantItems(itemList);
		
		//Adds the mod's entity spawn eggs to this tab
		for(EntityList.EntityEggInfo egg : EntityList.ENTITY_EGGS.values())
		{
			if(egg.spawnedID.getResourceDomain().equals(Reference.MOD_ID))
			{
				ItemStack itemstack = new ItemStack(Items.SPAWN_EGG, 1);
				ItemMonsterPlacer.applyEntityIdToItemStack(itemstack, egg.spawnedID);
				itemList.add(itemstack);
			}
		}
	}
}
