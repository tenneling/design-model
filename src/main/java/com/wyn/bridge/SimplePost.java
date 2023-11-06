package com.wyn.bridge;

/**
 * @ClassName SimplePost
 * @Description 平信
 * @Author WENYANNI
 * @Date 2021/11/27 下午12:05
 **/
public class SimplePost implements IPost{
    @Override
    public void post() {
        System.out.println("This is Simple post");
    }
}
