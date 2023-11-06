package com.wyn.policy;

/**
 * @ClassName DivCalc
 * @Description 除法计算
 * @Author WENYANNI
 * @Date 2021/11/14 下午8:11
 **/
public class DivCalc implements ICalc{
    @Override
    public int calc(int a, int b) {
        return a/b;
    }
}
