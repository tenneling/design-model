package com.wyn.intermediary.socket;

/**
 * @ClassName Intermediary
 * @Description 中介者模式介绍
 * @Author WENYANNI
 * @Date 2021/11/14 下午12:54
 **/
public class Intermediary {

    /**
     * IMediator抽象中介者：接口，定义了用于同事对象之间进行通信的方法
     * ConcreteMediator具体中介者：具体中介者
     * Colleague抽象同事接口：规定了具体同事需要实现的方法
     * ConcreteColleague：具体同事类，如果一个对象会影响其他的对象，同时也会被其他对象影响，那么这两个对象成为同事类
     * 同事类一般由多个对象组成，他们之间相互影响，相互依赖。同事类越多，关系越复杂
     **/
}
