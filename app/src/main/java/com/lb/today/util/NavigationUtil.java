package com.lb.today.util;

import android.content.Context;
import android.content.Intent;

import com.lb.today.entity.Event;
import com.lb.today.ui.AddEventActivity;
import com.lb.today.ui.EventDetialActivity;
import com.lb.today.ui.MainActivity;

/**
 * Created by lb on 16-1-17.
 * 导航类
 */
public class NavigationUtil {
    /**
     * 打开首页
     *
     * @param context
     */
    public static void toMain(Context context) {
        context.startActivity(new Intent(context, MainActivity.class));
    }

    /**
     * 添加一个事件
     * @param context
     */
    public static void toAddEvent(Context context) {
        context.startActivity(new Intent(context, AddEventActivity.class));
    }

    /**
     * 显示一个事件详细
     * @param context
     * @param event 事件
     */
    public static void toEventDetial(Context context, Event event){
        Intent intent = new Intent(context, EventDetialActivity.class);
        intent.putExtra("event",event);
        context.startActivity(intent);
    }
}
