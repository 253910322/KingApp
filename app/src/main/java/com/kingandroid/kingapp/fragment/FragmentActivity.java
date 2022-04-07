package com.kingandroid.kingapp.fragment;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kingandroid.kingapp.R;

public class FragmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);
    }





    public static class KFragmentFirst extends Fragment
    {
        private String TAG = "KFragmentFirst";

        @Override
        public void onAttach(@NonNull Context context) {
            super.onAttach(context);
            Log.d(TAG, "onAttach: Fragment被连接到父Activity上");
        }

        @Override
        public void onCreate(@Nullable Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            Log.d(TAG, "onCreate: Fragment被创建");
        }

        @Override
        public View onCreateView(LayoutInflater inflater,
                                 ViewGroup container,
                                 Bundle savedInstanceState) {
            Log.d(TAG, "onCreateView: Fragment已经创建了，这里要创建Fragment内部显示的View");
            return inflater.inflate(R.layout.fragment_show_style, container, false);
        }

        @Override
        public void onActivityCreated(@Nullable Bundle savedInstanceState) {
            super.onActivityCreated(savedInstanceState);
            Log.d(TAG, "onActivityCreated: 父Activity和Fragment已经被创建成功");
        }

        @Override
        public void onStart() {
            super.onStart();
            Log.d(TAG, "onStart: Fragment的生命周期开始，Fragment变为可见");
        }

        @Override
        public void onResume() {
            super.onResume();
            Log.d(TAG, "onResume: Fragment的声明周期变为可交互");
        }

        @Override
        public void onPause() {
            super.onPause();
            Log.d(TAG, "onPause: Fragment的生命周期变为暂停");
        }

        @Override
        public void onSaveInstanceState(@NonNull Bundle outState) {
            super.onSaveInstanceState(outState);
            Log.d(TAG, "onSaveInstanceState: Fragment的生命周期结束，需要保存Fragment中的状态变化");
        }

        @Override
        public void onStop() {
            super.onStop();
            Log.d(TAG, "onStop: Fragment声明周期变为Stop");
        }

        @Override
        public void onDestroyView() {
            super.onDestroyView();
            Log.d(TAG, "onDestroyView: Fragment结束需要清理View相关资源");
        }

        @Override
        public void onDestroy() {
            super.onDestroy();
            Log.d(TAG, "onDestroy: Fragment的声明周期结束需要清理资源");
        }

        @Override
        public void onDetach() {
            super.onDetach();
            Log.d(TAG, "onDetach: Fragment从他的父Acticity中分离 ");
        }


    }
}