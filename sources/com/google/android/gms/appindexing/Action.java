// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.appindexing;

import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.common.internal.zzv;

// Referenced classes of package com.google.android.gms.appindexing:
//            Thing

public final class Action extends Thing
{
    public static final class Builder extends Thing.Builder
    {

        public Action build()
        {
            zzv.zzb(zzKa.get("object"), "setObject is required before calling build().");
            zzv.zzb(zzKa.get("type"), "setType is required before calling build().");
            Bundle bundle = (Bundle)zzKa.getParcelable("object");
            zzv.zzb(bundle.get("name"), "Must call setObject() with a valid name. Example: setObject(new Thing.Builder().setName(name).setUrl(url))");
            zzv.zzb(bundle.get("url"), "Must call setObject() with a valid app URI. Example: setObject(new Thing.Builder().setName(name).setUrl(url))");
            return new Action(zzKa);
        }

        public volatile Thing build()
        {
            return build();
        }

        public Builder put(String s, Thing thing)
        {
            return (Builder)super.put(s, thing);
        }

        public Builder put(String s, String s1)
        {
            return (Builder)super.put(s, s1);
        }

        public volatile Thing.Builder put(String s, Thing thing)
        {
            return put(s, thing);
        }

        public volatile Thing.Builder put(String s, String s1)
        {
            return put(s, s1);
        }

        public Builder setActionStatus(String s)
        {
            zzv.zzr(s);
            return (Builder)super.put("actionStatus", s);
        }

        public Builder setName(String s)
        {
            return (Builder)super.put("name", s);
        }

        public volatile Thing.Builder setName(String s)
        {
            return setName(s);
        }

        public Builder setObject(Thing thing)
        {
            zzv.zzr(thing);
            return (Builder)super.put("object", thing);
        }

        public Builder setUrl(Uri uri)
        {
            if(uri != null)
                super.put("url", uri.toString());
            return this;
        }

        public volatile Thing.Builder setUrl(Uri uri)
        {
            return setUrl(uri);
        }

        public Builder(String s)
        {
            zzv.zzr(s);
            super.put("type", s);
        }
    }


    private Action(Bundle bundle)
    {
        super(bundle);
    }


    public static Action newAction(String s, String s1, Uri uri)
    {
        return newAction(s, s1, null, uri);
    }

    public static Action newAction(String s, String s1, Uri uri, Uri uri1)
    {
        Builder builder = new Builder(s);
        s1 = (new Thing.Builder()).setName(s1);
        if(uri == null)
            s = null;
        else
            s = uri.toString();
        return builder.setObject(s1.setId(s).setUrl(uri1).build()).build();
    }

    public static final String STATUS_TYPE_ACTIVE = "http://schema.org/ActiveActionStatus";
    public static final String STATUS_TYPE_COMPLETED = "http://schema.org/CompletedActionStatus";
    public static final String STATUS_TYPE_FAILED = "http://schema.org/FailedActionStatus";
    public static final String TYPE_ACTIVATE = "http://schema.org/ActivateAction";
    public static final String TYPE_ADD = "http://schema.org/AddAction";
    public static final String TYPE_BOOKMARK = "http://schema.org/BookmarkAction";
    public static final String TYPE_COMMUNICATE = "http://schema.org/CommunicateAction";
    public static final String TYPE_FILM = "http://schema.org/FilmAction";
    public static final String TYPE_LIKE = "http://schema.org/LikeAction";
    public static final String TYPE_LISTEN = "http://schema.org/ListenAction";
    public static final String TYPE_PHOTOGRAPH = "http://schema.org/PhotographAction";
    public static final String TYPE_RESERVE = "http://schema.org/ReserveAction";
    public static final String TYPE_SEARCH = "http://schema.org/SearchAction";
    public static final String TYPE_VIEW = "http://schema.org/ViewAction";
    public static final String TYPE_WANT = "http://schema.org/WantAction";
    public static final String TYPE_WATCH = "http://schema.org/WatchAction";
}
