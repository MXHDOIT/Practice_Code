package com.bit.operation;
import com.bit.book.BookList;
import java.util.Scanner;


public interface IOperation {
        Scanner in = new Scanner(System.in);
        void work(BookList bookList);

}
