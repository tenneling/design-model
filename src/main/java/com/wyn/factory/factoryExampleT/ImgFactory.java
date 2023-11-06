package com.wyn.factory.factoryExampleT;

/**
 * @ClassName ImgFactory
 * @Description 图像文件的解析工厂
 * @Author WENYANNI
 * @Date 2021/10/26 上午12:19
 **/
public class ImgFactory extends AbstractFactory{
    @Override
    public IRead create() {
        return new ImgRead();
    }
}
