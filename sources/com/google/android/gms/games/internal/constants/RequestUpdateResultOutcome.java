// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.games.internal.constants;


public final class RequestUpdateResultOutcome
{

    private RequestUpdateResultOutcome()
    {
    }

    public static boolean isValid(int i)
    {
        switch(i)
        {
        default:
            return false;

        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            return true;
        }
    }
}
