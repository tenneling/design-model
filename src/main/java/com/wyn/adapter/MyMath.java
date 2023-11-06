package com.wyn.adapter;

/**
 * @ClassName MyMath
 * @Description 对象适配器，使新定义的接口IMath适配原有方法。内部包含第三方软件成员变量，重写IHopeInterface接口定义的方法，在内部直接调用第三方软件方法实现我们所需功能
 * @Author WENYANNI
 * @Date 2021/11/21 上午11:22
 **/
public class MyMath implements IMath{
    ThirdCompany thirdCompany;

    MyMath(ThirdCompany thirdCompany){
        this.thirdCompany = thirdCompany;
    }

    @Override
    public int add(int a, int b) {
        return thirdCompany.addCalc(a,b);
    }
}
