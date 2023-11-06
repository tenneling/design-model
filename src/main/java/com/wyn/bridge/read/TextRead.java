package com.wyn.bridge.read;

/**
 * @ClassName TextRead
 * @Description 请描述类的业务用途
 * @Author WENYANNI
 * @Date 2021/11/27 下午12:27
 **/
public class TextRead implements IRead<String>{
    private AbstractStream abstractStream;

    public TextRead(AbstractStream abstractStream){
        this.abstractStream = abstractStream;
    }

    @Override
    public String read() throws Exception {
        byte buf[] = abstractStream.readBytes();
        String s = new String(buf);
        return s;
    }
}
