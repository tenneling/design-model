package com.wyn.policy;

/**
 * @ClassName MinusCalc
 * @Description 减法计算 具体策略类，实现了Strategy定义的各抽象接口方法
 * @Author WENYANNI
 * @Date 2021/11/14 下午8:09
 **/
public class MinusCalc implements ICalc{
    @Override
    public int calc(int a, int b) {
        return a-b;
    }
}
