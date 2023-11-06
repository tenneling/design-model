package com.wyn.singleton.ustax;

/**
 * @ Description:
 * @ Author     :wenyanni288
 * @ Date       :2023/10/22 15:17$
 */
public class UsTax {
    private static UsTax instance = null;

    private UsTax(){
    }

    private synchronized static void doSync(){
        if (instance == null){
            System.out.println("----------实例不存在，创建实例-----------");
            instance = new UsTax();
            System.out.println("----------实例创建成功-------------");
        }
        System.out.println("------------实例已经被创建了-----------");
    }

    public static UsTax getInstance(){
        if (instance == null){
            System.out.println("----------实例暂时不存在---------");
            doSync();
        }
        System.out.println("-----------实例已经存在--------------");
        return instance;
    }
}

    