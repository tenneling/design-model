package com.wyn.flyweight;

/**
 * @ClassName FlyWeightTest
 * @Description 享元模式测试类
 * @Author WENYANNI
 * @Date 2021/11/21 上午9:38
 **/
public class FlyWeightTest {
    public static void main(String[] args) {
        FlyWeightFactory factory = FlyWeightFactory.getInstance();

        IFlyWeight flyWeightOne = new FlyWeight("SHENZHEN","SHENZHEN","FUTIAN");
        IFlyWeight flyWeightTwo = new FlyWeight("SICHUAN","CHENGDU","CHUANCHUAN");
        factory.addFlyWeight("one",flyWeightOne);
        factory.addFlyWeight("two",flyWeightTwo);

        IFlyWeight obj = factory.getFlyWeight("one");
        StudentInfo studentInfoOne = new StudentInfo("tubby",24,obj);
        obj = factory.getFlyWeight("two");
        StudentInfo studentInfoTwo = new StudentInfo("bella",18,obj);

        studentInfoOne.display();
        studentInfoTwo.display();
    }
}
