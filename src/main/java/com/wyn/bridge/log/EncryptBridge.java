package com.wyn.bridge.log;

/**
 * @ClassName EncryptBridge
 * @Description 加密信息保存到文件
 * @Author WENYANNI
 * @Date 2021/11/27 下午12:21
 **/
public class EncryptBridge {
    LogFile file;
    public EncryptBridge(LogFile file){
        this.file = file;
    }

    public void save(String msg){
        msg = encrypt(msg);
        file.save(msg);
    }

    private String encrypt(String msg) {
        String s= "";
        //s是加密后的字符串
        return s;
    }
}
