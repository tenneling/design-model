package com.wyn.command;

/**
 * @ClassName Invoke
 * @Description 命令请求者 可以添加不同类型的ICommand方法
 * @Author WENYANNI
 * @Date 2021/10/30 下午8:21
 **/
public class Invoke {
    ICommand iCommand;

    public Invoke(ICommand iCommand){
        this.iCommand = iCommand;
    }

    public void execute(){
        //启动命令
        iCommand.sweep();
    }

    /**
     * 命令模式思路：
     * 在命令发送者和命令接收者之间多一个请求者
     * 命令发送者和请求者先作用，请求者再和命令接收者作用
     **/
}
