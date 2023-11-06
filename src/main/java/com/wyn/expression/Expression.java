package com.wyn.expression;

/**
 * @InterfaceName Expression
 * @Description 抽象表达式接口，在抽象表达式中声明了抽象的解释操作，是所有终结表达式和非终结表达式的父类
 * @Author WENYANNI
 * @Date 2021/11/20 下午1:56
 **/
public interface Expression {
    double interpret(Context context);
}
