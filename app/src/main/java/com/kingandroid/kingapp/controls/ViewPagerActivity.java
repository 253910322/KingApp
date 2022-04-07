package com.kingandroid.kingapp.controls;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.PagerTitleStrip;
import androidx.viewpager.widget.ViewPager;

import android.graphics.Color;
import android.os.Bundle;
import android.util.TypedValue;
import android.widget.ListView;

import com.kingandroid.kingapp.R;
import com.kingandroid.kingapp.adapter.AListViewAdapter;
import com.kingandroid.kingapp.adapter.CViewPaperAdapter;
import com.kingandroid.kingapp.beans.CityBeans;

import java.util.ArrayList;

public class ViewPagerActivity extends AppCompatActivity {

    private ViewPager mViewpaper;
    private ArrayList<CityBeans> citylist;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);
        mViewpaper = (ViewPager) findViewById(R.id.vp_view);
        InitDataList();

        /*
        *PagerTitleStrip用于显示标题栏
        *
        * */
        PagerTitleStrip pts_title = (PagerTitleStrip) findViewById(R.id.pts_title);
        pts_title.setTextSize(TypedValue.COMPLEX_UNIT_SP, 20);
        pts_title.setTextColor(Color.BLUE);

        CViewPaperAdapter adapter = new CViewPaperAdapter(this, citylist);
        mViewpaper.setAdapter(adapter);
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

    }


}



