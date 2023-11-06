package com.wyn.responsibility;

/**
 * @ClassName ZuzhangHandle
 * @Description ConcreteHandle 组长可以处理一天的请假。或者将请求传给下一节点
 * @Author WENYANNI
 * @Date 2021/10/30 下午4:51
 **/
public class ZuZhangHandle extends Handle{

    static int limit = 1;
    @Override
    public boolean handle(Request request) {
        if(request.day<=limit){
            System.out.println("Zuzhang agrees this request");
            return true;
        }
        return getNext().handle(request);
    }
}
