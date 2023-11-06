package com.wyn.templateMethod.shape;

import java.util.Scanner;

/**
 * @ClassName Circle
 * @Description 用来实现算法骨架中的某些步骤，完成与特定子类相关的功能
 * @Author WENYANNI
 * @Date 2021/11/20 下午1:16
 **/
public class Circle extends AbstractShape{

    double r;
    @Override
    public void input() {
        System.out.println("请输入半径：");
        Scanner scanner = new Scanner(System.in);
        r = scanner.nextDouble();
    }

    @Override
    public double getArea() {
        double s = Math.PI*r*r;
        return s;
    }
}
