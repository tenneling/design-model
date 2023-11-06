package com.wyn.visitor.abstractVisitor;

import javax.xml.bind.Element;

/**
 * @ClassName OneVisitor
 * @Description 访问者具体实现子类（引用的具体子类对象—）
 * @Author WENYANNI
 * @Date 2021/10/31 下午8:00
 **/
public class OneVisitor implements IVisitor{
    @Override
    public void visit(IElement obj) {
        if(obj instanceof Element){
            //对应处理代码
        }else{
            //对应处理代码
        }
    }
}
