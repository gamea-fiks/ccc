// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.common.server.converter:
//            ConverterWrapper, StringToIntConverter

public class zza
    implements android.os.Parcelable.Creator
{

    public zza()
    {
    }

    static void zza(ConverterWrapper converterwrapper, Parcel parcel, int i)
    {
        int j = zzb.zzM(parcel);
        zzb.zzc(parcel, 1, converterwrapper.getVersionCode());
        zzb.zza(parcel, 2, converterwrapper.zzmt(), i, false);
        zzb.zzH(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzO(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzaY(i);
    }

    public ConverterWrapper zzO(Parcel parcel)
    {
        int j = com.google.android.gms.common.internal.safeparcel.zza.zzL(parcel);
        int i = 0;
        StringToIntConverter stringtointconverter = null;
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
                    stringtointconverter = (StringToIntConverter)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, k, StringToIntConverter.CREATOR);
                    break;
                }
            } else
            if(parcel.dataPosition() != j)
                throw new com.google.android.gms.common.internal.safeparcel.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            else
                return new ConverterWrapper(i, stringtointconverter);
        while(true);
    }

    public ConverterWrapper[] zzaY(int i)
    {
        return new ConverterWrapper[i];
    }
}
