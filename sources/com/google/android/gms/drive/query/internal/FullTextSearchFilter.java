// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.drive.query.internal;

import android.os.Parcel;

// Referenced classes of package com.google.android.gms.drive.query.internal:
//            AbstractFilter, zzg, zzf

public class FullTextSearchFilter extends AbstractFilter
{

    FullTextSearchFilter(int i, String s)
    {
        zzzH = i;
        mValue = s;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzg.zza(this, parcel, i);
    }

    public Object zza(zzf zzf1)
    {
        return zzf1.zzcj(mValue);
    }

    public static final zzg CREATOR = new zzg();
    final String mValue;
    final int zzzH;

}
