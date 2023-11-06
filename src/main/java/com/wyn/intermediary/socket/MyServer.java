package com.wyn.intermediary.socket;

import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;

/**
 * @ClassName MyServer
 * @Description 服务器端主控类
 * @Author WENYANNI
 * @Date 2021/11/13 上午10:48
 **/
public class MyServer {
    Vector<Socket> vector = new Vector<>();

    public void init() throws Exception{
        ServerSocket socket = new ServerSocket(8000);
        while (true){
            Socket socket1 = socket.accept();
            vector.add(socket1);
            ClientRunnable clientRunnable = new ClientRunnable(socket1,this);
            Thread thread = new Thread(clientRunnable);
            thread.start();
        }
    }

    public void send(byte[] buf,int size){
        OutputStream outputStream = null;
        try{
            for(int i=0; i<size; i++){
                Socket socket = vector.elementAt(i);
                outputStream = socket.getOutputStream();
                outputStream.write(buf,0,size);
            }
        }catch (Exception e){

        }

    }

    public static void main(String[] args) throws Exception {
        new MyServer().init();
    }

}
