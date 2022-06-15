package com.example.weather.controller;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import com.example.weather.entity.WeatherEntity;
import com.example.weather.service.WeatherService;
import com.example.weather.utils.Dateformat;
import com.example.weather.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



/**
 * 
 *
 * @author MeKa
 * @email 1258469854@168.com
 * @date 2022-06-14 14:54:32
 */
@RestController
@RequestMapping("/weather")
public class WeatherController {
    @Autowired
    private WeatherService weatherService;


    /**
     * 查询
     */
    /**
     * 查询某地几天 的 温度数据
     * @param address 地点
     * @param day  几天内的温度
     * @return
     */
    @RequestMapping("/info/{address}/{day}")
    public R list(@PathVariable("address") String address, @PathVariable("day") int day){
        List<WeatherEntity> list = weatherService.selectList(address, Dateformat.dateformat(new Date()), day);
        return R.ok().put("list", list);
    }

    /**
     * @param address 某地进行爬虫
     * @return
     */
    @RequestMapping("/search/{address}")
    public R search(@PathVariable("address") String address){
        weatherService.search(address);
        return R.ok().put("data", "ok");
    }

}
