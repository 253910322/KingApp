package com.kingandroid.kingapp.fragment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.kingandroid.kingapp.R;

public class DialogFragmentExampleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog_fragment_example);
        DialogFragmentShow dialogFragment = DialogFragmentShow.newInstance(
                "Are you sure you want to do this?");
        dialogFragment.show(getSupportFragmentManager(), "dialog");

    }

    public void doPositiveClick() {
        Log.d("DialogFragmentExample", "User clicks on OK");
    }

    public void doNegativeClick() {
        Log.d("DialogFragmentExample", "User clicks on Cancel");
    }

}