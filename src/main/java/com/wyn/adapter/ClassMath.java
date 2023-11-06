package com.wyn.adapter;

/**
 * @ClassName ClassMath
 * @Description 类适配器，从第三方软件类派生
 * @Author WENYANNI
 * @Date 2021/11/21 上午11:54
 **/
public class ClassMath extends ThirdCompany implements IMath{
    @Override
    public int add(int a, int b) {
        return addCalc(a,b);
    }
}
