// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.ads.internal.client:
//            AdSizeParcel

public class zzg
    implements android.os.Parcelable.Creator
{

    public zzg()
    {
    }

    static void zza(AdSizeParcel adsizeparcel, Parcel parcel, int i)
    {
        int j = zzb.zzM(parcel);
        zzb.zzc(parcel, 1, adsizeparcel.versionCode);
        zzb.zza(parcel, 2, adsizeparcel.zzpX, false);
        zzb.zzc(parcel, 3, adsizeparcel.height);
        zzb.zzc(parcel, 4, adsizeparcel.heightPixels);
        zzb.zza(parcel, 5, adsizeparcel.zzpY);
        zzb.zzc(parcel, 6, adsizeparcel.width);
        zzb.zzc(parcel, 7, adsizeparcel.widthPixels);
        zzb.zza(parcel, 8, adsizeparcel.zzpZ, i, false);
        zzb.zza(parcel, 9, adsizeparcel.zzqa);
        zzb.zzH(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzc(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzh(i);
    }

    public AdSizeParcel zzc(Parcel parcel)
    {
        AdSizeParcel aadsizeparcel[] = null;
        boolean flag = false;
        int j1 = com.google.android.gms.common.internal.safeparcel.zza.zzL(parcel);
        int i = 0;
        int j = 0;
        boolean flag1 = false;
        int k = 0;
        int l = 0;
        String s = null;
        int i1 = 0;
        do
            if(parcel.dataPosition() < j1)
            {
                int k1 = com.google.android.gms.common.internal.safeparcel.zza.zzK(parcel);
                switch(com.google.android.gms.common.internal.safeparcel.zza.zzaV(k1))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.zza.zzb(parcel, k1);
                    break;

                case 1: // '\001'
                    i1 = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, k1);
                    break;

                case 2: // '\002'
                    s = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, k1);
                    break;

                case 3: // '\003'
                    l = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, k1);
                    break;

                case 4: // '\004'
                    k = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, k1);
                    break;

                case 5: // '\005'
                    flag1 = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, k1);
                    break;

                case 6: // '\006'
                    j = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, k1);
                    break;

                case 7: // '\007'
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, k1);
                    break;

                case 8: // '\b'
                    aadsizeparcel = (AdSizeParcel[])com.google.android.gms.common.internal.safeparcel.zza.zzb(parcel, k1, AdSizeParcel.CREATOR);
                    break;

                case 9: // '\t'
                    flag = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, k1);
                    break;
                }
            } else
            if(parcel.dataPosition() != j1)
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(j1).toString(), parcel);
            else
                return new AdSizeParcel(i1, s, l, k, flag1, j, i, aadsizeparcel, flag);
        while(true);
    }

    public AdSizeParcel[] zzh(int i)
    {
        return new AdSizeParcel[i];
    }
}
