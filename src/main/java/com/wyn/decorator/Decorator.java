package com.wyn.decorator;

/**
 * @ClassName Decorator
 * @Description 装饰角色 实现了Component接口，同时也持有接口Component的对象的引用
 * @Author WENYANNI
 * @Date 2021/11/27 下午7:21
 **/
public abstract class Decorator implements ILogger{

    protected ILogger logger;

    public Decorator(ILogger logger) {
        this.logger = logger;
    }
}
