package com.wyn.iterator.example;

/**
 * @ClassName ReverseIterator
 * @Description 反向迭代器
 * @Author WENYANNI
 * @Date 2021/10/31 下午5:14
 **/
public class ReverseIterator implements Iterator{

    private int size;
    private int currentIndex = size-1;
    private Object[] elementData;

    @Override
    public Object next() {
        Object obj = elementData[currentIndex];
        currentIndex--;
        return obj;
    }

    @Override
    public boolean hasNext() {
        if(currentIndex<0){
            return false;
        }
        return true;
    }
}
