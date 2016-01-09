// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.common.api;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzv;

// Referenced classes of package com.google.android.gms.common.api:
//            zzj

public final class Scope
    implements SafeParcelable
{

    Scope(int i, String s)
    {
        zzv.zzh(s, "scopeUri must not be null or empty");
        zzzH = i;
        zzQT = s;
    }

    public Scope(String s)
    {
        this(1, s);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if(this == obj)
            return true;
        if(!(obj instanceof Scope))
            return false;
        else
            return zzQT.equals(((Scope)obj).zzQT);
    }

    public int hashCode()
    {
        return zzQT.hashCode();
    }

    public String toString()
    {
        return zzQT;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzj.zza(this, parcel, i);
    }

    public String zzle()
    {
        return zzQT;
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzj();
    private final String zzQT;
    final int zzzH;

}
