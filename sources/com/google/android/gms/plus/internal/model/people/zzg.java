// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.plus.internal.model.people;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import java.util.HashSet;
import java.util.Set;

public class zzg
    implements android.os.Parcelable.Creator
{

    public zzg()
    {
    }

    static void zza(PersonEntity.NameEntity nameentity, Parcel parcel, int i)
    {
        i = zzb.zzM(parcel);
        Set set = nameentity.zzazD;
        if(set.contains(Integer.valueOf(1)))
            zzb.zzc(parcel, 1, nameentity.zzzH);
        if(set.contains(Integer.valueOf(2)))
            zzb.zza(parcel, 2, nameentity.zzaAb, true);
        if(set.contains(Integer.valueOf(3)))
            zzb.zza(parcel, 3, nameentity.zzaBb, true);
        if(set.contains(Integer.valueOf(4)))
            zzb.zza(parcel, 4, nameentity.zzaAe, true);
        if(set.contains(Integer.valueOf(5)))
            zzb.zza(parcel, 5, nameentity.zzaBc, true);
        if(set.contains(Integer.valueOf(6)))
            zzb.zza(parcel, 6, nameentity.zzaBd, true);
        if(set.contains(Integer.valueOf(7)))
            zzb.zza(parcel, 7, nameentity.zzaBe, true);
        zzb.zzH(parcel, i);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzfa(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzht(i);
    }

    public PersonEntity.NameEntity zzfa(Parcel parcel)
    {
        String s = null;
        int j = com.google.android.gms.common.internal.safeparcel.zza.zzL(parcel);
        HashSet hashset = new HashSet();
        int i = 0;
        String s1 = null;
        String s2 = null;
        String s3 = null;
        String s4 = null;
        String s5 = null;
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
                    hashset.add(Integer.valueOf(1));
                    break;

                case 2: // '\002'
                    s5 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, k);
                    hashset.add(Integer.valueOf(2));
                    break;

                case 3: // '\003'
                    s4 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, k);
                    hashset.add(Integer.valueOf(3));
                    break;

                case 4: // '\004'
                    s3 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, k);
                    hashset.add(Integer.valueOf(4));
                    break;

                case 5: // '\005'
                    s2 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, k);
                    hashset.add(Integer.valueOf(5));
                    break;

                case 6: // '\006'
                    s1 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, k);
                    hashset.add(Integer.valueOf(6));
                    break;

                case 7: // '\007'
                    s = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, k);
                    hashset.add(Integer.valueOf(7));
                    break;
                }
            } else
            {
                if(parcel.dataPosition() != j)
                    throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
                return new PersonEntity.NameEntity(hashset, i, s5, s4, s3, s2, s1, s);
            }
        while(true);
    }

    public PersonEntity.NameEntity[] zzht(int i)
    {
        return new PersonEntity.NameEntity[i];
    }
}
