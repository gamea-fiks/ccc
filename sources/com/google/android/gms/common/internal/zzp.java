// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.common.internal;

import android.os.*;

public interface zzp
    extends IInterface
{
    public static abstract class zza extends Binder
        implements zzp
    {

        public static zzp zzS(IBinder ibinder)
        {
            if(ibinder == null)
                return null;
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsCallbacks");
            if(iinterface != null && (iinterface instanceof zzp))
                return (zzp)iinterface;
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
            IBinder ibinder = null;
            Object obj = null;
            switch(i)
            {
            default:
                return super.onTransact(i, parcel, parcel1, j);

            case 1598968902: 
                parcel1.writeString("com.google.android.gms.common.internal.IGmsCallbacks");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsCallbacks");
                i = parcel.readInt();
                ibinder = parcel.readStrongBinder();
                if(parcel.readInt() != 0)
                    obj = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                zzb(i, ibinder, ((Bundle) (obj)));
                parcel1.writeNoException();
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsCallbacks");
                i = parcel.readInt();
                obj = ibinder;
                break;
            }
            if(parcel.readInt() != 0)
                obj = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            zzc(i, ((Bundle) (obj)));
            parcel1.writeNoException();
            return true;
        }

        public zza()
        {
            attachInterface(this, "com.google.android.gms.common.internal.IGmsCallbacks");
        }
    }

    private static class zza.zza
        implements zzp
    {

        public IBinder asBinder()
        {
            return zzlW;
        }

        public void zzb(int i, IBinder ibinder, Bundle bundle)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsCallbacks");
            parcel.writeInt(i);
            parcel.writeStrongBinder(ibinder);
            if(bundle == null)
                break MISSING_BLOCK_LABEL_78;
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L1:
            zzlW.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            ibinder;
            parcel1.recycle();
            parcel.recycle();
            throw ibinder;
        }

        public void zzc(int i, Bundle bundle)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsCallbacks");
            parcel.writeInt(i);
            if(bundle == null)
                break MISSING_BLOCK_LABEL_65;
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L1:
            zzlW.transact(2, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            bundle;
            parcel1.recycle();
            parcel.recycle();
            throw bundle;
        }

        private IBinder zzlW;

        zza.zza(IBinder ibinder)
        {
            zzlW = ibinder;
        }
    }


    public abstract void zzb(int i, IBinder ibinder, Bundle bundle)
        throws RemoteException;

    public abstract void zzc(int i, Bundle bundle)
        throws RemoteException;
}
