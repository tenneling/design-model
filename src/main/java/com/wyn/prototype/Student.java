package com.wyn.prototype;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @ClassName Student
 * @Description 学生信息
 * @Author WENYANNI
 * @Date 2021/10/30 下午2:17
 **/
@Setter
@Getter
@ToString
public class Student implements Cloneable{
    String name;
    int age;
    PubInfo pubInfo;

    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
