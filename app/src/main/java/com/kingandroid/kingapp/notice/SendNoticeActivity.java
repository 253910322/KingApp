package com.kingandroid.kingapp.notice;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.kingandroid.kingapp.R;

public class SendNoticeActivity extends AppCompatActivity {

    int notificationID = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_notice);
    }

    public void onClick(View view) {
        displayNotification();
    }


    protected void displayNotification()
    {
        notificationID = notificationID + 1;
        String id = "channel_" + notificationID;
        String description = "143";
        int importance = NotificationManager.IMPORTANCE_LOW;

        Intent i = new Intent(this, RecvNotififyViewActivity.class);
        i.putExtra("notificationID", notificationID);
        PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, i, 0);


        NotificationManager nm = (NotificationManager)getSystemService(NOTIFICATION_SERVICE);

        NotificationChannel channel = new NotificationChannel(id, description, importance);
        nm.createNotificationChannel(channel);
        Notification.Builder notifybuild = new Notification.Builder(this, id);

        notifybuild.setContentTitle("System Alarm");
        notifybuild.setContentText("Reminder: Meeting starts in 5 minutes");
        notifybuild.setSmallIcon(R.drawable.tuxing);
        notifybuild.setWhen(System.currentTimeMillis());
        notifybuild.setTicker("Meeting with customer at 3pm...");
        notifybuild.setAutoCancel(true);
        notifybuild.setContentIntent(pendingIntent);

        Notification notif = notifybuild.build();
        nm.notify(notificationID, notif);
    }



}