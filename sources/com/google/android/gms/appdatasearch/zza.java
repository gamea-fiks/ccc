// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.appdatasearch;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.zze;
import com.google.android.gms.internal.zzgt;
import com.google.android.gms.internal.zzgv;

// Referenced classes of package com.google.android.gms.appdatasearch:
//            zzk

public final class zza
{

    public static final com.google.android.gms.common.api.Api.zzc zzIS;
    private static final com.google.android.gms.common.api.Api.zzb zzIT;
    public static final Api zzIU;
    public static final zzk zzIV = new zzgv();

    static 
    {
        zzIS = new com.google.android.gms.common.api.Api.zzc();
        zzIT = new com.google.android.gms.common.api.Api.zzb() {

            public int getPriority()
            {
                return 0x7fffffff;
            }

            public volatile com.google.android.gms.common.api.Api.zza zza(Context context, Looper looper, zze zze, Object obj, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
            {
                return zza(context, looper, zze, (com.google.android.gms.common.api.Api.ApiOptions.NoOptions)obj, connectioncallbacks, onconnectionfailedlistener);
            }

            public zzgt zza(Context context, Looper looper, zze zze, com.google.android.gms.common.api.Api.ApiOptions.NoOptions nooptions, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
            {
                return new zzgt(context, looper, connectioncallbacks, onconnectionfailedlistener);
            }

        }
;
        zzIU = new Api("AppDataSearch.LIGHTWEIGHT_API", zzIT, zzIS, new Scope[0]);
    }
}
