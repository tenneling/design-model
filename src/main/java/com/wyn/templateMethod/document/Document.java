package com.wyn.templateMethod.document;

/**
 * @ Description:
 * @ Author     :wenyanni288
 * @ Date       :2023/10/22 11:23$
 */
public abstract class Document {
    void save(){
        System.out.println("----------正在保存----------");
    }

    void open(String name){
        System.out.println("----------正在打开----------"+name);
    }

    void close(){
        System.out.println("----------正在关闭----------");
    }

    public abstract void read(String docName);
}

    