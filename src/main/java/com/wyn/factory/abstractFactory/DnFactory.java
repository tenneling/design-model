package com.wyn.factory.abstractFactory;

/**
 * @ClassName DnFactory
 * @Description 低档汽车工厂
 * @Author WENYANNI
 * @Date 2021/10/24 下午8:00
 **/
public class DnFactory extends AbstractFactory{
    @Override
    public ICar createCar() {
        return new DnCar();
    }

    @Override
    public IBus createBus() {
        return new DnBus();
    }
}
