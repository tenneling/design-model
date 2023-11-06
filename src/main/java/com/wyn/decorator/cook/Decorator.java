package com.wyn.decorator.cook;

/**
 * @ClassName Decorator
 * @Description 抽象装饰器
 * @Author WENYANNI
 * @Date 2021/11/27 下午7:53
 **/
public abstract class Decorator implements ICook{
    ICook cook;
    public Decorator(ICook cook){
        this.cook = cook;
    }
}
