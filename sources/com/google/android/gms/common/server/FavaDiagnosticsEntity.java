// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.common.server;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.common.server:
//            zza

public class FavaDiagnosticsEntity
    implements SafeParcelable
{

    public FavaDiagnosticsEntity(int i, String s, int j)
    {
        zzzH = i;
        zzUq = s;
        zzUr = j;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zza.zza(this, parcel, i);
    }

    public static final zza CREATOR = new zza();
    public final String zzUq;
    public final int zzUr;
    final int zzzH;

}
