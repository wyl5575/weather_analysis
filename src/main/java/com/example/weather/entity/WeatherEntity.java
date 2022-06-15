package com.example.weather.entity;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * 
 * 
 * @author MeKa
 * @email 1258469854@168.com
 * @date 2022-06-14 14:54:32
 */
@Data
@TableName("weather")
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class WeatherEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id主键
	 */
	@TableId(value = "id", type = IdType.AUTO)
	private Long id;

	private String address;

	/**
	 * 天气状况
	 */
	private String weatherCondition;
	/**
	 * 最低气温
	 */
	private String min;
	/**
	 * 最高气温
	 */
	private String max;
	/**
	 *
	 */
	private Date date;

	@TableField(exist = false)
	private String dateTime;
	/**
	 *
	 */
	@TableField(fill = FieldFill.INSERT)
	private Date createTime;
	/**
	 *
	 */
	@TableField(fill = FieldFill.INSERT_UPDATE)
	private Date updateTime;

}
