// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.fitness.request;

import com.google.android.gms.fitness.data.BleDevice;

public abstract class BleScanCallback
{

    public BleScanCallback()
    {
    }

    public abstract void onDeviceFound(BleDevice bledevice);

    public abstract void onScanStopped();
}
