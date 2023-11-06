package com.wyn.visitor.selfadaption;

import java.util.Vector;

/**
 * @ClassName BankGroup
 * @Description 银行组存单管理类
 * @Author WENYANNI
 * @Date 2021/10/31 下午8:19
 **/
public class BankGroup {
    Vector<Bank> vector = new Vector<>();
    void add(Bank bank){
        vector.add(bank);
    }

    public void accept(IVisitor<BankGroup> visitor){
        visitor.visit(this);
    }

    public void process(IVisitor<Bank> visitor) {
        for (int i=0; i<vector.size();i++){
            vector.get(i).accept(visitor);
        }
    }
}
