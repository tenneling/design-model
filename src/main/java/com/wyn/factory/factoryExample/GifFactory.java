package com.wyn.factory.factoryExample;

/**
 * @ClassName GifFactory
 * @Description Gif具体工厂实现类
 * @Author WENYANNI
 * @Date 2021/10/24 下午8:26
 **/
public class GifFactory extends AbstractFactory{
    @Override
    public IRead create() {
        return new GifImgRead();
    }
}
