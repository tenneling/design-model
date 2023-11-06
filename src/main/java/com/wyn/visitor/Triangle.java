package com.wyn.visitor;

/**
 * @ClassName Triangle
 * @Description 三角形类 Element 具体功能的实现类
 * @Author WENYANNI
 * @Date 2021/10/31 下午6:57
 **/
public class Triangle implements IShape{

    float x1,x2,x3,y1,y2,y3;

    public Triangle(float x1,float x2,float x3,float y1,float y2,float y3){
        this.x1=x1;
        this.x2 = x2;
        this.x3 = x3;
        this.y1 = y1;
        this.y2 = y2;
    }

    //两点距离
    public float getDist(float u1,float v1,float u2,float v2){
        return (float) Math.sqrt((u1-u2)*(u1-u2)-(v1-v2)*(v1-v2));
    }

    @Override
    public float getArea() {
        //海伦公式求面积
        return 0;
    }

    @Override
    public float getLength() {
        //求周长
        return 0;
    }

    @Override
    public Object accept(IVisitor v) {
        return v.visit(this);
    }
}
