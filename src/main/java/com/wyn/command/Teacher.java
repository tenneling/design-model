package com.wyn.command;

/**
 * @ClassName Teacher
 * @Description 命令发送者 包含命令接收者的引用，表明发送命令的目的地址
 * @Author WENYANNI
 * @Date 2021/10/30 下午8:16
 **/
public class Teacher implements ICommand{

    private Student receiver = null;

    public Teacher(Student receiver){
        this.receiver = receiver;
    }

    //实现接口方法是发送命令的具体过程
    @Override
    public void sweep() {
        //发送清扫命令
        receiver.sweep();
    }
}
