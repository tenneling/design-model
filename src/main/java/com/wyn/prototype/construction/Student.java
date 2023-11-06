package com.wyn.prototype.construction;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @ClassName Student
 * @Description 学生基础信息类
 * @Author WENYANNI
 * @Date 2021/10/30 下午1:17
 **/
@Setter
@Getter
@ToString
public class Student {
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
    /*Student(Student student){
        name = student.getName();
        age = student.getAge();
        address = student.getAddress();
    }*/

    /**
     * 深复制
     **/
    Student(Student student){
        name = student.getName();
        age = student.getAge();
        address = new Address(student.getAddress());
    }
}
