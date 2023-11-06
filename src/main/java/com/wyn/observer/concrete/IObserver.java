package com.wyn.observer.concrete;

/**
 * @InterfaceName IObserver
 * @Description
 * @Author WENYANNI
 * @Date 2021/11/14 下午4:06
 **/
public interface IObserver<T> {
    void refresh(T data);
}
