package com.luck.picture.lib.utils;

import android.content.Context;
import android.util.DisplayMetrics;

import com.luck.picture.lib.app.PictureAppMaster;

public class DisplayUtil {
    public static int getDisplayWidth() {
        Context appContext = PictureAppMaster.getInstance().getAppContext();
        DisplayMetrics metrics = appContext.getResources().getDisplayMetrics();
        return metrics.widthPixels;
    }
}
