// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.ads.internal.client;

import android.os.*;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.internal.zzcr;

// Referenced classes of package com.google.android.gms.ads.internal.client:
//            AdSizeParcel, zzg

public interface zzo
    extends IInterface
{
    public static abstract class zza extends Binder
        implements zzo
    {

        public static zzo zzh(IBinder ibinder)
        {
            if(ibinder == null)
                return null;
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
            if(iinterface != null && (iinterface instanceof zzo))
                return (zzo)iinterface;
            else
                return new zza(ibinder);
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
            throws RemoteException
        {
            zzd zzd;
            switch(i)
            {
            default:
                return super.onTransact(i, parcel, parcel1, j);

            case 1598968902: 
                parcel1.writeString("com.google.android.gms.ads.internal.client.IAdManagerCreator");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
                zzd = com.google.android.gms.dynamic.zzd.zza.zzat(parcel.readStrongBinder());
                break;
            }
            AdSizeParcel adsizeparcel;
            if(parcel.readInt() != 0)
                adsizeparcel = AdSizeParcel.CREATOR.zzc(parcel);
            else
                adsizeparcel = null;
            parcel = zza(zzd, adsizeparcel, parcel.readString(), com.google.android.gms.internal.zzcr.zza.zzo(parcel.readStrongBinder()), parcel.readInt());
            parcel1.writeNoException();
            parcel1.writeStrongBinder(parcel);
            return true;
        }
    }

    private static class zza.zza
        implements zzo
    {

        public IBinder asBinder()
        {
            return zzlW;
        }

        public IBinder zza(zzd zzd1, AdSizeParcel adsizeparcel, String s, zzcr zzcr1, int i)
            throws RemoteException
        {
            Object obj;
            Parcel parcel;
            Parcel parcel1;
            obj = null;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManagerCreator");
            if(zzd1 == null) goto _L2; else goto _L1
_L1:
            zzd1 = zzd1.asBinder();
_L5:
            parcel.writeStrongBinder(zzd1);
            if(adsizeparcel == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            adsizeparcel.writeToParcel(parcel, 0);
_L6:
            parcel.writeString(s);
            zzd1 = obj;
            if(zzcr1 == null)
                break MISSING_BLOCK_LABEL_76;
            zzd1 = zzcr1.asBinder();
            parcel.writeStrongBinder(zzd1);
            parcel.writeInt(i);
            zzlW.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            zzd1 = parcel1.readStrongBinder();
            parcel1.recycle();
            parcel.recycle();
            return zzd1;
_L2:
            zzd1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            zzd1;
            parcel1.recycle();
            parcel.recycle();
            throw zzd1;
              goto _L5
        }

        private IBinder zzlW;

        zza.zza(IBinder ibinder)
        {
            zzlW = ibinder;
        }
    }


    public abstract IBinder zza(zzd zzd, AdSizeParcel adsizeparcel, String s, zzcr zzcr, int i)
        throws RemoteException;
}
