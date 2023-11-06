package com.wyn.prototype;

import java.util.Scanner;
import java.util.Vector;

/**
 * @ClassName PrototypeTest
 * @Description 原型对象测试类L创建m个辽宁师大对象，n个大连理工学生对象
 * @Author WENYANNI
 * @Date 2021/10/30 下午2:23
 **/
public class PrototypeTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        int m = 10,n=10;
        PrototypeManager pm = PrototypeManager.getPrototypeManager();

        PubInfo pubInfo = new PubInfo("liaoshi","dalian","116081");
        Student student = new Student();
        student.setPubInfo(pubInfo);

        //加入原型管理器
        pm.addPrototype("liaoshi",student);

        PubInfo pubInfo2 = new PubInfo("dagong","dalian","116023");
        Student student2 = new Student();
        student2.setPubInfo(pubInfo2);
        pm.addPrototype("dagong",student2);

        Scanner sc = new Scanner(System.in);
        Vector<Student> vector = new Vector<>();
        Student t = (Student) pm.getPrototype("liaoshi");
        for(int i = 0; i<m;i++){
            Student student1 = (Student)t.clone();
            student1.setName(sc.nextLine());
            student1.setAge(sc.nextInt());
            vector.add(student1);
        }

        Vector<Student> vector2 = new Vector<>();
        Student t2 = (Student) pm.getPrototype("dagong");
        for(int i = 0; i<n;i++){
            Student student1 = (Student)t2.clone();
            student1.setName(sc.nextLine());
            student1.setAge(sc.nextInt());
            vector2.add(student1);
        }
    }
}
