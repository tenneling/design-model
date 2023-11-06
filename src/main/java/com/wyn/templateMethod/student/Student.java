package com.wyn.templateMethod.student;

/**
 * @ClassName Student
 * @Description 学生成绩名次类
 * @Author WENYANNI
 * @Date 2021/11/20 下午12:22
 **/
public class Student {
    String name;
    int chinese;
    int math;
    int english;
    int cpos;
    int mpos;
    int epos;
    int tpos;

    Student(String name,int chinese,int math,int english){
        this.name = name;
        this.chinese = chinese;
        this.math = math;
        this.english = english;
    }
}
