package com.wyn.prototype.cloneable;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @ClassName Student
 * @Description 学生基本信息类，实现一个标识接口Cloneable,表示类支持复制
 * @Author WENYANNI
 * @Date 2021/10/30 下午1:41
 **/
@Setter
@Getter
@ToString
public class Student implements Cloneable{
    String name;
    int age;
    Address address;

    Student(String name, int age, Address address){
        this.address = address;
        this.name = name;
        this.age = age;
    }

    /**
     * 浅复制
     **/
    /*protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }*/

    /**
     * 深复制
     **/
    protected Object clone() throws CloneNotSupportedException{
        Student student = (Student)super.clone();
        student.setAddress((Address) address.clone());
        return student;
    }
}
