package com.kingandroid.kingapp.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.kingandroid.kingapp.R;
import com.kingandroid.kingapp.beans.CityBeans;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CViewPaperAdapter extends PagerAdapter {

    private Context mContext;
    private ArrayList<CityBeans> lstinfo;

    private Map<Integer,View> mShowView;

    public CViewPaperAdapter(Context cont, ArrayList<CityBeans> lst)
    {
        mContext = cont;
        lstinfo = lst;
        mShowView = new HashMap<>();
    }


    @Override
    public int getCount() {
        return lstinfo.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }



    /*
    * 其他的Adapter直接实现对应的接口即可，但是PagerAdapter除了实现对应的接口以外还需要额外实现下面的三个方法
    * destroyItem
    * instantiateItem
    * getPageTitle
    *
    *
    * ListView与GridView， 一个分行展示， 另一个分行又分列， 其实都是在垂直方向上下滑
    * 动。 有没有一种控件允许页面在水平方向左右滑动， 就像翻书、 翻报纸一样呢？ 对于这种左右滑动的翻页
    * 功能， Android提供了已经封装好的控件， 就是翻页视图ViewPager。 对于ViewPager来说， 一个页面就是一
    * 个项（相当于ListView的一个列表项） ， 许多页面组成ViewPager的页面项。
    * 明确了ViewPager的原理类似ListView和GridView， 翻页视图的用法也与它俩类似。 ListView和
    * GridView的适配器使用BaseAdapter， ViewPager的适配器使用PagerAdapter； ListView和GridView的监听器
    * 使用OnItemClickListener， ViewPager的监听器使用OnPageChangeListener， 表示监听页面切换事件。
    * */


    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {

        View v = mShowView.get(position);
        container.removeView(v);
        mShowView.remove(position);
    }

    /*
    * 这里的View可以在初始化的时候创建好，也可以在获取实例的时候创建，比较好的做法是在初始化的时候创建好View
    * */
    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        View v = View.inflate(mContext, R.layout.base_down_style,null);
        InnerHolder holder = new InnerHolder();
        holder.desc = v.findViewById(R.id.tv_desc);
        holder.img = v.findViewById(R.id.iv_image);
        holder.info = v.findViewById(R.id.tv_combox);

        holder.info.setText(lstinfo.get(position).CityName);
        holder.img.setImageResource(lstinfo.get(position).ImageId);
        holder.desc.setText(lstinfo.get(position).descinfo);
        v.setTag(holder);
        container.addView(v);
        mShowView.put(position,v);
        return v;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return lstinfo.get(position).CityName;
    }

    private class InnerHolder{
        TextView info;
        TextView desc;
        ImageView img;
    }

}
