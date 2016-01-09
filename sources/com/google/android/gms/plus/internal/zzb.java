// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.plus.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.StatusCreator;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zze;
import com.google.android.gms.common.server.response.SafeParcelResponse;
import com.google.android.gms.plus.internal.model.people.PersonEntity;

public interface zzb
    extends IInterface
{
    public static abstract class zza extends Binder
        implements zzb
    {

        public static zzb zzcv(IBinder ibinder)
        {
            if(ibinder == null)
                return null;
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
            if(iinterface != null && (iinterface instanceof zzb))
                return (zzb)iinterface;
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
            SafeParcelResponse safeparcelresponse = null;
            Object obj1 = null;
            Object obj2 = null;
            Object obj3 = null;
            Object obj = null;
            switch(i)
            {
            default:
                return super.onTransact(i, parcel, parcel1, j);

            case 1598968902: 
                parcel1.writeString("com.google.android.gms.plus.internal.IPlusCallbacks");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
                i = parcel.readInt();
                if(parcel.readInt() != 0)
                    obj = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                else
                    obj = null;
                if(parcel.readInt() != 0)
                    parcel = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                else
                    parcel = null;
                zza(i, ((Bundle) (obj)), parcel);
                parcel1.writeNoException();
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
                i = parcel.readInt();
                if(parcel.readInt() != 0)
                    obj = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                else
                    obj = null;
                if(parcel.readInt() != 0)
                    parcel = (ParcelFileDescriptor)ParcelFileDescriptor.CREATOR.createFromParcel(parcel);
                else
                    parcel = null;
                zza(i, ((Bundle) (obj)), parcel);
                parcel1.writeNoException();
                return true;

            case 3: // '\003'
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
                zzdn(parcel.readString());
                parcel1.writeNoException();
                return true;

            case 4: // '\004'
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
                if(parcel.readInt() != 0)
                    obj = DataHolder.CREATOR.zzC(parcel);
                zza(((DataHolder) (obj)), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 5: // '\005'
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
                i = parcel.readInt();
                if(parcel.readInt() != 0)
                    obj = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                else
                    obj = null;
                if(parcel.readInt() != 0)
                    safeparcelresponse = SafeParcelResponse.CREATOR.zzV(parcel);
                zza(i, ((Bundle) (obj)), safeparcelresponse);
                parcel1.writeNoException();
                return true;

            case 6: // '\006'
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
                obj = obj1;
                if(parcel.readInt() != 0)
                    obj = DataHolder.CREATOR.zzC(parcel);
                zza(((DataHolder) (obj)), parcel.readString(), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 7: // '\007'
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
                i = parcel.readInt();
                if(parcel.readInt() != 0)
                    parcel = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                else
                    parcel = null;
                zzj(i, parcel);
                parcel1.writeNoException();
                return true;

            case 8: // '\b'
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
                zzdo(parcel.readString());
                parcel1.writeNoException();
                return true;

            case 9: // '\t'
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
                i = parcel.readInt();
                obj = obj2;
                if(parcel.readInt() != 0)
                    obj = PersonEntity.CREATOR.zzeU(parcel);
                zza(i, ((PersonEntity) (obj)));
                parcel1.writeNoException();
                return true;

            case 10: // '\n'
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
                obj = obj3;
                break;
            }
            if(parcel.readInt() != 0)
                obj = Status.CREATOR.createFromParcel(parcel);
            zzaI(((Status) (obj)));
            parcel1.writeNoException();
            return true;
        }

        public zza()
        {
            attachInterface(this, "com.google.android.gms.plus.internal.IPlusCallbacks");
        }
    }

    private static class zza.zza
        implements zzb
    {

        public IBinder asBinder()
        {
            return zzlW;
        }

        public void zza(int i, Bundle bundle, Bundle bundle1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusCallbacks");
            parcel.writeInt(i);
            if(bundle == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L3:
            if(bundle1 == null)
                break MISSING_BLOCK_LABEL_111;
            parcel.writeInt(1);
            bundle1.writeToParcel(parcel, 0);
_L4:
            zzlW.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            bundle;
            parcel1.recycle();
            parcel.recycle();
            throw bundle;
            parcel.writeInt(0);
              goto _L4
        }

        public void zza(int i, Bundle bundle, ParcelFileDescriptor parcelfiledescriptor)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusCallbacks");
            parcel.writeInt(i);
            if(bundle == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L3:
            if(parcelfiledescriptor == null)
                break MISSING_BLOCK_LABEL_111;
            parcel.writeInt(1);
            parcelfiledescriptor.writeToParcel(parcel, 0);
_L4:
            zzlW.transact(2, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            bundle;
            parcel1.recycle();
            parcel.recycle();
            throw bundle;
            parcel.writeInt(0);
              goto _L4
        }

        public void zza(int i, Bundle bundle, SafeParcelResponse safeparcelresponse)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusCallbacks");
            parcel.writeInt(i);
            if(bundle == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L3:
            if(safeparcelresponse == null)
                break MISSING_BLOCK_LABEL_111;
            parcel.writeInt(1);
            safeparcelresponse.writeToParcel(parcel, 0);
_L4:
            zzlW.transact(5, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            bundle;
            parcel1.recycle();
            parcel.recycle();
            throw bundle;
            parcel.writeInt(0);
              goto _L4
        }

        public void zza(int i, PersonEntity personentity)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusCallbacks");
            parcel.writeInt(i);
            if(personentity == null)
                break MISSING_BLOCK_LABEL_66;
            parcel.writeInt(1);
            personentity.writeToParcel(parcel, 0);
_L1:
            zzlW.transact(9, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            personentity;
            parcel1.recycle();
            parcel.recycle();
            throw personentity;
        }

        public void zza(DataHolder dataholder, String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusCallbacks");
            if(dataholder == null)
                break MISSING_BLOCK_LABEL_65;
            parcel.writeInt(1);
            dataholder.writeToParcel(parcel, 0);
_L1:
            parcel.writeString(s);
            zzlW.transact(4, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            dataholder;
            parcel1.recycle();
            parcel.recycle();
            throw dataholder;
        }

        public void zza(DataHolder dataholder, String s, String s1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusCallbacks");
            if(dataholder == null)
                break MISSING_BLOCK_LABEL_79;
            parcel.writeInt(1);
            dataholder.writeToParcel(parcel, 0);
_L1:
            parcel.writeString(s);
            parcel.writeString(s1);
            zzlW.transact(6, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            dataholder;
            parcel1.recycle();
            parcel.recycle();
            throw dataholder;
        }

        public void zzaI(Status status)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusCallbacks");
            if(status == null)
                break MISSING_BLOCK_LABEL_57;
            parcel.writeInt(1);
            status.writeToParcel(parcel, 0);
_L1:
            zzlW.transact(10, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            status;
            parcel1.recycle();
            parcel.recycle();
            throw status;
        }

        public void zzdn(String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusCallbacks");
            parcel.writeString(s);
            zzlW.transact(3, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
        }

        public void zzdo(String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusCallbacks");
            parcel.writeString(s);
            zzlW.transact(8, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
        }

        public void zzj(int i, Bundle bundle)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusCallbacks");
            parcel.writeInt(i);
            if(bundle == null)
                break MISSING_BLOCK_LABEL_66;
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L1:
            zzlW.transact(7, parcel, parcel1, 0);
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


    public abstract void zza(int i, Bundle bundle, Bundle bundle1)
        throws RemoteException;

    public abstract void zza(int i, Bundle bundle, ParcelFileDescriptor parcelfiledescriptor)
        throws RemoteException;

    public abstract void zza(int i, Bundle bundle, SafeParcelResponse safeparcelresponse)
        throws RemoteException;

    public abstract void zza(int i, PersonEntity personentity)
        throws RemoteException;

    public abstract void zza(DataHolder dataholder, String s)
        throws RemoteException;

    public abstract void zza(DataHolder dataholder, String s, String s1)
        throws RemoteException;

    public abstract void zzaI(Status status)
        throws RemoteException;

    public abstract void zzdn(String s)
        throws RemoteException;

    public abstract void zzdo(String s)
        throws RemoteException;

    public abstract void zzj(int i, Bundle bundle)
        throws RemoteException;
}
