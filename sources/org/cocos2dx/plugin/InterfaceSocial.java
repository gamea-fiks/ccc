// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package org.cocos2dx.plugin;

import java.util.Hashtable;

public interface InterfaceSocial
{

    public abstract void configDeveloperInfo(Hashtable hashtable);

    public abstract String getPluginVersion();

    public abstract String getSDKVersion();

    public abstract void setDebugMode(boolean flag);

    public abstract void showAchievements();

    public abstract void showLeaderboard(String s);

    public abstract void submitScore(String s, long l);

    public abstract void unlockAchievement(Hashtable hashtable);

    public static final int PluginType = 6;
}
