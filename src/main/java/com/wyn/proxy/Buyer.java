package com.wyn.proxy;

/**
 * @ClassName Buyer
 * @Description 真实主题类，实现抽象主题接口
 * @Author WENYANNI
 * @Date 2021/11/21 下午7:35
 **/
public class Buyer implements ITv{
    @Override
    public void buyTv() {
        System.out.println("I buy a TV by buyer proxy");
    }
}
