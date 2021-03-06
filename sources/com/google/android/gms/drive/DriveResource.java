// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.drive;

import com.google.android.gms.common.api.*;
import com.google.android.gms.drive.events.ChangeListener;
import java.util.Set;

// Referenced classes of package com.google.android.gms.drive:
//            DriveId, MetadataChangeSet, Metadata

public interface DriveResource
{
    public static interface MetadataResult
        extends Result
    {

        public abstract Metadata getMetadata();
    }


    public abstract PendingResult addChangeListener(GoogleApiClient googleapiclient, ChangeListener changelistener);

    public abstract PendingResult addChangeSubscription(GoogleApiClient googleapiclient);

    public abstract DriveId getDriveId();

    public abstract PendingResult getMetadata(GoogleApiClient googleapiclient);

    public abstract PendingResult listParents(GoogleApiClient googleapiclient);

    public abstract PendingResult removeChangeListener(GoogleApiClient googleapiclient, ChangeListener changelistener);

    public abstract PendingResult removeChangeSubscription(GoogleApiClient googleapiclient);

    public abstract PendingResult setParents(GoogleApiClient googleapiclient, Set set);

    public abstract PendingResult trash(GoogleApiClient googleapiclient);

    public abstract PendingResult untrash(GoogleApiClient googleapiclient);

    public abstract PendingResult updateMetadata(GoogleApiClient googleapiclient, MetadataChangeSet metadatachangeset);
}
