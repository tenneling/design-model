package com.wyn.policy.teacher;

/**
 * @ClassName Teacher
 * @Description 教师工资类计算
 * @Author WENYANNI
 * @Date 2021/11/20 上午10:01
 **/
public class Teacher implements ISalary{

    private static final int base = 3000;

    @Override
    public float calc(Context context, int a) {
        //回调上文
        float radio = context.getRadio();

        return base * radio * a;
    }
}
