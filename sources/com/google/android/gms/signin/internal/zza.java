// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.signin.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.signin.internal:
//            AuthAccountResult

public class zza
    implements android.os.Parcelable.Creator
{

    public zza()
    {
    }

    static void zza(AuthAccountResult authaccountresult, Parcel parcel, int i)
    {
        i = zzb.zzM(parcel);
        zzb.zzc(parcel, 1, authaccountresult.zzzH);
        zzb.zzH(parcel, i);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzfg(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzhz(i);
    }

    public AuthAccountResult zzfg(Parcel parcel)
    {
        int j = com.google.android.gms.common.internal.safeparcel.zza.zzL(parcel);
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
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, k);
                    break;
                }
            } else
            if(parcel.dataPosition() != j)
                throw new com.google.android.gms.common.internal.safeparcel.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            else
                return new AuthAccountResult(i);
        while(true);
    }

    public AuthAccountResult[] zzhz(int i)
    {
        return new AuthAccountResult[i];
    }
}
