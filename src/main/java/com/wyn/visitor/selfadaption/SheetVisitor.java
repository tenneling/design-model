package com.wyn.visitor.selfadaption;

/**
 * @ClassName SheetVisitor
 * @Description 单据访问者
 * @Author WENYANNI
 * @Date 2021/10/31 下午8:22
 **/
public class SheetVisitor implements IVisitor<Sheet>{

    private void ABCProcess(ABCSheet sheet){
        System.out.println("ABCSheet");
    }

    private void ICBCProcess(ICBCSheet sheet){
        System.out.println("ICBCSheet");
    }

    @Override
    public void visit(Sheet s) {
        if(s instanceof ABCSheet){
            ABCProcess((ABCSheet) s);
        }

        if(s instanceof ICBCSheet){
            ICBCProcess((ICBCSheet) s);
        }
    }
}
