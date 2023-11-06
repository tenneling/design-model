package com.wyn.singleton;

import java.util.Scanner;

/**
 * @ClassName StaticSingleton
 * @Description 静态内部类的单例模式
 * @Author WENYANNI
 * @Date 2021/10/24 下午6:28
 **/
public class StaticSingleton {
    private static class My{
        private static final StaticSingleton single = new StaticSingleton();
    }
    private StaticSingleton(){
        System.out.println("This is a new instance");
    }

    public static final  StaticSingleton getInstance(){
        return My.single;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        //Object obj = new StaticSingleton();
        Object obj = StaticSingleton.getInstance();
        Object objOther = StaticSingleton.getInstance();
    }
}
