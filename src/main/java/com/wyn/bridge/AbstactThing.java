package com.wyn.bridge;

/**
 * @ClassName AbstactThing
 * @Description 抽象事物类：共享的功能封装在一个类中
 * @Author WENYANNI
 * @Date 2021/11/27 下午12:07
 **/
public class AbstactThing {
    private IPost iPost;
    public AbstactThing(IPost iPost){
        this.iPost = iPost;
    }
    public void post(){
        iPost.post();
    }
}
