// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.Future;

// Referenced classes of package com.google.android.gms.internal:
//            zzaa, zzy, zzfs, zzfl

public class zzz
{

    public zzz()
    {
    }

    protected zzy zza(Context context, VersionInfoParcel versioninfoparcel, zzfs zzfs1)
    {
        context = new zzaa(context, versioninfoparcel);
        context.zza(new zzy.zza(zzfs1, context) {

            public void zzbq()
            {
                zzoJ.zzc(zzoM);
            }

            final zzfs zzoJ;
            final zzz zzoL;
            final zzy zzoM;

            
            {
                zzoL = zzz.this;
                zzoJ = zzfs1;
                zzoM = zzy1;
                super();
            }
        }
);
        return context;
    }

    public Future zza(Context context, VersionInfoParcel versioninfoparcel, String s)
    {
        zzfs zzfs1 = new zzfs();
        zzfl.zzCr.post(new Runnable(context, versioninfoparcel, zzfs1, s) {

            public void run()
            {
                zzoL.zza(zzoH, zzoI, zzoJ).zzh(zzoK);
            }

            final Context zzoH;
            final VersionInfoParcel zzoI;
            final zzfs zzoJ;
            final String zzoK;
            final zzz zzoL;

            
            {
                zzoL = zzz.this;
                zzoH = context;
                zzoI = versioninfoparcel;
                zzoJ = zzfs1;
                zzoK = s;
                super();
            }
        }
);
        return zzfs1;
    }
}
