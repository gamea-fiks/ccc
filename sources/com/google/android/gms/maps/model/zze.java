// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.maps.model:
//            LatLng

public class zze
    implements android.os.Parcelable.Creator
{

    public zze()
    {
    }

    static void zza(LatLng latlng, Parcel parcel, int i)
    {
        i = zzb.zzM(parcel);
        zzb.zzc(parcel, 1, latlng.getVersionCode());
        zzb.zza(parcel, 2, latlng.latitude);
        zzb.zza(parcel, 3, latlng.longitude);
        zzb.zzH(parcel, i);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzei(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzgn(i);
    }

    public LatLng zzei(Parcel parcel)
    {
        double d = 0.0D;
        int j = com.google.android.gms.common.internal.safeparcel.zza.zzL(parcel);
        int i = 0;
        double d1 = 0.0D;
        do
            if(parcel.dataPosition() < j)
            {
                int k = com.google.android.gms.common.internal.safeparcel.zza.zzK(parcel);
                switch(com.google.android.gms.common.internal.safeparcel.zza.zzaV(k))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.zza.zzb(parcel, k);
                    break;

                case 1: // '\001'
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, k);
                    break;

                case 2: // '\002'
                    d1 = com.google.android.gms.common.internal.safeparcel.zza.zzm(parcel, k);
                    break;

                case 3: // '\003'
                    d = com.google.android.gms.common.internal.safeparcel.zza.zzm(parcel, k);
                    break;
                }
            } else
            if(parcel.dataPosition() != j)
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            else
                return new LatLng(i, d1, d);
        while(true);
    }

    public LatLng[] zzgn(int i)
    {
        return new LatLng[i];
    }
}
