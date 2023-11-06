package com.wyn.observer.pull;

/**
 * @InterfaceName IObserver
 * @Description 观察者接口 拉数据：观察者对象可间接获得变化后的主题数据
 * @Author WENYANNI
 * @Date 2021/11/14 下午3:29
 **/
public interface IObserver {
    void refresh(ISubject subject);
}
