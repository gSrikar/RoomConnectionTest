package com.gsrikar.roomconnectiontest.room;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

@Database(entities = {PersonEntity.class}, version = 2)
public abstract class AppDatabase extends RoomDatabase{

    public abstract PersonDao getPersonDao();
}
