// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.games.appcontent;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.games.appcontent:
//            AppContentConditionEntity

public class AppContentConditionEntityCreator
    implements android.os.Parcelable.Creator
{

    public AppContentConditionEntityCreator()
    {
    }

    static void zza(AppContentConditionEntity appcontentconditionentity, Parcel parcel, int i)
    {
        i = zzb.zzM(parcel);
        zzb.zza(parcel, 1, appcontentconditionentity.zzqn(), false);
        zzb.zzc(parcel, 1000, appcontentconditionentity.getVersionCode());
        zzb.zza(parcel, 2, appcontentconditionentity.zzqo(), false);
        zzb.zza(parcel, 3, appcontentconditionentity.zzqp(), false);
        zzb.zza(parcel, 4, appcontentconditionentity.zzqq(), false);
        zzb.zzH(parcel, i);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzdi(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzeO(i);
    }

    public AppContentConditionEntity zzdi(Parcel parcel)
    {
        android.os.Bundle bundle = null;
        int j = com.google.android.gms.common.internal.safeparcel.zza.zzL(parcel);
        int i = 0;
        String s = null;
        String s1 = null;
        String s2 = null;
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
                    s2 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, k);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, k);
                    break;

                case 2: // '\002'
                    s1 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, k);
                    break;

                case 3: // '\003'
                    s = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, k);
                    break;

                case 4: // '\004'
                    bundle = com.google.android.gms.common.internal.safeparcel.zza.zzq(parcel, k);
                    break;
                }
            } else
            if(parcel.dataPosition() != j)
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            else
                return new AppContentConditionEntity(i, s2, s1, s, bundle);
        while(true);
    }

    public AppContentConditionEntity[] zzeO(int i)
    {
        return new AppContentConditionEntity[i];
    }
}
