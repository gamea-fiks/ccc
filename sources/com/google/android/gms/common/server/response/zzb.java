// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.common.server.response;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;

public class zzb
    implements android.os.Parcelable.Creator
{

    public zzb()
    {
    }

    static void zza(FieldMappingDictionary.FieldMapPair fieldmappair, Parcel parcel, int i)
    {
        int j = com.google.android.gms.common.internal.safeparcel.zzb.zzM(parcel);
        com.google.android.gms.common.internal.safeparcel.zzb.zzc(parcel, 1, fieldmappair.versionCode);
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel, 2, fieldmappair.zzgk, false);
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel, 3, fieldmappair.zzUM, i, false);
        com.google.android.gms.common.internal.safeparcel.zzb.zzH(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzS(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzbc(i);
    }

    public FieldMappingDictionary.FieldMapPair zzS(Parcel parcel)
    {
        FastJsonResponse.Field field = null;
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
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, k);
                    break;

                case 2: // '\002'
                    s = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, k);
                    break;

                case 3: // '\003'
                    field = (FastJsonResponse.Field)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, k, FastJsonResponse.Field.CREATOR);
                    break;
                }
            } else
            if(parcel.dataPosition() != j)
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            else
                return new FieldMappingDictionary.FieldMapPair(i, s, field);
        while(true);
    }

    public FieldMappingDictionary.FieldMapPair[] zzbc(int i)
    {
        return new FieldMappingDictionary.FieldMapPair[i];
    }
}
