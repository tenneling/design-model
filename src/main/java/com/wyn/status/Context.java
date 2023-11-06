package com.wyn.status;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @ClassName Context
 * @Description 事物类（上下文类），通常用来定义多态接口，同时维护一个来具体处理当前状态的实例对象
 * @Author WENYANNI
 * @Date 2021/11/14 下午5:37
 **/
@Getter
@Setter
@ToString
public class Context {
    private IStatus status;

    public void manage(){
        status.changeStatus();
    }
}
