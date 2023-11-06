package com.wyn.policy.teacher;

/**
 * @ClassName Context
 * @Description 上下文类
 * @Author WENYANNI
 * @Date 2021/11/20 上午9:56
 **/
public class Context {
    private ISalary iSalary;
    //单位效益
    private float radio;

    public Context(ISalary iSalary,float radio){
        this.iSalary = iSalary;
        this.radio = radio;
    }

    public float calc(int n){
        return iSalary.calc(this,n);
    }

    //用于上文对下文的回调
    public float getRadio() {
        return radio;
    }
}
