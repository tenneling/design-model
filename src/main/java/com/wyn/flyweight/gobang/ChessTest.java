package com.wyn.flyweight.gobang;

import java.util.Random;

/**
 * @ClassName ChessTest
 * @Description 请描述类的业务用途
 * @Author WENYANNI
 * @Date 2021/11/21 上午10:15
 **/
public class ChessTest {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Chess c = ChessFactory.getChess(i % 2);
            c.play(i, new Random().nextInt(15));
        }
    }
}
