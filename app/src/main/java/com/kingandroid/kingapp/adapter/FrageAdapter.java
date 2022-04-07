package com.kingandroid.kingapp.adapter;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.kingandroid.kingapp.beans.CityBeans;

import java.util.ArrayList;

public class FrageAdapter extends FragmentPagerAdapter {

    private Context mContext;
    private ArrayList<CityBeans> lstinfo;

    public FrageAdapter(FragmentManager fm, Context cont, ArrayList<CityBeans> lst){
        super(fm);
        mContext = cont;
        lstinfo = lst;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return  new Fragment();


    }

    @Override
    public int getCount() {
        return 0;
        //return lstinfo.size();
    }
}
