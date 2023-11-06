package com.wyn.visitor.abstractVisitor;

/**
 * @InterfaceName IElement
 * @Description 抽象事物接口
 * @Author WENYANNI
 * @Date 2021/10/31 下午7:57
 **/
public interface IElement {
    void accept(IVisitor iVisitor);
}
