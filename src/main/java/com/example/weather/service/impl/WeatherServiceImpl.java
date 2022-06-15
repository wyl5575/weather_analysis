package com.example.weather.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.weather.entity.WeatherEntity;
import com.example.weather.mapper.WeatherMapper;
import com.example.weather.service.WeatherService;
import com.example.weather.utils.AddDay;
import com.example.weather.utils.ChangeWord;
import com.example.weather.utils.Dateformat;
import com.example.weather.utils.ParseHtml;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;


@Service("weatherService")
public class WeatherServiceImpl extends ServiceImpl<WeatherMapper, WeatherEntity> implements WeatherService {




    /**对数据进行筛选 对没有的数据进行插入 已经有的数据进行更新*/
    @Override
    public void insertOrUpdateData(String address,List<WeatherEntity> list) {
        List<WeatherEntity> listAll = selectList(address, Dateformat.dateformat(new Date()), 40);
        List<WeatherEntity> listAdd = new ArrayList<>();
        List<WeatherEntity> listUpdate = new ArrayList<>();
        list.forEach(item->{
            AtomicBoolean flag = new AtomicBoolean(false);
            listAll.forEach(it->{
                if(item.getAddress().equals(it.getAddress()) && item.getDate().equals(it.getDate())){
                    flag.set(true);
                }
            });
            if(flag.get()){
                listUpdate.add(item);
            }else {
                listAdd.add(item);
            }
        });
        if (listAdd.size()>0){
            this.saveBatch(listAdd);
        }
        if (listUpdate.size()>0){
            this.updateBatchById(listUpdate);
        }

    }

    /**查找数据*/
    @Override
    public List<WeatherEntity> selectList(String address,Date date, int day) {
        QueryWrapper<WeatherEntity> wrapper = new QueryWrapper<>();
        wrapper.between("date",date, AddDay.addOneDay(date,day-1));
        wrapper.eq("address",address);
        List<WeatherEntity> list = this.list(wrapper);
        list.forEach((item)->{
            item.setDateTime(Dateformat.dateToString(item.getDate()));
        });
        return list;
    }

    @Override
    public void search(String address) {
        List list = ParseHtml.parseHtml(address, 30);
//        list.forEach(System.out::println);
//        System.out.println("+++++");
        insertOrUpdateData(address,list);
    }
}