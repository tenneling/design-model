package com.wyn.templateMethod;

/**
 * @InterfaceName ILess
 * @Description 定义二元比较方法
 * @Author WENYANNI
 * @Date 2021/11/20 上午10:37
 **/
public interface ILess<T> {
    boolean less(T x,T y);
}
