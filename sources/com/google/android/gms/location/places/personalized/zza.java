// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.location.places.personalized;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zza
    implements android.os.Parcelable.Creator
{

    public zza()
    {
    }

    static void zza(HereContent.Action action, Parcel parcel, int i)
    {
        i = zzb.zzM(parcel);
        zzb.zza(parcel, 1, action.getTitle(), false);
        zzb.zzc(parcel, 1000, action.zzzH);
        zzb.zza(parcel, 2, action.getUri(), false);
        zzb.zzH(parcel, i);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzdW(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzgb(i);
    }

    public HereContent.Action zzdW(Parcel parcel)
    {
        String s1 = null;
        int j = com.google.android.gms.common.internal.safeparcel.zza.zzL(parcel);
        int i = 0;
        String s = null;
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
                    s = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, k);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, k);
                    break;

                case 2: // '\002'
                    s1 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, k);
                    break;
                }
            } else
            if(parcel.dataPosition() != j)
                throw new com.google.android.gms.common.internal.safeparcel.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            else
                return new HereContent.Action(i, s, s1);
        while(true);
    }

    public HereContent.Action[] zzgb(int i)
    {
        return new HereContent.Action[i];
    }
}
