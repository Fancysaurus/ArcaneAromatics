package com.fancysaurus.arcanearomatics.common.interf;

import com.fancysaurus.arcanearomatics.common.lib.LibMisc;
import vazkii.arl.interf.IVariantHolder;

public interface IArcAroItem extends IVariantHolder
{
    @Override
    default String getModNamespace()
    {
        return LibMisc.MOD_ID;
    }
}
