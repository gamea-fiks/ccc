// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.ads.mediation;


// Referenced classes of package com.google.ads.mediation:
//            MediationBannerAdapter

public interface MediationBannerListener
{

    public abstract void onClick(MediationBannerAdapter mediationbanneradapter);

    public abstract void onDismissScreen(MediationBannerAdapter mediationbanneradapter);

    public abstract void onFailedToReceiveAd(MediationBannerAdapter mediationbanneradapter, com.google.ads.AdRequest.ErrorCode errorcode);

    public abstract void onLeaveApplication(MediationBannerAdapter mediationbanneradapter);

    public abstract void onPresentScreen(MediationBannerAdapter mediationbanneradapter);

    public abstract void onReceivedAd(MediationBannerAdapter mediationbanneradapter);
}
