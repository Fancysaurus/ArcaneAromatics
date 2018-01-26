package com.fancysaurus.arcanearomatics.common.reg;

import com.fancysaurus.arcanearomatics.common.item.ItemPanacea;
import vazkii.arl.item.ItemMod;

public class ArcAroItems
{
    public static ItemMod panacea;

    public static void preInit()
    {
        panacea = new ItemPanacea();
    }

    public static void init()
    {

    }
}
