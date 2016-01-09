// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.*;
import com.google.android.gms.plus.Account;
import com.google.android.gms.plus.Plus;
import com.google.android.gms.plus.internal.zze;

public final class zzll
    implements Account
{
    private static abstract class zza extends com.google.android.gms.plus.Plus.zza
    {

        public Result createFailedResult(Status status)
        {
            return zzb(status);
        }

        public Status zzb(Status status)
        {
            return status;
        }

        private zza(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }

    }


    public zzll()
    {
    }

    public void clearDefaultAccount(GoogleApiClient googleapiclient)
    {
        googleapiclient = Plus.zzf(googleapiclient, false);
        if(googleapiclient != null)
            googleapiclient.zzvv();
    }

    public String getAccountName(GoogleApiClient googleapiclient)
    {
        return Plus.zzf(googleapiclient, true).getAccountName();
    }

    public PendingResult revokeAccessAndDisconnect(GoogleApiClient googleapiclient)
    {
        return googleapiclient.zzb(new zza(googleapiclient) {

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((zze)zza1);
            }

            protected void zza(zze zze1)
            {
                zze1.zzk(this);
            }

            final zzll zzazo;

            
            {
                zzazo = zzll.this;
                super(googleapiclient);
            }
        }
);
    }
}
