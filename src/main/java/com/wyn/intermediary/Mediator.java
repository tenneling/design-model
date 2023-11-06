package com.wyn.intermediary;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @ClassName Mediator
 * @Description 房屋中介者类
 * @Author WENYANNI
 * @Date 2021/11/13 上午8:59
 **/
public class Mediator {

    Map<String,Renter> mediator = new HashMap<>();
    Map<String,Saler> mediatorOther = new HashMap<>();

    void addRenter(Renter renter){
        mediator.put(renter.getNo(),renter);
    }

    void addSaler(Saler saler){
        mediatorOther.put(saler.getNo(),saler);
    }

    void send(Renter renter, String msg) {
        System.out.println("come from renter-"+renter.getNo()+"-"+renter.getName());
        System.out.println("\t"+msg);
        Set<String> stringSet = mediatorOther.keySet();
        Iterator<String> iterator = stringSet.iterator();
        while (iterator.hasNext()){
            String key = iterator.next();
            Saler saler = mediatorOther.get(key);
            saler.receive(renter.getNo()+"-"+renter.getName());
        }
    }

    void send(Saler saler, String msg) {
        System.out.println("come from saler-"+saler.getNo()+"-"+saler.getName());
        System.out.println("\t"+msg);
        Set<String> stringSet = mediator.keySet();
        Iterator<String> iterator = stringSet.iterator();
        while (iterator.hasNext()){
            String key = iterator.next();
            Renter renter = mediator.get(key);
            renter.receive(saler.getNo()+"-"+saler.getName());
        }
    }
}
