package com.wyn.bridge.read;

import java.io.File;
import java.io.FileInputStream;

/**
 * @ClassName NativeStream
 * @Description 请描述类的业务用途
 * @Author WENYANNI
 * @Date 2021/11/27 下午12:35
 **/
public class NativeStream extends AbstractStream{
    public NativeStream(String strFile) throws Exception{
        File file = new File(strFile);
        size = (int) file.length();
        inputStream = new FileInputStream(file);
    }
}
