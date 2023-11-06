package com.wyn.factory.factoryExample;

/**
 * @ClassName Utf8Factory
 * @Description Utf8具体工厂实现类
 * @Author WENYANNI
 * @Date 2021/10/24 下午8:26
 **/
public class Utf8Factory extends AbstractFactory{
    @Override
    public IRead create() {
        return new UnicodeFileRead();
    }
}
