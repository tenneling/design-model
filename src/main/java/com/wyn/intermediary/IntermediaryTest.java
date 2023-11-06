package com.wyn.intermediary;

/**
 * @ClassName IntermediaryTest
 * @Description 租房者发布租房信息，中介通知所有出租者；出租者发布出租信息，中介通知所有租房者
 * @Author WENYANNI
 * @Date 2021/11/13 上午9:16
 **/
public class IntermediaryTest {
    public static void main(String[] args) {
        Mediator mediator = new Mediator();
        Renter renter1 = new Renter("1","XIAONI",mediator);
        Renter renter2 = new Renter("2","ZEHAO",mediator);
        Saler saler = new Saler("3","XIAOQING",mediator);

        mediator.addRenter(renter1);
        mediator.addRenter(renter2);
        mediator.addSaler(saler);
        renter1.send("I want to rent a house");
        saler.send("I want to sale a house");
    }
}
