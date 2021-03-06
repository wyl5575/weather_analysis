package com.example.weather.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class AddDay {
    /**
     * 工具 当前日期的 以及后几天
     * @param date
     * @param day
     * @return
     */
    public static Date addOneDay(Date date, int day) {
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
        Date timeNow = null;
        try {
            timeNow = sf.parse(sf.format(date));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Calendar c = Calendar.getInstance();
        c.setTime(timeNow);
        c.add(Calendar.DAY_OF_MONTH, day);

        return c.getTime();
    }


}
