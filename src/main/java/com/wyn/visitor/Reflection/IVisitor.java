package com.wyn.visitor.Reflection;

/**
 * @InterfaceName IVisitor
 * @Description 访问者接口 为所有访问者对象声明一个Visit方法，用来代表为对象结构添加的功能，原则上可以代替所有的功能
 * @Author WENYANNI
 * @Date 2021/10/31 下午6:54
 **/
public interface IVisitor {
    Object visit(Triangle triangle,String method);
}
