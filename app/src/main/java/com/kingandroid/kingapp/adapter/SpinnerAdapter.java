package com.kingandroid.kingapp.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.kingandroid.kingapp.R;
import com.kingandroid.kingapp.beans.CityBeans;

import java.util.List;

public class SpinnerAdapter extends BaseAdapter {
    private List<CityBeans> InfoList;
    private Context mContext;
    private int mResourceid;
    public SpinnerAdapter(Context cont, List<CityBeans> lst, int Resourceid)
    {
        mContext = cont;
        InfoList = lst;
        mResourceid = Resourceid;
    }

    @Override
    public int getCount() {
        if (InfoList != null) {
            return InfoList.size();
        }
        return 0;
    }

    @Override
    public Object getItem(int position) {
        if (InfoList != null) {
            return InfoList.get(position);
        }
        return null;
    }

    @Override
    public long getItemId(int position) {
        return position;
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

    private class InnerHolder{
        TextView info;
        TextView desc;
        ImageView img;

    }

}
