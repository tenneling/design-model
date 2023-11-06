package com.wyn.responsibility;

import lombok.Getter;
import lombok.Setter;

/**
 * @ClassName Handle
 * @Description 抽象处理者 处理请求的接口或抽象类，可以定义一个方法，以设定对下一节点的引用
 * @Author WENYANNI
 * @Date 2021/10/30 下午4:45
 **/
@Setter
@Getter
public abstract class Handle {
    private Handle next;

    //定义抽象请求方法，子类需要重写
    public abstract boolean handle(Request request);
}
