package com.wyn.visitor.Reflection;

import java.lang.reflect.Method;

/**
 * @ClassName ShapeVisitor
 * @Description 具体访问者（反射方法）
 * @Author WENYANNI
 * @Date 2021/10/31 下午7:36
 **/
public class ShapeVisitor implements IVisitor{

    //方法1
    public Object getCenter(Triangle triangle){
        return triangle;
    }
    //方法2
    public float getInnerCircleR(Triangle triangle){
        return 1;
    }

    @Override
    public Object visit(Triangle triangle, String method) {
        //访问者接口转发方法
        Object obj = null;
        try{
            Class classInfo = this.getClass();
            Method md = classInfo.getMethod(method,Triangle.class);
            obj = md.invoke(new Object[]{triangle});
        }catch (Exception e){
            e.printStackTrace();
        }

        return obj;
    }
}
