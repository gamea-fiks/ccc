// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.maps.internal;

import android.os.*;
import com.google.android.gms.maps.model.internal.zzi;

public interface zzn
    extends IInterface
{
    public static abstract class zza extends Binder
        implements zzn
    {

        public static zzn zzbF(IBinder ibinder)
        {
            if(ibinder == null)
                return null;
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnMarkerClickListener");
            if(iinterface != null && (iinterface instanceof zzn))
                return (zzn)iinterface;
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
            boolean flag;
            switch(i)
            {
            default:
                return super.onTransact(i, parcel, parcel1, j);

            case 1598968902: 
                parcel1.writeString("com.google.android.gms.maps.internal.IOnMarkerClickListener");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IOnMarkerClickListener");
                flag = zza(com.google.android.gms.maps.model.internal.zzi.zza.zzbZ(parcel.readStrongBinder()));
                parcel1.writeNoException();
                break;
            }
            if(flag)
                i = 1;
            else
                i = 0;
            parcel1.writeInt(i);
            return true;
        }

        public zza()
        {
            attachInterface(this, "com.google.android.gms.maps.internal.IOnMarkerClickListener");
        }
    }

    private static class zza.zza
        implements zzn
    {

        public IBinder asBinder()
        {
            return zzlW;
        }

        public boolean zza(zzi zzi1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag;
            flag = true;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IOnMarkerClickListener");
            if(zzi1 == null)
                break MISSING_BLOCK_LABEL_73;
            zzi1 = zzi1.asBinder();
_L1:
            int i;
            parcel.writeStrongBinder(zzi1);
            zzlW.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            i = parcel1.readInt();
            if(i == 0)
                flag = false;
            parcel1.recycle();
            parcel.recycle();
            return flag;
            zzi1 = null;
              goto _L1
            zzi1;
            parcel1.recycle();
            parcel.recycle();
            throw zzi1;
        }

        private IBinder zzlW;

        zza.zza(IBinder ibinder)
        {
            zzlW = ibinder;
        }
    }


    public abstract boolean zza(zzi zzi)
        throws RemoteException;
}
