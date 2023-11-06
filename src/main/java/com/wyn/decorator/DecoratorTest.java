package com.wyn.decorator;

/**
 * @ClassName DecoratorTest
 * @Description 测试类
 * @Author WENYANNI
 * @Date 2021/11/27 下午7:41
 **/
public class DecoratorTest {
    public static void main(String[] args) throws Exception {
        ILogger existObj = new FileLogger();
        ILogger newObj = new XMLLogger(existObj);

        String s[] = {"how","are","you"};
        for(int i=0;i<s.length;i++){
            newObj.log(s[i]);
            Thread.sleep(1000);
        }
        System.out.println("End");
    }
}
