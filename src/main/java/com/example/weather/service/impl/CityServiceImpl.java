package com.example.weather.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.weather.entity.CityEntity;
import com.example.weather.entity.CityTemperature;
import com.example.weather.mapper.CityMapper;
import com.example.weather.service.CityService;
import com.example.weather.utils.ChangeWord;
import com.example.weather.utils.ParseHtml;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service("cityService")
public class CityServiceImpl extends ServiceImpl<CityMapper, CityEntity> implements CityService {


    @Override
    public List<CityEntity> queryList() {
        return this.list(new QueryWrapper<>());
    }

    /**
     * 要查找的实时数据
     * @param listCity 城市集合
     * @return
     */
    @Override
    public List<CityTemperature> temperatureList(List<CityEntity> listCity) {
        List<CityTemperature> listResult = new ArrayList<>();
        for (CityEntity item : listCity) {
            CityTemperature city = new CityTemperature();
            city.setCity(item.getCityName());
            city.setTemperature(ParseHtml.parseHtmlToday(ChangeWord.toPinyin(item.getCityName())));
            listResult.add(city);
        }
        return listResult;
    }

    /**
     * 增加一个城市
     * @param city 传入城市名字
     */
    @Override
    public void addCity(String city) {
        QueryWrapper<CityEntity> wrapper = new QueryWrapper<>();
        wrapper.eq("city_name",city);
        Integer integer = baseMapper.selectCount(wrapper);
        if (integer>0){
            return;
        }
        CityEntity cityEntity = new CityEntity();
        cityEntity.setCityName(city);
        this.baseMapper.insert(cityEntity);
    }

    /**
     * 删除一个城市
     * @param city 城市名字
     */
    @Override
    public void deleteCity(String city) {
        QueryWrapper<CityEntity> wrapper = new QueryWrapper<>();
        wrapper.eq("city_name",city);
        this.baseMapper.delete(wrapper);
    }
}