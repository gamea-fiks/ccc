// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.wearable;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.zze;
import com.google.android.gms.wearable.internal.zzav;
import com.google.android.gms.wearable.internal.zzax;
import com.google.android.gms.wearable.internal.zzbi;
import com.google.android.gms.wearable.internal.zzbk;
import com.google.android.gms.wearable.internal.zzbm;
import com.google.android.gms.wearable.internal.zzd;
import com.google.android.gms.wearable.internal.zzg;
import com.google.android.gms.wearable.internal.zzi;
import com.google.android.gms.wearable.internal.zzt;
import com.google.android.gms.wearable.internal.zzu;

// Referenced classes of package com.google.android.gms.wearable:
//            CapabilityApi, ChannelApi, DataApi, MessageApi, 
//            NodeApi, zza, zzd, zzg, 
//            zzi

public class Wearable
{
    public static final class WearableOptions
        implements com.google.android.gms.common.api.Api.ApiOptions.Optional
    {

        private WearableOptions(Builder builder)
        {
        }

    }

    public static class WearableOptions.Builder
    {

        public WearableOptions build()
        {
            return new WearableOptions(this);
        }

        public WearableOptions.Builder()
        {
        }
    }


    private Wearable()
    {
    }

    public static final Api API;
    public static final CapabilityApi CapabilityApi = new zzg();
    public static final ChannelApi ChannelApi = new zzi();
    public static final DataApi DataApi = new zzu();
    public static final MessageApi MessageApi = new zzav();
    public static final NodeApi NodeApi = new zzax();
    public static final com.google.android.gms.common.api.Api.zzc zzKh;
    private static final com.google.android.gms.common.api.Api.zzb zzKi;
    public static final zza zzaKK = new zzd();
    public static final com.google.android.gms.wearable.zzd zzaKL = new zzt();
    public static final com.google.android.gms.wearable.zzg zzaKM = new zzbi();
    public static final com.google.android.gms.wearable.zzi zzaKN = new zzbm();

    static 
    {
        zzKh = new com.google.android.gms.common.api.Api.zzc();
        zzKi = new com.google.android.gms.common.api.Api.zzb() {

            public int getPriority()
            {
                return 0x7fffffff;
            }

            public volatile com.google.android.gms.common.api.Api.zza zza(Context context, Looper looper, zze zze, Object obj, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
            {
                return zza(context, looper, zze, (WearableOptions)obj, connectioncallbacks, onconnectionfailedlistener);
            }

            public zzbk zza(Context context, Looper looper, zze zze, WearableOptions wearableoptions, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
            {
                if(wearableoptions == null)
                    new WearableOptions(new WearableOptions.Builder());
                return new zzbk(context, looper, connectioncallbacks, onconnectionfailedlistener, zze);
            }

        }
;
        API = new Api("Wearable.API", zzKi, zzKh, new Scope[0]);
    }
}
