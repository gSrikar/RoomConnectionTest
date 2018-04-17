package com.gsrikar.roomconnectiontest;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Process;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import static com.gsrikar.roomconnectiontest.utils.DatabaseUtils.insertPersonData;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startService(new Intent(this, Pro1Service.class));
        startService(new Intent(this, Pro2Service.class));
        for (int h = 0; h < 4; h++) {
            final int finalH = h;
            final Thread thread1 = new Thread() {
                @Override
                public void run() {
                    for (int i = 0; i < 500; i++) {
                        if (i % 10 == 0) {
                            for (int j = 0; j < 10; j++) {
                                Log.d(TAG, "Thread 1 (" + finalH + "), i: " + i + " running at " + Process.myTid()
                                        + " which is main thread " +
                                        (Looper.myLooper() == Looper.getMainLooper()));
                                insertPersonData(getApplicationContext());
                            }
                        } else {
                            Log.d(TAG, "Thread 1 (" + finalH + "), j: " + i + " running at " + Process.myTid()
                                    + " which is main thread " +
                                    (Looper.myLooper() == Looper.getMainLooper()));
                            insertPersonData(getApplicationContext());
                        }
                    }
                }
            };
            thread1.start();

            final Thread thread2 = new Thread() {
                @Override
                public void run() {
                    for (int i = 0; i < 500; i++) {
                        if (i % 10 == 0) {
                            for (int j = 0; j < 10; j++) {
                                Log.d(TAG, "Thread 2 (" + finalH + "), i: " + i + " running at " + Process.myTid()
                                        + " which is main thread " +
                                        (Looper.myLooper() == Looper.getMainLooper()));
                                insertPersonData(getApplicationContext());
                            }
                        } else {
                            Log.d(TAG, "Thread 2 (" + finalH + "), j: " + i + " running at " + Process.myTid()
                                    + " which is main thread " +
                                    (Looper.myLooper() == Looper.getMainLooper()));
                            insertPersonData(getApplicationContext());
                        }
                    }
                }
            };
            thread2.start();
        }
    }
}
