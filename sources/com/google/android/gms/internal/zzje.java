// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.internal;

import android.os.*;
import com.google.android.gms.fitness.request.*;

public interface zzje
    extends IInterface
{
    public static abstract class zza extends Binder
        implements zzje
    {

        public static zzje zzaK(IBinder ibinder)
        {
            if(ibinder == null)
                return null;
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.fitness.internal.IGoogleFitRecordingApi");
            if(iinterface != null && (iinterface instanceof zzje))
                return (zzje)iinterface;
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
                parcel1.writeString("com.google.android.gms.fitness.internal.IGoogleFitRecordingApi");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitRecordingApi");
                parcel1 = obj;
                if(parcel.readInt() != 0)
                    parcel1 = (SubscribeRequest)SubscribeRequest.CREATOR.createFromParcel(parcel);
                zza(parcel1);
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitRecordingApi");
                parcel1 = obj1;
                if(parcel.readInt() != 0)
                    parcel1 = (UnsubscribeRequest)UnsubscribeRequest.CREATOR.createFromParcel(parcel);
                zza(parcel1);
                return true;

            case 3: // '\003'
                parcel.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitRecordingApi");
                parcel1 = obj2;
                break;
            }
            if(parcel.readInt() != 0)
                parcel1 = (ListSubscriptionsRequest)ListSubscriptionsRequest.CREATOR.createFromParcel(parcel);
            zza(parcel1);
            return true;
        }
    }

    private static class zza.zza
        implements zzje
    {

        public IBinder asBinder()
        {
            return zzlW;
        }

        public void zza(ListSubscriptionsRequest listsubscriptionsrequest)
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitRecordingApi");
            if(listsubscriptionsrequest == null)
                break MISSING_BLOCK_LABEL_44;
            parcel.writeInt(1);
            listsubscriptionsrequest.writeToParcel(parcel, 0);
_L1:
            zzlW.transact(3, parcel, null, 1);
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            listsubscriptionsrequest;
            parcel.recycle();
            throw listsubscriptionsrequest;
        }

        public void zza(SubscribeRequest subscriberequest)
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitRecordingApi");
            if(subscriberequest == null)
                break MISSING_BLOCK_LABEL_44;
            parcel.writeInt(1);
            subscriberequest.writeToParcel(parcel, 0);
_L1:
            zzlW.transact(1, parcel, null, 1);
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            subscriberequest;
            parcel.recycle();
            throw subscriberequest;
        }

        public void zza(UnsubscribeRequest unsubscriberequest)
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitRecordingApi");
            if(unsubscriberequest == null)
                break MISSING_BLOCK_LABEL_44;
            parcel.writeInt(1);
            unsubscriberequest.writeToParcel(parcel, 0);
_L1:
            zzlW.transact(2, parcel, null, 1);
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            unsubscriberequest;
            parcel.recycle();
            throw unsubscriberequest;
        }

        private IBinder zzlW;

        zza.zza(IBinder ibinder)
        {
            zzlW = ibinder;
        }
    }


    public abstract void zza(ListSubscriptionsRequest listsubscriptionsrequest)
        throws RemoteException;

    public abstract void zza(SubscribeRequest subscriberequest)
        throws RemoteException;

    public abstract void zza(UnsubscribeRequest unsubscriberequest)
        throws RemoteException;
}
