package com.wyn.bridge.read;

import java.io.File;
import java.io.FileInputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * @ClassName URLStream
 * @Description 请描述类的业务用途
 * @Author WENYANNI
 * @Date 2021/11/27 下午12:35
 **/
public class URLStream extends AbstractStream{
    public URLStream(String strFile) throws Exception{
        URL url = new URL(strFile);
        inputStream = url.openStream();
        HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
        size = urlConnection.getContentLength();
    }
}
