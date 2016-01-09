// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.maps.model.internal;

import android.os.*;
import com.google.android.gms.maps.model.Tile;
import com.google.android.gms.maps.model.zzm;

public interface zzl
    extends IInterface
{
    public static abstract class zza extends Binder
        implements zzl
    {

        public static zzl zzcd(IBinder ibinder)
        {
            if(ibinder == null)
                return null;
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.maps.model.internal.ITileProviderDelegate");
            if(iinterface != null && (iinterface instanceof zzl))
                return (zzl)iinterface;
            else
                return new zza(ibinder);
        }

        public IBinder asBinder()
        {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
            throws RemoteException
        {
            switch(i)
            {
            default:
                return super.onTransact(i, parcel, parcel1, j);

            case 1598968902: 
                parcel1.writeString("com.google.android.gms.maps.model.internal.ITileProviderDelegate");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ITileProviderDelegate");
                parcel = getTile(parcel.readInt(), parcel.readInt(), parcel.readInt());
                parcel1.writeNoException();
                break;
            }
            if(parcel != null)
            {
                parcel1.writeInt(1);
                parcel.writeToParcel(parcel1, 1);
                return true;
            } else
            {
                parcel1.writeInt(0);
                return true;
            }
        }

        public zza()
        {
            attachInterface(this, "com.google.android.gms.maps.model.internal.ITileProviderDelegate");
        }
    }

    private static class zza.zza
        implements zzl
    {

        public IBinder asBinder()
        {
            return zzlW;
        }

        public Tile getTile(int i, int j, int k)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.ITileProviderDelegate");
            parcel.writeInt(i);
            parcel.writeInt(j);
            parcel.writeInt(k);
            zzlW.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            if(parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
            Tile tile = Tile.CREATOR.zzeq(parcel1);
_L4:
            parcel1.recycle();
            parcel.recycle();
            return tile;
_L2:
            tile = null;
            if(true) goto _L4; else goto _L3
_L3:
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        private IBinder zzlW;

        zza.zza(IBinder ibinder)
        {
            zzlW = ibinder;
        }
    }


    public abstract Tile getTile(int i, int j, int k)
        throws RemoteException;
}
