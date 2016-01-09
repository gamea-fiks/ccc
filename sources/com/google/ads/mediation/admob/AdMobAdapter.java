// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.ads.mediation.admob;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.ads.mediation.AbstractAdViewAdapter;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;

public final class AdMobAdapter extends AbstractAdViewAdapter
    implements MediationBannerAdapter, MediationInterstitialAdapter
{

    public AdMobAdapter()
    {
    }

    protected Bundle zza(Bundle bundle, Bundle bundle1)
    {
        if(bundle == null)
            bundle = new Bundle();
        bundle.putInt("gw", 1);
        bundle.putString("mad_hac", bundle1.getString("mad_hac"));
        if(!TextUtils.isEmpty(bundle1.getString("adJson")))
            bundle.putString("_ad", bundle1.getString("adJson"));
        bundle.putBoolean("_noRefresh", true);
        return bundle;
    }
}
