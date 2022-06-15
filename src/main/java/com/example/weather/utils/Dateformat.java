package com.example.weather.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Dateformat {

    /**
     * 日期格式 去掉 时分秒
     * @param date
     * @return
     */
    public static Date  dateformat(Date date){
        Date parse = null;
        try {
            SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
            parse = sf.parse(sf.format(date));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return parse;
    }

    /**
     * 日期变为字符串
     * @param date
     * @return
     */
    public static String dateToString(Date date){
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
        String str = sf.format(date);
        return str;
    }
}
