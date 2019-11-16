package com.bit.operation;

import com.bit.book.Book;
import com.bit.book.BookList;

public class BorrowOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("请输入你要借的书籍名称");
        String name = in.next();
        int i = 0;
        for (i = 0; i < bookList.getSize(); i++) {
            if(bookList.getBooks(i).getName().equals(name))
                break;
        }

        if(i>=bookList.getSize()){
            System.out.println("没有此书籍");
            return;
        }

        Book book = bookList.getBooks(i);
        if(book.isBorrowed()){
            System.out.println("书籍已经借出");
        }else{
            book.setBorrowed(true);
            System.out.println("借阅成功");
        }
    }
}
