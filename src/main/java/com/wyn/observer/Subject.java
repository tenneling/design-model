package com.wyn.observer;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Vector;

/**
 * @ClassName Subject
 * @Description 主题实现类
 * @Author WENYANNI
 * @Date 2021/11/14 下午3:48
 **/
@Getter
@Setter
@ToString
public class Subject implements ISubject{
    //观察者维护向量
    private Vector<IObserver> vector = new Vector<>();
    //主题中心数据
    private String data ;

    @Override
    public void register(IObserver observer) {
        //主题添加观察者
        vector.add(observer);
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
            observer.refresh(data);
        }
    }
}
