// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            zzcj, zzcs, zzcm

public final class zzco
{
    public static interface zza
    {

        public abstract void zzm(int i);
    }


    public zzco(int i)
    {
        this(null, null, null, null, i);
    }

    public zzco(zzcj zzcj, zzcs zzcs, String s, zzcm zzcm, int i)
    {
        zzuU = zzcj;
        zzuV = zzcs;
        zzuW = s;
        zzuX = zzcm;
        zzuT = i;
    }

    public final int zzuT;
    public final zzcj zzuU;
    public final zzcs zzuV;
    public final String zzuW;
    public final zzcm zzuX;
}
