package com.wyn.templateMethod;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @ClassName Student
 * @Description 学生基本类
 * @Author WENYANNI
 * @Date 2021/11/20 上午11:51
 **/
@Getter
@Setter
@ToString
public class Student {
    String name;
    int grade;

    public Student(String name ,int grade){
        this.name = name;
        this.grade = grade;
    }
}
