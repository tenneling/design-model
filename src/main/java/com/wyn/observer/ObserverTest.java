package com.wyn.observer;

/**
 * @ClassName ObserverTest
 * @Description 测试类
 * @Author WENYANNI
 * @Date 2021/11/14 下午4:01
 **/
public class ObserverTest {
    public static void main(String[] args) {
        IObserver observer = new Observer();
        Subject subject = new Subject();
        subject.register(observer);
        subject.setData("hello");
        subject.notifyObservers();
    }
}
