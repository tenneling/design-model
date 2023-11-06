package com.wyn.command.botton;

/**
 * @ Description:
 * @ Author     :wenyanni288
 * @ Date       :2023/10/22 17:05$
 */
public class RemoteController {
    protected Command[] commands = new Command[4];

    public void onPressButton(int button){
        if(button%2==0){
            commands[button].on();
        }
        commands[button].off();
    }

    public void setCommands(int botton,Command command){
        commands[botton] = command;
    }
}

    