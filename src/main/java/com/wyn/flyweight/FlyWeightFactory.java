package com.wyn.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName FlyWeightFactory
 * @Description 享元工厂，负责创建和管理享元角色，必须保证享元对象可以被系统适当的共享
 * @Author WENYANNI
 * @Date 2021/11/21 上午9:10
 **/
public class FlyWeightFactory {
    private FlyWeightFactory(){

    }

    private static FlyWeightFactory factory = new FlyWeightFactory();

    private Map<String,IFlyWeight> map = new HashMap<>();

    public synchronized static FlyWeightFactory getInstance(){
        return factory;
    }

    public void addFlyWeight(String key,IFlyWeight fly){
        map.put(key,fly);
    }

    public synchronized IFlyWeight getFlyWeight(String key){
        IFlyWeight flyWeight = map.get(key);
        return  flyWeight;
    }
}
