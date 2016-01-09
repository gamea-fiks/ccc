// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.common.internal;

import android.os.*;

public interface ICancelToken
    extends IInterface
{
    public static abstract class zza extends Binder
        implements ICancelToken
    {

        public static ICancelToken zzR(IBinder ibinder)
        {
            if(ibinder == null)
                return null;
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.common.internal.ICancelToken");
            if(iinterface != null && (iinterface instanceof ICancelToken))
                return (ICancelToken)iinterface;
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
                parcel1.writeString("com.google.android.gms.common.internal.ICancelToken");
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.gms.common.internal.ICancelToken");
                cancel();
                parcel1.writeNoException();
                return true;
            }
        }
    }

    private static class zza.zza
        implements ICancelToken
    {

        public IBinder asBinder()
        {
            return zzlW;
        }

        public void cancel()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.internal.ICancelToken");
            zzlW.transact(2, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
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


    public abstract void cancel()
        throws RemoteException;
}
