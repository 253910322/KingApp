package com.kingandroid.kingapp;

import android.content.pm.ActivityInfo;
import android.graphics.Point;
import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.kingandroid.utils.ScreenSizeUtils;


public class MainActivity extends AppCompatActivity {

    private String TAG= "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        Point point = new Point();
        ScreenSizeUtils.getScreenSize(this, point);

        Log.d(TAG, "onCreate: X:" + point.x);
        Log.d(TAG, "onCreate: Y:" + point.y);

        Log.d("","");



    }




}