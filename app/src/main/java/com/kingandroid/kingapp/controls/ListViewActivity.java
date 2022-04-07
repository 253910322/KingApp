package com.kingandroid.kingapp.controls;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.kingandroid.kingapp.R;
import com.kingandroid.kingapp.adapter.AListViewAdapter;
import com.kingandroid.kingapp.beans.CityBeans;

import java.util.ArrayList;

/*
*ListView在布局时候如果在ListView的下方还有控件要显示，那么需要将ListView改用权重的方式显示，否则的话
* ListView下方的控件将没有机会显示出来。会被ListView给覆盖掉。
*
* 如果ListView下面还有其他控件， 就要将ListView的高度设为0dp， 权重设为1， 确保列表视图扩
* 展到所有剩余页面； 如果ListView的高度设置为wrap_content， 系统就只预留一行高度， 如此一来只有第一
* 行显示， 这显然不是我们所期望的
*
* 如果列表项包含EditText、 Button（ 包括ImageButton、 CheckBox等按钮） 等控件， 此时点击列表
* 项不会响应点击监听器OnItemClickListener。 罪魁祸首还是焦点抢占问题， 之前介绍EditText时提到页面会
* 自动弹出软键盘， 就是EditText抢占焦点造成的。 同理， 列表项中如果存在EditText和Button， 这些子控件也
* 会抢占列表项的焦点， 使得点击操作被视为对EditText和Button的点击（ 无论点击处是否落在EditText和
* Button的范围内） ， 而不是列表项的点击。 解决办法是给列表项布局文件的根节点加上
* descendantFocusability属性， 并声明在列表项范围内剥夺子控件的抢占权利， 具体的属性设置代码如下
* android:descendantFocusability="blocksDescendants"
*  */

public class ListViewActivity extends AppCompatActivity {

    private ListView mListviewlist;
    private ArrayList<CityBeans> citylist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        InitDataList();

        mListviewlist = (ListView) findViewById(R.id.lv_listview);
        AListViewAdapter adapter = new AListViewAdapter(this, citylist, R.layout.base_down_style);
        mListviewlist.setAdapter(adapter);

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