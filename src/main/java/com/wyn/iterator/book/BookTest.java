package com.wyn.iterator.book;

/**
 * @ Description:
 * @ Author     :wenyanni288
 * @ Date       :2023/10/22 15:13$
 */
public class BookTest {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        //将书籍上架，省略相关代码
        Iterator iterator = bookShelf.iterator();
        while (iterator.hasNext()){
            //遍历书架，输出书名
            Book book = (Book) iterator.next();
            System.out.println(""+book.getName());
        }
    }
}

    