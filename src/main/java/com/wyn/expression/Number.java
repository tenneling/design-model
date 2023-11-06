package com.wyn.expression;

/**
 * @ClassName Number
 * @Description 终结表达式类，实现了与文法中的终结符相关联的解释操作
 * @Author WENYANNI
 * @Date 2021/11/20 下午1:58
 **/
public class Number implements Expression{
    String s;
    Number(String s){
        this.s = s;
    }
    @Override
    public double interpret(Context context) {
        return context.map.get(s);
    }
}
