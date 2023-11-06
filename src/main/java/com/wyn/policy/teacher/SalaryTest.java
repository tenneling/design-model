package com.wyn.policy.teacher;

/**
 * @ClassName SalaryTest
 * @Description 请描述类的业务用途
 * @Author WENYANNI
 * @Date 2021/11/20 上午10:04
 **/
public class SalaryTest {
    public static void main(String[] args) {
        ISalary teacher = new Teacher();
        Context context = new Context(teacher,1.1f);
        //teacher.calc(context,30);
        System.out.println(context.calc(30));
    }
}
