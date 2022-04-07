package com.kingandroid.kingapp.notice;

import androidx.appcompat.app.AppCompatActivity;
import android.app.NotificationManager;
import android.os.Bundle;

import com.kingandroid.kingapp.R;

public class RecvNotififyViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notifications);

        NotificationManager nm = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        nm.cancel(getIntent().getExtras().getInt("notificationID"));



    }
}