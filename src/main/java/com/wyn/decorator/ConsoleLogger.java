package com.wyn.decorator;

/**
 * @ClassName ConsoleLogger
 * @Description 日志打印类 具体构件角色，该类实现了Component接口
 * @Author WENYANNI
 * @Date 2021/11/27 下午7:11
 **/
public class ConsoleLogger implements ILogger{
    @Override
    public void log(String msg) {
        System.out.println(msg);
    }
}
