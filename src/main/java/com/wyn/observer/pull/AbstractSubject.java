package com.wyn.observer.pull;

import java.util.Vector;

/**
 * @ClassName AbstractSubject
 * @Description 抽象主题类
 * @Author WENYANNI
 * @Date 2021/11/14 下午4:29
 **/
public abstract class AbstractSubject implements ISubject{
    //观察者维护向量
    private Vector<IObserver> vector = new Vector<>();

    @Override
    public void register(IObserver observer) {
        //主题添加观察者
        //防止添加重复的观察者对象
        if (!vector.contains(observer)){
            vector.add(observer);
        }
    }

    @Override
    public void unRegister(IObserver observer) {
        //主题删除观察者
        if(vector.contains(observer)){
            vector.remove(observer);
        }
    }

    @Override
    public void notifyObservers() {
        //主题通知所有观察者进行数据响应
        for(int i=0;i<vector.size();i++){
            IObserver observer = vector.get(i);
            observer.refresh(this);
        }
    }
}
