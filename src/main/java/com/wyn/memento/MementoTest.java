package com.wyn.memento;

import java.util.Scanner;

/**
 * @ClassName MementoTest
 * @Description 测试类
 * @Author WENYANNI
 * @Date 2021/11/14 下午2:28
 **/
public class MementoTest {
    public static void main(String[] args) {
        //创建原发者对象
        ReadTopic readTopic = new ReadTopic();
        //创建备忘录对象
        Memento memento = new Memento();
        //创建备忘录管理者对象
        Caretaker caretaker = new Caretaker();

        Scanner scanner = new Scanner(System.in);
        System.out.println("从断点处开始计算吗？");

        String mark = scanner.nextLine();

        //如果从断点处开始计算，获取备忘录对象，恢复原发者状态
        if("Y".equals(mark)){
            memento = caretaker.getMemento();
            readTopic.restoreFromMe(memento);
        }

        do{
            //做题目
            String strTopic = readTopic.getNextTopic();
            System.out.println(strTopic);

            scanner.nextInt();

            System.out.println("继续做题吗？");

            scanner.nextLine();
            scanner.nextLine();
        }while ("Y".equals(mark));

        //创建备忘录对象
        memento = readTopic.createMemento();
        //关闭题目文件
        readTopic.close();
        //保存备忘录对象
        caretaker.saveMemento(memento);
    }
}
