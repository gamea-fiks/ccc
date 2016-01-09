// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.internal;

import android.os.*;
import com.google.android.gms.appdatasearch.UsageInfo;
import com.google.android.gms.appdatasearch.zzf;

// Referenced classes of package com.google.android.gms.internal:
//            zzgr

public interface zzgq
    extends IInterface
{
    public static abstract class zza extends Binder
        implements zzgq
    {

        public static zzgq zzH(IBinder ibinder)
        {
            if(ibinder == null)
                return null;
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
            if(iinterface != null && (iinterface instanceof zzgq))
                return (zzgq)iinterface;
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
                parcel1.writeString("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
                zza(com.google.android.gms.internal.zzgr.zza.zzI(parcel.readStrongBinder()), parcel.readString(), (UsageInfo[])parcel.createTypedArray(UsageInfo.CREATOR));
                parcel1.writeNoException();
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
                zza(com.google.android.gms.internal.zzgr.zza.zzI(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 3: // '\003'
                parcel.enforceInterface("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
                zzb(com.google.android.gms.internal.zzgr.zza.zzI(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 4: // '\004'
                parcel.enforceInterface("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
                zzgr zzgr = com.google.android.gms.internal.zzgr.zza.zzI(parcel.readStrongBinder());
                boolean flag;
                if(parcel.readInt() != 0)
                    flag = true;
                else
                    flag = false;
                zza(zzgr, flag);
                parcel1.writeNoException();
                return true;

            case 5: // '\005'
                parcel.enforceInterface("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
                com.google.android.gms.appdatasearch.GetRecentContextCall.Request request;
                if(parcel.readInt() != 0)
                    request = com.google.android.gms.appdatasearch.GetRecentContextCall.Request.CREATOR.zzr(parcel);
                else
                    request = null;
                zza(request, com.google.android.gms.internal.zzgr.zza.zzI(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 6: // '\006'
                parcel.enforceInterface("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
                zza(com.google.android.gms.internal.zzgr.zza.zzI(parcel.readStrongBinder()), parcel.readString(), parcel.readString());
                parcel1.writeNoException();
                return true;
            }
        }
    }

    private static class zza.zza
        implements zzgq
    {

        public IBinder asBinder()
        {
            return zzlW;
        }

        public void zza(com.google.android.gms.appdatasearch.GetRecentContextCall.Request request, zzgr zzgr1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
            if(request == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            request.writeToParcel(parcel, 0);
_L3:
            if(zzgr1 == null)
                break MISSING_BLOCK_LABEL_96;
            request = zzgr1.asBinder();
_L4:
            parcel.writeStrongBinder(request);
            zzlW.transact(5, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            request;
            parcel1.recycle();
            parcel.recycle();
            throw request;
            request = null;
              goto _L4
        }

        public void zza(zzgr zzgr1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
            if(zzgr1 == null)
                break MISSING_BLOCK_LABEL_57;
            zzgr1 = zzgr1.asBinder();
_L1:
            parcel.writeStrongBinder(zzgr1);
            zzlW.transact(2, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzgr1 = null;
              goto _L1
            zzgr1;
            parcel1.recycle();
            parcel.recycle();
            throw zzgr1;
        }

        public void zza(zzgr zzgr1, String s, String s1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
            if(zzgr1 == null)
                break MISSING_BLOCK_LABEL_79;
            zzgr1 = zzgr1.asBinder();
_L1:
            parcel.writeStrongBinder(zzgr1);
            parcel.writeString(s);
            parcel.writeString(s1);
            zzlW.transact(6, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzgr1 = null;
              goto _L1
            zzgr1;
            parcel1.recycle();
            parcel.recycle();
            throw zzgr1;
        }

        public void zza(zzgr zzgr1, String s, UsageInfo ausageinfo[])
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
            if(zzgr1 == null)
                break MISSING_BLOCK_LABEL_79;
            zzgr1 = zzgr1.asBinder();
_L1:
            parcel.writeStrongBinder(zzgr1);
            parcel.writeString(s);
            parcel.writeTypedArray(ausageinfo, 0);
            zzlW.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzgr1 = null;
              goto _L1
            zzgr1;
            parcel1.recycle();
            parcel.recycle();
            throw zzgr1;
        }

        public void zza(zzgr zzgr1, boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int i;
            i = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
            if(zzgr1 == null)
                break MISSING_BLOCK_LABEL_77;
            zzgr1 = zzgr1.asBinder();
_L1:
            parcel.writeStrongBinder(zzgr1);
            if(flag)
                i = 1;
            parcel.writeInt(i);
            zzlW.transact(4, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzgr1 = null;
              goto _L1
            zzgr1;
            parcel1.recycle();
            parcel.recycle();
            throw zzgr1;
        }

        public void zzb(zzgr zzgr1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
            if(zzgr1 == null)
                break MISSING_BLOCK_LABEL_57;
            zzgr1 = zzgr1.asBinder();
_L1:
            parcel.writeStrongBinder(zzgr1);
            zzlW.transact(3, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzgr1 = null;
              goto _L1
            zzgr1;
            parcel1.recycle();
            parcel.recycle();
            throw zzgr1;
        }

        private IBinder zzlW;

        zza.zza(IBinder ibinder)
        {
            zzlW = ibinder;
        }
    }


    public abstract void zza(com.google.android.gms.appdatasearch.GetRecentContextCall.Request request, zzgr zzgr)
        throws RemoteException;

    public abstract void zza(zzgr zzgr)
        throws RemoteException;

    public abstract void zza(zzgr zzgr, String s, String s1)
        throws RemoteException;

    public abstract void zza(zzgr zzgr, String s, UsageInfo ausageinfo[])
        throws RemoteException;

    public abstract void zza(zzgr zzgr, boolean flag)
        throws RemoteException;

    public abstract void zzb(zzgr zzgr)
        throws RemoteException;
}
