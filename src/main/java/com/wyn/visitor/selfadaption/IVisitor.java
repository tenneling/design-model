package com.wyn.visitor.selfadaption;

/**
 * @InterfaceName IVisitor
 * @Description 泛型访问者接口
 * @Author WENYANNI
 * @Date 2021/10/31 下午8:04
 **/
public interface IVisitor<T> {
    void visit(T s);
}
