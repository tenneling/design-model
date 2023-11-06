package com.wyn.command;

/**
 * @ClassName CommandTest
 * @Description 命令模式的测试类
 * @Author WENYANNI
 * @Date 2021/10/30 下午8:30
 **/
public class CommandTest {
    public static void main(String[] args) {
        //定义命令接收者
        Student student = new Student();
        //定义命令发送者
        Teacher teacher = new Teacher(student);
        //teacher.sweep();

        //将命令请求加到请求者对象中
        Invoke invoke = new Invoke(teacher);
        //由请求者发送命令
        invoke.execute();

        //添加不同的commandar
        //invoke.add(anotherCommandar)
    }
}
