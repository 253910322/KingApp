package com.kingandroid.kingapp.controls;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Gallery;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.Toast;

import com.kingandroid.kingapp.R;
import com.kingandroid.kingapp.adapter.ImageAdapter;

import java.util.ArrayList;

public class GalleryActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{

    private String TAG = "GalleryActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);
        InitImageView();
        IntGallery();
    }

    ArrayList<Integer> list ;
    private void InitImageView()
    {
        list = new ArrayList<>();
        list.add(R.drawable.pic1);
        list.add(R.drawable.pic2);
        list.add(R.drawable.pic3);
        list.add(R.drawable.pic4);
        list.add(R.drawable.pic5);
        list.add(R.drawable.pic6);
        list.add(R.drawable.pic7);
    }

    private void IntGallery(){
        Gallery gallery = (Gallery) findViewById(R.id.gallery1);
        gallery.setAdapter(new ImageAdapter(this, list));
        gallery.setOnItemClickListener(this);
    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(getBaseContext(),"pic" + (position + 1) + " selected", Toast.LENGTH_SHORT).show();
        ImageView imageView = (ImageView) findViewById(R.id.image1);
        int index = list.get(position);
        imageView.setImageResource(index);

    }
}