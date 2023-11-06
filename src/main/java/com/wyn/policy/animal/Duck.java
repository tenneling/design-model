package com.wyn.policy.animal;

/**
 * @ Description:
 * @ Author     :wenyanni288
 * @ Date       :2023/10/28 16:23$
 */
public abstract class Duck {
    FlyBahavior flyBahavior;
    QuarkBehavior quarkBehavior;

    public void fly(){
        flyBahavior.fly();
    }

    public void quack(){
        quarkBehavior.quack();
    }

    public abstract void display();
}

    