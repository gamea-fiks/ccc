// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.ads.internal.client;

import android.os.*;
import com.google.android.gms.dynamic.zzd;

public interface zzs
    extends IInterface
{
    public static abstract class zza extends Binder
        implements zzs
    {

        public static zzs zzk(IBinder ibinder)
        {
            if(ibinder == null)
                return null;
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
            if(iinterface != null && (iinterface instanceof zzs))
                return (zzs)iinterface;
            else
                return new zza(ibinder);
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
            throws RemoteException
        {
            switch(i)
            {
            default:
                return super.onTransact(i, parcel, parcel1, j);

            case 1598968902: 
                parcel1.writeString("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
                parcel = zza(com.google.android.gms.dynamic.zzd.zza.zzat(parcel.readStrongBinder()), parcel.readInt());
                parcel1.writeNoException();
                parcel1.writeStrongBinder(parcel);
                return true;
            }
        }
    }

    private static class zza.zza
        implements zzs
    {

        public IBinder asBinder()
        {
            return zzlW;
        }

        public IBinder zza(zzd zzd1, int i)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
            if(zzd1 == null)
                break MISSING_BLOCK_LABEL_73;
            zzd1 = zzd1.asBinder();
_L1:
            parcel.writeStrongBinder(zzd1);
            parcel.writeInt(i);
            zzlW.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            zzd1 = parcel1.readStrongBinder();
            parcel1.recycle();
            parcel.recycle();
            return zzd1;
            zzd1 = null;
              goto _L1
            zzd1;
            parcel1.recycle();
            parcel.recycle();
            throw zzd1;
        }

        private IBinder zzlW;

        zza.zza(IBinder ibinder)
        {
            zzlW = ibinder;
        }
    }


    public abstract IBinder zza(zzd zzd, int i)
        throws RemoteException;
}