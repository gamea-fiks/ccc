// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.fitness.data;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.fitness.data:
//            Bucket, Session, DataSet

public class zzc
    implements android.os.Parcelable.Creator
{

    public zzc()
    {
    }

    static void zza(Bucket bucket, Parcel parcel, int i)
    {
        int j = zzb.zzM(parcel);
        zzb.zza(parcel, 1, bucket.zzjm());
        zzb.zzc(parcel, 1000, bucket.getVersionCode());
        zzb.zza(parcel, 2, bucket.zzoD());
        zzb.zza(parcel, 3, bucket.getSession(), i, false);
        zzb.zzc(parcel, 4, bucket.zzoB());
        zzb.zzc(parcel, 5, bucket.getDataSets(), false);
        zzb.zzc(parcel, 6, bucket.getBucketType());
        zzb.zza(parcel, 7, bucket.zzoC());
        zzb.zzH(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzbW(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzdy(i);
    }

    public Bucket zzbW(Parcel parcel)
    {
        long l1 = 0L;
        java.util.ArrayList arraylist = null;
        boolean flag = false;
        int l = com.google.android.gms.common.internal.safeparcel.zza.zzL(parcel);
        int i = 0;
        int j = 0;
        Session session = null;
        long l2 = 0L;
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
                    l2 = com.google.android.gms.common.internal.safeparcel.zza.zzi(parcel, i1);
                    break;

                case 1000: 
                    k = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, i1);
                    break;

                case 2: // '\002'
                    l1 = com.google.android.gms.common.internal.safeparcel.zza.zzi(parcel, i1);
                    break;

                case 3: // '\003'
                    session = (Session)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, i1, Session.CREATOR);
                    break;

                case 4: // '\004'
                    j = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, i1);
                    break;

                case 5: // '\005'
                    arraylist = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, i1, DataSet.CREATOR);
                    break;

                case 6: // '\006'
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, i1);
                    break;

                case 7: // '\007'
                    flag = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, i1);
                    break;
                }
            } else
            if(parcel.dataPosition() != l)
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(l).toString(), parcel);
            else
                return new Bucket(k, l2, l1, session, j, arraylist, i, flag);
        while(true);
    }

    public Bucket[] zzdy(int i)
    {
        return new Bucket[i];
    }
}
