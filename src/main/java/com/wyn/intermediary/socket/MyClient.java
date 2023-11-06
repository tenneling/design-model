package com.wyn.intermediary.socket;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 * @ClassName MyClient
 * @Description 客户端主控类
 * @Author WENYANNI
 * @Date 2021/11/13 下午4:33
 **/
public class MyClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost",4000);
        ReceiverClientRunnable clientRunnable = new ReceiverClientRunnable(socket);
        Thread thread = new Thread(clientRunnable);
        thread.run();

        OutputStream outputStream = socket.getOutputStream();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        while (str.equals("bye")){
            outputStream.write(str.getBytes());
            str = scanner.nextLine();
        }
    }
}
