package com.kingandroid.kingapp.controls;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.kingandroid.kingapp.R;

import java.util.Calendar;


/*
 * DatePicker并非弹窗模式， 而是直接在页面上占据一块区域， 并且不会自动关闭。 按习惯来说， 日期控件应该在当前页面弹出， 选择完日期就要把控件关掉。
 * 因此DatePicker很少直接显示在界面上， 更常用的是已经封装好的日期选择对话框DatePickerDialog。
 * DatePickerDialog相当于在AlertDialog上加载了DatePicker， 用起来更简单， 只需调用构造函数设置一下
 * 当前年、 月、 日， 然后调用show方法即可弹出日期对话框。 日期选择事件由监听器OnDateSetListener负责响
 * 应， 在该监听器实现的onDateSet方法中， 开发者能够获得用户选择的具体日期， 并做后续处理。 这里要特
 * 别注意onDateSet方法的月份参数， 该参数的起始值不是1而是0。
 * */

public class DatePickerActivity extends AppCompatActivity implements DatePicker.OnDateChangedListener {

    private Button mbutton_get;
    private TextView medit_show;
    private String TAG = "DatePickerActivity";
    private DatePicker dp_picker;
    private TextView tv_sshow;

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_picker);
        mbutton_get = (Button) findViewById(R.id.bt_getdate);
        medit_show = (TextView) findViewById(R.id.et_showdate);
        dp_picker = (DatePicker) findViewById(R.id.dp_picker);
        tv_sshow = (TextView) findViewById(R.id.tv_sshow);
        dp_picker.setOnDateChangedListener(this);
        mbutton_get.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GetDate(v);
            }
        });
    }

    DatePickerDialog.OnDateSetListener datesetListen = new DatePickerDialog.OnDateSetListener() {
        /*
         * 一旦点击了对话框上的确认按钮，就会触发监听器的onDateSet方法
         * */
        @Override
        public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
            String desc = String.format("%04d-%02d-%02d", year, month + 1, dayOfMonth);
            medit_show.setText(desc);
        }
    };

    public void GetDate(View view) {
        if (view.getId() != R.id.bt_getdate) return;
        /*
         * 获取日历的对象，里面包含年月日等信息
         * */
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1;
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        /*
         * 第一个参数指定控件,第二个参数指定日期监听器对象
         * */
        DatePickerDialog dialog = new DatePickerDialog(this, datesetListen, year, month, day);
        dialog.show();
    }

    /*
    * 选中日期发生变化时触发此事件
    * */
    @Override
    public void onDateChanged(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
        String desc = String.format("%04d-%02d-%02d", year, monthOfYear + 1, dayOfMonth);
        tv_sshow.setText(desc);
    }
}