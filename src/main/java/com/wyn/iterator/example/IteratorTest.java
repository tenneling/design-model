package com.wyn.iterator.example;

/**
 * @ClassName IteratorTest
 * @Description 请描述类的业务用途
 * @Author WENYANNI
 * @Date 2021/10/31 下午5:02
 **/
public class IteratorTest {
    public static void traverse(com.wyn.iterator.example.Collection collection){
       Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            String str = (String) iterator.next();
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        //初始化自定义数组容器
        com.wyn.iterator.example.Collection collection = new MyArrayList(2);
        for(int i=0;i<20;i++){
            collection.add("array"+i);
        }
        System.out.println("数组容器遍历：");
        traverse(collection);

        //初始化自定义链表容器
        Collection collection1 = new MyLinkedlist();
        for (int i=0;i<20;i++){
            collection1.add("link"+i);
        }
        System.out.println("链表容器遍历");
        traverse(collection1);

        //反向迭代器遍历
        //collection.reverseIterator();

    }
}
