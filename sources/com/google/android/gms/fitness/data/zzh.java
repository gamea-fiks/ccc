// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.fitness.data;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.fitness.data:
//            Device

public class zzh
    implements android.os.Parcelable.Creator
{

    public zzh()
    {
    }

    static void zza(Device device, Parcel parcel, int i)
    {
        i = zzb.zzM(parcel);
        zzb.zza(parcel, 1, device.getManufacturer(), false);
        zzb.zzc(parcel, 1000, device.getVersionCode());
        zzb.zza(parcel, 2, device.getModel(), false);
        zzb.zza(parcel, 3, device.getVersion(), false);
        zzb.zza(parcel, 4, device.zzoR(), false);
        zzb.zzc(parcel, 5, device.getType());
        zzb.zzc(parcel, 6, device.zzoP());
        zzb.zzH(parcel, i);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzcb(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzdE(i);
    }

    public Device zzcb(Parcel parcel)
    {
        int i = 0;
        String s = null;
        int l = com.google.android.gms.common.internal.safeparcel.zza.zzL(parcel);
        int j = 0;
        String s1 = null;
        String s2 = null;
        String s3 = null;
        int k = 0;
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
                    s3 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, i1);
                    break;

                case 1000: 
                    k = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, i1);
                    break;

                case 2: // '\002'
                    s2 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, i1);
                    break;

                case 3: // '\003'
                    s1 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, i1);
                    break;

                case 4: // '\004'
                    s = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, i1);
                    break;

                case 5: // '\005'
                    j = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, i1);
                    break;

                case 6: // '\006'
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, i1);
                    break;
                }
            } else
            if(parcel.dataPosition() != l)
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(l).toString(), parcel);
            else
                return new Device(k, s3, s2, s1, s, j, i);
        while(true);
    }

    public Device[] zzdE(int i)
    {
        return new Device[i];
    }
}
