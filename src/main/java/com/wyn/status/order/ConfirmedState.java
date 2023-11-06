package com.wyn.status.order;

/**
 * @ClassName ConfirmedState
 * @Description 请描述类的业务用途
 * @Author WENYANNI
 * @Date 2021/11/14 下午7:23
 **/
public class ConfirmedState extends OrderState{
    @Override
    void confirm(OrderContext orderContext) {
        System.out.println("订单已确认，请勿重复确认");
    }

    @Override
    void modify(OrderContext orderContext) {
        System.out.println("订单已修改，请再次确认");
        orderContext.setState(new OrderedState());
    }

    @Override
    void pay(OrderContext orderContext) {
        System.out.println("订单已支付，没法再修改");
        orderContext.setState(new LockedState());
    }
}
