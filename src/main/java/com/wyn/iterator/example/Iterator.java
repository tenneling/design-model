package com.wyn.iterator.example;

/**
 * @InterfaceName Iterator
 * @Description 抽象迭代器 定义了访问和遍历容器元素的接口，声明了用于遍历容器的方法
 * @Author WENYANNI
 * @Date 2021/10/31 下午4:07
 **/
public interface Iterator {
    //用于获得下一个元素
    Object next();

    //判定容器是否有下一个元素
    boolean hasNext();
}
