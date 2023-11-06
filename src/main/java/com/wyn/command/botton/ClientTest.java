package com.wyn.command.botton;

/**
 * @ Description:
 *
 * 本题中，应用命令模式能够有效使类RemoteController和类Light、类Tv之间的耦合性降至最小
 *
 * @ Author     :wenyanni288
 * @ Date       :2023/10/22 17:12$
 */
public class ClientTest {
    public static void main(String[] args) {
        Light light = new Light();
        Tv tv = new Tv();

        LightCommand lightCommand = new LightCommand(light);
        TvCommand tvCommand = new TvCommand(tv);

        RemoteController remoteController = new RemoteController();
        remoteController.setCommands(0,lightCommand);
    }
}

    