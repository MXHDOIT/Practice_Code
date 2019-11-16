package com.bit.operation;

import com.bit.book.Book;
import com.bit.book.BookList;

public class AddOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
//        System.out.println("AddOperation");
        System.out.println("添加书籍");
        System.out.println("请输入书籍名称");
        String name = in.next();
        System.out.println("请输入图书的作者");
        String author = in.next();
        System.out.println("请输入图书的价格");
        int price = in.nextInt();
        System.out.println("请输入图书的类型");
        String type = in.next();

        Book book = new Book(name,author,price,type);

        int curSize = bookList.getSize();
        bookList.setBooks(curSize,book);
        bookList.setSize(curSize+1);
    }

}
