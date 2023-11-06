package com.wyn.proxy.book;

import java.util.*;

/**
 * @ClassName BookProxy
 * @Description 请描述类的业务用途
 * @Author WENYANNI
 * @Date 2021/11/21 下午8:21
 **/
public class BookProxy implements IBorrow{

    private Borrow borrow;

    private Map<String,Integer> map;

    public BookProxy(Borrow borrow){
        this.borrow = borrow;
        map = new HashMap<>();
    }

    @Override
    public boolean borrow() {
        if(!borrow.borrow()){
            return false;
        }

        Book book = borrow.getBook();
        Integer integer = map.get(book.getNo());
        integer = (integer==null)?1:integer+1;
        map.put(book.getNo(),integer);
        return true;
    }

    public void log(){
        Set<String> set = map.keySet();

        String key = "";
        String result = "";

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            key = iterator.next();
            result += key+"\t"+map.get(key)+"\r\n";
        }
        System.out.println(new Date() +result);
    }
}
