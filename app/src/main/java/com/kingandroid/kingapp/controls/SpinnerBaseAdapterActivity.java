package com.kingandroid.kingapp.controls;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.kingandroid.kingapp.R;
import com.kingandroid.kingapp.adapter.SpinnerAdapter;
import com.kingandroid.kingapp.beans.CityBeans;

import java.util.ArrayList;
import java.util.List;

public class SpinnerBaseAdapterActivity extends AppCompatActivity {

    private Spinner mSp_combox;
    private List<CityBeans> citylist;
    private List<String> cityStringlist;


    private Spinner mSimplespin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base_adapter);
        mSp_combox = (Spinner) findViewById(R.id.sp_combox);
        mSimplespin = (Spinner) findViewById(R.id.sp_simple);

        InitDataList();
        SpinnerAdapter adapter = new SpinnerAdapter(this,citylist,R.layout.base_down_style);
        mSp_combox.setAdapter(adapter);
        mSp_combox.setSelection(0);
        mSp_combox.setPrompt("请选择下拉列表:");


        /*
        * ArrayAdapter requires the resource ID to be a TextView
        * */
        android.widget.SpinnerAdapter baseadapter = new ArrayAdapter<String>(this,R.layout.array_down_style, cityStringlist);
        mSimplespin.setAdapter(baseadapter);
        mSimplespin.setSelection(0);
        mSimplespin.setPrompt("请选择下拉列表:");




    }

    private void InitDataList() {
        citylist = new ArrayList<>();
        citylist.add(new CityBeans("中国"));
        citylist.add(new CityBeans("美国"));
        citylist.add(new CityBeans("日本"));

        cityStringlist = new ArrayList<>();
        cityStringlist.add("中国");
        cityStringlist.add("美国");
        cityStringlist.add("日本");


    }

}