// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.location;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.location:
//            LocationSettingsRequest, LocationRequest

public class zzf
    implements android.os.Parcelable.Creator
{

    public zzf()
    {
    }

    static void zza(LocationSettingsRequest locationsettingsrequest, Parcel parcel, int i)
    {
        i = zzb.zzM(parcel);
        zzb.zzc(parcel, 1, locationsettingsrequest.zzpu(), false);
        zzb.zzc(parcel, 1000, locationsettingsrequest.getVersionCode());
        zzb.zza(parcel, 2, locationsettingsrequest.zzsB());
        zzb.zza(parcel, 3, locationsettingsrequest.zzsC());
        zzb.zza(parcel, 4, locationsettingsrequest.zzsD());
        zzb.zzH(parcel, i);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzdD(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzfC(i);
    }

    public LocationSettingsRequest zzdD(Parcel parcel)
    {
        boolean flag = false;
        int j = com.google.android.gms.common.internal.safeparcel.zza.zzL(parcel);
        java.util.ArrayList arraylist = null;
        boolean flag1 = false;
        boolean flag2 = false;
        int i = 0;
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
                    arraylist = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, k, LocationRequest.CREATOR);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, k);
                    break;

                case 2: // '\002'
                    flag2 = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, k);
                    break;

                case 3: // '\003'
                    flag1 = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, k);
                    break;

                case 4: // '\004'
                    flag = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, k);
                    break;
                }
            } else
            if(parcel.dataPosition() != j)
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            else
                return new LocationSettingsRequest(i, arraylist, flag2, flag1, flag);
        while(true);
    }

    public LocationSettingsRequest[] zzfC(int i)
    {
        return new LocationSettingsRequest[i];
    }
}
