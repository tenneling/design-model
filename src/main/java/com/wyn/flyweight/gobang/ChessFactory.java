package com.wyn.flyweight.gobang;

/**
 * @ClassName ChessFactory
 * @Description 享元工厂
 * @Author WENYANNI
 * @Date 2021/11/21 上午10:14
 **/
public class ChessFactory {
    private static Chess whiteChess;
    private static Chess blackChess;
    public static Chess getChess(int key) {
        if (key == 0) {
            if (whiteChess == null) {
                System.out.println("=====创建白棋对象======");
                whiteChess = new WhiteChess();
            }
            return whiteChess;
        } else {
            if (blackChess == null) {
                System.out.println("=====创建黑棋对象======");
                blackChess = new BlackChess();
            }
            return blackChess;
        }
    }
}
