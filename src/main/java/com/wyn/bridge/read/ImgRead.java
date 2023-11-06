package com.wyn.bridge.read;

/**
 * @ClassName ImgRead
 * @Description 请描述类的业务用途
 * @Author WENYANNI
 * @Date 2021/11/27 下午12:27
 **/
public class ImgRead implements IRead<byte[]>{
    private AbstractStream abstractStream;

    public ImgRead(AbstractStream abstractStream){
        this.abstractStream = abstractStream;
    }

    @Override
    public byte[] read() throws Exception {
        return abstractStream.readBytes();
    }
}
