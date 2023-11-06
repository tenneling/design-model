package com.wyn.prototype.construction;

/**
 * @ClassName SoftCopyTest
 * @Description 浅复制测试类、深复制测试类
 * @Author WENYANNI
 * @Date 2021/10/30 下午1:25
 **/
public class SoftCopyTest {
    public static void main(String[] args) {
        Address address = new Address("GUANGDONG","LUFENG","516545");
        Student student = new Student("WENYANNI",24,address);
        Student student1 = new Student(student);

        System.out.println(student1);
    }
}
