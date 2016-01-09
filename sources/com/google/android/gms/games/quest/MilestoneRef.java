// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.games.quest;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzc;

// Referenced classes of package com.google.android.gms.games.quest:
//            Milestone, MilestoneEntity

public final class MilestoneRef extends zzc
    implements Milestone
{

    MilestoneRef(DataHolder dataholder, int i)
    {
        super(dataholder, i);
    }

    private long zzsi()
    {
        return getLong("initial_value");
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return MilestoneEntity.zza(this, obj);
    }

    public Milestone freeze()
    {
        return new MilestoneEntity(this);
    }

    public volatile Object freeze()
    {
        return freeze();
    }

    public byte[] getCompletionRewardData()
    {
        return getByteArray("completion_reward_data");
    }

    public long getCurrentProgress()
    {
        switch(getState())
        {
        case 1: // '\001'
        default:
            return 0L;

        case 3: // '\003'
        case 4: // '\004'
            return getTargetProgress();

        case 2: // '\002'
            return getLong("current_value") - zzsi();
        }
    }

    public String getEventId()
    {
        return getString("external_event_id");
    }

    public String getMilestoneId()
    {
        return getString("external_milestone_id");
    }

    public int getState()
    {
        return getInteger("milestone_state");
    }

    public long getTargetProgress()
    {
        return getLong("target_value");
    }

    public int hashCode()
    {
        return MilestoneEntity.zza(this);
    }

    public String toString()
    {
        return MilestoneEntity.zzb(this);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ((MilestoneEntity)freeze()).writeToParcel(parcel, i);
    }
}
