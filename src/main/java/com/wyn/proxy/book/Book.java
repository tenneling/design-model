package com.wyn.proxy.book;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @ClassName Book
 * @Description 请描述类的业务用途
 * @Author WENYANNI
 * @Date 2021/11/21 下午8:14
 **/
@ToString
@Getter
@Setter
public class Book {
    private String no;
    private String name;

    Book(String no ,String name){
        this.no = no;
        this.name = name;
    }
}
