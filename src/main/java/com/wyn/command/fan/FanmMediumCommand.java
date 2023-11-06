package com.wyn.command.fan;

/**
 * @ClassName FanOffCommand
 * @Description 风扇中速的命令请求类
 * @Author WENYANNI
 * @Date 2021/10/31 下午12:40
 **/
public class FanmMediumCommand implements Command{

    Fan fan;

    //记录之前速度
    int preSpeed;

    public FanmMediumCommand(Fan fan){
        this.fan = fan;
    }

    @Override
    public void execute() {
        preSpeed = fan.getSpeed();
        fan.medium();
    }

    @Override
    public void undo() {
        if(preSpeed == Fan.HIGH){
            fan.high();
        }else if(preSpeed == Fan.MEDIUM){
            fan.medium();
        }else if(preSpeed == Fan.LOW){
            fan.low();
        }else if(preSpeed == Fan.OFF){
            fan.off();
        }



    }
}
