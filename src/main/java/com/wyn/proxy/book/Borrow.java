package com.wyn.proxy.book;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @ClassName Borrow
 * @Description 借阅实现类
 * @Author WENYANNI
 * @Date 2021/11/21 下午8:18
 **/
@Setter
@Getter
@ToString
public class Borrow implements IBorrow{

    private Book book;

    @Override
    public boolean borrow() {
        return true;
    }
}
