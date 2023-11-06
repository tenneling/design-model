package com.wyn.templateMethod;

/**
 * @ClassName IntLess
 * @Description 整数计算器
 * @Author WENYANNI
 * @Date 2021/11/20 上午10:57
 **/
public class IntLess implements ILess<Integer>{
    @Override
    public boolean less(Integer x, Integer y) {
        return x<y;
    }
}
