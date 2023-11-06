package com.wyn.adapter.phone;

import java.util.Scanner;

/**
 * @ClassName CallTest
 * @Description 新旧手机功能适配器测试类
 * @Author WENYANNI
 * @Date 2021/11/21 下午1:38
 **/
public class CallTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int type = scanner.nextInt();

        if(type == 1){
            OldCall oldCall = new OldCall();
            IFunc obj = new OldAdapterCall(oldCall);
            obj.msg();
            obj.phone();
        }else{
            IFunc obj = new NewCall();
            obj.msg();
            obj.phone();
            obj.net();
        }
    }
}
