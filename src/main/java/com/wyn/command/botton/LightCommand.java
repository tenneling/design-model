package com.wyn.command.botton;

/**
 * @ Description:
 * @ Author     :wenyanni288
 * @ Date       :2023/10/22 17:08$
 */
public class LightCommand implements Command{

    private Light light;

    @Override
    public void on() {
        light.turnLight(100);
    }

    @Override
    public void off() {
        light.turnLight(0);
    }

    public LightCommand(Light light){
        this.light = light;
    }
}

    