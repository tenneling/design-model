package com.wyn.command.fan;

/**
 * @InterfaceName Command
 * @Description 命令接口
 * @Author WENYANNI
 * @Date 2021/10/31 下午12:11
 **/
public interface Command {

    void execute();
    //回到execute()被执行前的状态
    void undo();
}
