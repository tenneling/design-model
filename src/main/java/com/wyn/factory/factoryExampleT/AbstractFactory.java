package com.wyn.factory.factoryExampleT;

/**
 * @ClassName AbstractFactory
 * @Description 抽象工厂类
 * @Author WENYANNI
 * @Date 2021/10/24 下午8:26
 **/
public abstract class AbstractFactory {
    public abstract IRead create();

    static AbstractFactory create(String className){
        AbstractFactory factory = null;
        try {
            Class c = Class.forName(className);
            factory = (AbstractFactory)c.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return factory;
    }
}
