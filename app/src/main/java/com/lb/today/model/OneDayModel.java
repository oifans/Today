package com.lb.today.model;

import android.content.Context;

import com.lb.today.entity.OneDay;

import cn.bmob.v3.listener.SaveListener;

/**
 * Created by lb on 16-1-17.
 * OneDay模型类 进行OneDay相关的逻辑操作
 */
public class OneDayModel {
    private OneDay oneDay;
    private Context mContext;

    public OneDayModel(Context mContext) {
        this.mContext = mContext;
    }

    public OneDayModel(OneDay oneDay) {

        this.oneDay = oneDay;
    }

    public void save(OneDay oneDay){
        oneDay.save(mContext, new SaveListener() {
            @Override
            public void onSuccess() {
            }

            @Override
            public void onFailure(int i, String s) {

            }
        });
    }
}
