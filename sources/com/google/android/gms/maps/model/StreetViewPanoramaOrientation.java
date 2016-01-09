// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.common.internal.zzv;

// Referenced classes of package com.google.android.gms.maps.model:
//            zzl

public class StreetViewPanoramaOrientation
    implements SafeParcelable
{
    public static final class Builder
    {

        public Builder bearing(float f)
        {
            bearing = f;
            return this;
        }

        public StreetViewPanoramaOrientation build()
        {
            return new StreetViewPanoramaOrientation(tilt, bearing);
        }

        public Builder tilt(float f)
        {
            tilt = f;
            return this;
        }

        public float bearing;
        public float tilt;

        public Builder()
        {
        }

        public Builder(StreetViewPanoramaOrientation streetviewpanoramaorientation)
        {
            bearing = streetviewpanoramaorientation.bearing;
            tilt = streetviewpanoramaorientation.tilt;
        }
    }


    public StreetViewPanoramaOrientation(float f, float f1)
    {
        this(1, f, f1);
    }

    StreetViewPanoramaOrientation(int i, float f, float f1)
    {
        boolean flag;
        if(-90F <= f && f <= 90F)
            flag = true;
        else
            flag = false;
        zzv.zzb(flag, "Tilt needs to be between -90 and 90 inclusive");
        zzzH = i;
        tilt = 0.0F + f;
        f = f1;
        if((double)f1 <= 0.0D)
            f = f1 % 360F + 360F;
        bearing = f % 360F;
    }

    public static Builder builder()
    {
        return new Builder();
    }

    public static Builder builder(StreetViewPanoramaOrientation streetviewpanoramaorientation)
    {
        return new Builder(streetviewpanoramaorientation);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if(this != obj)
        {
            if(!(obj instanceof StreetViewPanoramaOrientation))
                return false;
            obj = (StreetViewPanoramaOrientation)obj;
            if(Float.floatToIntBits(tilt) != Float.floatToIntBits(((StreetViewPanoramaOrientation) (obj)).tilt) || Float.floatToIntBits(bearing) != Float.floatToIntBits(((StreetViewPanoramaOrientation) (obj)).bearing))
                return false;
        }
        return true;
    }

    int getVersionCode()
    {
        return zzzH;
    }

    public int hashCode()
    {
        return zzu.hashCode(new Object[] {
            Float.valueOf(tilt), Float.valueOf(bearing)
        });
    }

    public String toString()
    {
        return zzu.zzq(this).zzg("tilt", Float.valueOf(tilt)).zzg("bearing", Float.valueOf(bearing)).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzl.zza(this, parcel, i);
    }

    public static final zzl CREATOR = new zzl();
    public final float bearing;
    public final float tilt;
    private final int zzzH;

}
