// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.zzh;
import java.util.*;

// Referenced classes of package com.google.android.gms.internal:
//            zzcb, zzcd, zzgd

public class zzcc
    implements Iterable
{

    public zzcc()
    {
    }

    private zzcb zzc(zzgd zzgd)
    {
        for(Iterator iterator1 = zzh.zzbb().iterator(); iterator1.hasNext();)
        {
            zzcb zzcb1 = (zzcb)iterator1.next();
            if(zzcb1.zznp == zzgd)
                return zzcb1;
        }

        return null;
    }

    public Iterator iterator()
    {
        return zztP.iterator();
    }

    public void zza(zzcb zzcb1)
    {
        zztP.add(zzcb1);
    }

    public boolean zza(zzgd zzgd)
    {
        zzgd = zzc(zzgd);
        if(zzgd != null)
        {
            ((zzcb) (zzgd)).zztM.abort();
            return true;
        } else
        {
            return false;
        }
    }

    public void zzb(zzcb zzcb1)
    {
        zztP.remove(zzcb1);
    }

    public boolean zzb(zzgd zzgd)
    {
        return zzc(zzgd) != null;
    }

    private final List zztP = new LinkedList();
}
