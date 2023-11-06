package com.wyn.templateMethod;

/**
 * @ClassName TemplateTest
 * @Description 请描述类的业务用途
 * @Author WENYANNI
 * @Date 2021/11/20 上午11:53
 **/
public class TemplateTest {
    public static void main(String[] args) {
        Algo<Integer> algo = new Algo<>();
        ILess<Integer> cmp = new IntLess();
        Integer a[] = {3,6,7,0};
        System.out.println(algo.getMax(a,cmp));

        ILess<Student> studentILess = new Grade();
        Student A = new Student("sunny",90);
        Student B = new Student("tom",80);
        System.out.println(studentILess.less(A,B));
        //System.out.println(algo.getMax(a,studentILess));

    }
}
