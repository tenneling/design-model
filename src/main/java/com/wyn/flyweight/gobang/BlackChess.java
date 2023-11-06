package com.wyn.flyweight.gobang;

/**
 * @ClassName BlackChess
 * @Description 黑棋，具体享元对象
 * @Author WENYANNI
 * @Date 2021/11/21 上午10:13
 **/
public class BlackChess extends Chess{
    @Override
    public void play(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("●:(" + this.x + "," + this.y + ")");
    }
}
