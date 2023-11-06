package com.wyn.iterator.book;

import java.util.Vector;

/**
 * @ Description:
 * @ Author     :wenyanni288
 * @ Date       :2023/10/22 15:07$
 */
public class BookShelf {
    private Vector books;

    public BookShelf(int initialSize){
        this.books = new Vector(initialSize);
    }

    public Book getBookAt(int index){
        return (Book)books.get(index);
    }

    public int getLength(){
        return books.size();
    }

    public Iterator iterator(){
        return new BookShelfIterator(this);
    }
}

    