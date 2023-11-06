package com.wyn.policy.animal;

/**
 * @ Description:
 * @ Author     :wenyanni288
 * @ Date       :2023/10/28 16:25$
 */
public class Rubber extends Duck{

    public Rubber(){
        flyBahavior = new FlyNoWay();
        quarkBehavior = new Squack();
    }

    @Override
    public void display() {

    }
}

    