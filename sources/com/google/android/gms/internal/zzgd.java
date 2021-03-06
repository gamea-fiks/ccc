// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.view.ViewParent;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.Map;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            zzge, zzk

public interface zzgd
{

    public abstract void destroy();

    public abstract Context getContext();

    public abstract android.view.ViewGroup.LayoutParams getLayoutParams();

    public abstract void getLocationOnScreen(int ai[]);

    public abstract int getMeasuredHeight();

    public abstract int getMeasuredWidth();

    public abstract ViewParent getParent();

    public abstract int getRequestedOrientation();

    public abstract WebView getWebView();

    public abstract boolean isDestroyed();

    public abstract void loadData(String s, String s1, String s2);

    public abstract void loadDataWithBaseURL(String s, String s1, String s2, String s3, String s4);

    public abstract void loadUrl(String s);

    public abstract void measure(int i, int j);

    public abstract void setBackgroundColor(int i);

    public abstract void setContext(Context context);

    public abstract void setOnClickListener(android.view.View.OnClickListener onclicklistener);

    public abstract void setOnTouchListener(android.view.View.OnTouchListener ontouchlistener);

    public abstract void setRequestedOrientation(int i);

    public abstract void setWebViewClient(WebViewClient webviewclient);

    public abstract void setWillNotDraw(boolean flag);

    public abstract void stopLoading();

    public abstract boolean willNotDraw();

    public abstract void zzB(boolean flag);

    public abstract void zzC(boolean flag);

    public abstract void zza(Context context, AdSizeParcel adsizeparcel);

    public abstract void zza(AdSizeParcel adsizeparcel);

    public abstract void zza(zzc zzc);

    public abstract void zza(String s, JSONObject jsonobject);

    public abstract AdSizeParcel zzah();

    public abstract void zzao(String s);

    public abstract void zzb(zzc zzc);

    public abstract void zzb(String s, String s1);

    public abstract void zzb(String s, Map map);

    public abstract void zzb(String s, JSONObject jsonobject);

    public abstract void zzdy();

    public abstract void zzfo();

    public abstract Activity zzfp();

    public abstract Context zzfq();

    public abstract zzc zzfr();

    public abstract zzc zzfs();

    public abstract zzge zzft();

    public abstract boolean zzfu();

    public abstract zzk zzfv();

    public abstract VersionInfoParcel zzfw();

    public abstract boolean zzfx();

    public abstract void zzfy();

    public abstract void zzfz();

    public abstract void zzp(int i);
}
