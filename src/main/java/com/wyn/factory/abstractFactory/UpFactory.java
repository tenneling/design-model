package com.wyn.factory.abstractFactory;

/**
 * @ClassName UpFactory
 * @Description 高档汽车工厂
 * @Author WENYANNI
 * @Date 2021/10/24 下午8:00
 **/
public class UpFactory extends AbstractFactory{
    @Override
    public ICar createCar() {
        return new UpCar();
    }

    @Override
    public IBus createBus() {
        return new UpBus();
    }
}
