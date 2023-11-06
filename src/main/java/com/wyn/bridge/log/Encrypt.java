package com.wyn.bridge.log;

/**
 * @ClassName Encrypt
 * @Description 加密信息保存到文件
 * @Author WENYANNI
 * @Date 2021/11/27 下午12:18
 **/
public class Encrypt extends LogFile{
    public void save(String msg){
        msg = encrypt(msg);
        super.save(msg);
    }

    private String encrypt(String msg) {
        String s= "";
        //s是加密后的字符串
        return s;
    }
}
