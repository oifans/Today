package com.lb.today.entity;

import cn.bmob.v3.BmobObject;

/**
 * Created by lb on 16-1-17.
 * 一天的实体类
 */
public class OneDay extends BmobObject{

    private String title;   //标题
    private String content; //详细内容
    private Integer year;   //年
    private Integer month;  //月
    private Integer day;    //日

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public Integer getDay() {
        return day;
    }

    public void setDay(Integer day) {
        this.day = day;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
