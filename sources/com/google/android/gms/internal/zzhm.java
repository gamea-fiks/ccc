// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.*;
import com.google.android.gms.common.internal.zzi;

// Referenced classes of package com.google.android.gms.internal:
//            zzho

public class zzhm extends zzi
{

    public zzhm(Context context, Looper looper, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        super(context, looper, 39, connectioncallbacks, onconnectionfailedlistener);
    }

    protected IInterface zzD(IBinder ibinder)
    {
        return zzX(ibinder);
    }

    protected zzho zzX(IBinder ibinder)
    {
        return zzho.zza.zzZ(ibinder);
    }

    public String zzeq()
    {
        return "com.google.android.gms.common.service.START";
    }

    protected String zzer()
    {
        return "com.google.android.gms.common.internal.service.ICommonService";
    }
}
