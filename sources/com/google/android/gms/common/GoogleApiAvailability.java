// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.common;

import android.app.*;
import android.content.Context;

// Referenced classes of package com.google.android.gms.common:
//            GooglePlayServicesUtil, GooglePlayServicesRepairableException, GooglePlayServicesNotAvailableException

public class GoogleApiAvailability
{

    GoogleApiAvailability()
    {
    }

    public static GoogleApiAvailability getInstance()
    {
        return zzOL;
    }

    public Dialog getErrorDialog(Activity activity, int i, int j)
    {
        return GooglePlayServicesUtil.getErrorDialog(i, activity, j);
    }

    public Dialog getErrorDialog(Activity activity, int i, int j, android.content.DialogInterface.OnCancelListener oncancellistener)
    {
        return GooglePlayServicesUtil.getErrorDialog(i, activity, j, oncancellistener);
    }

    public PendingIntent getErrorResolutionPendingIntent(Context context, int i, int j)
    {
        return GooglePlayServicesUtil.getErrorPendingIntent(i, context, j);
    }

    public final String getErrorString(int i)
    {
        return GooglePlayServicesUtil.getErrorString(i);
    }

    public String getOpenSourceSoftwareLicenseInfo(Context context)
    {
        return GooglePlayServicesUtil.getOpenSourceSoftwareLicenseInfo(context);
    }

    public int isGooglePlayServicesAvailable(Context context)
    {
        int j = GooglePlayServicesUtil.isGooglePlayServicesAvailable(context);
        int i = j;
        if(GooglePlayServicesUtil.zze(context, j))
            i = 18;
        return i;
    }

    public final boolean isUserResolvableError(int i)
    {
        return GooglePlayServicesUtil.isUserRecoverableError(i);
    }

    public boolean showErrorDialogFragment(Activity activity, int i, int j)
    {
        return GooglePlayServicesUtil.showErrorDialogFragment(i, activity, j);
    }

    public boolean showErrorDialogFragment(Activity activity, int i, int j, android.content.DialogInterface.OnCancelListener oncancellistener)
    {
        return GooglePlayServicesUtil.showErrorDialogFragment(i, activity, j, oncancellistener);
    }

    public void showErrorNotification(Context context, int i)
    {
        GooglePlayServicesUtil.showErrorNotification(i, context);
    }

    public void zzN(Context context)
        throws GooglePlayServicesRepairableException, GooglePlayServicesNotAvailableException
    {
        GooglePlayServicesUtil.zzM(context);
    }

    public static final String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = 0x6fcd18;
    private static final GoogleApiAvailability zzOL = new GoogleApiAvailability();

}
