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

    @RequestMapping("/list")
    public R listInfoCity(){
        List<CityEntity> listCity = cityService.queryList();
        return R.ok().put("list",listCity);
    }

    @RequestMapping("/list/temperature")
    public R listInfoTemperature(@RequestBody List<CityEntity> listCity){
        List<CityTemperature> list = cityService.temperatureList(listCity);
        return R.ok().put("list",list);
    }

    @RequestMapping("/add/{city}")
    public R addCity(@PathVariable("city") String city){
        cityService.addCity(city);
        return R.ok();
    }

    @RequestMapping("/delete/{city}")
    public R deleteCity(@PathVariable("city") String city){
        cityService.deleteCity(city);
        return R.ok();
    }

    /**
     * 列表
     */
//    @RequestMapping("/list")
//    public R list(@RequestParam Map<String, Object> params){
//        PageUtils page = cityService.queryPage(params);
//        return R.ok().put("page", page);
//    }
//
//
//    /**
//     * 信息
//     */
//    @RequestMapping("/info/{id}")
//    //@RequiresPermissions("ware:city:info")
//    public R info(@PathVariable("id") Long id){
//		CityEntity city = cityService.getById(id);
//
//        return R.ok().put("city", city);
//    }
//
//    /**
//     * 保存
//     */
//    @RequestMapping("/save")
//    //@RequiresPermissions("ware:city:save")
//    public R save(@RequestBody CityEntity city){
//		cityService.save(city);
//        return R.ok();
//    }




}
