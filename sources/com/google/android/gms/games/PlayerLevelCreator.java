// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.games;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.games:
//            PlayerLevel

public class PlayerLevelCreator
    implements android.os.Parcelable.Creator
{

    public PlayerLevelCreator()
    {
    }

    static void zza(PlayerLevel playerlevel, Parcel parcel, int i)
    {
        i = zzb.zzM(parcel);
        zzb.zzc(parcel, 1, playerlevel.getLevelNumber());
        zzb.zzc(parcel, 1000, playerlevel.getVersionCode());
        zzb.zza(parcel, 2, playerlevel.getMinXp());
        zzb.zza(parcel, 3, playerlevel.getMaxXp());
        zzb.zzH(parcel, i);
    }

    public PlayerLevel createFromParcel(Parcel parcel)
    {
        long l1 = 0L;
        int i = 0;
        int k = com.google.android.gms.common.internal.safeparcel.zza.zzL(parcel);
        long l2 = 0L;
        int j = 0;
        do
            if(parcel.dataPosition() < k)
            {
                int l = com.google.android.gms.common.internal.safeparcel.zza.zzK(parcel);
                switch(com.google.android.gms.common.internal.safeparcel.zza.zzaV(l))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.zza.zzb(parcel, l);
                    break;

                case 1: // '\001'
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, l);
                    break;

                case 1000: 
                    j = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, l);
                    break;

                case 2: // '\002'
                    l2 = com.google.android.gms.common.internal.safeparcel.zza.zzi(parcel, l);
                    break;

                case 3: // '\003'
                    l1 = com.google.android.gms.common.internal.safeparcel.zza.zzi(parcel, l);
                    break;
                }
            } else
            if(parcel.dataPosition() != k)
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(k).toString(), parcel);
            else
                return new PlayerLevel(j, i, l2, l1);
        while(true);
    }

    public volatile Object createFromParcel(Parcel parcel)
    {
        return createFromParcel(parcel);
    }

    public PlayerLevel[] newArray(int i)
    {
        return new PlayerLevel[i];
    }

    public volatile Object[] newArray(int i)
    {
        return newArray(i);
    }

    public static final int CONTENT_DESCRIPTION = 0;
}
