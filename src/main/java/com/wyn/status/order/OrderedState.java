package com.wyn.status.order;

/**
 * @ClassName OrderedState
 * @Description 预约状态
 * @Author WENYANNI
 * @Date 2021/11/14 下午7:21
 **/
public class OrderedState extends OrderState{
    @Override
    void confirm(OrderContext orderContext) {
        System.out.println("订单已确认");
        orderContext.setState(new ConfirmedState());
    }

    @Override
    void modify(OrderContext orderContext) {
        System.out.println("订单已修改");
        orderContext.setState(this);
    }

    @Override
    void pay(OrderContext orderContext) {
        System.out.println("预约状态没法完成订单！");
    }
}
