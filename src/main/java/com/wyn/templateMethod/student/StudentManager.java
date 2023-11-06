package com.wyn.templateMethod.student;

import java.util.Collections;
import java.util.Comparator;
import java.util.Vector;

/**
 * @ClassName StudentManager
 * @Description 学生集合管理类
 * @Author WENYANNI
 * @Date 2021/11/20 下午12:40
 **/
public class StudentManager {
    Vector<Student> students = new Vector<>();

    void add(Student student){
        students.add(student);
    }

    void sortByCh(){
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o2.chinese-o1.chinese;
            }
        });
        for (int i = 0 ;i<students.size();i++){
            Student student = students.get(i);
            student.cpos = i+1;
        }
    }

    void sortByMath(){
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o2.math-o1.math;
            }
        });
        for (int i = 0 ;i<students.size();i++){
            Student student = students.get(i);
            student.mpos = i+1;
        }
    }

    void sortByEnglish(){
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o2.english-o1.english;
            }
        });
        for (int i = 0 ;i<students.size();i++){
            Student student = students.get(i);
            student.epos = i+1;
        }
    }
    void sortByTotal(){
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o2.math+o2.chinese+o2.english-(o1.english+o1.math + o1.chinese);
            }
        });
        for (int i = 0 ;i<students.size();i++){
            Student student = students.get(i);
            student.epos = i+1;
        }
    }

}
