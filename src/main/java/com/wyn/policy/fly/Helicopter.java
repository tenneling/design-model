package com.wyn.policy.fly;

/**
 * @ Description:
 * @ Author     :wenyanni288
 * @ Date       :2023/10/22 11:07$
 */
public class Helicopter extends AirCraft{
    public Helicopter(){
        flyBehavior = new SubSonicFly();
        takeOffBehavior = new VerticalTakeOff();
    }
}

    