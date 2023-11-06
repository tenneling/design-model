package com.wyn.policy;

/**
 * @ClassName CalcTest
 * @Description 测试类
 * @Author WENYANNI
 * @Date 2021/11/14 下午8:13
 **/
public class CalcTest {
    public static void main(String[] args) {
        ICalc iCalc = new AddCalc();
        Select obj = new Select(iCalc);

        int result = obj.calc(1,2);
        System.out.println(result);
    }
}
