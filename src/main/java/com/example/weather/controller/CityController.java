package com.example.weather.controller;


import com.example.weather.entity.CityEntity;
import com.example.weather.entity.CityTemperature;
import com.example.weather.service.CityService;
import com.example.weather.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * 
 *
 * @author MeKa
 * @email 1258469854@168.com
 * @date 2022-06-15 09:18:22
 */
@RestController
@RequestMapping("/city")
public class CityController {
    @Autowired
    private CityService cityService;

    /**
     * 查找所有的城市 返回list
     * @return
     */
    @RequestMapping("/list")
    public R listInfoCity(){
        List<CityEntity> listCity = cityService.queryList();
        return R.ok().put("list",listCity);
    }

    /**通过爬虫获取 所选城市的 气温
     * @param listCity
     * @return
     */
    @RequestMapping("/list/temperature")
    public R listInfoTemperature(@RequestBody List<CityEntity> listCity){
        List<CityTemperature> list = cityService.temperatureList(listCity);
        return R.ok().put("list",list);
    }

    /**
     * 增加一个城市
     * @param city
     * @return
     */
    @RequestMapping("/add/{city}")
    public R addCity(@PathVariable("city") String city){
        cityService.addCity(city);
        return R.ok();
    }

    /**
     * 删除一个城市
     * @param city
     * @return
     */
    @RequestMapping("/delete/{city}")
    public R deleteCity(@PathVariable("city") String city){
        cityService.deleteCity(city);
        return R.ok();
    }


}
