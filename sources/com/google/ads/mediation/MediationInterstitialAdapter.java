// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.ads.mediation;

import android.app.Activity;

// Referenced classes of package com.google.ads.mediation:
//            MediationAdapter, MediationInterstitialListener, MediationServerParameters, MediationAdRequest, 
//            NetworkExtras

public interface MediationInterstitialAdapter
    extends MediationAdapter
{

    public abstract void requestInterstitialAd(MediationInterstitialListener mediationinterstitiallistener, Activity activity, MediationServerParameters mediationserverparameters, MediationAdRequest mediationadrequest, NetworkExtras networkextras);

    public abstract void showInterstitial();
}
