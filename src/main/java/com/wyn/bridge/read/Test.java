package com.wyn.bridge.read;

/**
 * @ClassName Test
 * @Description 测试类
 * @Author WENYANNI
 * @Date 2021/11/27 下午12:42
 **/
public class Test {
    public static void main(String[] args) throws Exception {
        AbstractStream in = new URLStream("SDS.jsp");
        TextRead textRead = new TextRead(in);
        AbstarctThing thing = new URLFile(textRead);
        String s = (String) thing.read();
        in.close();
        System.out.println(s);
    }
}
