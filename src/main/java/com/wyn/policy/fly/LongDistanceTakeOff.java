package com.wyn.policy.fly;

/**
 * @ Description:
 * @ Author     :wenyanni288
 * @ Date       :2023/10/22 10:58$
 */
public class LongDistanceTakeOff implements TakeOffBehavior{
    @Override
    public void takeOff() {
        System.out.println("---------长距离起飞---------");
    }
}

    