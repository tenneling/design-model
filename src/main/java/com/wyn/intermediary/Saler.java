package com.wyn.intermediary;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @ClassName Saler
 * @Description 出租者类
 * @Author WENYANNI
 * @Date 2021/11/13 上午8:58
 **/
@Setter
@Getter
@ToString
public class Saler {
    String no;
    String name;
    Mediator mediator;

    Saler(String no,String name,Mediator mediator){
        this.no = no;
        this.name = name;
        this.mediator = mediator;
    }

    void receive(String msg){
        System.out.println(no +"\t"+name+"receive:");
        System.out.println("\t"+msg);
    }

    void send(String msg){
        mediator.send(this,msg);
    }
}
