// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wallet.wobs:
//            zzh

public final class UriData
    implements SafeParcelable
{

    UriData()
    {
        zzzH = 1;
    }

    UriData(int i, String s, String s1)
    {
        zzzH = i;
        zzaxX = s;
        description = s1;
    }

    public int describeContents()
    {
        return 0;
    }

    public int getVersionCode()
    {
        return zzzH;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzh.zza(this, parcel, i);
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzh();
    String description;
    String zzaxX;
    private final int zzzH;

}
