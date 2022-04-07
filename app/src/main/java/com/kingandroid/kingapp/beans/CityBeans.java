package com.kingandroid.kingapp.beans;

import com.kingandroid.kingapp.R;

public class CityBeans {
    public String CityName;
    public int ImageId;
    public String descinfo;

    public CityBeans(String name){
        CityName = name;
        ImageId = R.mipmap.ic_launcher;
        descinfo = "this is beans class adapter test";
    }
}
