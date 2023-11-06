package com.wyn.visitor.selfadaption;

/**
 * @ClassName Sheet
 * @Description 存单
 * @Author WENYANNI
 * @Date 2021/10/31 下午8:05
 **/
public class Sheet {
    //账号
    String account;
    //姓名
    String name;
    //余额
    float money;
    //存款日期
    String startDate;
    //期限
    int range;

    public Sheet(String account,String name,float money,String startDate,int range){
        this.account = account;
        this.name = name;
        this.money = money;
        this.startDate = startDate;
        this.range = range;
    }

    public void accept(IVisitor<Sheet> visitor){
        visitor.visit(this);
    }
}
