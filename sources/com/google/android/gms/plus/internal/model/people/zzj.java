// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.plus.internal.model.people;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import java.util.HashSet;
import java.util.Set;

public class zzj
    implements android.os.Parcelable.Creator
{

    public zzj()
    {
    }

    static void zza(PersonEntity.UrlsEntity urlsentity, Parcel parcel, int i)
    {
        i = zzb.zzM(parcel);
        Set set = urlsentity.zzazD;
        if(set.contains(Integer.valueOf(1)))
            zzb.zzc(parcel, 1, urlsentity.zzzH);
        if(set.contains(Integer.valueOf(3)))
            zzb.zzc(parcel, 3, urlsentity.zzvY());
        if(set.contains(Integer.valueOf(4)))
            zzb.zza(parcel, 4, urlsentity.mValue, true);
        if(set.contains(Integer.valueOf(5)))
            zzb.zza(parcel, 5, urlsentity.zzawK, true);
        if(set.contains(Integer.valueOf(6)))
            zzb.zzc(parcel, 6, urlsentity.zzMG);
        zzb.zzH(parcel, i);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzfd(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzhw(i);
    }

    public PersonEntity.UrlsEntity zzfd(Parcel parcel)
    {
        String s = null;
        int i = 0;
        int l = com.google.android.gms.common.internal.safeparcel.zza.zzL(parcel);
        HashSet hashset = new HashSet();
        int j = 0;
        String s1 = null;
        int k = 0;
        do
            if(parcel.dataPosition() < l)
            {
                int i1 = com.google.android.gms.common.internal.safeparcel.zza.zzK(parcel);
                switch(com.google.android.gms.common.internal.safeparcel.zza.zzaV(i1))
                {
                case 2: // '\002'
                default:
                    com.google.android.gms.common.internal.safeparcel.zza.zzb(parcel, i1);
                    break;

                case 1: // '\001'
                    k = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, i1);
                    hashset.add(Integer.valueOf(1));
                    break;

                case 3: // '\003'
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, i1);
                    hashset.add(Integer.valueOf(3));
                    break;

                case 4: // '\004'
                    s = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, i1);
                    hashset.add(Integer.valueOf(4));
                    break;

                case 5: // '\005'
                    s1 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, i1);
                    hashset.add(Integer.valueOf(5));
                    break;

                case 6: // '\006'
                    j = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, i1);
                    hashset.add(Integer.valueOf(6));
                    break;
                }
            } else
            {
                if(parcel.dataPosition() != l)
                    throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(l).toString(), parcel);
                return new PersonEntity.UrlsEntity(hashset, k, s1, j, s, i);
            }
        while(true);
    }

    public PersonEntity.UrlsEntity[] zzhw(int i)
    {
        return new PersonEntity.UrlsEntity[i];
    }
}
