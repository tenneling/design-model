package com.wyn.templateMethod.shape;

/**
 * @ClassName AbstractShape
 * @Description 流程模板:抽象类，用来定义算法骨架和原语操作，来实现算法的各个步骤
 * @Author WENYANNI
 * @Date 2021/11/20 下午1:08
 **/
public abstract class AbstractShape {
    public double process(){
        input();
        double value = getArea();
        return value;
    }

    public abstract void input();
    public abstract double getArea();
}
