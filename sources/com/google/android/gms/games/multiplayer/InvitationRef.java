// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.games.multiplayer;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzc;
import com.google.android.gms.common.internal.zzv;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameRef;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games.multiplayer:
//            Invitation, ParticipantRef, InvitationEntity, Participant

public final class InvitationRef extends zzc
    implements Invitation
{

    InvitationRef(DataHolder dataholder, int i, int j)
    {
        super(dataholder, i);
        zzamO = new GameRef(dataholder, i);
        zzant = new ArrayList(j);
        String s = getString("external_inviter_id");
        i = 0;
        dataholder = null;
        for(; i < j; i++)
        {
            ParticipantRef participantref = new ParticipantRef(zzPy, zzRw + i);
            if(participantref.getParticipantId().equals(s))
                dataholder = participantref;
            zzant.add(participantref);
        }

        zzanw = (ParticipantRef)zzv.zzb(dataholder, "Must have a valid inviter!");
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return InvitationEntity.zza(this, obj);
    }

    public Invitation freeze()
    {
        return new InvitationEntity(this);
    }

    public volatile Object freeze()
    {
        return freeze();
    }

    public int getAvailableAutoMatchSlots()
    {
        if(!getBoolean("has_automatch_criteria"))
            return 0;
        else
            return getInteger("automatch_max_players");
    }

    public long getCreationTimestamp()
    {
        return Math.max(getLong("creation_timestamp"), getLong("last_modified_timestamp"));
    }

    public Game getGame()
    {
        return zzamO;
    }

    public String getInvitationId()
    {
        return getString("external_invitation_id");
    }

    public int getInvitationType()
    {
        return getInteger("type");
    }

    public Participant getInviter()
    {
        return zzanw;
    }

    public ArrayList getParticipants()
    {
        return zzant;
    }

    public int getVariant()
    {
        return getInteger("variant");
    }

    public int hashCode()
    {
        return InvitationEntity.zza(this);
    }

    public String toString()
    {
        return InvitationEntity.zzb(this);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ((InvitationEntity)freeze()).writeToParcel(parcel, i);
    }

    private final Game zzamO;
    private final ArrayList zzant;
    private final ParticipantRef zzanw;
}
