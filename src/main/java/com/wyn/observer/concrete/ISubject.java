package com.wyn.observer.concrete;


/**
 * @InterfaceName ISubject
 * @Description 主题接口
 * @Author WENYANNI
 * @Date 2021/11/14 下午3:30
 **/
public interface ISubject<T> {
    //注册观察者
    void register(IObserver<T> observer);
    //撤销观察者
    void unRegister(IObserver<T> observer);
    //通知所有观察者
    void notifyObservers();
}
