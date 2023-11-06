package com.wyn.decorator.cook;

/**
 * @ClassName PaperDecorator
 * @Description 请描述类的业务用途
 * @Author WENYANNI
 * @Date 2021/11/27 下午8:00
 **/
public class SugarDecorator extends Decorator{

    public SugarDecorator(ICook cook){
        super(cook);
    }

    @Override
    public void cook() {
        addSugar();
        cook.cook();
    }

    private void addSugar(){

    }
}
