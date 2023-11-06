package com.wyn.visitor;

/**
 * @ClassName VisitorTest
 * @Description 请描述类的业务用途
 * @Author WENYANNI
 * @Date 2021/10/31 下午7:14
 **/
public class VisitorTest {
    public static void main(String[] args) {
        //定义具体访问者对象
        CenterVisitor centerVisitor = new CenterVisitor();

        //定义三角形对象
        Triangle triangle = new Triangle(0,0,2,0,0,2);

        //通过访问者对象访问三角形重心坐标
        Point point = (Point) centerVisitor.visit(triangle);
        System.out.println(point);
    }
}
