// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.tagmanager;

import android.content.*;
import android.os.Bundle;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzct

class zzbl extends BroadcastReceiver
{

    zzbl(zzct zzct1)
    {
        zzaEa = zzct1;
    }

    public static void zzas(Context context)
    {
        Intent intent = new Intent("com.google.analytics.RADIO_POWERED");
        intent.addCategory(context.getPackageName());
        intent.putExtra(zzIs, true);
        context.sendBroadcast(intent);
    }

    public void onReceive(Context context, Intent intent)
    {
        context = intent.getAction();
        if("android.net.conn.CONNECTIVITY_CHANGE".equals(context))
        {
            Bundle bundle = intent.getExtras();
            context = Boolean.FALSE;
            if(bundle != null)
                context = Boolean.valueOf(intent.getExtras().getBoolean("noConnectivity"));
            intent = zzaEa;
            boolean flag;
            if(!context.booleanValue())
                flag = true;
            else
                flag = false;
            intent.zzaj(flag);
        } else
        if("com.google.analytics.RADIO_POWERED".equals(context) && !intent.hasExtra(zzIs))
        {
            zzaEa.zzgA();
            return;
        }
    }

    public void zzar(Context context)
    {
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(this, intentfilter);
        intentfilter = new IntentFilter();
        intentfilter.addAction("com.google.analytics.RADIO_POWERED");
        intentfilter.addCategory(context.getPackageName());
        context.registerReceiver(this, intentfilter);
    }

    static final String zzIs = com/google/android/gms/tagmanager/zzbl.getName();
    private final zzct zzaEa;

}