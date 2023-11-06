package com.wyn.flyweight;

/**
 * @InterfaceName IFlyWeight
 * @Description 抽象享元角色，所有具体享元类的超类，为这些类规定出需要实现的公共接口或抽象方法
 * @Author WENYANNI
 * @Date 2021/11/21 上午9:02
 **/
public interface IFlyWeight {
    String getUniversity();
    String getCity();
    String getProvince();
}
