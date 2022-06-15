package com.example.weather.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class CityTemperature implements Serializable {

    private static final long serialVersionUID = 1L;

    private String city;

    private String temperature;

}
