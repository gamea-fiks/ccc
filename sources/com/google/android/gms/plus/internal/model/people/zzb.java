// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.plus.internal.model.people;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import java.util.HashSet;
import java.util.Set;

public class zzb
    implements android.os.Parcelable.Creator
{

    public zzb()
    {
    }

    static void zza(PersonEntity.AgeRangeEntity agerangeentity, Parcel parcel, int i)
    {
        i = com.google.android.gms.common.internal.safeparcel.zzb.zzM(parcel);
        Set set = agerangeentity.zzazD;
        if(set.contains(Integer.valueOf(1)))
            com.google.android.gms.common.internal.safeparcel.zzb.zzc(parcel, 1, agerangeentity.zzzH);
        if(set.contains(Integer.valueOf(2)))
            com.google.android.gms.common.internal.safeparcel.zzb.zzc(parcel, 2, agerangeentity.zzaAU);
        if(set.contains(Integer.valueOf(3)))
            com.google.android.gms.common.internal.safeparcel.zzb.zzc(parcel, 3, agerangeentity.zzaAV);
        com.google.android.gms.common.internal.safeparcel.zzb.zzH(parcel, i);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzeV(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzho(i);
    }

    public PersonEntity.AgeRangeEntity zzeV(Parcel parcel)
    {
        int k = 0;
        int l = com.google.android.gms.common.internal.safeparcel.zza.zzL(parcel);
        HashSet hashset = new HashSet();
        int j = 0;
        int i = 0;
        do
            if(parcel.dataPosition() < l)
            {
                int i1 = com.google.android.gms.common.internal.safeparcel.zza.zzK(parcel);
                switch(com.google.android.gms.common.internal.safeparcel.zza.zzaV(i1))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.zza.zzb(parcel, i1);
                    break;

                case 1: // '\001'
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, i1);
                    hashset.add(Integer.valueOf(1));
                    break;

                case 2: // '\002'
                    j = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, i1);
                    hashset.add(Integer.valueOf(2));
                    break;

                case 3: // '\003'
                    k = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, i1);
                    hashset.add(Integer.valueOf(3));
                    break;
                }
            } else
            {
                if(parcel.dataPosition() != l)
                    throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(l).toString(), parcel);
                return new PersonEntity.AgeRangeEntity(hashset, i, j, k);
            }
        while(true);
    }

    public PersonEntity.AgeRangeEntity[] zzho(int i)
    {
        return new PersonEntity.AgeRangeEntity[i];
    }
}
