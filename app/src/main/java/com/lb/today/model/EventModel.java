package com.lb.today.model;

import android.app.Activity;
import android.content.Context;
import android.widget.Toast;

import com.lb.today.R;
import com.lb.today.entity.Event;
import com.lb.today.util.NavigationUtil;

import cn.bmob.v3.BmobQuery;
import cn.bmob.v3.listener.FindListener;
import cn.bmob.v3.listener.SaveListener;

/**
 * Created by lb on 16-1-17.
 * Event模型类 进行Event相关的逻辑操作
 */
public class EventModel {
    private Event event;

    /**
     * 添加
     *
     * @param event
     */
    public static void addEvent(final Context context , Event event) {
        event.save(context, new SaveListener() {
            @Override
            public void onSuccess() {
                Toast.makeText(context, context.getString(R.string.add_success), Toast.LENGTH_SHORT).show();
                NavigationUtil.toMain(context);
                if(context instanceof Activity){
                    ((Activity) context).finish();
                }
            }

            @Override
            public void onFailure(int i, String s) {
                Toast.makeText(context,
                        context.getString(R.string.add_failed) + ":" + s, Toast.LENGTH_SHORT).show();
            }
        });
    }

    /**
     * 通过年月日查询某天的事件
     *
     * @param year
     * @param month
     * @param day
     */
    public static void findByDate(final Context context,int year, int month, int day, FindListener<Event> listener) {
        BmobQuery<Event> query = new BmobQuery<Event>();
        query.addWhereEqualTo("year", year);
        query.addWhereEqualTo("month", month);
        query.addWhereEqualTo("day", day);

        query.findObjects(context, listener);
    }

    /**
     * 通过月日查询某天的事件
     *
     * @param month
     * @param day
     */
    public static void findByDate(final Context context,int month, int day, FindListener<Event> listener) {
        BmobQuery<Event> query = new BmobQuery<Event>();
        query.addWhereEqualTo("month", month);
        query.addWhereEqualTo("day", day);

        query.findObjects(context, listener);
    }

}
