package com.wyn.facade;

/**
 * @ClassName Refrigerator
 * @Description 冰箱
 * @Author WENYANNI
 * @Date 2021/11/27 下午8:16
 **/
public class Refrigerator {
    Container container = new Container();
    Freezer freezer = new Freezer();

    public void init(){
        container.init();
        freezer.init();
    }

    public void run(){
        container.run();
        freezer.run();
    }

    public void shutdown(){
        container.shutdown();
        freezer.shutdown();
    }
}
