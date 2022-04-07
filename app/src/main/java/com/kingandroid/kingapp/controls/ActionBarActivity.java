package com.kingandroid.kingapp.controls;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.widget.Toast;

import com.kingandroid.kingapp.R;

public class ActionBarActivity extends AppCompatActivity {

    private ActionBar mActionBar;
    private String TAG = "ActionBarActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_action_bar);
        mActionBar = getSupportActionBar();
        mActionBar.setDisplayHomeAsUpEnabled(true);
        mActionBar.hide();
        mActionBar.show();
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        return MenuChoice(item);
    }

    private void CreateMenu(Menu item) {
        SubMenu subMenu = item.addSubMenu(0, 1, 1, "菜单1");
        subMenu.setIcon(R.drawable.tuxing);
        MenuItem chil1 = subMenu.add(0,11,1,"子菜单1");
        chil1.setIcon(R.drawable.tuxing);
        MenuItem chil2 = subMenu.add(0,12,2,"子菜单2");
        chil2.setIcon(R.drawable.tuxing);

        MenuItem chil3 = subMenu.add(0,13,3,"子菜单3");
        chil3.setIcon(R.drawable.tuxing);

        SubMenu sigsubMenu =  subMenu.addSubMenu(0,14,4,"孙菜单");

        MenuItem sun1 = sigsubMenu.add(1,21,1,"孙菜单1");
        MenuItem sun2 = sigsubMenu.add(1,22,2,"孙菜单2");

        MenuItem item1 = item.add(2,32,1,"菜单2");
    }

    private boolean MenuChoice(MenuItem item) {
        switch (item.getItemId())
        {
            case android.R.id.home:
                Toast.makeText(this, "点击了应用程序的按钮", Toast.LENGTH_LONG).show();
                Intent i = new Intent(this, this.getClass());
                i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(i);
                return true;
            case 11:
                Toast.makeText(this, "你点击了子菜单1", Toast.LENGTH_LONG).show();
                return true;
            case 12:
                Toast.makeText(this, "你点击了子菜单2", Toast.LENGTH_LONG).show();
                return true;
            case 13:
                Toast.makeText(this, "你点击了子菜单3", Toast.LENGTH_LONG).show();
                return true;
            case 14:
                Toast.makeText(this, "你点击了孙菜单", Toast.LENGTH_LONG).show();
                return true;
            case 21:
                Toast.makeText(this, "你点击了孙菜单1", Toast.LENGTH_LONG).show();
                return true;
            case 22:
                Toast.makeText(this, "你点击了孙菜单2", Toast.LENGTH_LONG).show();
                return true;
            case 32:
                Toast.makeText(this, "你点击了菜单2", Toast.LENGTH_LONG).show();
                return true;
        }
        return false;


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        CreateMenu(menu);
        return true;
    }


}