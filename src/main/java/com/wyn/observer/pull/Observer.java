package com.wyn.observer.pull;

/**
 * @ClassName Observer
 * @Description 具体观察者
 * @Author WENYANNI
 * @Date 2021/11/14 下午3:59
 **/
public class Observer implements IObserver {
    @Override
    public void refresh(ISubject subject) {
        Subject subject1 = (Subject) subject;
        System.out.println("I have received the message:"+subject1.getData());
    }
}
