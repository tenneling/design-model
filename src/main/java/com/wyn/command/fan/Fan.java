package com.wyn.command.fan;

/**
 * @ClassName Fan
 * @Description 风扇类，状态：低速、中速、高速、关
 * @Author WENYANNI
 * @Date 2021/10/31 下午12:12
 **/
public class Fan {
    public static final int OFF = 0 ;
    public static final int LOW = 1 ;
    public static final int MEDIUM = 2 ;
    public static final int HIGH = 3 ;

    int speed;

    public void Fan(int speed){
        speed = OFF;
    }

    public int getSpeed(){
        return speed;
    }

    public void low(){
        speed = LOW;
        System.out.println("风扇速度：低速");
    }
    public void medium(){
        speed = MEDIUM;
        System.out.println("风扇速度：中速");
    }

    public void high(){
        speed = HIGH;
        System.out.println("风扇速度：高速");
    }

    public void off(){
        speed = OFF;
        System.out.println("风扇状态：关");
    }
}
