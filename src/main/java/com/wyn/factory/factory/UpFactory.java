package com.wyn.factory.factory;

/**
 * @ClassName UpFactory
 * @Description 高档小汽车工厂
 * @Author WENYANNI
 * @Date 2021/10/24 下午7:37
 **/
public class UpFactory extends AbstractFactory{
    @Override
    public ICar create() {
        return new UpCar();
    }
}
