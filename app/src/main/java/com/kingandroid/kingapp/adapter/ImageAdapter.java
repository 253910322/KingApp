package com.kingandroid.kingapp.adapter;

import static com.google.android.material.internal.ThemeEnforcement.obtainStyledAttributes;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.StyleRes;
import androidx.annotation.StyleableRes;

import com.kingandroid.kingapp.R;

import java.util.ArrayList;

public class ImageAdapter extends BaseAdapter {
    private Context context;
    ArrayList<Integer> mList ;
    int itemBackground;
    public ImageAdapter(Context c, ArrayList<Integer> list) {
        context = c;
        mList = list;
    }

    @Override
    public int getCount() {
        if (mList != null) {
            return mList.size();
        }
        return 0;
    }

    @Override
    public Object getItem(int position) {
        if (mList != null) {
            return mList.get(position);
        }
        return null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        InnerHolder TemHolder = new InnerHolder();
        if (convertView == null) {
            TemHolder.imageView = new ImageView(context);
            TemHolder.imageView.setImageResource(mList.get(position));
            TemHolder.imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        }
        else
        {
            TemHolder.imageView = (ImageView)convertView;
        }
        return TemHolder.imageView;
    }



    private class InnerHolder{

        public ImageView imageView;

    }


}
