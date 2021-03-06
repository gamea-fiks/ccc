// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.common.internal;

import android.os.Looper;
import android.text.TextUtils;

public final class zzv
{

    public static void zzP(boolean flag)
    {
        if(!flag)
            throw new IllegalStateException();
        else
            return;
    }

    public static void zzQ(boolean flag)
    {
        if(!flag)
            throw new IllegalArgumentException();
        else
            return;
    }

    public static int zza(int i, Object obj)
    {
        if(i == 0)
            throw new IllegalArgumentException(String.valueOf(obj));
        else
            return i;
    }

    public static void zza(boolean flag, Object obj)
    {
        if(!flag)
            throw new IllegalStateException(String.valueOf(obj));
        else
            return;
    }

    public static transient void zza(boolean flag, String s, Object aobj[])
    {
        if(!flag)
            throw new IllegalStateException(String.format(s, aobj));
        else
            return;
    }

    public static int zzaR(int i)
    {
        if(i == 0)
            throw new IllegalArgumentException("Given Integer is zero");
        else
            return i;
    }

    public static Object zzb(Object obj, Object obj1)
    {
        if(obj == null)
            throw new NullPointerException(String.valueOf(obj1));
        else
            return obj;
    }

    public static void zzb(boolean flag, Object obj)
    {
        if(!flag)
            throw new IllegalArgumentException(String.valueOf(obj));
        else
            return;
    }

    public static transient void zzb(boolean flag, String s, Object aobj[])
    {
        if(!flag)
            throw new IllegalArgumentException(String.format(s, aobj));
        else
            return;
    }

    public static void zzbI(String s)
    {
        if(Looper.myLooper() != Looper.getMainLooper())
            throw new IllegalStateException(s);
        else
            return;
    }

    public static void zzbJ(String s)
    {
        if(Looper.myLooper() == Looper.getMainLooper())
            throw new IllegalStateException(s);
        else
            return;
    }

    public static String zzbS(String s)
    {
        if(TextUtils.isEmpty(s))
            throw new IllegalArgumentException("Given String is empty or null");
        else
            return s;
    }

    public static String zzh(String s, Object obj)
    {
        if(TextUtils.isEmpty(s))
            throw new IllegalArgumentException(String.valueOf(obj));
        else
            return s;
    }

    public static Object zzr(Object obj)
    {
        if(obj == null)
            throw new NullPointerException("null reference");
        else
            return obj;
    }
}
