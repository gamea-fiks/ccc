// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.maps.model:
//            MarkerOptions, LatLng

public class zzf
    implements android.os.Parcelable.Creator
{

    public zzf()
    {
    }

    static void zza(MarkerOptions markeroptions, Parcel parcel, int i)
    {
        int j = zzb.zzM(parcel);
        zzb.zzc(parcel, 1, markeroptions.getVersionCode());
        zzb.zza(parcel, 2, markeroptions.getPosition(), i, false);
        zzb.zza(parcel, 3, markeroptions.getTitle(), false);
        zzb.zza(parcel, 4, markeroptions.getSnippet(), false);
        zzb.zza(parcel, 5, markeroptions.zztS(), false);
        zzb.zza(parcel, 6, markeroptions.getAnchorU());
        zzb.zza(parcel, 7, markeroptions.getAnchorV());
        zzb.zza(parcel, 8, markeroptions.isDraggable());
        zzb.zza(parcel, 9, markeroptions.isVisible());
        zzb.zza(parcel, 10, markeroptions.isFlat());
        zzb.zza(parcel, 11, markeroptions.getRotation());
        zzb.zza(parcel, 12, markeroptions.getInfoWindowAnchorU());
        zzb.zza(parcel, 13, markeroptions.getInfoWindowAnchorV());
        zzb.zza(parcel, 14, markeroptions.getAlpha());
        zzb.zzH(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzej(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzgo(i);
    }

    public MarkerOptions zzej(Parcel parcel)
    {
        int j = com.google.android.gms.common.internal.safeparcel.zza.zzL(parcel);
        int i = 0;
        LatLng latlng = null;
        String s1 = null;
        String s = null;
        android.os.IBinder ibinder = null;
        float f5 = 0.0F;
        float f4 = 0.0F;
        boolean flag2 = false;
        boolean flag1 = false;
        boolean flag = false;
        float f3 = 0.0F;
        float f2 = 0.5F;
        float f1 = 0.0F;
        float f = 1.0F;
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
                    latlng = (LatLng)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, k, LatLng.CREATOR);
                    break;

                case 3: // '\003'
                    s1 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, k);
                    break;

                case 4: // '\004'
                    s = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, k);
                    break;

                case 5: // '\005'
                    ibinder = com.google.android.gms.common.internal.safeparcel.zza.zzp(parcel, k);
                    break;

                case 6: // '\006'
                    f5 = com.google.android.gms.common.internal.safeparcel.zza.zzl(parcel, k);
                    break;

                case 7: // '\007'
                    f4 = com.google.android.gms.common.internal.safeparcel.zza.zzl(parcel, k);
                    break;

                case 8: // '\b'
                    flag2 = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, k);
                    break;

                case 9: // '\t'
                    flag1 = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, k);
                    break;

                case 10: // '\n'
                    flag = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, k);
                    break;

                case 11: // '\013'
                    f3 = com.google.android.gms.common.internal.safeparcel.zza.zzl(parcel, k);
                    break;

                case 12: // '\f'
                    f2 = com.google.android.gms.common.internal.safeparcel.zza.zzl(parcel, k);
                    break;

                case 13: // '\r'
                    f1 = com.google.android.gms.common.internal.safeparcel.zza.zzl(parcel, k);
                    break;

                case 14: // '\016'
                    f = com.google.android.gms.common.internal.safeparcel.zza.zzl(parcel, k);
                    break;
                }
            } else
            if(parcel.dataPosition() != j)
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            else
                return new MarkerOptions(i, latlng, s1, s, ibinder, f5, f4, flag2, flag1, flag, f3, f2, f1, f);
        while(true);
    }

    public MarkerOptions[] zzgo(int i)
    {
        return new MarkerOptions[i];
    }
}
