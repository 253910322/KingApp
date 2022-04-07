package com.kingandroid.utils;

import android.content.Context;
import android.graphics.Point;
import android.view.WindowManager;

public class ScreenSizeUtils {
    public static void getScreenSize(Context context, Point Point) {
        WindowManager vm = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        vm.getDefaultDisplay().getRealSize(Point);
    }
}
