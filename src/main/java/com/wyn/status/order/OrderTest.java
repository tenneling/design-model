package com.wyn.status.order;

/**
 * @ClassName OrderTest
 * @Description 请描述类的业务用途
 * @Author WENYANNI
 * @Date 2021/11/14 下午7:29
 **/
public class OrderTest {
    public static void main(String[] args) {
        OrderContext orderContext = new OrderContext();
        orderContext.confirm();     //已预约状态>已确认状态
        orderContext.modify();      //已确认状态>已预约状态
        orderContext.confirm();    //已预约状态>已确认状态
        orderContext.pay();       //已确认状态>已锁定状态
        orderContext.modify();    //已锁定状态
    }
}
