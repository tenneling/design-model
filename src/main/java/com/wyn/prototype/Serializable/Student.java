package com.wyn.prototype.Serializable;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.*;

/**
 * @ClassName Student
 * @Description Serializable序列化接口
 * @Author WENYANNI
 * @Date 2021/10/30 下午1:58
 **/
@Setter
@Getter
@ToString
public class Student implements Cloneable,Serializable {
    String name;
    int age;
    Address address;

    Student(String name, int age, Address address){
        this.address = address;
        this.name = name;
        this.age = age;
    }
    /**
     * 深复制
     **/
    protected Object clone() throws CloneNotSupportedException{
        Object obj = null;
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);
            //从流里读出来
            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            obj = ois.readObject();
        }catch (Exception e){
            e.printStackTrace();
        }
        return obj;
    }
}
