// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.tagmanager;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.CursorWindow;
import android.database.sqlite.*;
import android.text.TextUtils;
import com.google.android.gms.internal.zzht;
import com.google.android.gms.internal.zzhv;
import java.io.File;
import java.util.*;
import org.apache.http.impl.client.DefaultHttpClient;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzau, zzcx, zzbg, zzav, 
//            zzac, zzcu, zzaq, zzal

class zzby
    implements zzau
{
    class zza
        implements zzcx.zza
    {

        public void zza(zzaq zzaq1)
        {
            zzby.zza(zzaEk, zzaq1.zzwU());
        }

        public void zzb(zzaq zzaq1)
        {
            zzby.zza(zzaEk, zzaq1.zzwU());
            zzbg.zzam((new StringBuilder()).append("Permanent failure dispatching hitId: ").append(zzaq1.zzwU()).toString());
        }

        public void zzc(zzaq zzaq1)
        {
            long l = zzaq1.zzwV();
            if(l == 0L)
                zzby.zza(zzaEk, zzaq1.zzwU(), zzby.zza(zzaEk).currentTimeMillis());
            else
            if(l + 0xdbba00L < zzby.zza(zzaEk).currentTimeMillis())
            {
                zzby.zza(zzaEk, zzaq1.zzwU());
                zzbg.zzam((new StringBuilder()).append("Giving up on failed hitId: ").append(zzaq1.zzwU()).toString());
                return;
            }
        }

        final zzby zzaEk;

        zza()
        {
            zzaEk = zzby.this;
            super();
        }
    }

    class zzb extends SQLiteOpenHelper
    {

        private boolean zza(String s, SQLiteDatabase sqlitedatabase)
        {
            Object obj = null;
            sqlitedatabase = sqlitedatabase.query("SQLITE_MASTER", new String[] {
                "name"
            }, "name=?", new String[] {
                s
            }, null, null, null);
            boolean flag = sqlitedatabase.moveToFirst();
            if(sqlitedatabase != null)
                sqlitedatabase.close();
            return flag;
            sqlitedatabase;
            sqlitedatabase = null;
_L4:
            zzbg.zzan((new StringBuilder()).append("Error querying for table ").append(s).toString());
            if(sqlitedatabase != null)
                sqlitedatabase.close();
            return false;
            s;
            sqlitedatabase = obj;
_L2:
            if(sqlitedatabase != null)
                sqlitedatabase.close();
            throw s;
            s;
            continue; /* Loop/switch isn't completed */
            s;
            if(true) goto _L2; else goto _L1
_L1:
            SQLiteException sqliteexception;
            sqliteexception;
            if(true) goto _L4; else goto _L3
_L3:
        }

        private void zzc(SQLiteDatabase sqlitedatabase)
        {
            Object obj;
            sqlitedatabase = sqlitedatabase.rawQuery("SELECT * FROM gtm_hits WHERE 0", null);
            obj = new HashSet();
            String as[] = sqlitedatabase.getColumnNames();
            int i = 0;
_L2:
            if(i >= as.length)
                break; /* Loop/switch isn't completed */
            ((Set) (obj)).add(as[i]);
            i++;
            if(true) goto _L2; else goto _L1
_L1:
            sqlitedatabase.close();
            if(!((Set) (obj)).remove("hit_id") || !((Set) (obj)).remove("hit_url") || !((Set) (obj)).remove("hit_time") || !((Set) (obj)).remove("hit_first_send_time"))
                throw new SQLiteException("Database column missing");
            break MISSING_BLOCK_LABEL_122;
            obj;
            sqlitedatabase.close();
            throw obj;
            if(!((Set) (obj)).isEmpty())
                throw new SQLiteException("Database has extra columns");
            else
                return;
        }

        public SQLiteDatabase getWritableDatabase()
        {
            SQLiteDatabase sqlitedatabase;
            if(zzaEl && zzaEm + 0x36ee80L > zzby.zza(zzaEk).currentTimeMillis())
                throw new SQLiteException("Database creation failed");
            sqlitedatabase = null;
            zzaEl = true;
            zzaEm = zzby.zza(zzaEk).currentTimeMillis();
            SQLiteDatabase sqlitedatabase1 = super.getWritableDatabase();
            sqlitedatabase = sqlitedatabase1;
_L2:
            SQLiteDatabase sqlitedatabase2 = sqlitedatabase;
            if(sqlitedatabase == null)
                sqlitedatabase2 = super.getWritableDatabase();
            zzaEl = false;
            return sqlitedatabase2;
            SQLiteException sqliteexception;
            sqliteexception;
            zzby.zzc(zzaEk).getDatabasePath(zzby.zzb(zzaEk)).delete();
            if(true) goto _L2; else goto _L1
_L1:
        }

        public void onCreate(SQLiteDatabase sqlitedatabase)
        {
            zzal.zzaQ(sqlitedatabase.getPath());
        }

        public void onOpen(SQLiteDatabase sqlitedatabase)
        {
            Cursor cursor;
            if(android.os.Build.VERSION.SDK_INT >= 15)
                break MISSING_BLOCK_LABEL_29;
            cursor = sqlitedatabase.rawQuery("PRAGMA journal_mode=memory", null);
            cursor.moveToFirst();
            cursor.close();
            if(!zza("gtm_hits", sqlitedatabase))
            {
                sqlitedatabase.execSQL(zzby.zzxk());
                return;
            } else
            {
                zzc(sqlitedatabase);
                return;
            }
            sqlitedatabase;
            cursor.close();
            throw sqlitedatabase;
        }

        public void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
        {
        }

        final zzby zzaEk;
        private boolean zzaEl;
        private long zzaEm;

        zzb(Context context, String s)
        {
            zzaEk = zzby.this;
            super(context, s, null, 1);
            zzaEm = 0L;
        }
    }


    zzby(zzav zzav1, Context context)
    {
        this(zzav1, context, "gtm_urls.db", 2000);
    }

    zzby(zzav zzav1, Context context, String s, int i)
    {
        mContext = context.getApplicationContext();
        zzaEh = s;
        zzaEg = zzav1;
        zznR = zzhv.zznd();
        zzaEe = new zzb(mContext, zzaEh);
        zzaEf = new zzcx(new DefaultHttpClient(), mContext, new zza());
        zzaEi = 0L;
        zzaEj = i;
    }

    static zzht zza(zzby zzby1)
    {
        return zzby1.zznR;
    }

    static void zza(zzby zzby1, long l)
    {
        zzby1.zzo(l);
    }

    static void zza(zzby zzby1, long l, long l1)
    {
        zzby1.zzd(l, l1);
    }

    static String zzb(zzby zzby1)
    {
        return zzby1.zzaEh;
    }

    static Context zzc(zzby zzby1)
    {
        return zzby1.mContext;
    }

    private void zzd(long l, long l1)
    {
        SQLiteDatabase sqlitedatabase = zzdJ("Error opening database for getNumStoredHits.");
        if(sqlitedatabase == null)
            return;
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("hit_first_send_time", Long.valueOf(l1));
        try
        {
            sqlitedatabase.update("gtm_hits", contentvalues, "hit_id=?", new String[] {
                String.valueOf(l)
            });
            return;
        }
        catch(SQLiteException sqliteexception)
        {
            zzbg.zzan((new StringBuilder()).append("Error setting HIT_FIRST_DISPATCH_TIME for hitId: ").append(l).toString());
        }
        zzo(l);
    }

    private SQLiteDatabase zzdJ(String s)
    {
        SQLiteDatabase sqlitedatabase;
        try
        {
            sqlitedatabase = zzaEe.getWritableDatabase();
        }
        catch(SQLiteException sqliteexception)
        {
            zzbg.zzan(s);
            return null;
        }
        return sqlitedatabase;
    }

    private void zzh(long l, String s)
    {
        SQLiteDatabase sqlitedatabase = zzdJ("Error opening database for putHit");
        if(sqlitedatabase == null)
            return;
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("hit_time", Long.valueOf(l));
        contentvalues.put("hit_url", s);
        contentvalues.put("hit_first_send_time", Integer.valueOf(0));
        try
        {
            sqlitedatabase.insert("gtm_hits", null, contentvalues);
            zzaEg.zzai(false);
            return;
        }
        // Misplaced declaration of an exception variable
        catch(String s)
        {
            zzbg.zzan("Error storing hit");
        }
    }

    private void zzo(long l)
    {
        zzf(new String[] {
            String.valueOf(l)
        });
    }

    private void zzxh()
    {
        int i = (zzxi() - zzaEj) + 1;
        if(i > 0)
        {
            List list = zzhJ(i);
            zzbg.zzam((new StringBuilder()).append("Store full, deleting ").append(list.size()).append(" hits to make room.").toString());
            zzf((String[])list.toArray(new String[0]));
        }
    }

    static String zzxk()
    {
        return zzGk;
    }

    public void dispatch()
    {
        zzbg.zzam("GTM Dispatch running...");
        if(zzaEf.zzwN())
        {
            List list = zzhK(40);
            if(list.isEmpty())
            {
                zzbg.zzam("...nothing to dispatch");
                zzaEg.zzai(true);
                return;
            }
            zzaEf.zzs(list);
            if(zzxj() > 0)
            {
                zzcu.zzxF().dispatch();
                return;
            }
        }
    }

    void zzf(String as[])
    {
        boolean flag = true;
        if(as != null && as.length != 0) goto _L2; else goto _L1
_L1:
        SQLiteDatabase sqlitedatabase;
        return;
_L2:
        if((sqlitedatabase = zzdJ("Error opening database for deleteHits.")) == null) goto _L1; else goto _L3
_L3:
        String s = String.format("HIT_ID in (%s)", new Object[] {
            TextUtils.join(",", Collections.nCopies(as.length, "?"))
        });
        sqlitedatabase.delete("gtm_hits", s, as);
        as = zzaEg;
        if(zzxi() != 0)
            flag = false;
        as.zzai(flag);
        return;
        as;
        zzbg.zzan("Error deleting hits");
        return;
    }

    public void zzg(long l, String s)
    {
        zzhl();
        zzxh();
        zzh(l, s);
    }

    List zzhJ(int i)
    {
        Object obj;
        ArrayList arraylist;
        arraylist = new ArrayList();
        if(i <= 0)
        {
            zzbg.zzan("Invalid maxHits specified. Skipping");
            return arraylist;
        }
        obj = zzdJ("Error opening database for peekHitIds.");
        if(obj == null)
            return arraylist;
        Object obj1;
        obj1 = String.format("%s ASC", new Object[] {
            "hit_id"
        });
        String s = Integer.toString(i);
        obj1 = ((SQLiteDatabase) (obj)).query("gtm_hits", new String[] {
            "hit_id"
        }, null, null, null, null, ((String) (obj1)), s);
        obj = obj1;
        if(!((Cursor) (obj1)).moveToFirst()) goto _L2; else goto _L1
_L1:
        obj = obj1;
        arraylist.add(String.valueOf(((Cursor) (obj1)).getLong(0)));
        obj = obj1;
        boolean flag = ((Cursor) (obj1)).moveToNext();
        if(flag) goto _L1; else goto _L2
_L2:
        if(obj1 != null)
            ((Cursor) (obj1)).close();
_L3:
        return arraylist;
        SQLiteException sqliteexception;
        sqliteexception;
        obj1 = null;
_L6:
        obj = obj1;
        zzbg.zzan((new StringBuilder()).append("Error in peekHits fetching hitIds: ").append(sqliteexception.getMessage()).toString());
        if(obj1 != null)
            ((Cursor) (obj1)).close();
          goto _L3
        Exception exception;
        exception;
        obj = null;
_L5:
        if(obj != null)
            ((Cursor) (obj)).close();
        throw exception;
        exception;
        if(true) goto _L5; else goto _L4
_L4:
        sqliteexception;
          goto _L6
    }

    public List zzhK(int i)
    {
        Object obj1;
        Object obj4;
        obj1 = new ArrayList();
        obj4 = zzdJ("Error opening database for peekHits");
        if(obj4 != null) goto _L2; else goto _L1
_L1:
        Object obj2 = obj1;
_L8:
        return ((List) (obj2));
_L2:
        Object obj = null;
        obj2 = String.format("%s ASC", new Object[] {
            "hit_id"
        });
        String s = Integer.toString(i);
        obj2 = ((SQLiteDatabase) (obj4)).query("gtm_hits", new String[] {
            "hit_id", "hit_time", "hit_first_send_time"
        }, null, null, null, null, ((String) (obj2)), s);
        obj = obj2;
        Object obj3 = new ArrayList();
        boolean flag;
        if(((Cursor) (obj)).moveToFirst())
            do
            {
                ((List) (obj3)).add(new zzaq(((Cursor) (obj)).getLong(0), ((Cursor) (obj)).getLong(1), ((Cursor) (obj)).getLong(2)));
                flag = ((Cursor) (obj)).moveToNext();
            } while(flag);
        if(obj != null)
            ((Cursor) (obj)).close();
        obj1 = obj;
        obj2 = String.format("%s ASC", new Object[] {
            "hit_id"
        });
        obj1 = obj;
        String s1 = Integer.toString(i);
        obj1 = obj;
        obj2 = ((SQLiteDatabase) (obj4)).query("gtm_hits", new String[] {
            "hit_id", "hit_url"
        }, null, null, null, null, ((String) (obj2)), s1);
        if(!((Cursor) (obj2)).moveToFirst()) goto _L4; else goto _L3
_L3:
        i = 0;
_L18:
        if(((SQLiteCursor)obj2).getWindow().getNumRows() <= 0) goto _L6; else goto _L5
_L5:
        ((zzaq)((List) (obj3)).get(i)).zzdN(((Cursor) (obj2)).getString(1));
_L9:
        boolean flag1 = ((Cursor) (obj2)).moveToNext();
        if(flag1)
            break MISSING_BLOCK_LABEL_619;
_L4:
        if(obj2 != null)
            ((Cursor) (obj2)).close();
        return ((List) (obj3));
        obj2;
        obj3 = null;
        obj = obj1;
        obj1 = obj3;
_L17:
        zzbg.zzan((new StringBuilder()).append("Error in peekHits fetching hitIds: ").append(((SQLiteException) (obj2)).getMessage()).toString());
        obj2 = obj;
        if(obj1 == null) goto _L8; else goto _L7
_L7:
        ((Cursor) (obj1)).close();
        return ((List) (obj));
        obj2;
        obj1 = obj;
        obj = obj2;
_L16:
        if(obj1 != null)
            ((Cursor) (obj1)).close();
        throw obj;
_L6:
        zzbg.zzan(String.format("HitString for hitId %d too large.  Hit will be deleted.", new Object[] {
            Long.valueOf(((zzaq)((List) (obj3)).get(i)).zzwU())
        }));
          goto _L9
        obj1;
        obj = obj2;
        obj2 = obj1;
_L15:
        obj1 = obj;
        zzbg.zzan((new StringBuilder()).append("Error in peekHits fetching hit url: ").append(((SQLiteException) (obj2)).getMessage()).toString());
        obj1 = obj;
        obj2 = new ArrayList();
        i = 0;
        obj1 = obj;
        obj3 = ((List) (obj3)).iterator();
_L11:
        obj1 = obj;
        if(!((Iterator) (obj3)).hasNext())
            break MISSING_BLOCK_LABEL_523;
        obj1 = obj;
        obj4 = (zzaq)((Iterator) (obj3)).next();
        obj1 = obj;
        flag1 = TextUtils.isEmpty(((zzaq) (obj4)).zzwW());
        int j;
        j = i;
        if(!flag1)
            break MISSING_BLOCK_LABEL_539;
        if(i == 0)
            break MISSING_BLOCK_LABEL_536;
        if(obj != null)
            ((Cursor) (obj)).close();
        return ((List) (obj2));
        j = 1;
        obj1 = obj;
        ((List) (obj2)).add(obj4);
        i = j;
        if(true) goto _L11; else goto _L10
_L10:
        obj;
_L13:
        if(obj1 != null)
            ((Cursor) (obj1)).close();
        throw obj;
        obj;
        obj1 = obj2;
        if(true) goto _L13; else goto _L12
_L12:
        obj2;
        if(true) goto _L15; else goto _L14
_L14:
        obj2;
        obj1 = obj;
        obj = obj2;
          goto _L16
        obj;
          goto _L16
        obj2;
        obj3 = obj;
        obj = obj1;
        obj1 = obj3;
          goto _L17
        obj2;
        obj1 = obj;
        obj = obj3;
          goto _L17
        i++;
          goto _L18
    }

    int zzhl()
    {
        boolean flag = true;
        long l = zznR.currentTimeMillis();
        if(l > zzaEi + 0x5265c00L)
        {
            zzaEi = l;
            Object obj = zzdJ("Error opening database for deleteStaleHits.");
            if(obj != null)
            {
                int i = ((SQLiteDatabase) (obj)).delete("gtm_hits", "HIT_TIME < ?", new String[] {
                    Long.toString(zznR.currentTimeMillis() - 0x9a7ec800L)
                });
                obj = zzaEg;
                if(zzxi() != 0)
                    flag = false;
                ((zzav) (obj)).zzai(flag);
                return i;
            }
        }
        return 0;
    }

    int zzxi()
    {
        Cursor cursor;
        Object obj;
        Object obj1;
        int i;
        int j;
        obj = null;
        cursor = null;
        i = 0;
        j = 0;
        obj1 = zzdJ("Error opening database for getNumStoredHits.");
        if(obj1 != null) goto _L2; else goto _L1
_L1:
        return j;
_L2:
        obj1 = ((SQLiteDatabase) (obj1)).rawQuery("SELECT COUNT(*) from gtm_hits", null);
        cursor = ((Cursor) (obj1));
        obj = obj1;
        if(!((Cursor) (obj1)).moveToFirst())
            break MISSING_BLOCK_LABEL_64;
        cursor = ((Cursor) (obj1));
        obj = obj1;
        long l = ((Cursor) (obj1)).getLong(0);
        i = (int)l;
        j = i;
        if(obj1 != null)
        {
            ((Cursor) (obj1)).close();
            return i;
        }
        if(true) goto _L1; else goto _L3
_L3:
        obj;
        obj = cursor;
        zzbg.zzan("Error getting numStoredHits");
        if(cursor == null) goto _L1; else goto _L4
_L4:
        cursor.close();
        return 0;
        Exception exception;
        exception;
        if(obj != null)
            ((Cursor) (obj)).close();
        throw exception;
    }

    int zzxj()
    {
        Object obj;
        Object obj1;
        obj1 = null;
        obj = zzdJ("Error opening database for getNumStoredHits.");
        if(obj == null)
            return 0;
        obj = ((SQLiteDatabase) (obj)).query("gtm_hits", new String[] {
            "hit_id", "hit_first_send_time"
        }, "hit_first_send_time=0", null, null, null, null);
        int j = ((Cursor) (obj)).getCount();
        int i;
        i = j;
        if(obj != null)
        {
            ((Cursor) (obj)).close();
            i = j;
        }
_L1:
        return i;
        obj;
        obj = null;
_L4:
        zzbg.zzan("Error getting num untried hits");
        SQLiteException sqliteexception;
        Exception exception;
        if(obj != null)
        {
            ((Cursor) (obj)).close();
            i = 0;
        } else
        {
            i = 0;
        }
          goto _L1
        obj;
_L3:
        if(obj1 != null)
            ((Cursor) (obj1)).close();
        throw obj;
        exception;
        obj1 = obj;
        obj = exception;
        continue; /* Loop/switch isn't completed */
        exception;
        obj1 = obj;
        obj = exception;
        if(true) goto _L3; else goto _L2
_L2:
        sqliteexception;
          goto _L4
    }

    private static final String zzGk = String.format("CREATE TABLE IF NOT EXISTS %s ( '%s' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, '%s' INTEGER NOT NULL, '%s' TEXT NOT NULL,'%s' INTEGER NOT NULL);", new Object[] {
        "gtm_hits", "hit_id", "hit_time", "hit_url", "hit_first_send_time"
    });
    private final Context mContext;
    private final zzb zzaEe;
    private volatile zzac zzaEf;
    private final zzav zzaEg;
    private final String zzaEh;
    private long zzaEi;
    private final int zzaEj;
    private zzht zznR;

}
