package com.wyn.visitor.selfadaption;

import java.util.Vector;

/**
 * @ClassName ICBCBank
 * @Description 农行 process对应"集合"自适应，accept对应"元素"自适应
 * @Author WENYANNI
 * @Date 2021/10/31 下午8:15
 **/
public class ICBCBank extends Bank{

    Vector<ICBCSheet> vector = new Vector<>();
    void add(ICBCSheet sheet){
        vector.add(sheet);
    }

    @Override
    public void process(IVisitor<Sheet> visitor) {
        for (int i=0; i<vector.size();i++){
            vector.get(i).accept(visitor);
        }
    }
}
