package com.wyn.factory.factory;

import com.wyn.factory.factory.ICar;

/**
 * @ClassName FactoryTest
 * @Description 工厂模式测试类
 * @Author WENYANNI
 * @Date 2021/10/24 下午7:41
 **/
public class FactoryTest {

    /**
     * 定制抽象产品接口
     * 定制具体产品子类
     * 定制抽象工厂类，有具体的create()抽象方法
     * 定制具体的工厂子类
     **/

    /**
     * 简单工厂：CarSimpleFactory
     * 工厂：抽象工厂层AbstractFactory + 具体工厂子类层UpFactory、MidFactory、DnFactory
     **/

    public static void main(String[] args) {
        //多态创建高档工厂
        AbstractFactory obj = new UpFactory();
        //获得高档工厂中的小汽车对象
        ICar car = obj.create();
    }
}
