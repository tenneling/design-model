package com.wyn.expression;

/**
 * @ClassName Minus
 * @Description 减法
 * @Author WENYANNI
 * @Date 2021/11/20 下午2:16
 **/
public class Minus implements Expression{
    Expression one;
    Expression two;

    Minus(Expression one,Expression two){
        this.one = one;
        this.two = two;
    }

    @Override
    public double interpret(Context context) {
        return one.interpret(context) - two.interpret(context);
    }
}
