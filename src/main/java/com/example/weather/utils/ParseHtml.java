package com.example.weather.utils;

import com.example.weather.entity.WeatherEntity;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ParseHtml {

    /**得到 n天的数据*/
    public synchronized static List parseHtml(String address, int day){
        String str = ChangeWord.toPinyin(address);
        //解析url地址
        Document document = null;
        try {
            document = Jsoup.parse(new URL("https://www.tianqi.com/"+str+"/"+day+"/"), 10000);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Elements select = document.getElementsByClass("weaul").select("li");
        int i = 0;
        List<WeatherEntity> list = new ArrayList<>();
        for (Element element : select) {
            String weatherCondition = element.getElementsByClass("weaul_z").eq(0).text();
            String temperature = element.getElementsByClass("weaul_z").eq(1).text();
            WeatherEntity weatherEntity = new WeatherEntity();
            weatherEntity.setAddress(address);
            weatherEntity.setWeatherCondition(weatherCondition);
            weatherEntity.setMin(temperature.split("~")[0]);
            weatherEntity.setMax(temperature.split("~")[1].split("℃")[0]);
            weatherEntity.setDate(AddDay.addOneDay(new Date(),i));
            list.add(weatherEntity);
            i++;
        }
        return list;
    }

    /**得到某地今天气温*/
    public synchronized static String parseHtmlToday(String address){
        //解析url地址
        Document document = null;
        try {
            document = Jsoup.parse(new URL("https://www.tianqi.com/"+address+"/"), 10000);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Elements weatherInfo = document.getElementsByClass("weather_info");
        String text = weatherInfo.select("p").select("b").text();
        return text;
    }


}
