// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.internal;

import android.os.Process;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzh;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.google.android.gms.internal:
//            zzfs, zzfv, zzfc

public final class zzfk
{

    public static zzfv zza(int i, Runnable runnable)
    {
        if(i == 1)
            return zza(zzCm, new Callable(runnable) {

                public Object call()
                    throws Exception
                {
                    return zzeY();
                }

                public Void zzeY()
                {
                    zzCn.run();
                    return null;
                }

                final Runnable zzCn;

            
            {
                zzCn = runnable;
                super();
            }
            }
);
        else
            return zza(zzCl, new Callable(runnable) {

                public Object call()
                    throws Exception
                {
                    return zzeY();
                }

                public Void zzeY()
                {
                    zzCn.run();
                    return null;
                }

                final Runnable zzCn;

            
            {
                zzCn = runnable;
                super();
            }
            }
);
    }

    public static zzfv zza(Runnable runnable)
    {
        return zza(0, runnable);
    }

    public static zzfv zza(Callable callable)
    {
        return zza(zzCl, callable);
    }

    public static zzfv zza(ExecutorService executorservice, Callable callable)
    {
        zzfs zzfs1 = new zzfs();
        try
        {
            executorservice.submit(new Runnable(zzfs1, callable) {

                public void run()
                {
                    try
                    {
                        Process.setThreadPriority(10);
                        zzoJ.zzc(zzCo.call());
                        return;
                    }
                    catch(Exception exception)
                    {
                        zzh.zzaT().zzc(exception, true);
                    }
                    zzoJ.cancel(true);
                }

                final Callable zzCo;
                final zzfs zzoJ;

            
            {
                zzoJ = zzfs1;
                zzCo = callable;
                super();
            }
            }
);
        }
        // Misplaced declaration of an exception variable
        catch(ExecutorService executorservice)
        {
            zzb.zzd("Thread execution is rejected.", executorservice);
            zzfs1.cancel(true);
            return zzfs1;
        }
        return zzfs1;
    }

    private static ThreadFactory zzac(String s)
    {
        return new ThreadFactory(s) {

            public Thread newThread(Runnable runnable)
            {
                return new Thread(runnable, (new StringBuilder()).append("AdWorker(").append(zzCq).append(") #").append(zzCp.getAndIncrement()).toString());
            }

            private final AtomicInteger zzCp = new AtomicInteger(1);
            final String zzCq;

            
            {
                zzCq = s;
                super();
            }
        }
;
    }

    private static final ExecutorService zzCl = Executors.newFixedThreadPool(10, zzac("Default"));
    private static final ExecutorService zzCm = Executors.newFixedThreadPool(5, zzac("Loader"));

}
