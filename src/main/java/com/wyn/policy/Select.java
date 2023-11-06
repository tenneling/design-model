package com.wyn.policy;

/**
 * @ClassName Select
 * @Description 选择器：Context上下文环境类，将抽象策略接口的引用作为成员变量，并通过该变量调用具体策略对象的相关方法完成所需功能
 * @Author WENYANNI
 * @Date 2021/11/14 下午8:11
 **/
public class Select {
    private ICalc obj;

    public Select(ICalc calc){
        this.obj = calc;
    }

    public int calc(int a,int b){
        return obj.calc(a,b);
    }
}
