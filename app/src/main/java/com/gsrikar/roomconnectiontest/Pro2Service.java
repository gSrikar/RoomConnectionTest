package com.gsrikar.roomconnectiontest;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

import static com.gsrikar.roomconnectiontest.utils.DatabaseUtils.insertPersonData;

public class Pro2Service extends Service {

    private static final String TAG = Pro2Service.class.getSimpleName();

    public Pro2Service() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d(TAG, "Service Started in Process 2");
        for (int h = 0; h < 4; h++) {
            Thread thread = new Thread() {
                @Override
                public void run() {
                    for (int i = 0; i < 1000; i++) {
                        if (i % 100 == 0) Log.d(TAG, "i: " + i);
                        insertPersonData(getApplicationContext());
                    }
                }
            };
            thread.start();
        }

        Log.d(TAG, "Returning Sticky From On Start Command");
        return START_STICKY;
    }
}
