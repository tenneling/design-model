package com.wyn.facade.file;

/**
 * @ClassName FileReader
 * @Description 请描述类的业务用途
 * @Author WENYANNI
 * @Date 2021/11/27 下午8:51
 **/
public class FileReader {
    public String readFile(String fileName) {
        System.out.println("读取文件****"+fileName+"****中的明文信息.");
        return "需要加密的信息...";
    }
}
