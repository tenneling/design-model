package com.wyn.iterator;

import com.wyn.iterator.example.Iterator;

import java.util.*;

/**
 * @ClassName IteratorTest
 * @Description 迭代器测试类 容器的元素遍历与具体的容器无关
 * @Author WENYANNI
 * @Date 2021/10/31 下午3:27
 **/
public class IteratorTest {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("aaa");
        vector.add("bbb");
        vector.add("ccc");
        traverse(vector);
        System.out.println();

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("aaa");
        linkedList.add("bbb");
        linkedList.add("ccc");
        traverse(linkedList);
        System.out.println();

        Set<String> set = new HashSet<>();
        set.add("aaa");
        set.add("bbb");
        set.add("ccc");
        traverse(set);
        System.out.println();
    }

    public static void traverse(Collection<String> collection){
//        Iterator<String> iterator = collection.iterator();
//        while (iterator.hasNext()) {
//            String str = iterator.next();
//            System.out.println(str);
//        }
    }
}
