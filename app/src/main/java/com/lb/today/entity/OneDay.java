package com.lb.today.entity;

import cn.bmob.v3.BmobObject;
import cn.bmob.v3.datatype.BmobDate;

/**
 * Created by lb on 16-1-17.
 * 一天的实体类
 */
public class OneDay extends BmobObject{
    //标题
    private String title;
    private BmobDate date;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
