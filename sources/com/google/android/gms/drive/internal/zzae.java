// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.drive.internal:
//            FileUploadPreferencesImpl

public class zzae
    implements android.os.Parcelable.Creator
{

    public zzae()
    {
    }

    static void zza(FileUploadPreferencesImpl fileuploadpreferencesimpl, Parcel parcel, int i)
    {
        i = zzb.zzM(parcel);
        zzb.zzc(parcel, 1, fileuploadpreferencesimpl.zzzH);
        zzb.zzc(parcel, 2, fileuploadpreferencesimpl.zzYC);
        zzb.zzc(parcel, 3, fileuploadpreferencesimpl.zzYD);
        zzb.zza(parcel, 4, fileuploadpreferencesimpl.zzYE);
        zzb.zzH(parcel, i);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzaB(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzca(i);
    }

    public FileUploadPreferencesImpl zzaB(Parcel parcel)
    {
        boolean flag = false;
        int l = com.google.android.gms.common.internal.safeparcel.zza.zzL(parcel);
        int k = 0;
        int j = 0;
        int i = 0;
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
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, i1);
                    break;

                case 2: // '\002'
                    j = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, i1);
                    break;

                case 3: // '\003'
                    k = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, i1);
                    break;

                case 4: // '\004'
                    flag = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, i1);
                    break;
                }
            } else
            if(parcel.dataPosition() != l)
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(l).toString(), parcel);
            else
                return new FileUploadPreferencesImpl(i, j, k, flag);
        while(true);
    }

    public FileUploadPreferencesImpl[] zzca(int i)
    {
        return new FileUploadPreferencesImpl[i];
    }
}
