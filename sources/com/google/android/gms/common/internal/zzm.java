// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.common.internal;

import android.content.Intent;
import android.net.Uri;

public class zzm
{

    public static Intent zzbO(String s)
    {
        s = Uri.fromParts("package", s, null);
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(s);
        return intent;
    }

    private static Uri zzbP(String s)
    {
        return Uri.parse("market://details").buildUpon().appendQueryParameter("id", s).build();
    }

    public static Intent zzbQ(String s)
    {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(zzbP(s));
        intent.setPackage("com.android.vending");
        intent.addFlags(0x80000);
        return intent;
    }

    public static Intent zzmk()
    {
        Intent intent = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
        intent.setPackage("com.google.android.wearable.app");
        return intent;
    }

    private static final Uri zzTW;
    private static final Uri zzTX;

    static 
    {
        zzTW = Uri.parse("http://plus.google.com/");
        zzTX = zzTW.buildUpon().appendPath("circles").appendPath("find").build();
    }
}
