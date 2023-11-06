package com.wyn.reflection.msg;

/**
 * @ClassName ConsoleMsg
 * @Description 将信息打印到控制台
 * @Author WENYANNI
 * @Date 2021/10/24 下午4:40
 **/
public class ConsoleMsg implements IMsg{
    @Override
    public void process(String msg) {
        System.out.println(msg);
    }
}
