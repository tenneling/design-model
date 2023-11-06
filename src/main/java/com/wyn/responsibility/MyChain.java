package com.wyn.responsibility;

/**
 * @ClassName Chain
 * @Description Client角色，负责形成具体处理者的节点功能链，并传递初始请求
 * @Author WENYANNI
 * @Date 2021/10/30 下午5:01
 **/
public class MyChain {
    private Handle one = new ZuZhangHandle();
    private Handle two = new ZhuRenHandle();
    private Handle three = new JingLiHandle();

    public void createChain(){
        one.setNext(two);
        two.setNext(three);
    }

    public void handle(Request request){
        one.handle(request);
    }
}
