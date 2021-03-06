// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.common.api;

import com.google.android.gms.common.internal.zzv;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.common.api:
//            Result, BatchResultToken, PendingResult, Status

public final class BatchResult
    implements Result
{

    BatchResult(Status status, PendingResult apendingresult[])
    {
        zzKr = status;
        zzPu = apendingresult;
    }

    public Status getStatus()
    {
        return zzKr;
    }

    public Result take(BatchResultToken batchresulttoken)
    {
        boolean flag;
        if(batchresulttoken.mId < zzPu.length)
            flag = true;
        else
            flag = false;
        zzv.zzb(flag, "The result token does not belong to this batch");
        return zzPu[batchresulttoken.mId].await(0L, TimeUnit.MILLISECONDS);
    }

    private final Status zzKr;
    private final PendingResult zzPu[];
}
