package com.wyn.composite;

/**
 * @ClassName Node
 * @Description 抽象节点类，定义了个体对象和组合对象需要实现的关于操作其子节点的方法
 * @Author WENYANNI
 * @Date 2021/11/21 下午2:37
 **/
public abstract class Node {
    protected String name;

    Node(String name){
        this.name = name;
    }

    public void addNode(Node node) throws Exception{
        throw new Exception("Invalid Exception");
    }

    abstract void display();
}
