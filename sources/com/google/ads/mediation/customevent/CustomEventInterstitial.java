// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.ads.mediation.customevent;

import android.app.Activity;
import com.google.ads.mediation.MediationAdRequest;

// Referenced classes of package com.google.ads.mediation.customevent:
//            CustomEvent, CustomEventInterstitialListener

public interface CustomEventInterstitial
    extends CustomEvent
{

    public abstract void requestInterstitialAd(CustomEventInterstitialListener customeventinterstitiallistener, Activity activity, String s, String s1, MediationAdRequest mediationadrequest, Object obj);

    public abstract void showInterstitial();
}
