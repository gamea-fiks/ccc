// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.drive.query.internal:
//            LogicalFilter, Operator, FilterHolder

public class zzj
    implements android.os.Parcelable.Creator
{

    public zzj()
    {
    }

    static void zza(LogicalFilter logicalfilter, Parcel parcel, int i)
    {
        int j = zzb.zzM(parcel);
        zzb.zzc(parcel, 1000, logicalfilter.zzzH);
        zzb.zza(parcel, 1, logicalfilter.zzaaM, i, false);
        zzb.zzc(parcel, 2, logicalfilter.zzaba, false);
        zzb.zzH(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzbA(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzcZ(i);
    }

    public LogicalFilter zzbA(Parcel parcel)
    {
        java.util.ArrayList arraylist = null;
        int j = com.google.android.gms.common.internal.safeparcel.zza.zzL(parcel);
        int i = 0;
        Operator operator = null;
        do
            if(parcel.dataPosition() < j)
            {
                int k = com.google.android.gms.common.internal.safeparcel.zza.zzK(parcel);
                switch(com.google.android.gms.common.internal.safeparcel.zza.zzaV(k))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.zza.zzb(parcel, k);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, k);
                    break;

                case 1: // '\001'
                    operator = (Operator)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, k, Operator.CREATOR);
                    break;

                case 2: // '\002'
                    arraylist = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, k, FilterHolder.CREATOR);
                    break;
                }
            } else
            if(parcel.dataPosition() != j)
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            else
                return new LogicalFilter(i, operator, arraylist);
        while(true);
    }

    public LogicalFilter[] zzcZ(int i)
    {
        return new LogicalFilter[i];
    }
}
