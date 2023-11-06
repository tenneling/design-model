package com.wyn.adapter.phone;

/**
 * @ClassName NewCall
 * @Description 新手机功能
 * @Author WENYANNI
 * @Date 2021/11/21 下午1:36
 **/
public class NewCall implements IFunc{
    @Override
    public void phone() {
        System.out.println("newCall can call");
    }

    @Override
    public void msg() {
        System.out.println("newCall can msg");
    }

    @Override
    public void net() {
        System.out.println("newCall can net");
    }
}
