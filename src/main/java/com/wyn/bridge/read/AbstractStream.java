package com.wyn.bridge.read;

import java.io.InputStream;

/**
 * @ClassName AbstractStream
 * @Description 请描述类的业务用途
 * @Author WENYANNI
 * @Date 2021/11/27 下午12:29
 **/
public class AbstractStream {
    protected InputStream inputStream;
    protected  int size;

    protected  byte[] readBytes() throws Exception{
        byte buf[] = new byte[size];
        inputStream.read(buf);
        return buf;
    }

    public void close() throws Exception{
        inputStream.close();
    }
}
