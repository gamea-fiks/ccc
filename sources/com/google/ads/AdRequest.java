// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.ads;


public final class AdRequest
{
    public static final class ErrorCode extends Enum
    {

        public static ErrorCode valueOf(String s)
        {
            return (ErrorCode)Enum.valueOf(com/google/ads/AdRequest$ErrorCode, s);
        }

        public static ErrorCode[] values()
        {
            return (ErrorCode[])zza.clone();
        }

        public String toString()
        {
            return description;
        }

        public static final ErrorCode INTERNAL_ERROR;
        public static final ErrorCode INVALID_REQUEST;
        public static final ErrorCode NETWORK_ERROR;
        public static final ErrorCode NO_FILL;
        private static final ErrorCode zza[];
        private final String description;

        static 
        {
            INVALID_REQUEST = new ErrorCode("INVALID_REQUEST", 0, "Invalid Ad request.");
            NO_FILL = new ErrorCode("NO_FILL", 1, "Ad request successful, but no ad returned due to lack of ad inventory.");
            NETWORK_ERROR = new ErrorCode("NETWORK_ERROR", 2, "A network error occurred.");
            INTERNAL_ERROR = new ErrorCode("INTERNAL_ERROR", 3, "There was an internal error.");
            zza = (new ErrorCode[] {
                INVALID_REQUEST, NO_FILL, NETWORK_ERROR, INTERNAL_ERROR
            });
        }

        private ErrorCode(String s, int i, String s1)
        {
            super(s, i);
            description = s1;
        }
    }

    public static final class Gender extends Enum
    {

        public static Gender valueOf(String s)
        {
            return (Gender)Enum.valueOf(com/google/ads/AdRequest$Gender, s);
        }

        public static Gender[] values()
        {
            return (Gender[])zzb.clone();
        }

        public static final Gender FEMALE;
        public static final Gender MALE;
        public static final Gender UNKNOWN;
        private static final Gender zzb[];

        static 
        {
            UNKNOWN = new Gender("UNKNOWN", 0);
            MALE = new Gender("MALE", 1);
            FEMALE = new Gender("FEMALE", 2);
            zzb = (new Gender[] {
                UNKNOWN, MALE, FEMALE
            });
        }

        private Gender(String s, int i)
        {
            super(s, i);
        }
    }


    private AdRequest()
    {
    }

    public static final String LOGTAG = "Ads";
    public static final String TEST_EMULATOR;
    public static final String VERSION = "0.0.0";

    static 
    {
        TEST_EMULATOR = com.google.android.gms.ads.AdRequest.DEVICE_ID_EMULATOR;
    }
}
