package com.lb.today.util;

import android.content.Context;
import android.content.Intent;

import com.lb.today.ui.MainActivity;

/**
 * Created by lb on 16-1-17.
 */
public class NavigationUtil {
    /**
     * 打开首页
     * @param context
     */
    public static void ToMain(Context context){
        context.startActivity(new Intent(context, MainActivity.class));
    }
}
