// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.wallet.wobs:
//            TextModuleData

public class zzf
    implements android.os.Parcelable.Creator
{

    public zzf()
    {
    }

    static void zza(TextModuleData textmoduledata, Parcel parcel, int i)
    {
        i = zzb.zzM(parcel);
        zzb.zzc(parcel, 1, textmoduledata.getVersionCode());
        zzb.zza(parcel, 2, textmoduledata.zzaKs, false);
        zzb.zza(parcel, 3, textmoduledata.zzzr, false);
        zzb.zzH(parcel, i);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzfL(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzit(i);
    }

    public TextModuleData zzfL(Parcel parcel)
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
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, k);
                    break;

                case 2: // '\002'
                    s = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, k);
                    break;

                case 3: // '\003'
                    s1 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, k);
                    break;
                }
            } else
            if(parcel.dataPosition() != j)
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            else
                return new TextModuleData(i, s, s1);
        while(true);
    }

    public TextModuleData[] zzit(int i)
    {
        return new TextModuleData[i];
    }
}
