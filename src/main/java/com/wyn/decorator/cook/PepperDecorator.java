package com.wyn.decorator.cook;

/**
 * @ClassName PaperDecorator
 * @Description 请描述类的业务用途
 * @Author WENYANNI
 * @Date 2021/11/27 下午8:00
 **/
public class PepperDecorator extends Decorator{

    public PepperDecorator(ICook cook){
        super(cook);
    }

    @Override
    public void cook() {
        addPepper();
        cook.cook();
    }

    private void addPepper(){

    }
}
