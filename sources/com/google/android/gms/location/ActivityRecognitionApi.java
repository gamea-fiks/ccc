// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.location;

import android.app.PendingIntent;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;

public interface ActivityRecognitionApi
{

    public abstract PendingResult removeActivityUpdates(GoogleApiClient googleapiclient, PendingIntent pendingintent);

    public abstract PendingResult requestActivityUpdates(GoogleApiClient googleapiclient, long l, PendingIntent pendingintent);
}
