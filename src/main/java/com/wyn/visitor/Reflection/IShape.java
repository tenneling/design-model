package com.wyn.visitor.Reflection;

/**
 * @InterfaceName IShape
 * @Description 抽象需求分析接口 IElement 抽象的事物元素功能接口，定义了固定功能方法及可变功能方法
 * @Author WENYANNI
 * @Date 2021/10/31 下午6:51
 **/
public interface IShape {
    float getArea();
    float getLength();

    //可扩展的需求分析方法
    Object accept(IVisitor v,String method);
}
