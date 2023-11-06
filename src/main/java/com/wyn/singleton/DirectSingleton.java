package com.wyn.singleton;

/**
 * @ClassName DirectSingleton
 * @Description 直接实例化
 * @Author WENYANNI
 * @Date 2021/10/24 下午4:59
 **/
public class DirectSingleton {
    //构造方法私有化
    //避免外部调用，是实现单例对象的关键
    DirectSingleton(){};

    //直接产生单例实例
    //static 静态初始化，线程安全
    private static final DirectSingleton singleton = new DirectSingleton();

    //提供单例对象方法
    //外部可通过静态方法getInstance获取单例对象
    public static DirectSingleton getInstance(){
        return singleton;
    }
}
