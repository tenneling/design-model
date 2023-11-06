package com.wyn.reflection.msg;

/**
 * @ClassName FileMsg
 * @Description 将消息打印到文件
 * @Author WENYANNI
 * @Date 2021/10/24 下午4:42
 **/
public class FileMsg implements IMsg{
    @Override
    public void process(String msg) {
        System.out.println("save to the file");
    }
}
