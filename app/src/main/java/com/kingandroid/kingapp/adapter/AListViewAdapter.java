package com.kingandroid.kingapp.adapter;

import android.content.Context;
import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.kingandroid.kingapp.R;
import com.kingandroid.kingapp.beans.CityBeans;

import java.util.List;

public class AListViewAdapter implements android.widget.ListAdapter {

    private List<CityBeans> InfoList;
    private Context mContext;
    private int mResourceid;

    public AListViewAdapter(Context cont, List<CityBeans> lst, int Resourceid)
    {
        mContext = cont;
        InfoList = lst;
        mResourceid = Resourceid;
    }
    @Override
    public boolean areAllItemsEnabled() {
        return false;
    }

    @Override
    public boolean isEnabled(int position) {
        return false;
    }

    @Override
    public void registerDataSetObserver(DataSetObserver observer) {

    }

    @Override
    public void unregisterDataSetObserver(DataSetObserver observer) {

    }

    @Override
    public int getCount() {
        return InfoList.size();
    }

    @Override
    public Object getItem(int position) {
        return InfoList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        InnerHolder holder;
        if (convertView == null) {
            convertView = View.inflate(mContext, mResourceid, null);
            holder = new InnerHolder();
            holder.info = convertView.findViewById(R.id.tv_combox);
            holder.desc = convertView.findViewById(R.id.tv_desc);
            holder.img = convertView.findViewById(R.id.iv_image);
            convertView.setTag(holder);
        }
        else
        {
            holder = (InnerHolder)convertView.getTag();
        }
        holder.info.setText(InfoList.get(position).CityName);
        holder.desc.setText(InfoList.get(position).descinfo);
        holder.img.setImageResource(InfoList.get(position).ImageId);
        return convertView;
    }

    @Override
    public int getItemViewType(int position) {
        return 0;
    }

    /*
    *这里必须返回大于等于1的数字，不能返回0.这个方法必须重写，否则启动时候会报
    * java.lang.IllegalArgumentException: Can't have a viewTypeCount < 1
    * */
    @Override
    public int getViewTypeCount() {
        return 1;
    }


    @Override
    public boolean isEmpty() {
        return false;
    }

    private class InnerHolder{
        TextView info;
        TextView desc;
        ImageView img;

    }

}
