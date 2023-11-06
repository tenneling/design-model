package com.wyn.expression;

/**
 * @ClassName ExpressionTest
 * @Description 请描述类的业务用途
 * @Author WENYANNI
 * @Date 2021/11/20 下午2:17
 **/
public class ExpressionTest {
    public static void main(String[] args) {
        Context context = new Context();
        context.assign("a",10d);
        context.assign("b",20d);
        context.assign("c",30d);

        //a
        double r = new Number("a").interpret(context);
        //a+b
        double r2 = new Plus(new Number("a"),new Number("b")).interpret(context);
        //a-b
        double r3 = new Minus(new Number("a"),new Number("b")).interpret(context);

        System.out.println(r);
        System.out.println(r2);
        System.out.println(r3);

    }
}
