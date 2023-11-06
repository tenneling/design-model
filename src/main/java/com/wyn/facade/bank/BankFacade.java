package com.wyn.facade.bank;

import java.util.*;

/**
 * @ClassName BankFacade
 * @Description 外观类
 * @Author WENYANNI
 * @Date 2021/11/27 下午8:30
 **/
public class BankFacade {
    Bank bank = new Bank("ICBC","1000",0);
    Bank bankTwo = new Bank("CCB","2000",0);

    Map<String,Bank> map = new HashMap<>();
    BankFacade(){
        map.put("ICBC",bank);
        map.put("CCB",bankTwo);
    }

    void save(String mark,int money){
        Bank cur = (Bank) map.get(mark);
        cur.save(money);
    }

    boolean fetch(String mark,int money){
        Bank cur = (Bank) map.get(mark);
        return cur.fetch(money);
    }

    boolean fromAndTo(String mark,int money,String markTwo){
        Bank from = (Bank) map.get(mark);
        boolean b = from.fetch(money);
        if (!b){
            return false;
        }
        Bank to = (Bank) map.get(markTwo);
        to.save(money);
        return  true;
    }

    void display(){
        Set<String> set = map.keySet();
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            String key = iterator.next();
            Bank cur = (Bank) map.get(key);
            System.out.println(cur.getMark()+"\t"+cur.getNo()+"\t"+cur.getMoney());
        }
    }

}
