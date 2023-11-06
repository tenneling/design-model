package com.wyn.iterator.example;

/**
 * @ClassName MyLinkedlist
 * @Description 链表容器类
 * @Author WENYANNI
 * @Date 2021/10/31 下午4:42
 **/
public class MyLinkedlist implements Collection{

    //链表首节点
    private Node head = null;
    //链表元素大小
    private int size = 0;
    //链表尾节点
    private Node tail = null;

    @Override
    public void add(Object obj) {
        //将o对象封装为链表内容
        Node node = new Node(obj);
        if(head == null){
            head = node;
            tail = node;
            node.setNext(null);
        }else{
            tail.setNext(node);
            tail = node;
        }
        size++;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Iterator iterator() {
        //返回具体迭代器
        return new LinkedListIterator();
    }

    private class LinkedListIterator implements Iterator{

        private Node currentNode = head;

        @Override
        public Object next() {
            Node node = currentNode;
            currentNode = currentNode.getNext();
            return node.getData();
        }

        @Override
        public boolean hasNext() {
            if(currentNode == null){
                return false;
            }
            return true;
        }
    }
}
