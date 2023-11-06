package com.wyn.factory.factoryExampleT;

import java.io.File;
import java.io.FileInputStream;

/**
 * @ClassName TextRead
 * @Description 文本文件读取类
 * @Author WENYANNI
 * @Date 2021/10/24 下午8:37
 **/
public class TextRead implements IRead<String>{

   public String read(String... in) {
        String result = null;
        try {
            //in[0] 文件名称
            File file = new File(in[0]);
            long len = file.length();
            FileInputStream input = new FileInputStream(in[0]);
            byte buf[] = new byte[(int)len];
            input.read(buf);
            result = new String(buf, in[1]);
            input.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }
}
