// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.location.places.internal:
//            PlaceLocalization

public class zzm
    implements android.os.Parcelable.Creator
{

    public zzm()
    {
    }

    static void zza(PlaceLocalization placelocalization, Parcel parcel, int i)
    {
        i = zzb.zzM(parcel);
        zzb.zza(parcel, 1, placelocalization.name, false);
        zzb.zzc(parcel, 1000, placelocalization.versionCode);
        zzb.zza(parcel, 2, placelocalization.zzasR, false);
        zzb.zza(parcel, 3, placelocalization.zzasS, false);
        zzb.zza(parcel, 4, placelocalization.zzasT, false);
        zzb.zzb(parcel, 5, placelocalization.zzasU, false);
        zzb.zzH(parcel, i);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzdT(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzfY(i);
    }

    public PlaceLocalization zzdT(Parcel parcel)
    {
        java.util.ArrayList arraylist = null;
        int j = com.google.android.gms.common.internal.safeparcel.zza.zzL(parcel);
        int i = 0;
        String s = null;
        String s1 = null;
        String s2 = null;
        String s3 = null;
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
                    s3 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, k);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, k);
                    break;

                case 2: // '\002'
                    s2 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, k);
                    break;

                case 3: // '\003'
                    s1 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, k);
                    break;

                case 4: // '\004'
                    s = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, k);
                    break;

                case 5: // '\005'
                    arraylist = com.google.android.gms.common.internal.safeparcel.zza.zzC(parcel, k);
                    break;
                }
            } else
            if(parcel.dataPosition() != j)
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            else
                return new PlaceLocalization(i, s3, s2, s1, s, arraylist);
        while(true);
    }

    public PlaceLocalization[] zzfY(int i)
    {
        return new PlaceLocalization[i];
    }
}
