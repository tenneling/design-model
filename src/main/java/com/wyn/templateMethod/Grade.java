package com.wyn.templateMethod;

/**
 * @ClassName Grade
 * @Description 请描述类的业务用途
 * @Author WENYANNI
 * @Date 2021/11/20 上午11:52
 **/
public class Grade implements ILess<Student>{
    @Override
    public boolean less(Student x, Student y) {
        return x.grade<y.grade;
    }
}
