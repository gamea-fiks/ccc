// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.location.places;

import com.google.android.gms.common.api.CommonStatusCodes;

public class PlacesStatusCodes extends CommonStatusCodes
{

    private PlacesStatusCodes()
    {
    }

    public static String getStatusCodeString(int i)
    {
        switch(i)
        {
        default:
            return CommonStatusCodes.getStatusCodeString(i);

        case 9000: 
            return "PLACES_API_QUOTA_FAILED";

        case 9001: 
            return "PLACES_API_USAGE_LIMIT_EXCEEDED";

        case 9002: 
            return "PLACES_API_KEY_INVALID";

        case 9003: 
            return "PLACES_API_ACCESS_NOT_CONFIGURED";

        case 9004: 
            return "PLACES_API_INVALID_ARGUMENT";

        case 9005: 
            return "PLACES_API_RATE_LIMIT_EXCEEDED";

        case 9006: 
            return "PLACES_API_DEVICE_RATE_LIMIT_EXCEEDED";

        case 9007: 
            return "PLACES_API_KEY_EXPIRED";
        }
    }

    public static final int ACCESS_NOT_CONFIGURED = 9003;
    public static final int DEVICE_RATE_LIMIT_EXCEEDED = 9006;
    public static final int INVALID_ARGUMENT = 9004;
    public static final int KEY_EXPIRED = 9007;
    public static final int KEY_INVALID = 9002;
    public static final int RATE_LIMIT_EXCEEDED = 9005;
    public static final int USAGE_LIMIT_EXCEEDED = 9001;
}
