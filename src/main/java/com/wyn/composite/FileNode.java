package com.wyn.composite;

/**
 * @ClassName FileNode
 * @Description 文件叶子节点类，叶节点，无后续节点，只需实现与自身相关的方法
 * @Author WENYANNI
 * @Date 2021/11/21 下午2:40
 **/
public class FileNode extends Node{
    FileNode(String name) {
        super(name);
    }

    @Override
    void display() {
        System.out.println(name);
    }
}
