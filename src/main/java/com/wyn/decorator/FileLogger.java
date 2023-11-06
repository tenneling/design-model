package com.wyn.decorator;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

/**
 * @ClassName FileLogger
 * @Description 文件打印类
 * @Author WENYANNI
 * @Date 2021/11/27 下午7:12
 **/
public class FileLogger implements ILogger{
    @Override
    public void log(String msg) {
        DataOutputStream outputStream = null;
        try{
            outputStream = new DataOutputStream(new FileOutputStream("D:/log.txt",true)) ;
            outputStream.writeBytes(msg+"\r\n");
            outputStream.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
