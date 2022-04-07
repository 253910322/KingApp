package com.kingandroid.kingapp;

import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class NoLayoutActivity extends AppCompatActivity {

    private String TAG = "NoLayoutActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*
        LinearLayout linear = new LinearLayout(this);
        linear.setGravity(Gravity.CENTER);

        TextView textView = new TextView(this);
        textView.setText("Hello World");
        textView.setTextColor(0xffff0000);

        linear.addView(textView);
        setContentView(linear);
        */
        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);

        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        TextView tv = new TextView(this);
        tv.setText("this is a TextView");
        tv.setLayoutParams(layoutParams);

        Button btn = new Button(this);
        btn.setText("This is a Button");
        btn.setFocusable(false);
        btn.setLayoutParams(layoutParams);

        layout.addView(tv);
        layout.addView(btn);

        LinearLayout.LayoutParams linearparam =
                new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        LinearLayout.LayoutParams.WRAP_CONTENT );

        this.addContentView(layout, linearparam);

    }


    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        Log.d(TAG, "onKeyDown: ");
        return super.onKeyDown(keyCode, event);

    }


    @Override
    public boolean onKeyUp(int keyCode, KeyEvent event) {
        Log.d(TAG, "onKeyUp: ");
        return super.onKeyUp(keyCode, event);
    }

    @Override
    public boolean onMenuOpened(int featureId, Menu menu) {
        Log.d(TAG, "onMenuOpened: ");
        return super.onMenuOpened(featureId, menu);
    }


}