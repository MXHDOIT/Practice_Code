package com.bit.user;

import com.bit.book.BookList;
import com.bit.operation.IOperation;

public abstract class User {
    protected String name;
    public IOperation[] operations;

    public abstract int menu();
    public void doOperation(int choice, BookList bookList){
        operations[choice].work(bookList);
    }
}
