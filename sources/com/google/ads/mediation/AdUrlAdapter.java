// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.ads.mediation;

import android.os.Bundle;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;

// Referenced classes of package com.google.ads.mediation:
//            AbstractAdViewAdapter

public final class AdUrlAdapter extends AbstractAdViewAdapter
    implements MediationBannerAdapter, MediationInterstitialAdapter
{

    public AdUrlAdapter()
    {
    }

    protected Bundle zza(Bundle bundle, Bundle bundle1)
    {
        if(bundle == null)
            bundle = new Bundle();
        bundle.putBundle("sdk_less_server_data", bundle1);
        bundle.putBoolean("_noRefresh", true);
        return bundle;
    }
}
