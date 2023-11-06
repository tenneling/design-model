package com.wyn.visitor;

/**
 * @ClassName CenterVisitor
 * @Description 重心坐标实现类 Visitor 具体访问者实现类，实现要真正被添加到对象结构中的功能
 * @Author WENYANNI
 * @Date 2021/10/31 下午7:11
 **/
public class CenterVisitor implements IVisitor{
    @Override
    public Object visit(Triangle triangle) {
        Point point = new Point();
        point.x = (triangle.x1+ triangle.x2+ triangle.x3)/3;
        point.y = (triangle.y1+ triangle.y2+ triangle.y3)/3;
        return point;
    }
}
