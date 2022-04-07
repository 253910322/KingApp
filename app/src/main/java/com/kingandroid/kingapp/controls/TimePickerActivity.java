package com.kingandroid.kingapp.controls;

import androidx.appcompat.app.AppCompatActivity;

import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

import com.kingandroid.kingapp.R;

import java.util.Calendar;

public class TimePickerActivity extends AppCompatActivity implements View.OnClickListener,
        TimePickerDialog.OnTimeSetListener,TimePicker.OnTimeChangedListener {

    private Button mButton;
    private TextView mshow_tx;
    private TimePicker mTimepicker;
    private TextView mTimepicshow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_picker);
        mButton = (Button)findViewById(R.id.bt_time);
        mshow_tx = (TextView) findViewById(R.id.tv_timeshow);
        mTimepicker = (TimePicker) findViewById(R.id.tp_time);
        mTimepicshow = (TextView) findViewById(R.id.tv_showtime);
        mButton.setOnClickListener(this);
        mTimepicker.setOnTimeChangedListener(this);
        /*设置以24小时的样式显示时间*/
        mTimepicker.setIs24HourView(true);
    }


    @Override
    public void onClick(View v) {
        if(v.getId() != R.id.bt_time) return;
        Calendar calendar = Calendar.getInstance();
        int hour = calendar.get(Calendar.HOUR);
        int minute = calendar.get(Calendar.MINUTE);
        TimePickerDialog dialog = new TimePickerDialog(this,this,hour,minute,true);
        dialog.show();
    }

    @Override
    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
        String result = String.format("%02d:%02d:00", hourOfDay, minute);
        mshow_tx.setText(result);
    }

    @Override
    public void onTimeChanged(TimePicker view, int hourOfDay, int minute) {
        String result = String.format("%02d:%02d:00", hourOfDay, minute);
        mTimepicshow.setText(result);
    }
}