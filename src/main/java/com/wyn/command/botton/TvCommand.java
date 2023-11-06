package com.wyn.command.botton;

/**
 * @ Description:
 * @ Author     :wenyanni288
 * @ Date       :2023/10/22 17:11$
 */
public class TvCommand implements Command{

    protected Tv tv;

    @Override
    public void on() {
        tv.setChannel(1);
    }

    @Override
    public void off() {
        tv.setChannel(0);
    }

    public TvCommand(Tv tv){
        this.tv = tv;
    }
}

    