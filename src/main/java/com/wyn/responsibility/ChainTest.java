package com.wyn.responsibility;

/**
 * @ClassName ChainTest
 * @Description 请描述类的业务用途
 * @Author WENYANNI
 * @Date 2021/10/30 下午5:06
 **/
public class ChainTest {
    public static void main(String[] args) {
        //请假1天的请求
        Request request = new Request(1);
        //创建责任链
        MyChain myChain = new MyChain();
        myChain.createChain();
        //放入请求
        myChain.handle(request);
    }
}
