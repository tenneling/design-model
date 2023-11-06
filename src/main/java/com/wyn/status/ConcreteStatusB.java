package com.wyn.status;

/**
 * @ClassName ConcreteStatusB
 * @Description 具体状态实现类B:具体实现状态处理的类
 * @Author WENYANNI
 * @Date 2021/11/14 下午5:36
 **/
public class ConcreteStatusB implements IStatus{
    @Override
    public void changeStatus() {
        System.out.println("This is ConcreteStatusB");
    }
}
