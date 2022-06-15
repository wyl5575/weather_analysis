package com.example.weather.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.weather.entity.WeatherEntity;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * 
 *
 * @author MeKa
 * @email 1258469854@168.com
 * @date 2022-06-14 14:54:32
 */
public interface WeatherService extends IService<WeatherEntity> {

    void insertOrUpdateData(String address,List<WeatherEntity> list);

    /**查找几天的数据数据*/
    List<WeatherEntity> selectList(String address,Date date, int day);

    void search(String address);
}

