package com.wyn.responsibility;

/**
 * @ClassName ZhuRenHandle
 * @Description ConcreteHandle 主任只能处理两天的请假。或者将请求传给下一节点
 * @Author WENYANNI
 * @Date 2021/10/30 下午4:51
 **/
public class ZhuRenHandle extends Handle{

    static int limit = 2;
    @Override
    public boolean handle(Request request) {
        if(request.day<=limit){
            System.out.println("ZhuRen agrees this request");
            return true;
        }
        return getNext().handle(request);
    }
}
