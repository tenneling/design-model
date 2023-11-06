package com.wyn.status;

/**
 * @ClassName ConcreteStatusA
 * @Description 具体状态实现类A:具体实现状态处理的类
 * @Author WENYANNI
 * @Date 2021/11/14 下午5:34
 **/
public class ConcreteStatusA implements IStatus{
    @Override
    public void changeStatus() {
        System.out.println("This is ConcreteStatusA");
    }
}
