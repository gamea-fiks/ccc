// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.wearable;

import com.google.android.gms.common.api.*;
import java.util.Map;

// Referenced classes of package com.google.android.gms.wearable:
//            CapabilityInfo

public interface CapabilityApi
{
    public static interface AddLocalCapabilityResult
        extends Result
    {
    }

    public static interface CapabilityListener
    {

        public abstract void onCapabilityChanged(CapabilityInfo capabilityinfo);
    }

    public static interface GetAllCapabilitiesResult
        extends Result
    {

        public abstract Map getAllCapabilities();
    }

    public static interface GetCapabilityResult
        extends Result
    {

        public abstract CapabilityInfo getCapability();
    }

    public static interface RemoveLocalCapabilityResult
        extends Result
    {
    }


    public abstract PendingResult addCapabilityListener(GoogleApiClient googleapiclient, CapabilityListener capabilitylistener, String s);

    public abstract PendingResult addLocalCapability(GoogleApiClient googleapiclient, String s);

    public abstract PendingResult getAllCapabilities(GoogleApiClient googleapiclient, int i);

    public abstract PendingResult getCapability(GoogleApiClient googleapiclient, String s, int i);

    public abstract PendingResult removeCapabilityListener(GoogleApiClient googleapiclient, CapabilityListener capabilitylistener, String s);

    public abstract PendingResult removeLocalCapability(GoogleApiClient googleapiclient, String s);

    public static final int FILTER_ALL = 0;
    public static final int FILTER_REACHABLE = 1;
}
