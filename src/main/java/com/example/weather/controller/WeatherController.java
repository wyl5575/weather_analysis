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
    @RequestMapping("/info/{address}/{day}")
    public R list(@PathVariable("address") String address, @PathVariable("day") int day){
        List<WeatherEntity> list = weatherService.selectList(address, Dateformat.dateformat(new Date()), day);
        return R.ok().put("list", list);
    }

    @RequestMapping("/search/{address}")
    public R search(@PathVariable("address") String address){
        weatherService.search(address);
        return R.ok().put("data", "ok");
    }

    @RequestMapping("/hello")
    public R kkkk(){
        return R.ok().put("data", 55);
    }

    /**
     * 列表
     */
//    @RequestMapping("/list")
//    //@RequiresPermissions("ware:weather:list")
//    public R list(@RequestParam Map<String, Object> params){
//        PageUtils page = weatherService.queryPage(params);
//        return R.ok().put("page", page);
//    }




//
//    /**
//     * 修改
//     */
//    @RequestMapping("/update")
//    //@RequiresPermissions("ware:weather:update")
//    public R update(@RequestBody WeatherEntity weather){
//		weatherService.updateById(weather);
//
//        return R.ok();
//    }
//

}
