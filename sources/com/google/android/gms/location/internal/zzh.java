// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.location.internal;

import android.os.*;
import com.google.android.gms.location.LocationSettingsResult;
import com.google.android.gms.location.LocationSettingsResultCreator;

public interface zzh
    extends IInterface
{
    public static abstract class zza extends Binder
        implements zzh
    {

        public static zzh zzbi(IBinder ibinder)
        {
            if(ibinder == null)
                return null;
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.location.internal.ISettingsCallbacks");
            if(iinterface != null && (iinterface instanceof zzh))
                return (zzh)iinterface;
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
                parcel1.writeString("com.google.android.gms.location.internal.ISettingsCallbacks");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.location.internal.ISettingsCallbacks");
                break;
            }
            if(parcel.readInt() != 0)
                parcel = LocationSettingsResult.CREATOR.createFromParcel(parcel);
            else
                parcel = null;
            zza(parcel);
            parcel1.writeNoException();
            return true;
        }

        public zza()
        {
            attachInterface(this, "com.google.android.gms.location.internal.ISettingsCallbacks");
        }
    }

    private static class zza.zza
        implements zzh
    {

        public IBinder asBinder()
        {
            return zzlW;
        }

        public void zza(LocationSettingsResult locationsettingsresult)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.location.internal.ISettingsCallbacks");
            if(locationsettingsresult == null)
                break MISSING_BLOCK_LABEL_56;
            parcel.writeInt(1);
            locationsettingsresult.writeToParcel(parcel, 0);
_L1:
            zzlW.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            locationsettingsresult;
            parcel1.recycle();
            parcel.recycle();
            throw locationsettingsresult;
        }

        private IBinder zzlW;

        zza.zza(IBinder ibinder)
        {
            zzlW = ibinder;
        }
    }


    public abstract void zza(LocationSettingsResult locationsettingsresult)
        throws RemoteException;
}
