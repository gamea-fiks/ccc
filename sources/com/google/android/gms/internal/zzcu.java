// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.internal;

import android.location.Location;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import java.util.Date;
import java.util.Set;

public final class zzcu
    implements MediationAdRequest
{

    public zzcu(Date date, int i, Set set, Location location, boolean flag, int j)
    {
        zzi = date;
        zzqm = i;
        zzk = set;
        zzm = location;
        zzl = flag;
        zzuZ = j;
    }

    public Date getBirthday()
    {
        return zzi;
    }

    public int getGender()
    {
        return zzqm;
    }

    public Set getKeywords()
    {
        return zzk;
    }

    public Location getLocation()
    {
        return zzm;
    }

    public boolean isTesting()
    {
        return zzl;
    }

    public int taggedForChildDirectedTreatment()
    {
        return zzuZ;
    }

    private final Date zzi;
    private final Set zzk;
    private final boolean zzl;
    private final Location zzm;
    private final int zzqm;
    private final int zzuZ;
}
