package com.wyn.prototype.cloneable;

/**
 * @ClassName CloneableTest
 * @Description Cloneable接口测试类
 * @Author WENYANNI
 * @Date 2021/10/30 下午1:46
 **/
public class CloneableTest {
    public static void main(String[] args) throws Exception {
        Address address = new Address("GUANGDONG","LUFENG","516545");
        //原型对象
        Student student = new Student("WENYANNI",24,address);
        //克隆对象
        Student student1 = (Student)student.clone();
    }
}
