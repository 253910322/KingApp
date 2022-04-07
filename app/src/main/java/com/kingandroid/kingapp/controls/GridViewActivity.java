package com.kingandroid.kingapp.controls;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;
import android.widget.ListView;

import com.kingandroid.kingapp.R;
import com.kingandroid.kingapp.adapter.AListViewAdapter;
import com.kingandroid.kingapp.beans.CityBeans;

import java.util.ArrayList;

public class GridViewActivity extends AppCompatActivity {

    private GridView mGridView;
    private ArrayList<CityBeans> citylist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view);
        mGridView = (GridView) findViewById(R.id.gv_grid);
        mGridView.setHorizontalSpacing(10);
        mGridView.setVerticalSpacing(10);
        mGridView.setNumColumns(4);
        //mGridView.setStretchMode(GridView.STRETCH_SPACING);
        InitDataList();

        AListViewAdapter adapter = new AListViewAdapter(this, citylist, R.layout.base_down_style);
        mGridView.setAdapter(adapter);

    }

    private void InitDataList() {
        citylist = new ArrayList<>();
        citylist.add(new CityBeans("中国"));
        citylist.add(new CityBeans("美国"));
        citylist.add(new CityBeans("日本"));
        citylist.add(new CityBeans("法国"));
        citylist.add(new CityBeans("德国"));
        citylist.add(new CityBeans("奥大利亚"));
        citylist.add(new CityBeans("菲律宾"));
        citylist.add(new CityBeans("新西兰"));
        citylist.add(new CityBeans("巴基斯坦"));
        citylist.add(new CityBeans("尼日利亚"));
        citylist.add(new CityBeans("意大利"));
        citylist.add(new CityBeans("英国"));
        citylist.add(new CityBeans("法国"));
        citylist.add(new CityBeans("德国"));
        citylist.add(new CityBeans("奥大利亚"));
        citylist.add(new CityBeans("菲律宾"));
        citylist.add(new CityBeans("新西兰"));
        citylist.add(new CityBeans("巴基斯坦"));
        citylist.add(new CityBeans("尼日利亚"));
        citylist.add(new CityBeans("意大利"));
        citylist.add(new CityBeans("英国"));
        citylist.add(new CityBeans("中国"));
        citylist.add(new CityBeans("美国"));
        citylist.add(new CityBeans("日本"));
        citylist.add(new CityBeans("法国"));
        citylist.add(new CityBeans("德国"));
        citylist.add(new CityBeans("奥大利亚"));
        citylist.add(new CityBeans("菲律宾"));
        citylist.add(new CityBeans("新西兰"));
        citylist.add(new CityBeans("巴基斯坦"));
        citylist.add(new CityBeans("尼日利亚"));
        citylist.add(new CityBeans("意大利"));
        citylist.add(new CityBeans("英国"));
        citylist.add(new CityBeans("法国"));
        citylist.add(new CityBeans("德国"));
        citylist.add(new CityBeans("奥大利亚"));
        citylist.add(new CityBeans("菲律宾"));
        citylist.add(new CityBeans("新西兰"));
        citylist.add(new CityBeans("巴基斯坦"));
        citylist.add(new CityBeans("尼日利亚"));
        citylist.add(new CityBeans("意大利"));
        citylist.add(new CityBeans("英国"));



    }



}