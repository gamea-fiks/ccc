// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.games.multiplayer;

import com.google.android.gms.games.Player;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games.multiplayer:
//            Participant

public final class ParticipantUtils
{

    private ParticipantUtils()
    {
    }

    public static String getParticipantId(ArrayList arraylist, String s)
    {
        int j = arraylist.size();
        for(int i = 0; i < j; i++)
        {
            Participant participant = (Participant)arraylist.get(i);
            Player player = participant.getPlayer();
            if(player != null && player.getPlayerId().equals(s))
                return participant.getParticipantId();
        }

        return null;
    }
}
