package com.wyn.iterator.example;

import com.sun.org.apache.xalan.internal.xsltc.dom.ArrayNodeListIterator;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @ClassName MyArrayList
 * @Description 自定义数组容器类 具体聚合类 实现了在抽象聚合类声明的方法返回一个该具体聚合类对应的具体迭代器实例
 * @Author WENYANNI
 * @Date 2021/10/31 下午4:23
 **/
public class MyArrayList implements Collection{

    //容器元素
    private Object[] elementData;

    //元素个数
    private int size;

    public MyArrayList(int size){
        elementData = new Object[size];
        this.size = 0;
    }

    @Override
    public void add(Object obj) {
        if (this.size == elementData.length){
            //容器扩容，并拷贝源数据
            int newSize = size *2;
            elementData = Arrays.copyOf(elementData,newSize);
        }
        //添加新数据
        elementData[size]= obj;
        size++;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Iterator iterator() {
        return new ArrayListIterator();
    }
}
