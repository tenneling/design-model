package com.wyn.bridge;

/**
 * @ClassName BridgeTest
 * @Description 桥接模式测试类：桥接模式完成的是一个多条件选择的问题
 * @Author WENYANNI
 * @Date 2021/11/27 下午12:11
 **/
public class BridgeTest {
    public static void main(String[] args) {
        IPost post = new SimplePost();
        Letter letter = new Letter(post);
        letter.post();
    }
}
