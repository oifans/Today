package com.lb.today.util;

import java.util.Calendar;

/**
 * Created by lb on 16-1-18.
 * 时间日期的工具类
 */
public class TimeUtil {

    /**
     * 得到当前年
     *
     * @return 当前年
     */
    public static int getYear() {
        Calendar calendar = Calendar.getInstance();
        return calendar.get(Calendar.YEAR);
    }

    /**
     * 得到当前月
     *
     * @return 当前月
     */
    public static int getMonth() {
        Calendar calendar = Calendar.getInstance();
        return calendar.get(Calendar.MONTH) + 1;
    }

    /**
     * 得到当前日
     *
     * @return 当前日
     */
    public static int getDay() {
        Calendar calendar = Calendar.getInstance();
        return calendar.get(Calendar.DAY_OF_MONTH);
    }

}
