package com.wyn.expression;

/**
 * @ClassName Plus
 * @Description 非终结符表达式，实现了文法中非终结符的解释操作
 * @Author WENYANNI
 * @Date 2021/11/20 下午2:03
 **/
public class Plus implements Expression{

    Expression one;
    Expression two;

    Plus(Expression one,Expression two){
        this.one = one;
        this.two = two;
    }

    @Override
    public double interpret(Context context) {
        return one.interpret(context) + two.interpret(context);
    }
}
