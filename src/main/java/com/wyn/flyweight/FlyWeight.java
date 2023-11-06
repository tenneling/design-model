package com.wyn.flyweight;

/**
 * @ClassName FlyWeight
 * @Description 具体享元类，实现抽象享元角色所定义的接口方法
 * @Author WENYANNI
 * @Date 2021/11/21 上午9:04
 **/
public class FlyWeight implements IFlyWeight{
    private String university;
    private String province;
    private String city;

    public FlyWeight(String university,String province,String city){
        this.university = university;
        this.province = province;
        this.city = city;
    }

    @Override
    public String getUniversity() {
        return university;
    }

    @Override
    public String getCity() {
        return city;
    }

    @Override
    public String getProvince() {
        return province;
    }
}
