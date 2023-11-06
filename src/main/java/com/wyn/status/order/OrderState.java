package com.wyn.status.order;

/**
 * @ClassName OrderState
 * @Description 抽象状态类
 * @Author WENYANNI
 * @Date 2021/11/14 下午7:19
 **/
public abstract class OrderState {
    abstract void confirm(OrderContext orderContext);

    abstract void modify(OrderContext orderContext);

    abstract void pay(OrderContext orderContext);
}
