package com.wyn.factory.factoryExample;

/**
 * @ClassName JpgFactory
 * @Description Jpg具体工厂实现类
 * @Author WENYANNI
 * @Date 2021/10/24 下午8:26
 **/
public class JpgFactory extends AbstractFactory{
    @Override
    public IRead create() {
        return new JpgImgRead();
    }
}
