package com.wyn.proxy.book;

/**
 * @ClassName BookTest
 * @Description 请描述类的业务用途
 * @Author WENYANNI
 * @Date 2021/11/21 下午8:38
 **/
public class BookTest {
    public static void main(String[] args) {
        Borrow borrow = new Borrow();
        BookProxy bookProxy = new BookProxy(borrow);

        Book book = new Book("1","计算机应用");
        borrow.setBook(book);
        bookProxy.borrow();

        book = new Book("2","数据结构");
        borrow.setBook(book);
        bookProxy.borrow();
        bookProxy.log();
    }
}
