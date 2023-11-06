package com.wyn.visitor.Reflection;

/**
 * @ClassName ReflectionVisitorTest
 * @Description 反射方法的访问者模式
 * @Author WENYANNI
 * @Date 2021/10/31 下午7:44
 **/
public class ReflectionVisitorTest {
    public static void main(String[] args) {
        ShapeVisitor shapeVisitor = new ShapeVisitor();
        Triangle triangle = new Triangle(0,0,2,0,0,2);

        //方法1
        Object pt = triangle.accept(shapeVisitor,"getCenter");
        System.out.println(pt);

        //方法2
        float fl = (float) triangle.accept(shapeVisitor,"getInnerCircleR");
        System.out.println(fl);
    }
}
