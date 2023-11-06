package com.wyn.flyweight.gobang;

/**
 * @ClassName Chess
 * @Description 抽象享元角色
 * @Author WENYANNI
 * @Date 2021/11/21 上午10:11
 **/
public abstract class Chess {
    protected int x;
    protected int y;
    public abstract void play(int x,int y);
}
