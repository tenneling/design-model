package com.wyn.policy.fly;

/**
 * @ Description:
 * @ Author     :wenyanni288
 * @ Date       :2023/10/22 10:57$
 */
public class VerticalTakeOff implements TakeOffBehavior{
    @Override
    public void takeOff() {
        System.out.println("--------垂直起飞-------");
    }
}

    