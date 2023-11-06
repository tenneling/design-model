package com.wyn.policy.fly;

/**
 * @ Description:
 * @ Author     :wenyanni288
 * @ Date       :2023/10/22 10:55$
 */
public class SubSonicFly implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("--------亚音速飞行--------");
    }
}

    