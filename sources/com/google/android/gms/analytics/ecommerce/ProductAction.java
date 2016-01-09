// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.analytics.ecommerce;

import com.google.android.gms.common.internal.zzv;
import com.google.android.gms.internal.zzki;
import java.util.*;

public class ProductAction
{

    public ProductAction(String s)
    {
        zzFn = new HashMap();
        put("&pa", s);
    }

    public Map build()
    {
        return new HashMap(zzFn);
    }

    void put(String s, String s1)
    {
        zzv.zzb(s, "Name should be non-null");
        zzFn.put(s, s1);
    }

    public ProductAction setCheckoutOptions(String s)
    {
        put("&col", s);
        return this;
    }

    public ProductAction setCheckoutStep(int i)
    {
        put("&cos", Integer.toString(i));
        return this;
    }

    public ProductAction setProductActionList(String s)
    {
        put("&pal", s);
        return this;
    }

    public ProductAction setProductListSource(String s)
    {
        put("&pls", s);
        return this;
    }

    public ProductAction setTransactionAffiliation(String s)
    {
        put("&ta", s);
        return this;
    }

    public ProductAction setTransactionCouponCode(String s)
    {
        put("&tcc", s);
        return this;
    }

    public ProductAction setTransactionId(String s)
    {
        put("&ti", s);
        return this;
    }

    public ProductAction setTransactionRevenue(double d)
    {
        put("&tr", Double.toString(d));
        return this;
    }

    public ProductAction setTransactionShipping(double d)
    {
        put("&ts", Double.toString(d));
        return this;
    }

    public ProductAction setTransactionTax(double d)
    {
        put("&tt", Double.toString(d));
        return this;
    }

    public String toString()
    {
        HashMap hashmap = new HashMap();
        for(Iterator iterator = zzFn.entrySet().iterator(); iterator.hasNext();)
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
            if(((String)entry.getKey()).startsWith("&"))
                hashmap.put(((String)entry.getKey()).substring(1), entry.getValue());
            else
                hashmap.put(entry.getKey(), entry.getValue());
        }

        return zzki.zzC(hashmap);
    }

    public static final String ACTION_ADD = "add";
    public static final String ACTION_CHECKOUT = "checkout";
    public static final String ACTION_CHECKOUT_OPTION = "checkout_option";
    public static final String ACTION_CHECKOUT_OPTIONS = "checkout_options";
    public static final String ACTION_CLICK = "click";
    public static final String ACTION_DETAIL = "detail";
    public static final String ACTION_PURCHASE = "purchase";
    public static final String ACTION_REFUND = "refund";
    public static final String ACTION_REMOVE = "remove";
    Map zzFn;
}
