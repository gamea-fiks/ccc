// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.appstate;

import com.google.android.gms.common.data.AbstractDataBuffer;
import com.google.android.gms.common.data.DataHolder;

// Referenced classes of package com.google.android.gms.appstate:
//            zzb, AppState

public final class AppStateBuffer extends AbstractDataBuffer
{

    public AppStateBuffer(DataHolder dataholder)
    {
        super(dataholder);
    }

    public AppState get(int i)
    {
        return new zzb(zzPy, i);
    }

    public volatile Object get(int i)
    {
        return get(i);
    }
}
