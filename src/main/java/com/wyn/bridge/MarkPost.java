package com.wyn.bridge;

/**
 * @ClassName MarkPost
 * @Description 邮寄
 * @Author WENYANNI
 * @Date 2021/11/27 下午12:06
 **/
public class MarkPost implements IPost{
    @Override
    public void post() {
        System.out.println("This is Mark Post");
    }
}
