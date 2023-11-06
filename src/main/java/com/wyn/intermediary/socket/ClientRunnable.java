package com.wyn.intermediary.socket;

import java.io.InputStream;
import java.net.Socket;

/**
 * @ClassName ClientRunnable
 * @Description 服务器端接收线程类
 * @Author WENYANNI
 * @Date 2021/11/13 上午10:47
 **/
public class ClientRunnable implements Runnable{

    Socket socket;

    MyServer myServer;

    public ClientRunnable(Socket socket,MyServer myServer){
        this.socket = socket;
        this.myServer = myServer;
    }

    @Override
    public void run() {
        byte buf[] = new byte[80];
        int size;
        try{
            InputStream inputStream = socket.getInputStream();
            while (true){
                size= inputStream.read(buf);
                myServer.send(buf,size);
            }
        }catch (Exception e){

        }
    }
}
