package com.wyn.factory.factory;

import com.wyn.factory.factory.DnCar;
import com.wyn.factory.factory.ICar;

/**
 * @ClassName DnFactory
 * @Description 低档小汽车工厂
 * @Author WENYANNI
 * @Date 2021/10/24 下午7:40
 **/
public class DnFactory extends AbstractFactory{
    @Override
    public ICar create() {
        return new DnCar();
    }
}
