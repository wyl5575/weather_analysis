package com.example.weather.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Dateformat {

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

    public static String dateToString(Date date){
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
        String str = sf.format(date);
        return str;
    }
}
