// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.location;

import android.os.*;

// Referenced classes of package com.google.android.gms.location:
//            LocationAvailability, LocationResult, LocationResultCreator, LocationAvailabilityCreator

public interface zzc
    extends IInterface
{
    public static abstract class zza extends Binder
        implements zzc
    {

        public static zzc zzbd(IBinder ibinder)
        {
            if(ibinder == null)
                return null;
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
            if(iinterface != null && (iinterface instanceof zzc))
                return (zzc)iinterface;
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
            Object obj1 = null;
            Object obj = null;
            switch(i)
            {
            default:
                return super.onTransact(i, parcel, parcel1, j);

            case 1598968902: 
                parcel1.writeString("com.google.android.gms.location.ILocationCallback");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.location.ILocationCallback");
                parcel1 = obj;
                if(parcel.readInt() != 0)
                    parcel1 = LocationResult.CREATOR.createFromParcel(parcel);
                onLocationResult(parcel1);
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.gms.location.ILocationCallback");
                parcel1 = obj1;
                break;
            }
            if(parcel.readInt() != 0)
                parcel1 = LocationAvailability.CREATOR.createFromParcel(parcel);
            onLocationAvailability(parcel1);
            return true;
        }

        public zza()
        {
            attachInterface(this, "com.google.android.gms.location.ILocationCallback");
        }
    }

    private static class zza.zza
        implements zzc
    {

        public IBinder asBinder()
        {
            return zzlW;
        }

        public void onLocationAvailability(LocationAvailability locationavailability)
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.location.ILocationCallback");
            if(locationavailability == null)
                break MISSING_BLOCK_LABEL_44;
            parcel.writeInt(1);
            locationavailability.writeToParcel(parcel, 0);
_L1:
            zzlW.transact(2, parcel, null, 1);
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            locationavailability;
            parcel.recycle();
            throw locationavailability;
        }

        public void onLocationResult(LocationResult locationresult)
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.location.ILocationCallback");
            if(locationresult == null)
                break MISSING_BLOCK_LABEL_44;
            parcel.writeInt(1);
            locationresult.writeToParcel(parcel, 0);
_L1:
            zzlW.transact(1, parcel, null, 1);
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            locationresult;
            parcel.recycle();
            throw locationresult;
        }

        private IBinder zzlW;

        zza.zza(IBinder ibinder)
        {
            zzlW = ibinder;
        }
    }


    public abstract void onLocationAvailability(LocationAvailability locationavailability)
        throws RemoteException;

    public abstract void onLocationResult(LocationResult locationresult)
        throws RemoteException;
}
