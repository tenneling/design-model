package com.wyn.policy;

/**
 * @ClassName AddCalc
 * @Description 加法计算
 * @Author WENYANNI
 * @Date 2021/11/14 下午8:08
 **/
public class AddCalc implements ICalc{
    @Override
    public int calc(int a, int b) {
        return a+b;
    }
}
