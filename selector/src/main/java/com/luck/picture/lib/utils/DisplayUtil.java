package com.luck.picture.lib.utils;

import android.content.Context;
import android.util.DisplayMetrics;

public class DisplayUtil {
    public static int getDisplayWidth(Context context) {
        DisplayMetrics metrics = context.getResources().getDisplayMetrics();
        return metrics.widthPixels;
    }
}
