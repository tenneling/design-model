package com.wyn.policy;

/**
 * @ClassName MulCalc
 * @Description 乘法计算
 * @Author WENYANNI
 * @Date 2021/11/14 下午8:10
 **/
public class MulCalc implements ICalc{
    @Override
    public int calc(int a, int b) {
        return a*b;
    }
}
