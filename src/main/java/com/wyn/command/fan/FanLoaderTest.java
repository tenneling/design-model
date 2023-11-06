package com.wyn.command.fan;

/**
 * @ClassName FanLoader
 * @Description 风扇测试类
 * @Author WENYANNI
 * @Date 2021/10/31 下午1:01
 **/
public class FanLoaderTest {
    public static void main(String[] args) {
        FanInvoker fanInvoker = new FanInvoker();
        Fan fan = new Fan();
        FanmMediumCommand fanmMediumCommand = new FanmMediumCommand(fan);
        FanOffCommand fanOffCommand = new FanOffCommand(fan);
        FanmHighCommand fanmHighCommand = new FanmHighCommand(fan);

        fanInvoker.setCommand(fanmMediumCommand);
        fanInvoker.buttonWasPushed();
        fanInvoker.setCommand(fanOffCommand);
        fanInvoker.buttonWasPushed();
        fanInvoker.setCommand(fanmHighCommand);
        fanInvoker.buttonWasPushed();
        fanInvoker.undoButtonWasPushed();
    }
}
