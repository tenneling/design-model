package com.wyn.templateMethod;

/**
 * @ClassName Algo
 * @Description 具体算法，泛型方法类
 * @Author WENYANNI
 * @Date 2021/11/20 上午10:39
 **/
public class Algo<T>{
    public T getMax(T t[],ILess<T> cmp){
        T maxValue = t[0];
        for (int i = 0;i<t.length;i++){
            if (cmp.less(maxValue,t[i])){
                maxValue = t[i];
            }
        }
        return maxValue;
    }
}