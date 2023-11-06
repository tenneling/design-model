package com.wyn.factory.abstractFactory;


/**
 * @ClassName AbstractFactory
 * @Description 抽象工厂类
 * @Author WENYANNI
 * @Date 2021/10/24 下午7:36
 **/
public abstract class AbstractFactory {
    //生产小汽车
    public abstract ICar createCar();
    //生产公共汽车
    public abstract IBus createBus();
}
