package com.wyn.iterator.example;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @ClassName Node
 * @Description 链表类
 * @Author WENYANNI
 * @Date 2021/10/31 下午4:39
 **/
@Getter
@Setter
@ToString
public class Node {
    //当前节点值
    private Object data ;
    //下一节点
    private Node next;

    public Node(Object data){
        this.data = data;
    }
}
