// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.maps.model.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.maps.model.internal:
//            MarkerOptionsParcelable, BitmapDescriptorParcelable

public class zzm
    implements android.os.Parcelable.Creator
{

    public zzm()
    {
    }

    static void zza(MarkerOptionsParcelable markeroptionsparcelable, Parcel parcel, int i)
    {
        int j = zzb.zzM(parcel);
        zzb.zzc(parcel, 1, markeroptionsparcelable.getVersionCode());
        zzb.zza(parcel, 2, markeroptionsparcelable.zztY(), i, false);
        zzb.zzH(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzew(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzgC(i);
    }

    public MarkerOptionsParcelable zzew(Parcel parcel)
    {
        int j = com.google.android.gms.common.internal.safeparcel.zza.zzL(parcel);
        int i = 0;
        BitmapDescriptorParcelable bitmapdescriptorparcelable = null;
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
                    bitmapdescriptorparcelable = (BitmapDescriptorParcelable)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, k, BitmapDescriptorParcelable.CREATOR);
                    break;
                }
            } else
            if(parcel.dataPosition() != j)
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            else
                return new MarkerOptionsParcelable(i, bitmapdescriptorparcelable);
        while(true);
    }

    public MarkerOptionsParcelable[] zzgC(int i)
    {
        return new MarkerOptionsParcelable[i];
    }
}
