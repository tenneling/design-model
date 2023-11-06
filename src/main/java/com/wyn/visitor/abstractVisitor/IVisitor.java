package com.wyn.visitor.abstractVisitor;

/**
 * @InterfaceName IVisitor
 * @Description 抽象访问者接口
 * @Author WENYANNI
 * @Date 2021/10/31 下午7:58
 **/
public interface IVisitor {
    void visit(IElement obj);
}
