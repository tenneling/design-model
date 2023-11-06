package com.wyn.command.fan;

/**
 * @ClassName FanInvoker
 * @Description 命令请求者
 * @Author WENYANNI
 * @Date 2021/10/31 下午12:51
 **/
public class FanInvoker {
    Command command;

    public FanInvoker(){
        Command noCommand = new NoCommand();
        command = noCommand;
    }

    public  void setCommand(Command command){
        this.command=command;
    }

    public void buttonWasPushed(){
        command.execute();
    }

    public void undoButtonWasPushed(){
        command.undo();
    }
}
