package com.example.weather.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.weather.entity.WeatherEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * 
 * @author MeKa
 * @email 1258469854@168.com
 * @date 2022-06-14 14:54:32
 */
@Mapper
public interface WeatherMapper extends BaseMapper<WeatherEntity> {
	
}
