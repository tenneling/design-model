package com.wyn.visitor.selfadaption;

/**
 * @ClassName SheetVisitor
 * @Description 银行访问者
 * @Author WENYANNI
 * @Date 2021/10/31 下午8:22
 **/
public class BankVisitor implements IVisitor<Bank>{

    private void ABCProcess(ABCBank bank){
        System.out.println("ABCBank");
    }

    private void ICBCProcess(ICBCBank bank){
        System.out.println("ICBCBank");
    }

    @Override
    public void visit(Bank s) {
        if(s instanceof ABCBank){
            ABCProcess((ABCBank) s);
        }

        if(s instanceof ICBCBank){
            ICBCProcess((ICBCBank) s);
        }
    }
}
