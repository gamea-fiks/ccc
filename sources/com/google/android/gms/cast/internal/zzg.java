// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.cast.internal;

import android.os.Parcel;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.cast.internal:
//            DeviceStatus

public class zzg
    implements android.os.Parcelable.Creator
{

    public zzg()
    {
    }

    static void zza(DeviceStatus devicestatus, Parcel parcel, int i)
    {
        int j = zzb.zzM(parcel);
        zzb.zzc(parcel, 1, devicestatus.getVersionCode());
        zzb.zza(parcel, 2, devicestatus.zzkc());
        zzb.zza(parcel, 3, devicestatus.zzkm());
        zzb.zzc(parcel, 4, devicestatus.zzkd());
        zzb.zza(parcel, 5, devicestatus.getApplicationMetadata(), i, false);
        zzb.zzc(parcel, 6, devicestatus.zzke());
        zzb.zzH(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzz(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzaq(i);
    }

    public DeviceStatus[] zzaq(int i)
    {
        return new DeviceStatus[i];
    }

    public DeviceStatus zzz(Parcel parcel)
    {
        int i = 0;
        int l = com.google.android.gms.common.internal.safeparcel.zza.zzL(parcel);
        double d = 0.0D;
        ApplicationMetadata applicationmetadata = null;
        int j = 0;
        boolean flag = false;
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
                    k = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, i1);
                    break;

                case 2: // '\002'
                    d = com.google.android.gms.common.internal.safeparcel.zza.zzm(parcel, i1);
                    break;

                case 3: // '\003'
                    flag = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, i1);
                    break;

                case 4: // '\004'
                    j = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, i1);
                    break;

                case 5: // '\005'
                    applicationmetadata = (ApplicationMetadata)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, i1, ApplicationMetadata.CREATOR);
                    break;

                case 6: // '\006'
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, i1);
                    break;
                }
            } else
            if(parcel.dataPosition() != l)
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(l).toString(), parcel);
            else
                return new DeviceStatus(k, d, flag, j, applicationmetadata, i);
        while(true);
    }
}
