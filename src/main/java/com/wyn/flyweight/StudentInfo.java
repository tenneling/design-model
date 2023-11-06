package com.wyn.flyweight;

/**
 * @ClassName StudentInfo
 * @Description 请描述类的业务用途
 * @Author WENYANNI
 * @Date 2021/11/21 上午9:33
 **/
public class StudentInfo {
    private String name;
    private int age;
    private IFlyWeight flyWeight;

    StudentInfo(String name,int age,IFlyWeight flyWeight){
        this.name = name;
        this.age = age;
        this.flyWeight = flyWeight;
    }

    public void display(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(flyWeight.getUniversity());
        System.out.println(flyWeight.getProvince());
        System.out.println(flyWeight.getCity());
    }
}
