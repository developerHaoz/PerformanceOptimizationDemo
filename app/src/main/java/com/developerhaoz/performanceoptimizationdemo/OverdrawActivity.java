package com.developerhaoz.performanceoptimizationdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

/**
 * Created by developerHaoz on 2017/10/3.
 */

public class OverdrawActivity extends AppCompatActivity {

    private static final String TAG = "OverdrawActivity";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_overdraw);
        Log.d(TAG, "onCreate: " + "这个只能说尽量减少布局嵌套吧");
    }
}
