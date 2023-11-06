package com.wyn.singleton;

/**
 * @ClassName DelaySingleton
 * @Description 延时实例化
 * @Author WENYANNI
 * @Date 2021/10/24 下午5:09
 **/
public class DelaySingleton {
    private DelaySingleton(){};

    private static DelaySingleton singleton = null;

    public static DelaySingleton getInstance(){
        if (singleton == null){
            singleton = new DelaySingleton();
        }
        return singleton;
    }

    //存在线程安全问题，当多个线程进入时都满足条件singleton == null，会实例化多个对象

    //解决方法1:完全同步方法
    //synchronized方法，多线程是串行运行的，一个线程必须执行完getInstance()方法，下一个线程才能调用getInstance()方法
    /*public static synchronized DelaySingleton getInstance(){
        if(singleton == null){
            singleton = new DelaySingleton();
        }
        return singleton;
    }*/

    //解决方法2:部分同步方法
    //通过双重锁部分同步机制获得单例对象，因为有两行相同的语句if (singleton == null)，因此叫双重锁
    //第一个if，进入synchronized方法，必须串行。第二个if进入时判断是否为空再创建对象，否则return
    /*public static DelaySingleton getInstance(){
        if(singleton == null){
            synchronized (DelaySingleton.class){
                if (singleton == null) {
                   singleton = new DelaySingleton();
                }
            }
        }
        return singleton;
    }*/

    //解决方法3:静态内部类
    //无进入synchronized方法而提高了Java虚拟机的维护效率，运行my.single时单例对象生成
    /*private static class My{
        private static final DelaySingleton single = new DelaySingleton();
    }
    private DelaySingleton(){}

    public static final  DelaySingleton getInstance(){
        return My.single;
    }*/
}
