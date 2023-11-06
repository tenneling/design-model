package com.wyn.composite;

import java.util.ArrayList;

/**
 * @ClassName DirectNode
 * @Description 目录节点类 Composite从抽象节点派生，包含其他叶节点和组合节点的引用
 * @Author WENYANNI
 * @Date 2021/11/21 下午2:45
 **/
public class DirectNode extends Node{
    private ArrayList<Node> nodes = new ArrayList<>();

    DirectNode(String name) {
        super(name);
    }

    public void add(Node node) throws Exception{
        nodes.add(node);
    }

    @Override
    void display() {
        System.out.println(name);
        for(int i=0;i<nodes.size();i++){
            nodes.get(i).display();
        }
    }
}
