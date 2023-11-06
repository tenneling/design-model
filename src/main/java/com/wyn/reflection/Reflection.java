package com.wyn.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @ClassName Reflection
 * @Description 反射，在程序运行时获取已知名称的类或已有对象相关类型的一种机制
 * @Author WENYANNI
 * @Date 2021/10/24 下午3:44
 **/

public class Reflection {

    //psvm自动生成main方法
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchMethodException {

        //加载并初始化指定的类A
        Class classInfo = Class.forName("ReflectionA");

        //获得类的构造函数
        Constructor cons[] = classInfo.getConstructors();

        //获取类的所有变量
        Field fields[] = classInfo.getDeclaredFields();

        //获取类的所有方法
        Method methods[] = classInfo.getDeclaredMethods();

        //产生类A的实例的两种方法
        //方法1
        cons[0].newInstance();
        cons[1].newInstance(new Object[]{10});
        cons[1].newInstance(new Object[]{"Hello",20211024});

        //方法2
        Constructor con = classInfo.getConstructor();
        con.newInstance();

        Constructor conOne = classInfo.getConstructor(new Class[]{Integer.class});
        conOne.newInstance(new Object[]{10});

        Constructor conTwo = classInfo.getConstructor(new Class[]{String.class,Integer.class});
        conTwo.newInstance(new Object[]{"Hello",20211024});

        //调用成员函数
        Object object = classInfo.getConstructor().newInstance();
        Method mt = classInfo.getMethod("func1");
        mt.invoke(object);

        Method mtOne = classInfo.getMethod("func2");
        mtOne.invoke(object,new Object[]{10});

        Method mtTwo = classInfo.getMethod("func3");
        mtTwo.invoke(object,new Object[]{"Hello",20211024});
    }
}
