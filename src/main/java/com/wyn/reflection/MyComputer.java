package com.wyn.reflection;

/**
 * @ClassName MyComputer
 * @Description 电脑抽象类
 * @Author WENYANNI
 * @Date 2021/10/24 下午3:44
 **/
public abstract class MyComputer {
    //不同的硬盘
    abstract void makeHardDisk();
    //不同的光驱
    abstract void makeOptical();
    //不同的显示器
    abstract void makeMonitor();

    //表明所有的计算机都有相同类型的主板
    void makeMainKeyBoard(){

    };
}
