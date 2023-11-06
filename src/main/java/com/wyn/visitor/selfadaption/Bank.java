package com.wyn.visitor.selfadaption;

/**
 * @ClassName Bank
 * @Description 抽象银行存单管理类
 * @Author WENYANNI
 * @Date 2021/10/31 下午8:13
 **/
public abstract class Bank {
    public void accept(IVisitor<Bank> visitor){
        visitor.visit(this);
    }

    public abstract void process(IVisitor<Sheet> visitor);
}
