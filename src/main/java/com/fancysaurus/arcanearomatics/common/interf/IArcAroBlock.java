package com.fancysaurus.arcanearomatics.common.interf;

import com.fancysaurus.arcanearomatics.common.lib.LibMisc;
import vazkii.arl.interf.IModBlock;

public interface IArcAroBlock extends IModBlock
{
    @Override
    default String getModNamespace()
    {
        return LibMisc.MOD_ID;
    }
}
