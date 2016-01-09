// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.internal;

import android.os.*;
import com.google.android.gms.fitness.request.*;

public interface zzjf
    extends IInterface
{
    public static abstract class zza extends Binder
        implements zzjf
    {

        public static zzjf zzaL(IBinder ibinder)
        {
            if(ibinder == null)
                return null;
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.fitness.internal.IGoogleFitSensorsApi");
            if(iinterface != null && (iinterface instanceof zzjf))
                return (zzjf)iinterface;
            else
                return new zza(ibinder);
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
            throws RemoteException
        {
            Object obj1 = null;
            Object obj2 = null;
            Object obj = null;
            switch(i)
            {
            default:
                return super.onTransact(i, parcel, parcel1, j);

            case 1598968902: 
                parcel1.writeString("com.google.android.gms.fitness.internal.IGoogleFitSensorsApi");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitSensorsApi");
                parcel1 = obj;
                if(parcel.readInt() != 0)
                    parcel1 = (DataSourcesRequest)DataSourcesRequest.CREATOR.createFromParcel(parcel);
                zza(parcel1);
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitSensorsApi");
                parcel1 = obj1;
                if(parcel.readInt() != 0)
                    parcel1 = (SensorRegistrationRequest)SensorRegistrationRequest.CREATOR.createFromParcel(parcel);
                zza(parcel1);
                return true;

            case 3: // '\003'
                parcel.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitSensorsApi");
                parcel1 = obj2;
                break;
            }
            if(parcel.readInt() != 0)
                parcel1 = (SensorUnregistrationRequest)SensorUnregistrationRequest.CREATOR.createFromParcel(parcel);
            zza(parcel1);
            return true;
        }
    }

    private static class zza.zza
        implements zzjf
    {

        public IBinder asBinder()
        {
            return zzlW;
        }

        public void zza(DataSourcesRequest datasourcesrequest)
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitSensorsApi");
            if(datasourcesrequest == null)
                break MISSING_BLOCK_LABEL_44;
            parcel.writeInt(1);
            datasourcesrequest.writeToParcel(parcel, 0);
_L1:
            zzlW.transact(1, parcel, null, 1);
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            datasourcesrequest;
            parcel.recycle();
            throw datasourcesrequest;
        }

        public void zza(SensorRegistrationRequest sensorregistrationrequest)
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitSensorsApi");
            if(sensorregistrationrequest == null)
                break MISSING_BLOCK_LABEL_44;
            parcel.writeInt(1);
            sensorregistrationrequest.writeToParcel(parcel, 0);
_L1:
            zzlW.transact(2, parcel, null, 1);
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            sensorregistrationrequest;
            parcel.recycle();
            throw sensorregistrationrequest;
        }

        public void zza(SensorUnregistrationRequest sensorunregistrationrequest)
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitSensorsApi");
            if(sensorunregistrationrequest == null)
                break MISSING_BLOCK_LABEL_44;
            parcel.writeInt(1);
            sensorunregistrationrequest.writeToParcel(parcel, 0);
_L1:
            zzlW.transact(3, parcel, null, 1);
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            sensorunregistrationrequest;
            parcel.recycle();
            throw sensorunregistrationrequest;
        }

        private IBinder zzlW;

        zza.zza(IBinder ibinder)
        {
            zzlW = ibinder;
        }
    }


    public abstract void zza(DataSourcesRequest datasourcesrequest)
        throws RemoteException;

    public abstract void zza(SensorRegistrationRequest sensorregistrationrequest)
        throws RemoteException;

    public abstract void zza(SensorUnregistrationRequest sensorunregistrationrequest)
        throws RemoteException;
}