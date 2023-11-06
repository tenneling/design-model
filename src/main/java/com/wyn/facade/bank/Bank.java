package com.wyn.facade.bank;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @ClassName Bank
 * @Description 银行功能类
 * @Author WENYANNI
 * @Date 2021/11/27 下午8:25
 **/
@Setter
@Getter
@ToString
public class Bank {
    String mark;
    String no;
    int money;

    public Bank(String mark,String no,int money){
        this.mark = mark;
        this.no = no;
        this.money = money;
    }

    public void save(int value){
        money += value;
    }

    public boolean fetch(int value){
        if(money >= value){
            money -=value;
            return true;
        }
        return false;
    }
}
