package com.wyn.iterator.example;

/**
 * @ClassName ArrayListIterator
 * @Description 具体迭代器 实现了抽象迭代器接口，完成对聚合对象的遍历，在具体迭代器中通过游标来记录在聚合对象中所处的当前位置
 * @Author WENYANNI
 * @Date 2021/10/31 下午4:30
 **/
public class ArrayListIterator implements Iterator{

    private int currentIndex = 0;
    Object[] elementData;
    private int size;

    @Override
    public Object next() {
        Object obj = elementData[currentIndex];
        currentIndex++;
        return obj;
    }

    @Override
    public boolean hasNext() {
        if (currentIndex>size){
            return false;
        }
        return true;
    }
}
