package com.developerhaoz.performanceoptimizationdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

/**
 * Created by developerHaoz on 2017/10/3.
 */

public class MemoryLeakActivity extends AppCompatActivity {

    private static final String TAG = "MemoryLeakActivity";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_memory_leak);
        Log.d(TAG, "onCreate: " + "不查不知道，一查吓一跳");
    }
}
