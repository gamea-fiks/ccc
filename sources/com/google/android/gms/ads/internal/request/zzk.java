// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.ads.internal.request;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.ads.internal.request:
//            LargeParcelTeleporter

public class zzk
    implements android.os.Parcelable.Creator
{

    public zzk()
    {
    }

    static void zza(LargeParcelTeleporter largeparcelteleporter, Parcel parcel, int i)
    {
        int j = zzb.zzM(parcel);
        zzb.zzc(parcel, 1, largeparcelteleporter.zzzH);
        zzb.zza(parcel, 2, largeparcelteleporter.zzzI, i, false);
        zzb.zzH(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzj(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzy(i);
    }

    public LargeParcelTeleporter zzj(Parcel parcel)
    {
        int j = com.google.android.gms.common.internal.safeparcel.zza.zzL(parcel);
        int i = 0;
        ParcelFileDescriptor parcelfiledescriptor = null;
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
                    parcelfiledescriptor = (ParcelFileDescriptor)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, k, ParcelFileDescriptor.CREATOR);
                    break;
                }
            } else
            if(parcel.dataPosition() != j)
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            else
                return new LargeParcelTeleporter(i, parcelfiledescriptor);
        while(true);
    }

    public LargeParcelTeleporter[] zzy(int i)
    {
        return new LargeParcelTeleporter[i];
    }
}
