package tsb.cacticraft;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class CactiTab extends ItemGroup
{

	private ItemStack icon;

	public CactiTab(String label)
	{
		super(label);
	}

	public CactiTab(int index, String label)
	{
		super(index, label);
	}

	public void setIcon(Block icon)
	{
		this.icon = new ItemStack(icon);
	}

	public void setIcon(Item icon)
	{
		this.icon = new ItemStack(icon);
	}

	@Override
	public ItemStack createIcon()
	{
		return this.icon;
	}
}
