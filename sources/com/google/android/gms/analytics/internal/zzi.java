// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.analytics.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.*;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.common.internal.zzv;
import com.google.android.gms.internal.zzht;
import java.io.Closeable;
import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.*;
import org.apache.http.NameValuePair;
import org.apache.http.client.utils.URLEncodedUtils;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            zzd, zzai, zze, zzaa, 
//            zzq, zzg, zzae, zzal, 
//            zzw

class zzi extends zzd
    implements Closeable
{
    class zza extends SQLiteOpenHelper
    {

        private void zza(SQLiteDatabase sqlitedatabase)
        {
            boolean flag1 = true;
            Set set = zzb(sqlitedatabase, "hits2");
            String as[] = new String[4];
            as[0] = "hit_id";
            as[1] = "hit_string";
            as[2] = "hit_time";
            as[3] = "hit_url";
            int j = as.length;
            for(int i = 0; i < j; i++)
            {
                String s = as[i];
                if(!set.remove(s))
                    throw new SQLiteException((new StringBuilder()).append("Database hits2 is missing required column: ").append(s).toString());
            }

            boolean flag;
            if(!set.remove("hit_app_id"))
                flag = flag1;
            else
                flag = false;
            if(!set.isEmpty())
                throw new SQLiteException("Database hits2 has extra columns");
            if(flag)
                sqlitedatabase.execSQL("ALTER TABLE hits2 ADD COLUMN hit_app_id INTEGER");
        }

        private boolean zza(SQLiteDatabase sqlitedatabase, String s)
        {
            SQLiteDatabase sqlitedatabase1 = null;
            sqlitedatabase = sqlitedatabase.query("SQLITE_MASTER", new String[] {
                "name"
            }, "name=?", new String[] {
                s
            }, null, null, null);
            sqlitedatabase1 = sqlitedatabase;
            sqlitedatabase = sqlitedatabase1;
            boolean flag = sqlitedatabase1.moveToFirst();
            if(sqlitedatabase1 != null)
                sqlitedatabase1.close();
            return flag;
            SQLiteException sqliteexception;
            sqliteexception;
            sqlitedatabase1 = null;
_L4:
            sqlitedatabase = sqlitedatabase1;
            zzGp.zzc("Error querying for table", s, sqliteexception);
            if(sqlitedatabase1 != null)
                sqlitedatabase1.close();
            return false;
            sqlitedatabase;
            s = sqlitedatabase1;
_L2:
            if(s != null)
                s.close();
            throw sqlitedatabase;
            Exception exception;
            exception;
            s = sqlitedatabase;
            sqlitedatabase = exception;
            if(true) goto _L2; else goto _L1
_L1:
            sqliteexception;
            if(true) goto _L4; else goto _L3
_L3:
        }

        private Set zzb(SQLiteDatabase sqlitedatabase, String s)
        {
            HashSet hashset;
            hashset = new HashSet();
            sqlitedatabase = sqlitedatabase.rawQuery((new StringBuilder()).append("SELECT * FROM ").append(s).append(" LIMIT 0").toString(), null);
            s = sqlitedatabase.getColumnNames();
            int i = 0;
_L2:
            if(i >= s.length)
                break; /* Loop/switch isn't completed */
            hashset.add(s[i]);
            i++;
            if(true) goto _L2; else goto _L1
_L1:
            sqlitedatabase.close();
            return hashset;
            s;
            sqlitedatabase.close();
            throw s;
        }

        private void zzb(SQLiteDatabase sqlitedatabase)
        {
            int i = 0;
            sqlitedatabase = zzb(sqlitedatabase, "properties");
            String as[] = new String[6];
            as[0] = "app_uid";
            as[1] = "cid";
            as[2] = "tid";
            as[3] = "params";
            as[4] = "adid";
            as[5] = "hits_count";
            for(int j = as.length; i < j; i++)
            {
                String s = as[i];
                if(!sqlitedatabase.remove(s))
                    throw new SQLiteException((new StringBuilder()).append("Database properties is missing required column: ").append(s).toString());
            }

            if(!sqlitedatabase.isEmpty())
                throw new SQLiteException("Database properties table has extra columns");
            else
                return;
        }

        public SQLiteDatabase getWritableDatabase()
        {
            if(!zzi.zza(zzGp).zzt(0x36ee80L))
                throw new SQLiteException("Database open failed");
            SQLiteDatabase sqlitedatabase;
            try
            {
                sqlitedatabase = super.getWritableDatabase();
            }
            catch(SQLiteException sqliteexception)
            {
                zzi.zza(zzGp).start();
                zzGp.zzaJ("Opening the database failed, dropping the table and recreating it");
                Object obj = zzi.zzb(zzGp);
                zzGp.getContext().getDatabasePath(((String) (obj))).delete();
                try
                {
                    obj = super.getWritableDatabase();
                    zzi.zza(zzGp).clear();
                }
                catch(SQLiteException sqliteexception1)
                {
                    zzGp.zze("Failed to open freshly created database", sqliteexception1);
                    throw sqliteexception1;
                }
                return ((SQLiteDatabase) (obj));
            }
            return sqlitedatabase;
        }

        public void onCreate(SQLiteDatabase sqlitedatabase)
        {
            zzw.zzaQ(sqlitedatabase.getPath());
        }

        public void onOpen(SQLiteDatabase sqlitedatabase)
        {
            Cursor cursor;
            if(android.os.Build.VERSION.SDK_INT >= 15)
                break MISSING_BLOCK_LABEL_29;
            cursor = sqlitedatabase.rawQuery("PRAGMA journal_mode=memory", null);
            cursor.moveToFirst();
            cursor.close();
            if(!zza(sqlitedatabase, "hits2"))
                sqlitedatabase.execSQL(zzi.zzhp());
            else
                zza(sqlitedatabase);
            if(!zza(sqlitedatabase, "properties"))
            {
                sqlitedatabase.execSQL("CREATE TABLE IF NOT EXISTS properties ( app_uid INTEGER NOT NULL, cid TEXT NOT NULL, tid TEXT NOT NULL, params TEXT NOT NULL, adid INTEGER NOT NULL, hits_count INTEGER NOT NULL, PRIMARY KEY (app_uid, cid, tid)) ;");
                return;
            } else
            {
                zzb(sqlitedatabase);
                return;
            }
            sqlitedatabase;
            cursor.close();
            throw sqlitedatabase;
        }

        public void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
        {
        }

        final zzi zzGp;

        zza(Context context, String s)
        {
            zzGp = zzi.this;
            super(context, s, null, 1);
        }
    }


    zzi(zze zze1)
    {
        super(zze1);
        String s = zzho();
        zzGm = new zza(zze1.getContext(), s);
    }

    private long zza(String s, String as[])
    {
        String as1[];
        String as2[];
        SQLiteDatabase sqlitedatabase;
        sqlitedatabase = getWritableDatabase();
        as2 = null;
        as1 = null;
        as = sqlitedatabase.rawQuery(s, as);
        as1 = as;
        as2 = as;
        if(!as.moveToFirst())
            break MISSING_BLOCK_LABEL_60;
        as1 = as;
        as2 = as;
        long l = as.getLong(0);
        if(as != null)
            as.close();
        return l;
        as1 = as;
        as2 = as;
        try
        {
            throw new SQLiteException("Database returned empty set");
        }
        // Misplaced declaration of an exception variable
        catch(String as[])
        {
            as2 = as1;
        }
        zzd("Database error", s, as);
        as2 = as1;
        throw as;
        s;
        if(as2 != null)
            as2.close();
        throw s;
    }

    private long zza(String s, String as[], long l)
    {
        String as1[];
        String as2[];
        SQLiteDatabase sqlitedatabase;
        sqlitedatabase = getWritableDatabase();
        as2 = null;
        as1 = null;
        as = sqlitedatabase.rawQuery(s, as);
        as1 = as;
        as2 = as;
        if(!as.moveToFirst()) goto _L2; else goto _L1
_L1:
        as1 = as;
        as2 = as;
        l = as.getLong(0);
        long l1;
        l1 = l;
        if(as != null)
        {
            as.close();
            l1 = l;
        }
_L4:
        return l1;
_L2:
        l1 = l;
        if(as == null) goto _L4; else goto _L3
_L3:
        as.close();
        return l;
        as;
        as2 = as1;
        zzd("Database error", s, as);
        as2 = as1;
        throw as;
        s;
        if(as2 != null)
            as2.close();
        throw s;
    }

    static zzai zza(zzi zzi1)
    {
        return zzi1.zzGo;
    }

    static String zzb(zzi zzi1)
    {
        return zzi1.zzho();
    }

    private String zzd(zzaa zzaa1)
    {
        if(zzaa1.zziR())
            return zzgI().zzid();
        else
            return zzgI().zzie();
    }

    private static String zze(zzaa zzaa1)
    {
        zzv.zzr(zzaa1);
        Object obj = new android.net.Uri.Builder();
        zzaa1 = zzaa1.zzhe().entrySet().iterator();
        do
        {
            if(!zzaa1.hasNext())
                break;
            java.util.Map.Entry entry = (java.util.Map.Entry)zzaa1.next();
            String s = (String)entry.getKey();
            if(!"ht".equals(s) && !"qt".equals(s) && !"AppUID".equals(s))
                ((android.net.Uri.Builder) (obj)).appendQueryParameter(s, (String)entry.getValue());
        } while(true);
        obj = ((android.net.Uri.Builder) (obj)).build().getEncodedQuery();
        zzaa1 = ((zzaa) (obj));
        if(obj == null)
            zzaa1 = "";
        return zzaa1;
    }

    private void zzhn()
    {
        int i = zzgI().zzin();
        long l = zzhd();
        if(l > (long)(i - 1))
        {
            List list = zzm((l - (long)i) + 1L);
            zzd("Store full, deleting hits to make room, count", Integer.valueOf(list.size()));
            zze(list);
        }
    }

    private String zzho()
    {
        if(!zzgI().zzhP())
            return zzgI().zzip();
        if(zzgI().zzhQ())
            return zzgI().zzip();
        else
            return zzgI().zziq();
    }

    static String zzhp()
    {
        return zzGk;
    }

    private static String zzz(Map map)
    {
        zzv.zzr(map);
        Object obj = new android.net.Uri.Builder();
        java.util.Map.Entry entry;
        for(map = map.entrySet().iterator(); map.hasNext(); ((android.net.Uri.Builder) (obj)).appendQueryParameter((String)entry.getKey(), (String)entry.getValue()))
            entry = (java.util.Map.Entry)map.next();

        obj = ((android.net.Uri.Builder) (obj)).build().getEncodedQuery();
        map = ((Map) (obj));
        if(obj == null)
            map = "";
        return map;
    }

    public void beginTransaction()
    {
        zzgR();
        getWritableDatabase().beginTransaction();
    }

    public void close()
    {
        try
        {
            zzGm.close();
            return;
        }
        catch(SQLiteException sqliteexception)
        {
            zze("Sql error closing database", sqliteexception);
            return;
        }
        catch(IllegalStateException illegalstateexception)
        {
            zze("Error closing database", illegalstateexception);
        }
    }

    public void endTransaction()
    {
        zzgR();
        getWritableDatabase().endTransaction();
    }

    SQLiteDatabase getWritableDatabase()
    {
        SQLiteDatabase sqlitedatabase;
        try
        {
            sqlitedatabase = zzGm.getWritableDatabase();
        }
        catch(SQLiteException sqliteexception)
        {
            zzd("Error opening database", sqliteexception);
            throw sqliteexception;
        }
        return sqlitedatabase;
    }

    boolean isEmpty()
    {
        return zzhd() == 0L;
    }

    public void setTransactionSuccessful()
    {
        zzgR();
        getWritableDatabase().setTransactionSuccessful();
    }

    public long zza(long l, String s, String s1)
    {
        zzv.zzbS(s);
        zzv.zzbS(s1);
        zzgR();
        zzgF();
        return zza("SELECT hits_count FROM properties WHERE app_uid=? AND cid=? AND tid=?", new String[] {
            String.valueOf(l), s, s1
        }, 0L);
    }

    public void zza(long l, String s)
    {
        zzv.zzbS(s);
        zzgR();
        zzgF();
        int i = getWritableDatabase().delete("properties", "app_uid=? AND cid<>?", new String[] {
            String.valueOf(l), s
        });
        if(i > 0)
            zza("Deleted property records", Integer.valueOf(i));
    }

    Map zzaK(String s)
    {
        if(TextUtils.isEmpty(s))
            return new HashMap(0);
        Object obj;
        if(!s.startsWith("?"))
            try
            {
                s = (new StringBuilder()).append("?").append(s).toString();
            }
            // Misplaced declaration of an exception variable
            catch(String s)
            {
                zze("Error parsing hit parameters", s);
                return new HashMap(0);
            }
        obj = URLEncodedUtils.parse(new URI(s), "UTF-8");
        s = new HashMap(((List) (obj)).size());
        NameValuePair namevaluepair;
        for(obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); s.put(namevaluepair.getName(), namevaluepair.getValue()))
            namevaluepair = (NameValuePair)((Iterator) (obj)).next();

        return s;
    }

    Map zzaL(String s)
    {
        if(TextUtils.isEmpty(s))
            return new HashMap(0);
        try
        {
            Object obj = URLEncodedUtils.parse(new URI((new StringBuilder()).append("?").append(s).toString()), "UTF-8");
            s = new HashMap(((List) (obj)).size());
            NameValuePair namevaluepair;
            for(obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); s.put(namevaluepair.getName(), namevaluepair.getValue()))
                namevaluepair = (NameValuePair)((Iterator) (obj)).next();

        }
        // Misplaced declaration of an exception variable
        catch(String s)
        {
            zze("Error parsing property parameters", s);
            return new HashMap(0);
        }
        return s;
    }

    public void zzb(zzg zzg1)
    {
        zzv.zzr(zzg1);
        zzgR();
        zzgF();
        SQLiteDatabase sqlitedatabase = getWritableDatabase();
        String s = zzz(zzg1.zzhe());
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("app_uid", Long.valueOf(zzg1.zzha()));
        contentvalues.put("cid", zzg1.getClientId());
        contentvalues.put("tid", zzg1.zzhb());
        int i;
        if(zzg1.zzhc())
            i = 1;
        else
            i = 0;
        contentvalues.put("adid", Integer.valueOf(i));
        contentvalues.put("hits_count", Long.valueOf(zzg1.zzhd()));
        contentvalues.put("params", s);
        try
        {
            if(sqlitedatabase.insertWithOnConflict("properties", null, contentvalues, 5) == -1L)
                zzaJ("Failed to insert/update a property (got -1)");
            return;
        }
        // Misplaced declaration of an exception variable
        catch(zzg zzg1)
        {
            zze("Error storing a property", zzg1);
        }
    }

    public void zzc(zzaa zzaa1)
    {
        SQLiteDatabase sqlitedatabase;
        ContentValues contentvalues;
        zzv.zzr(zzaa1);
        zzgF();
        zzgR();
        String s = zze(zzaa1);
        if(s.length() > 8192)
        {
            zzgH().zza(zzaa1, "Hit length exceeds the maximum allowed size");
            return;
        }
        zzhn();
        sqlitedatabase = getWritableDatabase();
        contentvalues = new ContentValues();
        contentvalues.put("hit_string", s);
        contentvalues.put("hit_time", Long.valueOf(zzaa1.zziP()));
        contentvalues.put("hit_app_id", Integer.valueOf(zzaa1.zziN()));
        contentvalues.put("hit_url", zzd(zzaa1));
        long l = sqlitedatabase.insert("hits2", null, contentvalues);
        if(l == -1L)
        {
            try
            {
                zzaJ("Failed to insert a hit (got -1)");
                return;
            }
            // Misplaced declaration of an exception variable
            catch(zzaa zzaa1)
            {
                zze("Error storing a hit", zzaa1);
            }
            return;
        }
        zzb("Hit saved to database. db-id, hit", Long.valueOf(l), zzaa1);
        return;
    }

    public void zze(List list)
    {
        zzv.zzr(list);
        zzgF();
        zzgR();
        if(!list.isEmpty())
        {
            Object obj = new StringBuilder("hit_id");
            ((StringBuilder) (obj)).append(" in (");
            for(int i = 0; i < list.size(); i++)
            {
                Long long1 = (Long)list.get(i);
                if(long1 == null || long1.longValue() == 0L)
                    throw new SQLiteException("Invalid hit id");
                if(i > 0)
                    ((StringBuilder) (obj)).append(",");
                ((StringBuilder) (obj)).append(long1);
            }

            ((StringBuilder) (obj)).append(")");
            obj = ((StringBuilder) (obj)).toString();
            try
            {
                SQLiteDatabase sqlitedatabase = getWritableDatabase();
                zza("Deleting dispatched hits. count", Integer.valueOf(list.size()));
                int j = sqlitedatabase.delete("hits2", ((String) (obj)), null);
                if(j != list.size())
                {
                    zzb("Deleted fewer hits then expected", Integer.valueOf(list.size()), Integer.valueOf(j), obj);
                    return;
                }
            }
            // Misplaced declaration of an exception variable
            catch(List list)
            {
                zze("Error deleting hits", list);
                throw list;
            }
        }
    }

    protected void zzgb()
    {
    }

    public long zzhd()
    {
        zzgF();
        zzgR();
        return zza("SELECT COUNT(*) FROM hits2", ((String []) (null)));
    }

    public void zzhj()
    {
        zzgF();
        zzgR();
        getWritableDatabase().delete("hits2", null, null);
    }

    public void zzhk()
    {
        zzgF();
        zzgR();
        getWritableDatabase().delete("properties", null, null);
    }

    public int zzhl()
    {
        zzgF();
        zzgR();
        if(!zzGn.zzt(0x5265c00L))
        {
            return 0;
        } else
        {
            zzGn.start();
            zzaF("Deleting stale hits (if any)");
            int i = getWritableDatabase().delete("hits2", "hit_time < ?", new String[] {
                Long.toString(zzgG().currentTimeMillis() - 0x9a7ec800L)
            });
            zza("Deleted stale hits, count", Integer.valueOf(i));
            return i;
        }
    }

    public long zzhm()
    {
        zzgF();
        zzgR();
        return zza(zzGl, ((String []) (null)), 0L);
    }

    public List zzm(long l)
    {
        Object obj;
        Object obj1;
        ArrayList arraylist;
        obj1 = null;
        zzgF();
        zzgR();
        if(l <= 0L)
            return Collections.emptyList();
        obj = getWritableDatabase();
        arraylist = new ArrayList();
        String s = String.format("%s ASC", new Object[] {
            "hit_id"
        });
        String s1 = Long.toString(l);
        obj = ((SQLiteDatabase) (obj)).query("hits2", new String[] {
            "hit_id"
        }, null, null, null, null, s, s1);
        obj1 = obj;
        obj = obj1;
        if(!((Cursor) (obj1)).moveToFirst()) goto _L2; else goto _L1
_L1:
        obj = obj1;
        arraylist.add(Long.valueOf(((Cursor) (obj1)).getLong(0)));
        obj = obj1;
        boolean flag = ((Cursor) (obj1)).moveToNext();
        if(flag) goto _L1; else goto _L2
_L2:
        if(obj1 != null)
            ((Cursor) (obj1)).close();
_L3:
        return arraylist;
        Object obj2;
        obj2;
        obj1 = null;
_L6:
        obj = obj1;
        zzd("Error selecting hit ids", obj2);
        if(obj1 != null)
            ((Cursor) (obj1)).close();
          goto _L3
        obj;
_L5:
        if(obj1 != null)
            ((Cursor) (obj1)).close();
        throw obj;
        obj2;
        obj1 = obj;
        obj = obj2;
        if(true) goto _L5; else goto _L4
_L4:
        obj2;
          goto _L6
    }

    public List zzn(long l)
    {
        Object obj;
        Object obj1;
        boolean flag = true;
        obj1 = null;
        Object obj2;
        String s;
        String s1;
        int i;
        long l1;
        if(l < 0L)
            flag = false;
        zzv.zzQ(flag);
        zzgF();
        zzgR();
        obj2 = getWritableDatabase();
        obj = obj1;
        s = String.format("%s ASC", new Object[] {
            "hit_id"
        });
        obj = obj1;
        s1 = Long.toString(l);
        obj = obj1;
        obj1 = ((SQLiteDatabase) (obj2)).query("hits2", new String[] {
            "hit_id", "hit_time", "hit_string", "hit_url", "hit_app_id"
        }, null, null, null, null, s, s1);
        obj = obj1;
        obj2 = new ArrayList();
        obj = obj1;
        if(!((Cursor) (obj1)).moveToFirst()) goto _L2; else goto _L1
_L1:
        obj = obj1;
        l = ((Cursor) (obj1)).getLong(0);
        obj = obj1;
        l1 = ((Cursor) (obj1)).getLong(1);
        obj = obj1;
        s = ((Cursor) (obj1)).getString(2);
        obj = obj1;
        s1 = ((Cursor) (obj1)).getString(3);
        obj = obj1;
        i = ((Cursor) (obj1)).getInt(4);
        obj = obj1;
        ((List) (obj2)).add(new zzaa(this, zzaK(s), l1, zzal.zzaZ(s1), l, i));
        obj = obj1;
        flag = ((Cursor) (obj1)).moveToNext();
        if(flag) goto _L1; else goto _L2
_L2:
        if(obj1 != null)
            ((Cursor) (obj1)).close();
        return ((List) (obj2));
        obj1;
        obj = null;
_L6:
        zze("Error loading hits from the database", obj1);
        throw obj1;
        obj1;
_L4:
        if(obj != null)
            ((Cursor) (obj)).close();
        throw obj1;
        obj1;
        if(true) goto _L4; else goto _L3
_L3:
        SQLiteException sqliteexception;
        sqliteexception;
        obj = obj1;
        obj1 = sqliteexception;
        if(true) goto _L6; else goto _L5
_L5:
    }

    public void zzo(long l)
    {
        zzgF();
        zzgR();
        ArrayList arraylist = new ArrayList(1);
        arraylist.add(Long.valueOf(l));
        zza("Deleting hit, id", Long.valueOf(l));
        zze(arraylist);
    }

    public List zzp(long l)
    {
        Cursor cursor;
        Cursor cursor1;
        Object obj1;
        zzgR();
        zzgF();
        obj1 = getWritableDatabase();
        cursor1 = null;
        cursor = cursor1;
        int i = zzgI().zzio();
        cursor = cursor1;
        cursor1 = ((SQLiteDatabase) (obj1)).query("properties", new String[] {
            "cid", "tid", "adid", "hits_count", "params"
        }, "app_uid=?", new String[] {
            String.valueOf(l)
        }, null, null, null, String.valueOf(i));
        cursor = cursor1;
        obj1 = new ArrayList();
        cursor = cursor1;
        if(!cursor1.moveToFirst()) goto _L2; else goto _L1
_L1:
        cursor = cursor1;
        String s = cursor1.getString(0);
        cursor = cursor1;
        String s1 = cursor1.getString(1);
        cursor = cursor1;
        Map map;
        long l1;
        boolean flag;
        if(cursor1.getInt(2) != 0)
            flag = true;
        else
            flag = false;
        cursor = cursor1;
        l1 = cursor1.getInt(3);
        cursor = cursor1;
        map = zzaL(cursor1.getString(4));
        cursor = cursor1;
        if(TextUtils.isEmpty(s)) goto _L4; else goto _L3
_L3:
        cursor = cursor1;
        if(!TextUtils.isEmpty(s1)) goto _L5; else goto _L4
_L4:
        cursor = cursor1;
        zzc("Read property with empty client id or tracker id", s, s1);
_L6:
        cursor = cursor1;
        if(cursor1.moveToNext()) goto _L1; else goto _L2
_L2:
        cursor = cursor1;
        if(((List) (obj1)).size() < i)
            break MISSING_BLOCK_LABEL_271;
        cursor = cursor1;
        zzaI("Sending hits to too many properties. Campaign report might be incorrect");
        if(cursor1 != null)
            cursor1.close();
        return ((List) (obj1));
_L5:
        cursor = cursor1;
        ((List) (obj1)).add(new zzg(l, s, s1, flag, l1, map));
          goto _L6
        SQLiteException sqliteexception;
        sqliteexception;
        Object obj;
        cursor = cursor1;
        obj = sqliteexception;
_L10:
        zze("Error loading hits from the database", obj);
        throw obj;
        obj;
_L8:
        if(cursor != null)
            cursor.close();
        throw obj;
        obj;
        if(true) goto _L8; else goto _L7
_L7:
        obj;
        cursor = null;
        if(true) goto _L10; else goto _L9
_L9:
    }

    private static final String zzGk = String.format("CREATE TABLE IF NOT EXISTS %s ( '%s' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, '%s' INTEGER NOT NULL, '%s' TEXT NOT NULL, '%s' TEXT NOT NULL, '%s' INTEGER);", new Object[] {
        "hits2", "hit_id", "hit_time", "hit_url", "hit_string", "hit_app_id"
    });
    private static final String zzGl = String.format("SELECT MAX(%s) FROM %s WHERE 1;", new Object[] {
        "hit_time", "hits2"
    });
    private final zza zzGm;
    private final zzai zzGn = new zzai(zzgG());
    private final zzai zzGo = new zzai(zzgG());

}
