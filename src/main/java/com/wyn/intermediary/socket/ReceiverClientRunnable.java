package com.wyn.intermediary.socket;

import java.io.InputStream;
import java.net.Socket;

/**
 * @ClassName ReceiverClientRunnable
 * @Description 客户端接收线程类
 * @Author WENYANNI
 * @Date 2021/11/13 下午4:29
 **/
public class ReceiverClientRunnable implements Runnable{

    Socket socket;

    ReceiverClientRunnable(Socket socket){
        this.socket = socket;
    }

    @Override
    public void run() {
        try{
            InputStream inputStream = socket.getInputStream();
            char ch = 0;
            while (true){
                while ((ch=(char)inputStream.read())!=-1){
                    System.out.println(ch);
                }
            }
        }catch (Exception e){

        }
    }
}
