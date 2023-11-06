package com.wyn.iterator.example;

/**
 * @InterfaceName Collection
 * @Description 抽象聚合类 用于存储和管理元素对象，充当抽象迭代器工厂角色
 * @Author WENYANNI
 * @Date 2021/10/31 下午4:15
 **/
public interface Collection {

    //用于容器添加元素对象
    void add(Object obj);
    //用于获取容器中的元素个数
    int size();
    //用于返回容器遍历需要的迭代器接口
    Iterator iterator();

    //反向迭代器：容器元素倒序遍历
    //Iterator reverseIterator();
}
