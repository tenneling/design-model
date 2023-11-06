package com.wyn.observer;

/**
 * @InterfaceName ISubject
 * @Description 主题接口
 * @Author WENYANNI
 * @Date 2021/11/14 下午3:30
 **/
public interface ISubject {
    //注册观察者
    void register(IObserver observer);
    //撤销观察者
    void unRegister(IObserver observer);
    //通知所有观察者
    void notifyObservers();
}
