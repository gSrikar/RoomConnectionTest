# RoomConnectionTest

The project is an attempt to create the `SQLiteDatabaseLockedException` by inserting data from multiple threads and multiple process.

The complete exception when thrown from MainActivity looks something like below.

```
android.database.sqlite.SQLiteDatabaseLockedException: database is locked (code 5)
        at android.database.sqlite.SQLiteConnection.nativeExecute(Native Method)
        at android.database.sqlite.SQLiteConnection.execute(SQLiteConnection.java:561)
        at android.database.sqlite.SQLiteSession.beginTransactionUnchecked(SQLiteSession.java:323)
        at android.database.sqlite.SQLiteSession.beginTransaction(SQLiteSession.java:298)
        at android.database.sqlite.SQLiteDatabase.beginTransaction(SQLiteDatabase.java:505)
        at android.database.sqlite.SQLiteDatabase.beginTransaction(SQLiteDatabase.java:416)
        at android.arch.persistence.db.framework.FrameworkSQLiteDatabase.beginTransaction(FrameworkSQLiteDatabase.java:67)
        at android.arch.persistence.room.InvalidationTracker.internalInit(InvalidationTracker.java:153)
        at android.arch.persistence.room.RoomDatabase.internalInitInvalidationTracker(RoomDatabase.java:282)
        at com.gsrikar.roomconnectiontest.room.AppDatabase_Impl.access$400(AppDatabase_Impl.java:21)
        at com.gsrikar.roomconnectiontest.room.AppDatabase_Impl$1.onOpen(AppDatabase_Impl.java:46)
        at android.arch.persistence.room.RoomOpenHelper.onOpen(RoomOpenHelper.java:101)
        at android.arch.persistence.db.framework.FrameworkSQLiteOpenHelper$OpenHelper.onOpen(FrameworkSQLiteOpenHelper.java:133)
        at android.database.sqlite.SQLiteOpenHelper.getDatabaseLocked(SQLiteOpenHelper.java:266)
        at android.database.sqlite.SQLiteOpenHelper.getWritableDatabase(SQLiteOpenHelper.java:163)
        at android.arch.persistence.db.framework.FrameworkSQLiteOpenHelper$OpenHelper.getWritableSupportDatabase(FrameworkSQLiteOpenHelper.java:93)
        at android.arch.persistence.db.framework.FrameworkSQLiteOpenHelper.getWritableDatabase(FrameworkSQLiteOpenHelper.java:54)
        at android.arch.persistence.room.RoomDatabase.inTransaction(RoomDatabase.java:305)
        at android.arch.persistence.room.InvalidationTracker$1.run(InvalidationTracker.java:281)
        at android.arch.persistence.room.InvalidationTracker.syncTriggers(InvalidationTracker.java:437)
        at android.arch.persistence.room.RoomDatabase.beginTransaction(RoomDatabase.java:212)
        at com.gsrikar.roomconnectiontest.room.PersonDao_Impl.insert(PersonDao_Impl.java:42)
        at com.gsrikar.roomconnectiontest.MainActivity$3.run(MainActivity.java:89)
        at android.os.AsyncTask$SerialExecutor$1.run(AsyncTask.java:234)
        at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1113)
        at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:588)
        at java.lang.Thread.run(Thread.java:818)
```

### Make sure to:

Avoid multiple threads for database insertions and use single thread.

Avoid multiple process for database insertions and use content provider for multi process insertions or move all the insertions to single process.

Avoid insertions from single thread in each process in multi process application as this is considered as inserting data from multiple threads and leads to database locks.

Avoid insertions from singleton instances in a multi process application as a single instance is created per process and not for all processes.

### Things to Remember While looking for crashes:

There might be delay in the crash to happen. If this happens, open and close (not kill) fast few times.

Since both services run in different processes, to see all the crashes remove the filter in the Logcat.
