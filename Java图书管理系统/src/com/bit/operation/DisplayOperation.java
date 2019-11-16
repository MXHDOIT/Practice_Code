package com.bit.operation;

import com.bit.book.Book;
import com.bit.book.BookList;

public class DisplayOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
//        System.out.println("DisplayOperation");
        System.out.println("展示所有书籍");

        for(int i = 0;i< bookList.getSize();i++){
            System.out.println(bookList.getBooks(i).toString());
        }
    }
}
