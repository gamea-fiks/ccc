// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.internal;

import android.os.*;

// Referenced classes of package com.google.android.gms.internal:
//            zzdu

public interface zzdv
    extends IInterface
{
    public static abstract class zza extends Binder
        implements zzdv
    {

        public static zzdv zzA(IBinder ibinder)
        {
            if(ibinder == null)
                return null;
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IPlayStorePurchaseListener");
            if(iinterface != null && (iinterface instanceof zzdv))
                return (zzdv)iinterface;
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
                parcel1.writeString("com.google.android.gms.ads.internal.purchase.client.IPlayStorePurchaseListener");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.ads.internal.purchase.client.IPlayStorePurchaseListener");
                boolean flag = isValidPurchase(parcel.readString());
                parcel1.writeNoException();
                if(flag)
                    i = 1;
                else
                    i = 0;
                parcel1.writeInt(i);
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.gms.ads.internal.purchase.client.IPlayStorePurchaseListener");
                zza(zzdu.zza.zzz(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;
            }
        }

        public zza()
        {
            attachInterface(this, "com.google.android.gms.ads.internal.purchase.client.IPlayStorePurchaseListener");
        }
    }

    private static class zza.zza
        implements zzdv
    {

        public IBinder asBinder()
        {
            return zzlW;
        }

        public boolean isValidPurchase(String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag;
            flag = true;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i;
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.purchase.client.IPlayStorePurchaseListener");
            parcel.writeString(s);
            zzlW.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            i = parcel1.readInt();
            if(i == 0)
                flag = false;
            parcel1.recycle();
            parcel.recycle();
            return flag;
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
        }

        public void zza(zzdu zzdu1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.purchase.client.IPlayStorePurchaseListener");
            if(zzdu1 == null)
                break MISSING_BLOCK_LABEL_57;
            zzdu1 = zzdu1.asBinder();
_L1:
            parcel.writeStrongBinder(zzdu1);
            zzlW.transact(2, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzdu1 = null;
              goto _L1
            zzdu1;
            parcel1.recycle();
            parcel.recycle();
            throw zzdu1;
        }

        private IBinder zzlW;

        zza.zza(IBinder ibinder)
        {
            zzlW = ibinder;
        }
    }


    public abstract boolean isValidPurchase(String s)
        throws RemoteException;

    public abstract void zza(zzdu zzdu)
        throws RemoteException;
}
