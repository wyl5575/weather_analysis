package com.example.weather.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.weather.entity.CityEntity;
import com.example.weather.entity.CityTemperature;

import java.util.List;
import java.util.Map;

/**
 * 
 *
 * @author MeKa
 * @email 1258469854@168.com
 * @date 2022-06-15 09:18:22
 */
public interface CityService extends IService<CityEntity> {

    /**查询城市列表*/
    List<CityEntity> queryList();

    List<CityTemperature> temperatureList(List<CityEntity> listCity);

    void addCity(String city);

    void deleteCity(String city);
}

