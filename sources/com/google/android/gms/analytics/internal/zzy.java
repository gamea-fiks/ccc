// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.analytics.internal;


// Referenced classes of package com.google.android.gms.analytics.internal:
//            zzp, zze, zzz, zzae, 
//            zzo

public class zzy extends zzp
{
    private static class zza
        implements zzp.zza
    {

        public void zzc(String s, int i)
        {
            if("ga_dispatchPeriod".equals(s))
            {
                zzHX.zzIb = i;
                return;
            } else
            {
                zzFD.zzgH().zzd("Int xml configuration name not recognized", s);
                return;
            }
        }

        public void zzc(String s, boolean flag)
        {
            if("ga_dryRun".equals(s))
            {
                s = zzHX;
                int i;
                if(flag)
                    i = 1;
                else
                    i = 0;
                s.zzIc = i;
                return;
            } else
            {
                zzFD.zzgH().zzd("Bool xml configuration name not recognized", s);
                return;
            }
        }

        public zzo zzhO()
        {
            return zziC();
        }

        public zzz zziC()
        {
            return zzHX;
        }

        public void zzj(String s, String s1)
        {
        }

        public void zzk(String s, String s1)
        {
            if("ga_appName".equals(s))
            {
                zzHX.zzHY = s1;
                return;
            }
            if("ga_appVersion".equals(s))
            {
                zzHX.zzHZ = s1;
                return;
            }
            if("ga_logLevel".equals(s))
            {
                zzHX.zzIa = s1;
                return;
            } else
            {
                zzFD.zzgH().zzd("String xml configuration name not recognized", s);
                return;
            }
        }

        private final zze zzFD;
        private final zzz zzHX = new zzz();

        public zza(zze zze1)
        {
            zzFD = zze1;
        }
    }


    public zzy(zze zze)
    {
        super(zze, new zza(zze));
    }
}
