package minetux.common;

import net.minecraft.block.BlockCarrot;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.Icon;

public class BlockHop extends BlockCarrot{

	public static String[] type = new String[]{"BlockHop_stage_0", "BlockHop_stage_1", "BlockHop_stage_2", "BlockHop_stage_3", "BlockHop_stage_4", "BlockHop_stage_5", "BlockHop_stage_6", "BlockHop_stage_7"};
	private Icon[] IconArray;
	
	protected BlockHop(int id) {
		super(id);
	}

	public Icon getIcon(int side, int metadata)
    {
       	return metadata < type.length && metadata >= 0 ? IconArray[metadata] : IconArray[0];
    }
	
	public void registerIcons(IconRegister iconregister)
	{
		IconArray = new Icon[type.length];

		for(int i = 0; i < type.length; i++)
		{
			IconArray[i] = iconregister.registerIcon("minetux:" + type[i]);
		}
	}
	
	protected int getSeedItem()
    {
        return MineTux.HopSeed.itemID;
    }
	
	protected int getCropItem()
    {
        return MineTux.HopItem.itemID;
    }
	
	public int damageDropped(int metadata)
	{
		return metadata;
	}
}
