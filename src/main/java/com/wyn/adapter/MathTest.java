package com.wyn.adapter;

/**
 * @ClassName MathTest
 * @Description 客户端，调用自己需要的领域接口IHopeInterface，实现相应功能
 * @Author WENYANNI
 * @Date 2021/11/21 上午11:24
 **/
public class MathTest {
    public static void main(String[] args) {
        ThirdCompany company = new ThirdCompany();
        IMath math = new MyMath(company);

        int result = math.add(1,2);
        System.out.println(result);
    }
}
