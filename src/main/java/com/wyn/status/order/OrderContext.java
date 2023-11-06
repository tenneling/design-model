package com.wyn.status.order;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @ClassName OrderContext
 * @Description 请描述类的业务用途
 * @Author WENYANNI
 * @Date 2021/11/14 下午7:20
 **/
@ToString
@Setter
@Getter
public class OrderContext {
    OrderState state = null;
    //新建订单设为已预约状态
    OrderContext() {
        this.state = new OrderedState();
    }

    void setState(OrderState state) {
        this.state = state;
    }

    public void confirm() {
        state.confirm(this);
    }

    public void modify() {
        state.modify(this);
    }

    public void pay() {
        state.pay(this);
    }
}
