package com.wyn.status.order;

/**
 * @ClassName LockedState
 * @Description 请描述类的业务用途
 * @Author WENYANNI
 * @Date 2021/11/14 下午7:28
 **/
public class LockedState extends OrderState {
    @Override
    void confirm(OrderContext orderContext) {
        System.out.println("订单已锁定");
    }

    @Override
    void modify(OrderContext orderContext) {
        System.out.println("订单已锁定");
    }

    @Override
    void pay(OrderContext orderContext) {
        System.out.println("订单已锁定");
    }
}
