package com.wyn.responsibility;

/**
 * @ClassName JingLiHandle
 * @Description ConcreteHandle 经理可以处理两天以上的请假
 * @Author WENYANNI
 * @Date 2021/10/30 下午4:51
 **/
public class JingLiHandle extends Handle{

    @Override
    public boolean handle(Request request) {
        System.out.println("JingLi agrees this request");
        return true;
    }
}
