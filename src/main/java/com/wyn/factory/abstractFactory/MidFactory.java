package com.wyn.factory.abstractFactory;

/**
 * @ClassName MidFactory
 * @Description 中档汽车工厂
 * @Author WENYANNI
 * @Date 2021/10/24 下午8:00
 **/
public class MidFactory extends AbstractFactory{
    @Override
    public ICar createCar() {
        return new MidCar();
    }

    @Override
    public IBus createBus() {
        return new MidBus();
    }
}
