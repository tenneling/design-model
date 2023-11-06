package com.wyn.factory.factory;

/**
 * @ClassName MidFactory
 * @Description 中档小汽车工厂
 * @Author WENYANNI
 * @Date 2021/10/24 下午7:38
 **/
public class MidFactory extends AbstractFactory{
    @Override
    public ICar create() {
        return new MidCar();
    }
}
