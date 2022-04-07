package com.kingandroid.kingapp.fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.kingandroid.kingapp.R;

public class FragmentManagerActivity extends AppCompatActivity implements View.OnClickListener {


    private static final String TAG = "FragmentManagerActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_manager);


        findViewById(R.id.add_fragment).setOnClickListener(this);
        findViewById(R.id.del_fragment).setOnClickListener(this);


        FragmentManager manager = getSupportFragmentManager();
        Fragment showfragview = manager.findFragmentById(R.id.details_container);
        if (showfragview == null)
        {
            FragmentTransaction ft = manager.beginTransaction();
            ft.add(R.id.details_container, new ShowFragmentView());
            ft.commit();
        }
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.add_fragment)
        {
            FragmentManager manager = getSupportFragmentManager();
            Fragment showfragview = manager.findFragmentById(R.id.ui_container);
            if (showfragview == null)
            {
                FragmentTransaction ft = manager.beginTransaction();
                ft.add(R.id.ui_container, new ShowFragmentView());
                /*
                * 加上这句话之后当我们按下返回键，则返回到添加碎片之前的状态。不会直接退出，需要再次点击返回键才会退出
                * */
                ft.addToBackStack(null);
                ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                ft.commit();
            }
        }
        else if(v.getId() == R.id.del_fragment)
        {
            FragmentManager manager = getSupportFragmentManager();
            Fragment showfragview = manager.findFragmentById(R.id.ui_container);

            if (showfragview != null)
            {

                FragmentTransaction ft = manager.beginTransaction();
                ft.remove(showfragview);
                ft.commit();
            }

        }
    }
}