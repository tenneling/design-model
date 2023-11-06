package com.wyn.singleton;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Calendar;

/**
 * @ClassName FileLogger
 * @Description 日志文件输出 时间和相关内容
 * @Author WENYANNI
 * @Date 2021/10/24 下午6:37
 **/
public class FileLogger {
    private String filePath = "..../test.txt";
    private FileOutputStream out;

    private FileLogger() throws Exception{
        System.out.println("This is a new instance");
    }

    public void write(String msg){
        Calendar c = Calendar.getInstance();
        int y = c.get(Calendar.YEAR);
        int m = c.get(Calendar.MONTH);
        int d = c.get(Calendar.DAY_OF_MONTH);
        int hh = c.get(Calendar.HOUR);
        int mm = c.get(Calendar.MINUTE);
        int ss = c.get(Calendar.SECOND);

        String strTime = "";
        strTime = String.format(strTime,"time:%d-%02d-%02d %02d:%02d:%02d\r\n", y,m,d,hh,mm,ss);

        String strContent = "content:\r\n"+msg+"\r\n";

        byte buf[] = strTime.getBytes(StandardCharsets.UTF_8);
        try {
            out.write(buf);
            buf = strContent.getBytes(StandardCharsets.UTF_8);
            out.write(buf);
            out.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void close(){
        try {
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static class My{
        static FileLogger log;
        static {
            try {
                log = new FileLogger();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static FileLogger getInstance(){
        return My.log;
    }

    //测试类
    public static void main(String[] args) {
        FileLogger fl = FileLogger.getInstance();
        fl.write("hello");
        fl.write("你好！");
        fl.close();
    }
}
