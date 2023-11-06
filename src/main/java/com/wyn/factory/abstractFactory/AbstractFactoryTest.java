package com.wyn.factory.abstractFactory;

import com.wyn.factory.abstractFactory.AbstractFactory;
import com.wyn.factory.abstractFactory.ICar;
import com.wyn.factory.abstractFactory.UpFactory;

/**
 * @ClassName AbstractFactoryTest
 * @Description 抽象工厂测试类
 * @Author WENYANNI
 * @Date 2021/10/24 下午8:03
 **/
public class AbstractFactoryTest {

    /**
     * 定制抽象产品接口
     * 定制具体产品子类
     * 定制抽象工厂类(或接口)，有两个或多个具体的create()抽象方法
     * 定制具体的工厂子类，其中每个工厂类需重写方法
     **/

    public static void main(String[] args) {
        //多态创建高档工厂
        AbstractFactory obj = new UpFactory();
        //获得高档工厂中的小汽车对象
        ICar car = obj.createCar();
        IBus bus = obj.createBus();
    }
}
