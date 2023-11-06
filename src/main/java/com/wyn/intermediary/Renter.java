package com.wyn.intermediary;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @ClassName Renter
 * @Description 租房者
 * @Author WENYANNI
 * @Date 2021/11/13 上午8:58
 **/
@Setter
@Getter
@ToString
public class Renter {

    String no;
    String name;
    Mediator mediator;

    Renter(String no,String name,Mediator mediator){
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
