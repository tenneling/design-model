package com.wyn.factory.factoryExampleT;

/**
 * @ClassName TextFactory
 * @Description 解析文本文件的工厂
 * @Author WENYANNI
 * @Date 2021/10/26 上午12:18
 **/
public class TextFactory extends AbstractFactory{
    @Override
    public IRead create() {
        return new TextRead();
    }
}
