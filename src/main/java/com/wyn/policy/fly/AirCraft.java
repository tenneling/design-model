package com.wyn.policy.fly;

/**
 * @ Description:
 * @ Author     :wenyanni288
 * @ Date       :2023/10/22 11:04$
 */
public abstract class AirCraft {
    protected FlyBehavior flyBehavior;
    protected TakeOffBehavior takeOffBehavior;
    public void fly(){
        flyBehavior.fly();
    }
    public void takeOff(){
        takeOffBehavior.takeOff();
    }
}

    